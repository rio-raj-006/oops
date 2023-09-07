import java.util.*;

public class PalindromeStringBuffer
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        String myString =sc.nextLine();
//        StringBuffer buffer = new StringBuffer(myString);
//        System.out.println(buffer);
//        buffer.reverse();
//        String data = buffer.toString();
//        if(myString.equals(data))
//        {
//            System.out.println("Given String is palindrome");
//        }else
//        {
//            System.out.println("Given String is not palindrome");
//        }
//        System.out.println( buffer);
        StringBuffer i=new StringBuffer(sc.nextLine());
        //String i1= String.valueOf(i.reverse());
        i.reverse();
        StringBuffer s=i.reverse();
        System.out.println(i);
        System.out.println(s);
//        System.out.println(i.reverse());
//        if(i.equals(i.reverse()))
//            System.out.println("Palindrome" +i.reverse()+i);
//        else
//            System.out.println("Not a palindrome");

    }
}
