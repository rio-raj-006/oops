import java.util.LinkedHashSet;

public class LinkedHashsetconcepts {
    public static void main(String[] args) {
        LinkedHashSet<Integer> obj1=new LinkedHashSet<>();
        obj1.add(12);
        obj1.add(11);
        obj1.add(1466);
        obj1.add(13);
        obj1.add(123);
        System.out.println(obj1.size());
        System.out.println(obj1.isEmpty());
        System.out.println(obj1);    // Linked hashset is same as the hashset, because, the linked hashset is the sub-class of the hash set
    }           // The only difference between the linked hashset and hashset is that linked hashset follows the insertion order.
}
