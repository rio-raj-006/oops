import java.util.Scanner;

public class pattern {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        for(int i=0;i<a;i++){
            if(i==0 || i==a-1) {
                for (int j = 0; j < a; j++) {
                    System.out.print("*"+" ");
                }
            }
            else {
                for(int j=0;j<a;j++){
                    if(j!=0 && j!=a-1){
                        System.out.print(" "+" ");
                    }
                    else {
                        System.out.print("*"+" ");
                    }
                }
            }
            System.out.println("\n");
        }
    }
}
