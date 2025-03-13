package BST;

public class Main {

    public static void main(String[] args) {
    Bst1 b=new Bst1();
    b.insertt(90);
    b.insertt(10);
    b.insertt(20);
    b.insertt(5);
    b.insertt(30);
    b.insertt(30);


    System.out.println(b.root.left.left.data);
    }
}
