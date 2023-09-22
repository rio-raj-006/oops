import java.util.Scanner;

public class LamdaTopic {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        dummy an= () -> {System.out.println(a + b);};
        an.sum();
    }
}
interface dummy{
    void sum();
}