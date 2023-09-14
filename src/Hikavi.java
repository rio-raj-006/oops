import java.util.LinkedList;
import java.util.List;

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList<T> {
    private Node<T> head;
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Add other methods as needed for your singly linked list
}
public class Hikavi{
    public static void main(String[] args) {
        SinglyLinkedList<Integer> ob=new SinglyLinkedList<>();
        ob.add(1);
        System.out.println(ob.toString());
    }
}

