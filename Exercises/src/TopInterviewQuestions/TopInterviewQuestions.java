package TopInterviewQuestions;

import java.util.*;

public class TopInterviewQuestions {
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        new TopInterviewQuestions().merge(arr,3,arr2,arr2.length);
    }

    public int[] sum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)) {
                return new int[]{i, map.get(temp)};
            }
        }
        return new int[]{-1, -1};
    }

    public int romanToInt(String s) {
        if (s.length() < 1) {
            return -1;
        }
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            stack.add(arr[i]);
        }
        int result = 0;
        int temp_result = 0;
        while (!stack.empty()) {
            int temp_num = fromRomToInteger(stack.pop());
            if (temp_num >= temp_result) {
                result += temp_num;
            }
            if (temp_num < temp_result) {
                result -= temp_num;
            }
            temp_result = temp_num;
        }
        return result;
    }

    private int fromRomToInteger(Character character) {
        switch (character) {
            case 'I' -> {
                return 1;
            }
            case 'V' -> {
                return 5;
            }
            case 'X' -> {
                return 10;
            }
            case 'L' -> {
                return 50;
            }
            case 'C' -> {
                return 100;
            }
            case 'D' -> {
                return 500;
            }
            case 'M' -> {
                return 1000;
            }
            default -> {
                return -1;
            }
        }
    }

    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int count = 0;
        int length = Math.min(strs[0].length(), strs[strs.length - 1].length());
        for (int i = 0; i < length; i++) {
            if (strs[0].charAt(i) == strs[strs.length - 1].charAt(i)) {
                count++;
            } else {
                break;
            }
        }
        return strs[0].substring(0, count);
    }

    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(']', '[');
        map.put('}', '{');
        map.put(')', '(');

        for (Character c : s.toCharArray()) {
            if (map.containsValue(c)) {
                st.push(c);
            } else if (map.containsKey(c)) {
                if (st.isEmpty() || st.pop() != map.get(c)) {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (true) {
            if (list1 == null) {
                tail.next = list2;
                break;
            }
            if (list2 == null) {
                tail.next = list1;
                break;
            }
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        return dummy.next;
    }

    public static int removeDuplicates(int[] nums) {
        int result = 1;
        int j = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[j++] = nums[i + 1];
                result++;
            }
        }
        System.gc();
        return result;
    }

    public int strStr(String haystack, String needle) {
        int start = 0;
        int end = needle.length();
        while (end <= haystack.length()) {
            String temp = haystack.substring(start, end);
            if (temp.equals(needle)) {
                return start;
            }
            start++;
            end++;
        }
        return -1;
    }

    public int[] plusOne(int[] digits) {
        digits[digits.length - 1] += 1;

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 10) {
                digits[i] = 0;
                if (i > 0) {
                    digits[i - 1]++;
                } else {
                    break;
                }
            } else {
                return digits;
            }
        }

        int[] arr;
        if (digits[0] == 0) {
            arr = new int[digits.length + 1];
            arr[0] = 1;
            for (int i = 1; i < arr.length; i++) {
                arr[i] = digits[i - 1];
            }
            return arr;
        }
        return null;
    }

    public int mySqrt(int x) {
        if(x==0) return 0;
        int low = 1,high = x,ans =0;
        while(low<=high){
            int mid =low + (high-low)/2;
            if(x/mid==mid)  return mid;
            else if(x/mid<mid)   high=mid-1;
            else {low = mid+1; ans = mid;}
        }
        return ans;
    }
    public int climbStairs(int n) {
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.println(Arrays.toString(arr));
        return arr[arr.length-1] + arr[arr.length-2];
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {

    }
    
}
