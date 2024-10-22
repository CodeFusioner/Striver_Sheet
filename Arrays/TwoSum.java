package Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        // brute force
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;i<arr.length;j++){
                if(i == j){
                    continue;
                }
                if(arr[i] + arr[j] == target){
                    System.out.println(arr[i] + arr[j]);
                }
            }
        }
    }
}
