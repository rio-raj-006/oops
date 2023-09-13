import java.util.Arrays;

public class MultiDimensionArray {
    public static void main(String[] args){
        int a=5;
        int arr[][]=new int[a][a];
        for (int i=0;i<a;i++){
            for (int j=0;j<a;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
