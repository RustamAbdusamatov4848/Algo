package Leetcode75;

import java.util.*;

public class Leetcode75 {
    public static void main(String[] args) {

    }
//    public String gcdOfStrings(String str1, String str2) {
//        if (!(str1 + str2).equals(str2 + str1)) {
//            return "";
//        }
//        int gcd = gcd(str1.length(),str2.length());
//        return str1.substring(0,gcd);
//
//    }
//    private int gcd(int length1, int length2) {
//        if(length2==0){
//            return length1;
//        }else {
//            return gcd(length2,length1%length2);
//        }
//    }
//    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//        List<Boolean> listOfKidsValidate = new ArrayList<>();
//        if(candies.length<2){
//            return listOfKidsValidate;
//        }
//        int max = Integer.MIN_VALUE;
//
//        for (int candy : candies) {
//            if (candy > max) {
//                max = candy;
//            }
//        }
//        for (int candy : candies) {
//            if (candy + extraCandies >= max) {
//                listOfKidsValidate.add(true);
//            } else {
//                listOfKidsValidate.add(false);
//            }
//        }
//        return listOfKidsValidate;
//    }
//    public  String reverseVowels(String s) {
//        StringBuilder stringBuilder = new StringBuilder();
//        char[]arr = s.toCharArray();
//        int start = 0;
//        int end = arr.length-1;
//
//        while (start<end){
//            if(arr[start]==' '){
//                start++;
//            }
//            if (arr[end]==' '){
//                end--;
//            }
//            if(equalsVowel(arr[start])&&equalsVowel(arr[end])){
//                char temp = arr[start];
//                arr[start] = arr[end];
//                arr[end] = temp;
//                start++;
//                end--;
//            }
//            if(!equalsVowel(arr[start])&&equalsVowel(arr[end])){
//                start++;
//            }else {
//                end--;
//            }
//        }
//        return String.valueOf(stringBuilder.append(arr));
//    }
//    private boolean equalsVowel(char vowel){
//        char[]arrVowel = {'a', 'e', 'i', 'o','u','A','E','I','O','U'};
//        for (char v:arrVowel) {
//            if(vowel==v){
//                return true;
//            }
//        }
//        return false;
//    }
//    public String reverseWords(String s) {
//        if(s.length()<2){
//            return s;
//        }
//        s = s.replaceAll("\\s+"," ");
//        StringBuilder stringBuilder = new StringBuilder();
//        String[]arr = s.split(" ");
//        for (int i = arr.length-1 ; i >= 0 ; i--) {
//            stringBuilder.append(arr[i]).append(" ");
//        }
//        return String.valueOf(stringBuilder);
//    }
//    public int[] productExceptSelf(int[] nums) {
//        int[]right = new int[nums.length];
//        int[]left = new int[nums.length];
//        int[]res = new int[nums.length];
//
//        right[0]=1;
//        left[nums.length-1]= 1;
//        for (int i = 1; i < nums.length; i++) {
//            right[i] = right[i-1] * nums[i-1];
//        }
//        for (int i = nums.length-2; i >=0 ; i--) {
//            left[i] = left[i+1]*nums[i+1];
//        }
//        for (int i = 0; i < res.length; i++) {
//            res[i] = right[i] * left[i];
//        }
//        return res;
//    }
//    public boolean increasingTriplet(int[] nums) {
//        if(nums.length<3){
//            return false;
//        }
//        int i = Integer.MAX_VALUE, j = Integer.MAX_VALUE;
//        for (int in = 0; in < nums.length; in++) {
//            if(nums[in]<=i){
//                i = nums[in];
//            }else if(nums[in]<=j){
//                j = nums[in];
//            }else {
//                return true;
//            }
//            System.out.println("I= " + i);
//            System.out.println("J= " + j);
//            System.out.println("____________________________________");
//        }
//        return false;
//    }
//    public void   increasingTriplet(int[] nums) {
//        int[] left = new int[nums.length];
//        int[] right = new int[nums.length];
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < nums.length; i++) {
//            min = Math.min(min, nums[i]);
//            left[i] = min;
//            max = Math.max(max, nums[nums.length - i - 1]);
//            right[nums.length - i - 1] = max;
//        }
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i] + " " + left[i] + " " + right[i]);
//            if (nums[i] > left[i] && nums[i] < right[i]){
//                System.out.println("Got it!");
//            }
//        }

}
