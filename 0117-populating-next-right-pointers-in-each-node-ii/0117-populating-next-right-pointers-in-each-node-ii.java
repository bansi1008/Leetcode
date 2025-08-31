/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null){
            return null;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int s=q.size();
            Node p=null;
            for(int i=0;i<s;i++){
                Node n=q.poll();
                if(p!=null){
                    p.next=n;

                }
                p=n;
                if(n.left!=null) q.add(n.left);
                if(n.right!=null) q.add(n.right);

            }
            p.next=null;
        }
        return root;
    }
}