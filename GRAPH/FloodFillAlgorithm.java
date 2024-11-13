package GRAPH;

public class FloodFillAlgorithm {
    public static void main(String[] args) {

    }
    public static int [][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color) {
            return image;
        }
        int currColor = image[sr][sc];
        dfs(image , sr , sc , color , currColor);
        return image;
    }
    private static void dfs(int[][] image, int sr , int sc , int color , int currColor) {
        if(sr < 0 || sr>= image.length || sc < 0 || sc >= image[0].length ) {
            return;
        }
        if(image[sr][sc] != currColor){
            return;
        }
        image[sr][sc] = color;
        dfs(image , sr+1, sc, color , currColor);
        dfs(image , sr-1 , sc, color , currColor);
        dfs(image , sr , sc-1, color , currColor);
        dfs(image , sr , sc+1, color , currColor);
    }
}
