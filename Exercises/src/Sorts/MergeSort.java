package Sorts;

public class MergeSort implements Sort{
    @Override
    public void sort(int[] arr) {
        mergeSort(arr);
    }

    private void mergeSort(int[] arr) {
        int arrLength = arr.length;
        if (arr.length<2){
            return;
        }
        int mid = arrLength/2;

        int[]left = new int[mid];
        int[]right = new int[arrLength-mid];

        System.arraycopy(arr,0,left,0,mid);
        if (arrLength - mid >= 0) System.arraycopy(arr,mid,right,0,arrLength-mid);

        mergeSort(left);
        mergeSort(right);

        merge(arr,left,right,mid,arrLength-mid);
    }

    private void merge(int[] arr, int[] left, int[] right, int l, int r) {
        int i= 0,j = 0,k = 0;

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
}
