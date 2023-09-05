import java.util.Scanner;

public class automorphic {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number: ");
        int a=s.nextInt();
        int b=a*a;
        int r=0;
        int dope=a;
        while (dope>0){
            dope=dope/10;
            r++;
        }
         int c=0;
        for(int i=0;i<r;i++){
            c=c*10;
            c=c+(b%10);
            b=b/10;
        }
        int bal=0;
        for(int i=0;i<r;i++){
            bal=bal*10;
            bal=bal+(c%10);
            c=c/10;
        }
        if(bal==a){
            System.out.println("Yes");
        }
        else {
            System.out.println("no" );
        }
    }
}
