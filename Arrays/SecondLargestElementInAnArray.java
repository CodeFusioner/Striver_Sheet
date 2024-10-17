package Arrays;
import java.util.*;

public class SecondLargestElementInAnArray {
    public static void main(String[] args) {
        int [] arr = {2,3,4,7,9,9};
        // brute force  (n logn)
        Arrays.sort(arr);
        int secondLargest = 0;
        int largest = arr[arr.length-1];
        for(int i = arr.length - 2;i>=0;i--){
            if(arr[i] != largest){
                secondLargest = arr[i];
                break;
            }
        }
        System.out.println(secondLargest);

        // optimal

        int [] ary = {2,3,4,7,9,9};
        int max = ary[0];
        for(int i = 0;i<ary.length;i++){
            if(ary[i] > max){
                max = ary[i];
            }
        }
        int largest1 = max;
        int secondLargest1 = -1;
        for(int i = 0;i<ary.length;i++){
            if(ary[i] > secondLargest1 && ary[i] != largest1){
                secondLargest1 = ary[i];
            }
        }
        System.out.println(secondLargest1);

    }
}
