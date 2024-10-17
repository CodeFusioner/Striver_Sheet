package Arrays;

public class ArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(arrayIsSorted(arr));
    }
    public static boolean arrayIsSorted(int[] arr) {
        boolean flag = false;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
