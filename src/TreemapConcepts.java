import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreemapConcepts {
    public static void main(String[] args) {
        Map<String, String> data =new HashMap<>();
        data.put("19EC074","bharani");        // map does not allow duplicate key, so this value does not mapped.
        data.put("19EC080","balaji");
        data.put("19EC074","Rajkumar");
        data.put("19EC095","Rajkumar");    //but map does allow the duplicate value
        data.put("19EC081","mari");
        data.put("19EC094","jaya");
        System.out.println("Output of hashmap");
        for(Map.Entry<String,String> e1: data.entrySet()){
            System.out.println(e1.getKey()+" : "+e1.getValue());
        }
        Map<String,String> tr=new TreeMap<>(data);
        System.out.println("Output of Treemap : ");
        System.out.println(tr);
    }
}
