import java.util.ArrayList;
import java.util.List;

public class MethodreferenceTopics {
    public static void main(String[] args){
        List<Integer> obj=new ArrayList<>();
        obj.add(12);
        obj.add(14);
        obj.add(2334);
        obj.add(343);
        obj.forEach(printk::pf);
    }
}
class printk{
    public static void pf(Integer a){
        System.out.println(a);
    }
}
