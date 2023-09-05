public class methodDoubt {
    public static void main(String[] args){
        raj1.balaji();             //static method can be accessed by another class without creating the object
        raj1 obj=new raj1();        // object creation
        obj.jaya();                 // non-static method can be accessed by another class only with the use of object
    }
}
class raj1{
    public static void balaji(){                // static method
        System.out.println("Hi balaji");
    }
    public void jaya(){                             // non-method
        System.out.println("Hi jaya");
    }
}
