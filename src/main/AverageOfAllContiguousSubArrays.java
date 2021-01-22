package main;

public class AverageOfAllContiguousSubArrays {

    // input Array: [1, 3, 2, 6, -1, 4, 1, 8, 2], K=5
    // Output: [2.2, 2.8, 2.4, 3.6, 2.8]

    // breakdown
    /*
    For the first 5 numbers (subarray from index 0-4),
    the average is: (1+3+2+6−1)/5=>2.2(1+3+2+6-1)/5 => 2.2(1+3+2+6−1)/5=>2.2
    The average of next 5 numbers (subarray from index 1-5)
    is: (3+2+6−1+4)/5=>2.8(3+2+6-1+4)/5 => 2.8(3+2+6−1+4)/5=>2.8
    For the next 5 numbers (subarray from index 2-6),
    the average is: (2+6−1+4+1)/5=>2.4(2+6-1+4+1)/5 => 2.4(2+6−1+4+1)/5=>2.4
    */

    public static void main(String[] args) {
        double[] result = findAverages(5, new int[]{
                1, 3, 2, 6, -1, 4, 1, 8, 2
        });
        System.out.print("result: [");
        String output = "";
        for(double n: result)
            output += n + ", ";
        output = output.substring(0, output.length() - 2);
        System.out.print(output + "]");
    }

    // this is a sliding window problem.
    // where you reach the result with a better and smoother approach.

    public static double[] findAverages(int k, int[] arr) {
        double[] result = new double[arr.length - k + 1];
        int windowStart = 0;
        double sum = 0;
        for(int windowEnd = 0; windowStart <= arr.length - k; windowEnd++) {
            sum += arr[windowEnd];
            if(windowEnd - windowStart == k - 1) {
                result[windowStart] = sum / k;
                sum = sum - arr[windowStart];
                windowStart++;
            }
        }
        return result;
    }

    // Time -> Big O -> O(n * k)
//    public static double[] findAverages(int k, int[] arr) {
//        double[] result = new double[arr.length - k + 1];
//
//        for (int i = 0; i <= arr.length - k; i++) {
//            double sum = 0;
//            for (int j = i; j < i + k; j++) {
//                sum += arr[j];
//            }
//            result[i] = sum / k;
//        }
//        return result;
//    }
}
