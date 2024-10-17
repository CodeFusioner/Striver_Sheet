package Arrays;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Remove duplicates in place from sorted array
        // distinct element in starting
        int [] arr = {1,1,2,2,1,8,9};
        int i = 0;
        for(int j = 1;j<arr.length;j++){
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        System.out.println(i+1);
    }
}
