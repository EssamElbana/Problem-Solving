package main;

public class MaxSumSubArrayOfSizeK {

    public static void main(String[] args) {
        System.out.println("result: " + findMaxSumSubArray(2, new int[]{
                2, 3, 4, 1, 5
        }));

    }

    // a better solution with Big O(N) time complexity
    public static int findMaxSumSubArray(int k, int[] arr) {
        int max = 0;
        int windowStart = 0;
        int sum = 0;
        for(int windowEnd = 0; windowStart <= arr.length- k; windowEnd++) {
            sum += arr[windowEnd];
            if(windowEnd - windowStart == k - 1) {
                if(max < sum) max = sum;
                sum = sum - arr[windowStart];
                windowStart++;
            }
        }
        return max;
    }

    // time O(N*K) a better solution can be found.
//    public static int findMaxSumSubArray(int k, int[] arr) {
//        int max = 0;
//        for (int i = 0; i < arr.length - k; i++) {
//            int sum = 0;
//            for(int j = i; j < i + k; j++) {
//                sum += arr[j];
//            }
//            if (max < sum) max = sum;
//        }
//
//        return max;
//    }
}
