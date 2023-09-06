public class static12 {
    public static void main(String[] args){
        System.out.println(balaji.bal());      //static method can be accessed without the use of object
        balaji obj= new balaji();
        obj.print();               //non-static method of another class can be accessed by the use of the object
    }
}
class balaji{
    public static int bal(){   //static method
        int a=0;
        return a;
    }
    public void print(){
        System.out.println("non-static method");
        System.out.println(method23());                // non-static method can be accessed by another no-static method only if they both are in same class
    }
    public int method23(){             //non-static method
        return 2;
    }
}
