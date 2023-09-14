import java.util.LinkedList;
import java.util.Objects;

public class LinkedListConcepts {
    public static void main(String[] args) {
        LinkedList m=new LinkedList();
        m.add("balaji");
        m.add(1,"balaraman");
        LinkedList m2=new LinkedList();
        m2.add("new");
        m2.add("linked list");
        m2.addFirst(1);
        m2.addLast("again");
        m.addAll(m2);
        System.out.println(m);
        System.out.println(m2);
        m2.clear();
        System.out.println(m2);
        LinkedList m3=new LinkedList();
        m3=(LinkedList) m.clone();
        System.out.println(m3);
        java.lang.Object[] arr=new java.lang.Object[2];
        arr[0]=1;
        arr[1]="s";
        for (java.lang.Object a:arr) {
            System.out.println(a);
        }
        m3.push("balaji");
        System.out.println(m3);
    }
}
