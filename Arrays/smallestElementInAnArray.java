package Arrays;

public class smallestElementInAnArray {
    public static void main(String[] args) {
        int [] arr = {2,3,4,6,1,8,9};
        int smallest = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println(smallest);
    }
}
