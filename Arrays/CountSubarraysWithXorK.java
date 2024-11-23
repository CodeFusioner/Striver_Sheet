package Arrays;

public class CountSubarraysWithXorK {
    public static void main(String[] args) {
        int [] arr = {4,2,2,6,4};
        int K = 6;
        int count = 0;
//         brute force
        for(int i = 0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                int xor = 0;
                for(int k = i;k<=j;k++){
                    xor ^= arr[k];
                }
                if(xor == K){
                    count++;
                }
            }
        }
        System.out.println(count);

        // better solution

//        for(int i=0; i<arr.length; i++){
//            int xor = 0;
//            for(int j=i; j<arr.length; j++) {
//                xor ^= arr[j];
//                if (xor == K) {
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);



    }
}
