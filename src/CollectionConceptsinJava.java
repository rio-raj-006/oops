import java.awt.*;
import java.util.*;
import java.util.List;

public class CollectionConceptsinJava {
    public static void main(String[] args){
        List ob=new LinkedList<>();
        List ob1=new ArrayList<>();
        ob1.add("String");
        ob1.add(1);
        System.out.println(ob1.toString());
        List ob2=new Vector<>();
        ob2.add("String");
        ob2.add(1);
        System.out.println(ob2.toString());
        ob.add("String");
        ob.add(1);
        System.out.println(ob.toString());
        List ob3=new Stack<>();
        ob3.add("String");
        ob3.add(1);
        System.out.println(ob3.toString());
    }
}
