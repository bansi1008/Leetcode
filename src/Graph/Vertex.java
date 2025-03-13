package Graph;

import java.util.HashMap;
import java.util.ArrayList;

public class Vertex {
    private HashMap<String, ArrayList<String>> adj = new HashMap<>();

    public boolean addVertex(String vertex) {
        if (!adj.containsKey(vertex)) {
            adj.put(vertex, new ArrayList<>());
            return true;
        }
        return false;
    }

    public boolean addEdge(String from, String to) {
        if(adj.get(from)!=null && adj.get(to)!=null) {
            adj.get(from).add(to);
            adj.get(to).add(from);
            return true;
        }
        return false;
    }

    public boolean removeEdge(String from, String to) {
        if(adj.get(from)!=null && adj.get(to)!=null) {
            adj.get(from).remove(to);
            adj.get(to).remove(from);
            return true;
        }
        return false;
    }

    public void print() {

        System.out.println(adj);
    }
}
