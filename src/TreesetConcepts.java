import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class TreesetConcepts {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of students : ");
        int a=s.nextInt();
        String[] arr=new String[a];
        for (int i=0;i<a;i++) {
            System.out.println("Enter the student name :");
            arr[i]=s.next();
        }
        TreeSet<String> bala=new TreeSet<>(Arrays.asList(arr));
        System.out.println(bala);
        System.out.println(bala.descendingSet());
        System.out.println(bala.first());
        System.out.println(bala.size());
    }
}