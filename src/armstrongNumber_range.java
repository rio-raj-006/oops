import java.util.Scanner;

public class armstrongNumber_range {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the starting number : ");
        int a=s.nextInt();
        System.out.println("Enter the last number : ");
        int b=s.nextInt();
        int[] arr1=new int[(b-a)+1];
        int j=0;
        for(int i=a;i<=b;i++){
            arr1[j]=i;
            number(arr1[j]);
            j++;
        }

    }
        public static void number(int w){
            int a=w;
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
                System.out.println("The number "+a+" is an armstrong number");
            }
            else{
                System.out.println("The number "+a+" is not an armstrong number");
            }
        }
}
