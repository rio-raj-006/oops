import java.util.Random;

public class ThreadsSynchronized {
    public static void main(String[] args) {
        check ob=new check();
        ob.add();
    }
}
class check{
    public static int num=0;
    public synchronized void numplus(){
        num++;
    }
    public void add(){
        Thread th1=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10000;i++){
                    numplus();
                }
            }
        });
        Thread th2=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10000;i++){
                    numplus();
                }
            }
        });
        th1.start();
        th2.start();
        try{
            th1.join();
            th2.join();
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println(num);
    }
}
