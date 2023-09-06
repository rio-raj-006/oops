import java.util.Scanner;

public class parameter {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        System.out.println(add(a));
    }
    public static int add(int b){
        return b+1;
    }
}
