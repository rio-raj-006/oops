import java.util.Scanner;

public class forloop {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        for(int i=0;i<a;i++){            // for-loop statement, we use for loop when we know about the limit of the loop
            System.out.print("*");
        }
        while(a>0){          // while-loop, we use while loop when we know the limit of loop
            a=a-2;
            System.out.println("#");
        }
    }
}
