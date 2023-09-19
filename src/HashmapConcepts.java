import java.util.HashMap;
import java.util.Map;

public class HashmapConcepts {
    public static void main(String[] args) {
        Map<String, String> data =new HashMap<>();
        data.put("19EC074","bharani");        // map does not allow duplicate key, so this value does not mapped.
        data.put("19EC080","balaji");
        data.put("19EC074","Rajkumar");
        data.put("19EC095","Rajkumar");    //but map does allow the duplicate value
        data.put("19EC081","mari");
        data.put("19EC094","jaya");
        for (Map.Entry<String,String> e: data.entrySet()){
            System.out.println(e.getKey()+" : "+e.getValue());
        }
    }
}
