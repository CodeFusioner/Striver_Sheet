package Arrays;

import java.util.HashMap;
import java.util.HashSet;

public class FindMissingAndRepeatingNumber {
    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 1, 1};
        int n = 6;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int repeat = -1;
        int missing = -1;
        for (int i = 1; i <= n; i++) {
            if (map.containsKey(i)) {
                int c = map.get(i);
                if(c == 2){
                    repeat = i;
                }
            }else{
                missing = i;
            }
        }
        System.out.println(repeat);
        System.out.println(missing);

    }
}
