public class Threadlockagain {
    public int a=0;

    public static void main(String[] args) {
        new Threadlockagain().main();
    }
    public void main() {
        checkagain th1=new checkagain();
        checkagain th2=new checkagain();
        th1.start();
        th2.start();
        try{
            th1.join();
            th2.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println(a);
    }
}
class checkagain extends Thread{
    Threadlockagain e=new Threadlockagain();
    public void run(){
        stageone();
        stagetwo();
    }
    public void stageone() {
        for (int i = 0; i < 1000000; i++) {
            e.a++;
        }
        System.out.println(e.a);
    }
    public void stagetwo(){
        for(int i=0;i<1000000;i++){
            e.a++;
        }
    }
}