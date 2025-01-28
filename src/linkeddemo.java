

public class linkeddemo {
    private Node head;
    private Node tail;
    private Node prev;
    int size;

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public linkeddemo() {

        head = null;
        tail = null;
        size = 0;

    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public void insert(int val) {
        Node n = new Node(val);
        if (size == 0) {
            tail = n;
            head = n;

        } else {
            tail.next = n;
            tail = n;

        }
        size++;
    }

    public Node delete() {
        if (size == 0) return null;

        Node temp = head;
        Node prev = head;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        tail = prev;
        tail.next = null;
        size--;
        if (size == 0) {
            head = null;
            tail = null;
        }
        return temp;

}

public Node deletee(int val) {
    if (size == 0) return null;

    Node temp = head;
    Node prev = null;

    // If the node to be deleted is the head node
    if (temp != null && temp.val == val) {
        head = temp.next; // Change head
        size--;
        if (head == null) {
            tail = null;
        }
        return temp;
    }

    // Search for the node to be deleted, keep track of the previous node
    while (temp != null && temp.val != val) {
        prev = temp;
        temp = temp.next;
    }

    // If the value was not present in the list
    if (temp == null) return null;

    // Unlink the node from the linked list
    prev.next = temp.next;

    // Update the tail if the node to be deleted is the tail node
    if (temp == tail) {
        tail = prev;
    }

    size--;
    return temp;
}

}
