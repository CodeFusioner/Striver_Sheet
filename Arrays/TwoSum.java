package Arrays;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int target = 6;
        int[] ans = twoSum(arr, target);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

    }

    public static int[] twoSum(int[] nums, int target) {
        // better solution
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
    public static int[] twoSum2(int[] nums, int target) {
        // optimal approach
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if(sum == target) {
                return new int[]{left, right};
            }else if(sum < target){
                left++;
            }else{
                right--;
            }
        }
        return null;
    }
}
