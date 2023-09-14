import java.util.Scanner;
import java.util.Vector;

public class VectorlistConcepts {
    public static void main(String[] args) {
        Vector in=new Vector();
        in.add("new");
        in.add("Vector");
        in.add("Collection");
        in.add(200);
        in.add(300);
        in.add(200);
        in.add(400);
        in.add(500);
        in.add(600);
        in.add(700);
        System.out.println("Values in vector: " +in);
        System.out.println("Remove first occourence of element 200: "+in.remove((Integer)200));
        System.out.println("Values in vector: " +in);
        System.out.println("Remove element at index 4: " +in.remove(4));
        System.out.println("New Value list in vector: " +in);
        in.removeElementAt(5);
        System.out.println("Vector element after removal: " +in);
        System.out.println("Hash code of this vector = "+in.hashCode());
        System.out.println("Element at index 1 is = "+in.get(1));
    }
}
