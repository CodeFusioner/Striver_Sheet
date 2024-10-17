package Arrays;

import java.util.*;

public class intersectionBetweenTwoSortedArrays {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,6,2};
        int [] arr2 = {5,2,3,4,6,2,2,2};
        List<Integer> intersection = intersection(arr1, arr2);
        System.out.println(intersection);

    }
    public static List<Integer> intersection(int[] arr1, int[] arr2) {
        List<Integer> intersection = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            map.put(arr1[i] , map.getOrDefault((arr1[i]),0)+1);
        }
        for(int key:arr2){
            if(map.containsKey(key) && map.get(key)>0){
                intersection.add(key);
                map.put(key , map.get(key)-1);
            }
        }
        return intersection;
    }
}
