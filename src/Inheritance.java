public class Inheritance {
    public static void main(String[] args){
        robert obj=new robert();
        obj.print();
    }
}
class rioraj extends rio{
    int a=10;
}
class rio{
    int a=0;
}
//class rioraj extends rio{
//    int a=10;
//}
class robert extends rioraj{
    int a=123;
    public void print(){
        System.out.println("Robert class "+super.a );
        System.out.println(this.a);
    }
}
