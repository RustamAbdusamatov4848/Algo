package AlgorithmStudyPlan.Day_4;

public class Day_4 {
    public static void main(String[] args) {
        String str = "God Ding";
        //new Day_4().reverseWords(str);
        System.out.println(new Day_4().reverseWords(str));
    }
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        while (start < end) {

            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
        }
    }
    public String reverseWords(String s) {
       String[]arr = s.split(" ");
       StringBuilder result = new StringBuilder();
        for (String value:arr) {
            char[]charArr = value.toCharArray();
            reverse(charArr);
            result.append(charArr).append(" ");
        }
        return result.toString().trim();
    }
    private void reverse(char[]arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
