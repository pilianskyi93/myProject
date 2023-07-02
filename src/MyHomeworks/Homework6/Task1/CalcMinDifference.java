package MyHomeworks.Homework6.Task1;

import java.util.Arrays;

public class CalcMinDifference {
    public static int minDifference(int[] arr) {

        int minDiff = Integer.MAX_VALUE;

        //comparing difference of all pairs in array
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int diff = Math.abs(arr[i] - arr[j]); //getting absolute difference between pair of numbers
                if (diff < minDiff) {
                    minDiff = diff;
                }
            }
        }
        return minDiff;
    }

    public static void main(String[] args) {
        int[] arr = {5, 11, 7, 20};
        int leastDiff = minDifference(arr);
        System.out.println("The least difference between all numbers in the array is: " + leastDiff);

    }
}