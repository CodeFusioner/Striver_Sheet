package Arrays;

public class leftRotateAnArrayByKPlaces {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int k = 3;
        k = k % arr.length;
        int n = arr.length;
        int [] temp = new int[k];
        for(int i = 0;i<k;i++){
            temp[i] = arr[i];
        }
        for(int i =k;i<arr.length;i++){
            arr[i-k] = arr[i];
        }
        int d = k;
       for(int i = 0;i<k;i++){
           arr[n-d] = temp[i];
           d--;
       }
       for(int i = 0;i<n;i++){
           System.out.print(arr[i]+" ");
       }
    }
}
