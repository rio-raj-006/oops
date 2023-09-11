import java.util.ArrayList;
import java.util.List;

public class error {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<Integer>();
        try{
            int[] arr1=new int[2147483647];
        }
        catch (OutOfMemoryError e){
            System.out.println(e);
        }
    }
}
