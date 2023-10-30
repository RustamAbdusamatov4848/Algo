package Sorts;

import java.util.Arrays;
import java.util.Random;

public class TestAlgo {
    private static Sort sort;
    public static void testAlgo(Sorts typeOfSorts,int size){
        int[]arr = generateArr(size);
        System.out.println("Before: " + Arrays.toString(arr));

        switch (typeOfSorts){
            case BUBBLE_SORT -> sort = new BubbleSort();
            case SELECT_SORT -> sort = new SelectSort();
            case INSERT_SORT -> sort = new InsertSort();
            case MERGE_SORT -> sort = new MergeSort();
        }
        sort.sort(arr);
        System.out.println("After: " + Arrays.toString(arr) + "\n");
        System.out.println(isAlgoRightOrder(arr) ? "Algorithm is right" : "Algorithm is wrong" );
    }
    private static int[] generateArr(int size){
        Random random = new Random();
        int[]arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000);
        }
        return arr;
    }
    private static boolean isAlgoRightOrder(int[]arr){
        boolean flag = true;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]>arr[i+1]){
                flag= false;
                break;
            }
        }
        return flag;
    }

}
