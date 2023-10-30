package Two_Pointers;

import java.util.Arrays;

public class Two_pointers {
    public static void main(String[] args) {
        String word = "ababa";
        System.out.println(word.length()/2);
    }

    public String reversePrefixOfWord(String word, char ch) {
        if (word.length() < 2) {
            return word;
        }
        StringBuilder stringBuilder = new StringBuilder();
        char[] arr = word.toCharArray();
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch) {
                end = i;
                break;
            }
        }
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return String.valueOf(stringBuilder.append(arr));
    }

    public int[][] flipAndInvertImage(int[][] image) {
        int start = 0;
        int endArray = image.length;
        while (start < endArray) {
            int tempStartArray = 0;
            int endSubArray = image[start].length - 1;
            while (tempStartArray < endSubArray) {
                int temp = image[start][tempStartArray];
                image[start][tempStartArray] = image[start][endSubArray];
                image[start][endSubArray] = temp;
                endSubArray--;
                tempStartArray++;
            }
            start++;
        }

        int startArray = 0;
        while (startArray < endArray) {
            int tempStartArray = 0;
            int endSubArray = image[startArray].length;
            for (int i = tempStartArray; i < endSubArray; i++) {
                if (image[startArray][i] == 0) {
                    image[startArray][i] = 1;
                } else {
                    image[startArray][i] = 0;
                }
            }
            startArray++;
        }
        return image;
    }

    public static String firstPalindrome(String[] words) {
        StringBuilder stringBuilder = new StringBuilder();

        int start = 0;
        while (start < words.length) {
            char[] tempArr = words[start].toCharArray();
            int startArr = 0;
            int endArr = tempArr.length - 1;
            while (startArr < endArr) {
                if (tempArr[startArr] == tempArr[endArr]) {
                    if (tempArr.length < 3) {
                        return String.valueOf(stringBuilder.append(tempArr));
                    }
                    startArr++;
                    endArr--;
                } else {
                    break;
                }
            }
            if (tempArr.length % 2 == 0 && endArr - startArr == 1) {
                return String.valueOf(stringBuilder.append(tempArr));
            }
            if (tempArr.length % 2 != 0 && endArr - startArr == 2) {
                return String.valueOf(stringBuilder.append(tempArr));
            } else {
                start++;
            }
        }
        return "";
    }

    public static String firstPalindromeTemp(String[] words) {
        StringBuilder stringBuilder = new StringBuilder();

        int start = 0;
        while (start < words.length) {
            char[] arr = words[start].toCharArray();
            char[] arrDublicate = words[start].toCharArray();
            int startArr = 0;
            int endArr = arrDublicate.length - 1;
            while (startArr < endArr) {
                char temp = arrDublicate[startArr];
                arrDublicate[startArr] = arrDublicate[endArr];
                arrDublicate[endArr] = temp;
                startArr++;
                endArr--;
            }
            if (Arrays.equals(arr, arrDublicate)) {
                return String.valueOf(stringBuilder.append(arr));
            } else {
                start++;
            }
        }
        return "";
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();
        int start = 0;
        int end = Math.min(word1.length(), word2.length());

        while (start < end) {
            stringBuilder.append(arr1[start]).append(arr2[start]);
            start++;
        }
        if (arr1.length < arr2.length) {
            while (start < arr2.length) {
                stringBuilder.append(arr2[start]);
                start++;
            }
        } else {
            while (start < arr1.length) {
                stringBuilder.append(arr1[start]);
                start++;
            }
        }
        return String.valueOf(stringBuilder);
    }
    public static int removePalindromeSub(String s) {
        if(s.length()==0){
            return 0;
        }
        int start = 0;
        while (start<s.length()/2){
            if(s.charAt(start)!=s.charAt(s.length()-1-start++)){
                return 2;
            }
        }
        return 1;
    }
}
