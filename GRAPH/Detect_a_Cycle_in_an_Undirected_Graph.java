package GRAPH;
import java.util.*;
public class Detect_a_Cycle_in_an_Undirected_Graph {

    public static void main(String[] args) {

    }
    public static boolean isCycle(int V , ArrayList<ArrayList<Integer>>adj){
        int [] vis = new int[V];
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                if(dfs(i , -1 , vis , adj)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean dfs(int node, int parent, int[] vis , ArrayList<ArrayList<Integer>>adj){
        vis[node]=1;
        for(int v : adj.get(node)){
            if(vis[v]==0){
                if(dfs(v , node , vis , adj)){
                    return true;
                }
            } else if (v != parent) {
                return true;
            }
        }
        return false;
    }
}
