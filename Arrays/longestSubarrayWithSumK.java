package Arrays;

import java.util.HashMap;

public class longestSubarrayWithSumK {
    public static void main(String[] args) {
        int[] arr = {4,2,3,3,4};
        int k = 7;
        System.out.println(longestSubarray2(arr, k));
    }
    public static int longestSubarray2(int[] arr, int k) {
        // optimal approach
        int maxLen = 0;
        int left = 0;
        int right = 0;
        int sum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }
            if(sum == k){
                maxLen = Math.max(maxLen , right - left + 1);  /
            }
            right++;
            if(right < arr.length){
                sum += arr[right];
            }
        }
        return maxLen;
    }
}
