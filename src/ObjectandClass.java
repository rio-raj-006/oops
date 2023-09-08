public class ObjectandClass {
    public static void main(String[] args) {
        y ob=new y();   // object creation for y class
        System.out.println(ob.name);  // instantce variable of the y class can be only accessed by object.
        ob.print();        //the print method of y class can accessed by both the object and also by class name, because static method.
        new R().printhi();     // the printhi method of r class got accessed by the anonymous object(object which has no reference).
    }
}
class y{
    String name="raj";       // instance variable
    public static void print(){ // static method in this class
        System.out.println("hi");
    }
}
class R{
    public static void printhi(){   // static method of another class
        System.out.println("Hi");
    }
}
