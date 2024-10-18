package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class findTheNumberThatAppearsOneInTheArray {
    public static void main(String[] args) {
        // first approach
        int [] arr = {1,2,2,3,1,4,5,5,3,1};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i] , map.getOrDefault(arr[i] , 0) + 1);
        }
        for(int key:map.keySet()){
            if(map.get(key) == 1){
                System.out.println(key);
            }
        }

        // Second Approach
        int [] arr2 = {1,2,2,3,1};
        int xor1 = 0;
        for(int i=0;i<arr2.length;i++){
            xor1 ^= arr2[i];
        }
        System.out.println(xor1);
    }
}
