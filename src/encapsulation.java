import java.util.Scanner;

public class encapsulation {
    public static void main(String[] args){
        bind obj=new bind();
        Scanner s=new Scanner(System.in);
        System.out.println("enter your age : ");
        int age=s.nextInt();
        System.out.println("enter your id :");
        int id=s.nextInt();
        System.out.println("enter your name :");
        String name=s.next();
        obj.set(age,id,name);
        System.out.println(obj.getAge()+" "+obj.getIdno()+" "+obj.getName());
    }
}
class bind{
    private int age;
    private int idno;
    private String name;
    public void set(int age,int idno,String name){
        this.name=name;
        this.age=age;
        this.idno=idno;
    }
    public int getAge(){
        return age;
    }
    public int getIdno(){
        return idno;
    }
    public String getName(){
        return name;
    }
}
