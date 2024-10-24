package Stocks;
import java.util.*;

public class AlternateNumbers {
    public static void main(String[] args) {
        // any no of positive and negative
        // position is preserved
        int[] nums = {1, 2, -4, -5, 6};
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                pos.add(nums[i]);
            } else {
                neg.add(nums[i]);
            }
        }
        if (pos.size() > neg.size()) {
            for (int i = 0; i < neg.size(); i++) {
                nums[2 * i] = pos.get(i);
                nums[2 * i + 1] = neg.get(i);
            }
            int idx = neg.size() + neg.size();
            for (int i = neg.size() ; i < pos.size(); i++) {
                nums[idx] = pos.get(i);
                idx++;
            }
        }else{
            for (int i = 0; i < pos.size(); i++) {
                nums[2 * i] = pos.get(i);
                nums[2 * i + 1] = neg.get(i);
            }
            int idx = pos.size() + pos.size();
            for (int i = pos.size() ; i < neg.size(); i++) {
                nums[idx] = neg.get(i);
                idx++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");

        }
    }
}
