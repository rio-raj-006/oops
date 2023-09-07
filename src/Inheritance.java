public class Inheritance {
    public static void main(String[] args){
        robert obj=new robert();
        obj.print();
        obj.print12();
    }
}
class rio{
    int a=0;
}
class rioraj extends rio{
    int a=10;
    public void print12(){
        System.out.println(super.a);
    }
}
class robert extends rioraj{
    int a=123;
    public void print(){
        System.out.println("Robert class "+super.a );
        System.out.println(this.a);
    }
}
