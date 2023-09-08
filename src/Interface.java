public class Interface {
    public static void main(String[] args) {  //main method
        test1 ob=new test1();  //object declaration
        ob.run();   //calling run method of test1 clas using object
        ob.sleep();   // calling the default method of the interface
//        ob.walk();   //It is not possible to call static method of the interface.
        test.walk();  //but it can be called by using the name of interface itself, because the method is static.
    }
}
interface test{      //interface
    void run();     //abstract method
    static void walk(){   // static method of this interface
        System.out.println("Im walking");
    }
    default void sleep(){       //default method of this interface
        System.out.println("I'm sleeping");    //the difference between the default and static methods in interface is
    }         // the default method can be overriden by the class which inherits the interface. but the static methods
}           // cannot be inherited by the class.
class test1 implements test{    // class implements the interface
    @Override
    public void run() {           // overriding the abstract (run) method of the interface
        System.out.println("I'm running");
    }
}
