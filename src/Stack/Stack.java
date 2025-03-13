package Stack;

public class Stack {
    private Node top;
    private int size;

    class Node {
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
        }
    }
    public  Stack() {

        top = null;
        size = 0;


    }
    public void printStack() {
        Node current = top;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
    public void push(int val) {
        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;
        size++;

    }
    public Node pop() {
        if (top == null) {
            System.out.println("Stack is empty");
        }
       Node a = top;
       top=top.next;
       a.next = null;
        size--;
        return a;

    }


}
