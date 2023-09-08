import java.util.Scanner;

public class forloop {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);   // edited by me
        int a=s.nextInt();
        for(int i=0;i<a;i++){            // for-loop statement, we use for loop when we know about the limit of the loop
            System.out.print("*");
        }
        while(a>0){          // while-loop, we use while loop when we know the limit of loop
            a=a-2;
            System.out.println("#");
        }
        do {                       // the difference between the normal loop and do-while loop is
            System.out.println("@");   //the do-while loop executes the statements first and then checks the condition
            a=a-2;          // but,In While-loop the condition is checked first and then the statements executes.
        }
        while (a>0);
    }
}
