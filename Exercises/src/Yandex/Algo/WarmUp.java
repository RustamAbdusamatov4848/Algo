package Yandex.Algo;

import java.util.Arrays;

public class WarmUp {
    public static String isAnagram(String firstWord,String secondWord){
        if (firstWord == null || secondWord == null){
            return "NO";
        }
        boolean flag = false;
        char[]arr1 = firstWord.toCharArray();
        char[]arr2 = secondWord.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]!=arr2[i]){
                flag = true;
                break;
            }
        }
        return flag ? "NO" : "YES";
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("rat","bat"));
    }
}
