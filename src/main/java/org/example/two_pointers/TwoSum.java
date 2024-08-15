package org.example.two_pointers;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int [] numbers = {-1,0};
        int[] ints = twoSum(numbers, -1);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] twoSum(int[] numbers, int target) {

        //Create a left pointer at the start of the array
        int left = 0;

        //Create a right pointer at the end of the array
        int right = numbers.length - 1;


        //Iterate and Compare the sum of the left and right pointers to the target
        while(left < right) {
            int sum = numbers[left] +  numbers[right];
            if (sum == target) {
                return new int[] {left+ 1, right+ 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[0];
    }
}
