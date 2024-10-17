package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MoveAllZeroesToTheEndOfTheArray {
    public static void main(String[] args) {
         //Brute force
        int [] arr1 = {0,3,0,5,0,1,2};
        List<Integer> ll = new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=0){
                ll.add(arr1[i]);
            }
        }
        for(int i = 0;i<arr1.length;i++){
            if(arr1[i] == 0){
                ll.add(arr1[i]);
            }
        }
        System.out.println(ll);

        // optimal approach
        // finding the first zero element then start iterating i to j+1 then check ith element is non-zero if non-zero then swapping the element with the previous element

        int [] arr = {0,3,0,5,0,1,2};
        int j = -1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        for(int i = j+1;i<arr.length;i++){
            if(arr[i] != 0){
                swap(arr , i ,j);
                j++;
            }
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
     }
     public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
     }
}
