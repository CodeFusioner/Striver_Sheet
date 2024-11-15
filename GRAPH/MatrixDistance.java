package GRAPH;

import java.util.LinkedList;
import java.util.Queue;

public class MatrixDistance {
    class Node{
        int row;
        int col;
        int steps;
        Node(int row , int col , int steps){
            this.row = row;
            this.col = col;
            this.steps = steps;
        }
    }
    public static void main(String[] args) {
        // find the distance of nearest 1 in the grid for each cell
    }
    public int [][] nearest(int [][] grid){
        int n = grid.length;
        int m = grid[0].length;
        int [][] distance = new int[n][m];
        int [][] vis = new int[n][m];
        Queue<Node> q = new LinkedList<Node>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 1){
                    q.add(new Node(i, j, 0));
                    vis[i][j] = 1;
                }else{
                    vis[i][j] = 0;
                }
            }
        }
        int[] delrow = {-1,0,1,0};
        int[] delcol = {0,1,0,-1};
        while(!q.isEmpty()){
            int row = q.peek().row;
            int col = q.peek().col;
            int steps = q.peek().steps;
            q.remove();
            distance[row][col] = steps;
            for(int i = 0;i<4;i++){
                int newRow = row+delrow[i];
                int newCol = col+delcol[i];
                if(newRow > 0 && newRow < n && newCol > 0 && newCol < m && vis[newRow][newCol] == 0){
                    vis[newRow][newCol] = 1;
                    q.add(new Node(newRow, newCol, steps+1));
                }
            }
        }
        return distance;
    }
}
