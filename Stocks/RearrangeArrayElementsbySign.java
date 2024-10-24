package Stocks;

import java.util.ArrayList;
import java.util.List;

public class RearrangeArrayElementsbySign {
    public static void main(String[] args) {
        // brute force
        int [] nums = {3,1,-2,-5,2,-4};
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for(int i = 0;i < nums.length;i++){
            if(nums[i] > 0){
                pos.add(nums[i]);
            }
            if(nums[i] < 0){
                neg.add(nums[i]);
            }
        }
        for(int i = 0;i < nums.length/2;i++){
            nums[i*2] = pos.get(i);
            nums[i*2+1] = neg.get(i);
        }
        for(int i = 0;i < nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
