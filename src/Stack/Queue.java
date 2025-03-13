package Stack;

public class Queue {
    private Node f;
    private Node l;
    class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }

    }
    public Queue() {
        f=null;
        l=null;

    }

    public void push(int data) {
        Node newNode = new Node(data);
        if(f==null) {
            f=newNode;
            l=newNode;
        }
        else {
            newNode.next=l;
            l=newNode;

        }

    }
    public void print(){

    }
}
