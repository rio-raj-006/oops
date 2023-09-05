import java.util.Scanner;

public class abudantNumber {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int sum=0;
        for(int i=1;i<a;i++){
            if(a%i==0){
                sum=sum+i;
            }
        }
        if(sum>a){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
