package AlgorithmStudyPlan.Day_2;

import java.util.*;

public class Day_2 {
    public static void main(String[] args) {
        int[]arr = {1,2};
        rotate(arr,3);

    }
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i]= nums[i]*nums[i];
        }
        mergeSortApp(nums, nums.length);
        return nums;
    }
    public void mergeSortApp(int[]arr,int length){
        new Day_2().mergeSort(arr,arr.length);
    }
    public void mergeSort(int[]arr,int length){
        if(length<2){
            return;
        }
        int mid = length/2;

        int[]left = new int[mid];
        int[]right = new int[length-mid];

        System.arraycopy(arr,0,left,0,mid);
        if (length - mid >= 0) System.arraycopy(arr, mid, right, 0, length - mid);

        mergeSort(left,mid);
        mergeSort(right,length-mid);
        merge(arr,right,left,mid,length-mid);
    }
    private void merge(int[] arr, int[] right, int[] left, int l, int r) {

        int i=0,j=0,k=0;
        while (i<l&&j<r){
            if(left[i]<right[j]){
                arr[k++] = left[i++];
            }else {
                arr[k++] = right[j++];
            }
        }
        while (i<l){
            arr[k++] = left[i++];
        }
        while (j<r){
            arr[k++] = right[j++];
        }
    }
    public static void rotate(int[] nums, int k) {
        if (nums.length>1) {
            k%= nums.length;
            reverse(nums, 0, nums.length - 1);
            reverse(nums, 0, k - 1);
            reverse(nums, k, nums.length - 1);
            System.out.println(Arrays.toString(nums));
        }
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
