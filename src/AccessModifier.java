public class AccessModifier {
    private static int b = 9;      // It is a private variable and it can be accessed only inside the class and it is also declared as static which means it can be accesses by the method inside the same class without the use of the object
    static int a = 0;                   // default data member. So, It can be accessed only in this package.
    public static int c=10;             // public data member can be accessed by anywhere.

    protected static int d=100;          //protected data members can be accessed within this package and also by the child class

    public static void main(String[] args) {           // main method of this class
        newOne.method2();
        System.out.println(b);
    }

}
class newOne{
    public static void method2(){
        System.out.println(AccessModifier.a);   // default
        System.out.println(AccessModifier.c);   // public
        System.out.println(AccessModifier.d);   //protected
    }
}
