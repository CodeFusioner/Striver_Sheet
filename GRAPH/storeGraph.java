package GRAPH;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class storeGraph {
    public static ArrayList<Integer> bfsOfGraph(int v , ArrayList<ArrayList<Integer>> adj){
        boolean[] visited = new boolean[v];
        ArrayList<Integer> bfs = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        visited[0] = true;
        while(!q.isEmpty()){
            Integer node = q.poll();
            bfs.add(node);

            for(int it : adj.get(node)){
                if(!visited[it]){
                    visited[it] = true;
                    q.add(it);
                }
            }
        }
        return bfs;
    }
    
    public static void main(String[] args) {
        
    }
}
