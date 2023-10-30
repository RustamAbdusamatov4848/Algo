package AlgorithmStudyPlan.Day_1;



public class Day_1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 6};
        System.out.println(searchInsert(arr, 5));
    }

    public static int binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int searchInsert(int[] nums, int target) {
        int foundPosition = findPosition(nums, target);
        if(foundPosition==-1) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > target) {
                    return i;
                }
                if(i+1==nums.length){
                    return i+1;
                }
            }
        }
        return foundPosition;
    }

    private static int findPosition(int[]arr,int target){
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int curInt = arr[mid];
            if (curInt == target) {
                return mid;
            }
            if (target > curInt) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
