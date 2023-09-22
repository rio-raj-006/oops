import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
public class Streamsnewagain {
    public static void main(String[] args){
        List<Integer> obj=new ArrayList<>();
        obj.add(12);
        obj.add(43);
        obj.add(1344);
        obj.add(144);
        obj.add(54);
        obj.add(564);
        Set<Integer> n=obj.stream().filter(s->s>200).collect(Collectors.toSet());
        System.out.println(n);
    }
}