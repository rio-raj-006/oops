public class Polymorphism {
    public static void main(String[] args){
        poly obj=new poly();
        obj.eat();
        poly1 obj1=new poly1();
        obj1.eat();
        run();
        run(3);
    }
    public static void run(){            // static method in the same class
        System.out.println("running");
    }
    public static void run(int a){           // method overloading- method overloading can be achieved by creating another method with same name and having changes in parameter in the class.
        System.out.println("running "+ a +" times fastly");
    }
}
class poly{                // another class
    public void eat(){           // parent class with eat method
        System.out.println("eating");
    }
}
class poly1 extends poly{       // another class which inherited the poly class using extends keywords
    public void eat(){           //eat method which override the parent class eat method
        System.out.println("eating breakfast");
    }
}
