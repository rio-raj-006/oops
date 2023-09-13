public class parentclasssubclass {
    public static void main(String[] args) {
        newSubClass obj=new newSubClass();
        obj.print();
    }
}
class newParentclass{
    public void print(){
        System.out.println("hi");
    }
}
class newSubClass extends newParentclass{
    public void print12(){
        System.out.println("hello");
    }
}
