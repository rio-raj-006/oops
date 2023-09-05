import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int num=a;
        int num1=a;
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        int sum=0;
        while(num1>0){
            int num2=num1%10;
            int dupe=1;
            for(int i=0;i<count;i++){
                dupe=dupe*num2;
            }
            sum=sum+dupe;
            num1=num1/10;
        }
        if(sum==a){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
