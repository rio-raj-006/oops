import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int[][] arr1 = new int[a][];
        for (int i=0;i<a;i++){
            arr1[i]=new int[i];
        }
        for (int i=0;i<a;i++){
            for(int j=0;j<arr1[i].length;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
