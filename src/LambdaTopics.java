public class LambdaTopics {
    public static void main(String[] args){
        dummy123 add=(int a,int b) -> a+b;
        dummy123 multiply=(int a,int b) -> a*b;
        printvalue(2,4,add);
        printvalue(2,4,multiply);
    }
    public static void printvalue(int a,int b, dummy123 obj){
        System.out.println(obj.operation(a,b));
    }
}
interface dummy123{
    int operation(int a, int c);
}
