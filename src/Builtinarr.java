import java.util.Arrays;

public class Builtinarr {
    public static void main(String[] args){
        int a=5;
        int arr[][]=new int[a][];
        for (int i=0;i<a;i++){
            for(int j=0;j<i;j++){
                arr[i]=new int[j];
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
