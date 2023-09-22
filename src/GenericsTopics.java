public class GenericsTopics {
    public static void main (String[] args){
        Employee emp=new Employee(456, "balaji");
        interns intr=new interns(8, 30, "siva");
        print ob=new print(emp);
        print ob1=new print(intr);
        ob.print();
        ob1.print();
    }
}
class Employee{
    int idno;
    String name;
    Employee(int a, String n){
        this.idno=a;
        this.name=n;
    }

    @Override
    public String toString() {
        return idno + " "+ name;
    }
}
class interns{
    int tempidno;
    String name;
    int noofdays;
    interns (int id,int nd, String n){
        this.tempidno=id;
        this.name=n;
        this.noofdays=nd;
    }

    @Override
    public String toString() {
        return tempidno+ " "+ name + " "+ noofdays;
    }
}
class print<T>{
    T t;
    print(T obj){
        this.t=obj;
    }
    public void print(){
        System.out.println(t.toString());
    }
}
