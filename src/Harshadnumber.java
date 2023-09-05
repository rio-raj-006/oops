import java.util.Scanner;

public class Harshadnumber {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int num=a;
        int dope=0;
        while(num>0){
            dope=dope+(num%10);
            num=num/10;
        }
        int bal=a%dope;
        if(bal==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
