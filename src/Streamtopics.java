import java.util.Arrays;
import java.util.List;

public class Streamtopics {
    public static void main(String[] args){
        List<Emp> obj= Arrays.asList(new Emp(3,2020,"raj"),new Emp(4,2021,"balaji"),new Emp(5,2023,"bharani"));
        obj.stream().filter(m ->m.year<2023).map(m-> m.name).forEach(s -> System.out.println(s));
    }
}
class Emp{
    int rollno;
    int year;
    String name;
    Emp(int rn,int y,String n){
        this.name=n;
        this.year=y;
        this.rollno=rn;
    }
}
