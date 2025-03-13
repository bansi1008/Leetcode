package Graph;

public class Main {
    public static void main(String[] args) {
        Vertex v = new Vertex();
        v.addVertex("a");
        v.addVertex("b");
        v.addVertex("c");
        v.addVertex("d");
        v.addEdge("a", "b");
        v.addEdge("a", "c");
        v.addEdge("b", "d");
        v.addEdge("c", "d");
        v.removeEdge("a", "b");
        v.print();
    }
}