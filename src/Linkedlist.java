

public class Linkedlist {
    private Node head;
    private Node tail;
    private int size;
    class Node {
    int value;
    Node next;
     Node(int value) {
        this.value = value;

    }
    }
    public Linkedlist(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        size = 0;


    }
    public void printList() {
        Node temp=head;
        while(temp!=null) {
            System.out.println(temp.value);
            temp=temp.next;
        }
    }

    public void getHead() {
        System.out.println("head"+ head.value);
    }

    public void getTail() {
        System.out.println("tail"+ tail.value);

    }

    public void getSize() {
        System.out.println("size"+ size);
    }
}
