package Arrays;
import java.util.*;

public class LeadersInAnArray {
    public static void main(String[] args) {
        int [] arr = {10,22,12,3,0,6};
        List<Integer> ll = leader(arr);
        System.out.println(ll);
    }
    public static List<Integer> leader(int [] arr){
        // brute force
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<arr.length;i++){
            boolean leader = true;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j] > arr[i]){
                    leader = false;
                }
            }
            if(leader){
                list.add(arr[i]);
            }
        }
        return list;
    }
}
