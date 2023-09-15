import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetConcepts {
    public static void main(String[] args){
        Set<Integer> set=new HashSet<>(); // hashset Does not maintains the order of insertion, but it is fast.
        set.add(1);
        set.add(23);
        set.add(1);
        set.add(1);
        set.add(10);
        set.add(134);
        System.out.println(set);
        Set raj=new TreeSet<>(set);    // Treeset also does not maintains the order of insertion(means the order of elements inserted)
        System.out.println(raj);          // But, it sort the elements.
        Set rio=new LinkedHashSet(set);          // Linked hashset is the child class of the hashset , but it maintains the order of insertion
        System.out.println(rio);
    }
}
