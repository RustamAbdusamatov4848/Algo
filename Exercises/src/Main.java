import Sorts.Sorts;
import Sorts.TestAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        TestAlgo.testAlgo(Sorts.MERGE_SORT,20);
    }
    public static void binarySearch(int[]arr,int targetNum){
        int low = 0;
        int high = arr.length-1;

        while (low<=high){
            int mid = (low + high)/2;
            int currentNum = arr[mid];

            if (currentNum==targetNum){
                System.out.println("Number: " + targetNum + " presents in array"  + "\n" + "it's position is: " + mid);
                return;
            }
            if (currentNum<targetNum) {
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        System.out.println("Number: " + targetNum + " doesn't present in array");
    }
    public static int maximumWealth(int[][] accounts) {
        if(accounts.length<2){
            return -1;
        }
        int sum = 0;
        for (int[] account : accounts) {
            int temp = 0;
            for (int i : account) {
                temp += i;
            }
            if (temp > sum) {
                sum = temp;
            }
        }
        return sum;
    }
    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();

        for (int i = 1; i < n+1; i++) {

            if(i%3==0 && i%5==0){
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            }else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
    public static int numberOfSteps(int num) {
        int step = 0;

        while (num > 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num--;
            }
            step++;
        }
        return step;
    }
}
