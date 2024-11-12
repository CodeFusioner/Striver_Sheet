package GRAPH;

public class NumberOfIsLands {
    public static void main(String[] args) {

    }
    public static int numberOfIslands(char[][] grid) {
        int cnt = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    cnt++;
                    removeIslands(grid, i, j);
                }
            }
        }
        return cnt;
    }

    public static void removeIslands(char[][] grid, int row, int col) {
        int n = grid.length;
        int m = grid[0].length;
        if(row < 0 || row >= n || col < 0 || col >= m) {
            return;
        }
        if (grid[row][col] == '1') {
            grid[row][col] = '0';
            int[] rowArray = {-1, 0, 1, 0};
            int[] colArray = {0, -1, 0, 1};
            for(int i = 0; i < rowArray.length; i++) {
                removeIslands(grid , row + rowArray[i], col + colArray[i]);
            }
        }
    }
}

