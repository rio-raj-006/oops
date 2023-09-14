import java.util.ArrayList;
import java.util.List;

public class NestedList {
    public static void main(String[] args) {
        List<ArrayList<Integer> > raj=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> N=new ArrayList<>();
        for(int i=0;i<4;i++){
            N.add(i);
        }
        for (int i=0;i<5;i++){
            raj.add(N);
        }
        for(int i=0;i<raj.size();i++){
            System.out.println(raj.get(i));
        }
    }
}
