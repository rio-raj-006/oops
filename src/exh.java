import java.util.Scanner;

public class exh {
    public static void main(String[] args) {
        System.out.println("enter the length of the array : ");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int[] arr1=new int[a];
        for(int i=0;i<a;i++){
            arr1[i]=s.nextInt();
        }
            for(int c:arr1) {
                try {          // try block
                    System.out.println(10 / c);
                }       //here, we write a code to handle an unchecked exception (Arithmetic exception) which is also known runtime exception.
                catch (ArithmeticException e){  //catch block for exception handling
                    System.out.println(e);
                }
            }
        String n=null;
        try {
            System.out.println(n.length());
        }
        catch (NullPointerException e){
            System.out.println(e);
        }
    }
}

