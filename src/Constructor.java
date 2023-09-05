public class Constructor {
    int age ;
    public Constructor(){                // Default constructor
        age =1;
    }
    public Constructor(int age){            // Parameterised constructor
        this.age=age;
    }
    public static void main(String[] args){
        Constructor obj =new Constructor();
        Constructor obj1 =new Constructor(8);
        System.out.println(obj.age);
        System.out.println(obj1.age);
    }
}
