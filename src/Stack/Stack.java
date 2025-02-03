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
    public Stack(int val) {
        Node newNode = new Node(val);
        top = newNode;
        size = 1;


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
    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty");
        }
        int val = top.val;
        top = top.next;
        size--;
        return val;

    }


}
