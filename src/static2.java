public class static2 {
    public static void main(String[] args){
        next obj=new next(25, "balaji");
        obj.status="Employee";          // once a static member is modified. it will be same for all object. So, it means it doesn't depends on the object
        next obj1=new next(30, "john");
        obj.print();
        obj1.print();
    }
}
class next{
    int age;       // non-static
    String name;    //non-static
      static String status;     // static
    public next(int age, String name){
        this.age=age;
        this.name=name;
    }
    public void print(){
        System.out.println(age + "-"+ name+"-"+status);
    }
}
