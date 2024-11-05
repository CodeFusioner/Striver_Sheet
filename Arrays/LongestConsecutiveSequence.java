package Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int [] arr = {101,4,100,1,101,3,2,1,1};
        int cnt = 1;
        for(int i = 0;i<arr.length;i++){
            int x = arr[i];
            cnt = 1;
            while(linearSearch(arr,x+1)){
                x = x + 1;
                cnt++;
            }
        }
        System.out.println(cnt);

    }
    public static boolean linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }
}
