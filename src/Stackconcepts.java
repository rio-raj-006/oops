import java.util.Stack;

public class Stackconcepts {
    public static void main(String[] args) {
        Stack<Integer> obj=new Stack<>();
        obj.push(1);
        obj.push(2);
        obj.push(4);
        obj.push(19);
        System.out.println(obj);
        obj.pop();
        System.out.println(obj);
        System.out.println(obj.search(2));
        System.out.println(obj.peek());
        while(!obj.empty()){
            obj.pop();
        }
        System.out.println(obj);
    }
}
