import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListconcepts {
    public static void main(String[] args) {
        ArrayList<Integer> obj=new ArrayList<Integer>();
        for (int i=0;i<10;i++){
            obj.add(i+i);
        }
        System.out.println(obj.toString());
        for (int i=0;i<10;i++){
            obj.set(i,i);
        }
        System.out.println(obj.toString());
//        Iterator<Integer> it=obj.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
        obj.remove(1);
        System.out.println(obj.toString());
        System.out.println(obj.get(1));
        System.out.println(obj.contains(90));
        ArrayList o=new ArrayList(obj);
        o.add("s");
        o.add("dd");
        o.add("ecss");
        System.out.println(o);
    }
}
