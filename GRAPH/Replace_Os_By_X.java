package GRAPH;

public class Replace_Os_By_X {
    public static void main(String[] args) {

    }
    public static void dfs(int row , int col , int [][] vis , char [][] mat){
        vis[row][col] = 1;
        int n = mat.length;
        int m = mat[0].length;
        int [] delrow = {-1,0,1,0};
        int [] delcol = {0,-1,0,1};

        for(int i = 0;i<4;i++){
            int nrow = row + delrow[i];
            int ncol = col + delcol[i];
            if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] == 0 && mat[nrow][ncol] == 'O' ){
                dfs(nrow , ncol , vis , mat);
            }
        }
    }
    public static char [][] fill(int n , int m , char [][] mat){
        int [][] vis = new int[n][m];
        for(int j = 0;j<m;j++){
            // first row
            if(vis[0][j] == 0 && mat[0][j] == 'O'){
               dfs(0 , j , vis , mat);
            }
            // last row
            if(vis[n-1][j] == 0 && mat[n-1][j] == 'O'){
                dfs(n-1 , j , vis , mat);
            }
        }
        for(int i = 0;i<n;i++){
            // first column
            if(vis[i][0] == 0 && mat[i][0] == 'O'){
                dfs(i , 0 , vis , mat);
            }
            // last column
            if(vis[i][m-1] == 0 && mat[i][m-1] == 'O'){
                dfs(i , m-1 , vis , mat);
            }
        }
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(vis[i][j] == 0 && mat[i][j] == 'O'){
                    mat[i][j] = 'X';
                }
            }
        }
        return mat;
    }
}