package Arrays;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        // kadane`s algorithm
        int [] arr = {-2,3,4,-5};
        System.out.println(maxSubArray(arr));
        System.out.println(maxSubArray2(arr));

    }
    public static int maxSubArray(int[] nums) {
        // brute force
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = i; j < nums.length; j++){
                sum += nums[j];
                max = Math.max(max, sum);
            }
        }
        return max;
    }
    public static int maxSubArray2(int[] nums) {
        // kadane`s algorithm
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        if(max < 0){
            return 0;
        }
        return max;
    }
}
