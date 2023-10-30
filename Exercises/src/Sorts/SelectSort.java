package Sorts;

public class SelectSort implements Sort{
    @Override
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<min){
                    min = arr[j];
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
