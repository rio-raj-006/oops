public class staticKeyword {
    int a=0;               // non-static data members
    static int b=10;
    public static void main(String[] args){
        staticKeyword obj=new staticKeyword();     // non-static data member can be accessed only with the use of object
        System.out.println(obj.a);
        System.out.println(b);                // static data members can be directly accessed by another static field without the use of the object
    }
}
