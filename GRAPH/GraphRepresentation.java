package GRAPH;
import java.util.*;

public class GraphRepresentation {
    public static void main(String[] args) {


    }
    public static void Graph(int u , int v){
        int n = 3 , m = 3;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0;i<=n;i++){
            adj.add(new ArrayList<>());
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        for(int i = 1;i<n;i++){
            for(int j  = 0;j<adj.get(i).size();j++){
                System.out.print(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
