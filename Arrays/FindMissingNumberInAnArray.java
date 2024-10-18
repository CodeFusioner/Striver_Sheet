package Arrays;

import java.util.HashMap;

public class FindMissingNumberInAnArray {
    public static void main(String[] args) {
        int [] arr = {1,2,4,5};
        findMissingNumber(arr);

    }
    // optimal approach
    public static void findMissingNumber(int[] nums) {
        // one approach
        int n = nums.length+1;
        int sum = (n*(n+1))/2;
        int s2 = 0;
        for(int i = 0;i<nums.length;i++){
            s2 += nums[i];
        }
        System.out.println(sum - s2);

        // second approach
        int xor1 = 0;
        int xor2 = 0;
        for(int i = 1;i<=nums.length;i++){
            xor1 ^= i;
        }
        for(int i = 0;i<nums.length-1;i++){
            xor2 ^= nums[i];
        }
        int ans = xor1^xor2;
        System.out.println(ans);


    }
    // better approach
    public static int helper1(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= arr.length; i++) {
            map.put(i, 0);
        }
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], 1);
        }
        int ans = 0;
        for (int key : map.keySet()) {
            if (map.get(key) == 0) {
                ans = key;
            }
        }
        return ans;
    }

    // brute force
    public static void helper2(int[] arr) {
        int i = 1;
        int flag = 0;
        for (i = 1; i < arr.length; i++) {
            flag = 0;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] == i) {
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0) {
            System.out.println(i - 1);
        }
    }
}
