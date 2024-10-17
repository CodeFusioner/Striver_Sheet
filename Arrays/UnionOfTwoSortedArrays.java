package Arrays;
import java.util.*;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4};
        int [] arr2 = {5,2,3,4,6};
        int [] arr = unionOfTwoSortedArrays(arr1, arr2);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] unionOfTwoSortedArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0;
        int j = 0;
        List<Integer> list = new ArrayList<>();
        while (i < n1 && j < n2) {
            if(arr1[i] <= arr2[j]){
                if(!list.contains(arr1[i])){
                    list.add(arr1[i]);
                }
                i++;
            }else{
                if(!list.contains(arr2[j])){
                    list.add(arr2[j]);
                }
                j++;
            }
        }
        while(j<n2){
            if(!list.contains(arr2[j])){
                list.add(arr2[j]);
            }
            j++;
        }
        while(i<n1){
            if(!list.contains(arr1[i])){
                list.add(arr1[i]);
            }
            i++;
        }
        int[] arr = new int[list.size()];
        for(int k = 0; k < arr.length; k++){
            arr[k] = list.get(k);
        }
        return arr;
    }
}
