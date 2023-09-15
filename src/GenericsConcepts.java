import java.util.ArrayList;
import java.util.Collection;

public class GenericsConcepts {
    public static void main(String[] args) {
        Gen<Integer> rio=new Gen<>(1,4,6);
        System.out.println(rio.getvalue());
        Gen<String> raj=new Gen<>("Hi","Hello","Welcome");
        System.out.println(raj.getvalue());
    }
}
class Gen<T>{
    ArrayList<T> obj=new ArrayList<>();
    public Gen(T...obj1){
        for(int i=0;i<obj1.length;i++) {
            obj.add(obj1[i]);
        }
    }
    public ArrayList<T> getvalue(){
        return obj;
    }
}
