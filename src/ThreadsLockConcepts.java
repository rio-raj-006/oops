public class ThreadsLockConcepts {
    public static void main(String[] args) {
        long c=System.currentTimeMillis();
        ThreadsLockConcepts obj=new ThreadsLockConcepts();
        Thread obj1=new Thread(new Runnable() {
            @Override
            public void run() {
                obj.process();
            }
        });
        Thread obj2= new Thread(new Runnable() {
            @Override
            public void run() {
                obj.process();
            }
        });
        obj1.start();
        obj2.start();
        try {
            obj1.join();
            obj2.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        long d=System.currentTimeMillis();
        System.out.println(d-c);
        System.out.println(obj.a);
    }
    public int a=0;
    public synchronized void one(){
        for(int i=0;i<10000000;i++){
            a++;
        }
    }
    public synchronized void two(){
        for(int i=0;i<10000000;i++){
            a++;
        }
    }
    public void process() {
        one();
        two();
    }
}
