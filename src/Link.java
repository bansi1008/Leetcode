import org.w3c.dom.Node;

public class Link {
    private Node head;
    private Node tail;
    int size;
    class Node {
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
            this.next = null;
        }

    }


    public void insert(int val) {
        Node newNode = new Node(val);
        if(size == 0) {
            head = newNode;
            tail = newNode;
            size++;

        }
        else {
            tail.next = newNode;
            tail = newNode;
            size++;
        }

    }

    public void display() {
        Node current = head;
        while(current != null) {
            System.out.print(current.val);

            current=current.next;

        }
        System.out.println();
    }

    public void findMiddleNode(){

        if(size == 0) {
           System.out.println("No middle node");
        }
        else {
            Node s=head;
            Node f=head;
            while(f.next != null && f!=null) { s=s.next;
                f=f.next.next;
            }
            System.out.println(s.val);


        }

    }

}
