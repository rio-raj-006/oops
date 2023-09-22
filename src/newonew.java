import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class newonew {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(2);
        ExecutorService ex1 = Executors.newCachedThreadPool();
        ExecutorService ex2 = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 15; i++) {
            ex.execute(new testnew("Fixed thread"));
            ex1.execute(new testnew("Cached thread"));
            ex2.execute(new testnew("Single thread"));
            System.out.println("next");
        }
        ex.shutdown();
        ex1.shutdown();
        ex2.shutdown();
    }
}
class testnew implements Runnable {
    private String name ;
    testnew(String n){
        this.name=n;
    }
    @Override
    public void run() {
        System.out.println( 10 + " printed by Thread " + Thread.currentThread().getId()+ " by "+name);
    }
}