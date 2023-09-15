import java.util.ArrayList;
import java.util.HashSet;

public class HashsetConcepts {
    public static void main(String[] args) {
        HashSet<ArrayList> obj=new HashSet<>();
        ArrayList<Integer> obj1=new ArrayList<>();
        ArrayList<Integer> obj2=new ArrayList<>();
        obj1.add(1);
        obj1.add(2);
        obj1.add(1);
        obj1.add(1);
        obj2.add(1);
        obj2.add(2);
        obj2.add(1);
        obj2.add(1);     // Same elements or data in both the arraylist
        obj.add(obj1);
        obj.add(obj2);
        System.out.println(obj);    // So, Hashset cannot allows duplicates arraylist, so it prints only one arraylist.
        HashSet<ArrayList> raj=new HashSet<>();
        ArrayList<Integer> obj3=new ArrayList<>();
        ArrayList<Integer> obj4=new ArrayList<>();
        obj3.add(1);
        obj3.add(2);
        obj3.add(1);
        obj3.add(1);
        obj4.add(1);
        obj4.add(2);
        obj4.add(1);
        obj4.add(3);  // only the last element is different from the obj3 arraylist
        raj.add(obj3);
        raj.add(obj4);
        System.out.println(raj); // Due the difference of the last elements, the hashset consider it as different data.
    }
}
