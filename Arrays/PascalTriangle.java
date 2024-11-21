package Arrays;

public class PascalTriangle {
    public static void main(String[] args) {
        //Ncr
        int row = 5;
        int col = 3;
        int n = row - 1;
        int r = col  - 1;
        int ans = fact(n)/(fact(n-r)*fact(r));
        System.out.println(ans);

    }
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        int facto = 1;
        for(int i = 1;i<=n;i++){
            facto *= i;
        }
        return facto;
    }
}
