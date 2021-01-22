package main;

import java.util.HashMap;

public class MinSizeSubArraySum {


    public static void main(String[] args) {
//        System.out.println(findMinSubArray(7, new int[] {
//                2, 1, 5, 2, 8
//        }));
        System.out.println(findMinSubArray(3, new int[] {
               1,1
        }));
    }

    // using sliding window (a non-fixed size one)
    // Time complexity O(2n) ----> O(n)
    public static int findMinSubArray(int S, int[] arr) {
        int minSubArray = Integer.MAX_VALUE;
        int sum = 0;
        int windowStart = 0;
        // shrink the window as small as possible until the 'windowSum' is smaller than 'S'
        for(int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            sum += arr[windowEnd];
            while (sum >= S) {
                minSubArray = Math.min(minSubArray, windowEnd - windowStart + 1);
                sum = sum - arr[windowStart];// subtract the element going out
                windowStart++;// slide the window ahead
            }
        }
        return minSubArray == Integer.MAX_VALUE ? 0 : minSubArray;
    }


    // this is a big O(n^2) a better approach can be found.
    // min sub array that is contiguous and greater than
    // or equal the given S.
//    public static int findMinSubArray(int S, int[] arr) {
////        Input: [2, 1, 5, 2, 3, 2], S=7
////        Output: 2
////        Explanation: The smallest subarray with a sum great than or equal to '7' is [5, 2].
//        int min = arr.length;
//        for(int i = 0; i < arr.length; i++) {
//            int sum = 0;
//            for(int j = i; j < arr.length; j++) {
//                sum += arr[j];
//                if(sum >= S) {
//                    min = Math.min(min, j-i+1);
//                    break;
//                }
//            }
//
//        }
//        return min;
//    }
}
