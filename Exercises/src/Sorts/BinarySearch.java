package Sorts;

public class BinarySearch {
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
}
