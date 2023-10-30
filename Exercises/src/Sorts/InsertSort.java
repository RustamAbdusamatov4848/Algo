package Sorts;

public class InsertSort implements Sort{
    @Override
    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int index = i;
            int currentNum = arr[i];
            while (index>0 && arr[index-1]>currentNum){
                arr[index] = arr[index-1];
                index--;
            }
            arr[index] = currentNum;
        }
    }
}
