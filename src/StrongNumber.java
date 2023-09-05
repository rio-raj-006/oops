import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int num=a;
        int res=0;
        while(num>0){
            int r=num%10;
            int num1=1;
            for(int i=1;i<=r;i++){
                num1=num1*i;
            }
            res=res+num1;
            num=num/10;
        }
        if(res==a){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
