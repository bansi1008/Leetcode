package BST;

import org.w3c.dom.Node;

public class bst {
    public Node root;

    class Node {
        int data;
        Node left, right;
        public Node(int data) {
            this.data = data;
        }
    }

    public boolean insert(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node current = root;

            while (true){
                if(current.data == newNode.data){
                    return false;
                }
                if(newNode.data < current.data) {
                    if (current.left == null) {
                        current.left = newNode;
                        return true;
                    }
                    current = current.left;
                }
                    else{
                        if (current.right == null) {
                            current.right = newNode;
                            return true;

                        }
                        current = current.right;

                    }


                }
            }



    }



