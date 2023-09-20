import java.util.Scanner;

public class ThreadsConcepts {
    public static void main(String[] args) {
        threads1 obj=new threads1();
        obj.start();

        Scanner s=new Scanner(System.in);
        s.nextLine();
        obj.shutdown();
    }
}
class threads1 extends Thread{
    public volatile boolean running=true;

    @Override
    public void run() {
        while (running){
            System.out.println("hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void shutdown(){
        running=false;
    }
}
