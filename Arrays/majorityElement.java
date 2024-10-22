package Arrays;

public class majorityElement {
    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 3, 3, 1, 2, 2};
        System.out.println(majorityElem(nums));

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
}
