package Arrays;
import java.util.Arrays;
public class SecondSmallestElementInAnArray {
    public static void main(String[] args) {
//        int [] arr = {2,1,1,1,1,8,9};
//        // brute force
//        Arrays.sort(arr);
//        int smallest = arr[0];
//        for(int i = 1; i < arr.length; i++ ){
//            if(arr[i] != smallest){
//                smallest = arr[i];
//                break;
//            }
//        }
//        System.out.println(smallest);

        // optimal
        int [] arr1 = {41,1,28,2,92,97,1,87};
        int smallest1 = arr1[0];
        for(int i = 1; i < arr1.length; i++ ){
            if(arr1[i] < smallest1){
                smallest1 = arr1[i];
            }
        }
        int secondSmallest = Integer.MAX_VALUE;
        for(int i = 0;i<arr1.length;i++){
            if(arr1[i] <secondSmallest && arr1[i] != smallest1){
                secondSmallest = arr1[i];
            }
        }
        System.out.println(secondSmallest);
        System.out.println(smallest1);


    }
}
