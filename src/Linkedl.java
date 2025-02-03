public class Linkedl {
    private Node head;
    private Node tail;
    private int size;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;

        }
    }
    public Linkedl(){
        head = null;
        tail = null;
        size = 0;

    }

    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;

        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void print(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;

        }

        System.out.println();
    }

    public void prepend(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;

        }
        else{
            newNode.next = head;
            head = newNode;

        }
        size++;
    }

    public void removefirst(){
        head = head.next;
        size--;

    }
public void removelast(){
        Node temp = head;
        while(temp==tail){


        }


}
    public Node get(int index) {
        if(index < 0 || index >= size)
        {
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;

        }
        return temp;

    }

    public boolean set(int index, int data){
        Node temp=get(index);
        temp.data=data;
        return true;
    }

    public boolean insertByIndex(int index, int data) {


        Node newNode = new Node(data);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
        return true;


    }

    public void reverse(){
        Node temp = head;
        Node prev = null;

        while(temp!=null){
            Node nxt = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nxt;

        }
        head = prev;

    }


}
