package BST;



public class Bst1 {
    public Node root;
    class Node {
        int data;
        Node left, right;
        public Node(int data) {
            this.data = data;

        }
    }
    public boolean insertt(int data) {
        Node newNode = new Node(data);

        if (root == null) {
            root = newNode;
            return true;

        }
        Node current = root;
       while (current != null) {
           if (current.data == data) {
               System.out.println("The data you entred" + data +" is not possible to print in the tree"  );
               return false;
           }
           if (current.data > data) {
               if (current.left == null) {
                   current.left = newNode;
                   return true;
               }
               else {
                   current = current.left;

               }

           }
           else {
               if (current.data<data) {
                   if (current.right == null) {
                       current.right = newNode;
                       return true;
                   }
                   else {
                       current = current.right;

                   }
               }

           }
       }
       return true;


    }



}
