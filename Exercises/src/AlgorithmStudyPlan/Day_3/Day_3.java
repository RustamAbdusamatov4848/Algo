package AlgorithmStudyPlan.Day_3;

import java.util.Arrays;

public class Day_3 {
    public static void main(String[] args) {
        int[]arr = {5,25,75};
        System.out.println(Arrays.toString(twoSum(arr,100)));
    }
    public static void moveZeroes(int[] nums) {
       int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                nums[j] = nums[i];
                j++;
            }
        }
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];
        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            int sum = numbers[start] + numbers[end];
            if (sum == target) {
                arr[0] = start + 1;
                arr[1] = end + 1;
                break;
            }
            if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
        return arr;
    }
}
