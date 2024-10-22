package Arrays;

import java.util.HashMap;

public class majorityElement {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 3, 1, 1, 3, 1,1};
        System.out.println(majorityElem(nums));
        System.out.println(majorityElem2(nums));
        System.out.println(majorityElem3(nums));

    }

    public static int majorityElem(int[] nums) {
        // brute force
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > nums.length / 2) {
                return nums[i];
            }
        }
        return nums[0];
    }
    public static int majorityElem2(int[] nums) {
        // better solution
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(int key: map.keySet()) {
            if(map.get(key) > nums.length / 2) {
                return key;
            }
        }
        return -1;
    }
    public static int majorityElem3(int[] nums) {
        // optimal approach
        int count = 0;
        int element = 0;
        for(int i = 0; i < nums.length; i++) {
            if(count == 0) {
                count = 1;
                element = nums[i];
            }else if(nums[i] == element) {
                count++;
            }else{
                count--;
            }
        }
        return element;
    }
}
