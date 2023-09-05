import java.util.Scanner;
public class count_repeated {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the word : ");
        String a=s.next();
        int[] arr1=new int[1000];
        for(int i=0;i<a.length();i++){
         int j=(int) a.charAt(i);
         arr1[j]=arr1[j]+1;
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>0){
                char n=(char) i;
                System.out.print(n+" = "+ arr1[i] );
                System.out.print(",");
            }
        }
    }
}
