import java.util.Arrays;

public class Arr {
    public static void main(String[] args){
        int a=9;
        int[] arr =new int[a];
        for(int i=0;i<a;i++){
            arr[i]=i;
        }
        System.out.println(Arrays.toString(arr));
    }
}
