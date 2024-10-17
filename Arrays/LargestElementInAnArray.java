package Arrays;

public class LargestElementInAnArray {
    public static void main(String[] args) {
        int [] arr = {3,4,5,1,7,8,99};
        int max = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
