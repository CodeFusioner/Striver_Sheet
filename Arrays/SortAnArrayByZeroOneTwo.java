package Arrays;

public class SortAnArrayByZeroOneTwo {
    public static void main(String[] args) {
        int[] arr = {2, 1, 2, 1, 0, 1, 0, 1, 0};
        sort(arr);
    }

    public static void sort(int[] arr) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count0++;
            }
            if (arr[i] == 1) {
                count1++;
            }
            if (arr[i] == 2) {
                count2++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (count0 > 0) {
                arr[i] = 0;
                count0--;
            } else if ( count1 > 0) {
                arr[i] = 1;
                count1--;
            } else  {
                arr[i] = 2;
                count2--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
