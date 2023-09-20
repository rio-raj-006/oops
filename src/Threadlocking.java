import java.util.ArrayList;
import java.util.List;

public class Threadlocking {
    private java.lang.Object lock=new java.lang.Object();
    private java.lang.Object lock1=new java.lang.Object();
    List<Integer> list1=new ArrayList<>();
    List<Integer> list2=new ArrayList<>();
    public static void main(String[] args){
        new Threadlocking().main();
    }
    public void main(){
        long s=System.currentTimeMillis();
        Thread obj=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++) {
                    process();
                }            }
        });
        Thread obj1=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++) {
                    process();
                }
            }
        });
        obj.start();
        obj1.start();
        try{
            obj.join();
            obj1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        long en=System.currentTimeMillis();
        System.out.println(en-s);
        System.out.println(list1.size());
        System.out.println(list2.size());
    }
    public void stageone() {
        synchronized (lock) {
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                System.out.println(e);
            }
            list1.add(1);
        }
    }
    public synchronized void stagetwo() {
        synchronized (lock1) {
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                System.out.println(e);
            }
            list2.add(1);
        }
    }
    public void process(){
        stageone();
        stagetwo();
    }
}
