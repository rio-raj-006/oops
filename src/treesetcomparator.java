import java.util.Comparator;
import java.util.TreeSet;

public class treesetcomparator {
    public static void main(String[] args){
        Store obj=new Store("anbu","food",120);
//        save obj2=new save();
//        obj2.add(obj);
        Store.add(obj);
        Store obj1=new Store("zam zam","bakery",14);
//        obj2.add(obj1);
        Store.add(obj1);
//        again call=new again();
//        call.compare(obj,obj1);
//        System.out.println(obj2.print());
        for (Store a:Store.data)
        System.out.println(a.storeno +" "+ a.category+" "+ a.storename);
    }
}
class Store {
    String storename;
    String category;
    int storeno;

    Store(String sn, String c, int stno) {
        this.storename = sn;
        this.storeno = stno;
        this.category = c;
    }
    static TreeSet<Store> data = new TreeSet<>(new Comparator<Store>() {
        @Override
        public int compare(Store o1, Store o2) {
            String a = o1.storename;
            String b = o2.storename;
            return a.compareTo(b);
        }
    });

    public static void add(Store a) {
        data.add(a);
    }
}

