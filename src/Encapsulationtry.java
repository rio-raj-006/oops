import java.util.Scanner;
public class Encapsulationtry {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        trial obj=new trial();
        System.out.println(obj.getBalance(a));
    }
}
class trial{
    private int accountno=12341;
    private int balance=334;
    public int getBalance(int a){
        if (a==accountno) {
            return balance;
        }
        else {
            return 0;
        }
    }

}