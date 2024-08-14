package str_arr;

import java.util.Arrays;

public class ReverseWordsStr {

    public String reverseWords(String s) {
        String[] splitArr = Arrays.stream(s.trim().split("\\s+"))
                .filter(word -> !word.isEmpty()).toArray(String[]::new);
        int first = 0;
        int second = splitArr.length-1;
        while (first < second){
            swap(splitArr,first++,second--);
        }
        return String.join(" ", splitArr);
    }

    void swap(String[] arr, int first, int second) {
        String temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {

        ReverseWordsStr pr = new ReverseWordsStr();
        System.out.println(pr.reverseWords("")); // Should print ""
        System.out.println(pr.reverseWords("word")); // Should print "word"
        System.out.println(pr.reverseWords("  multiple   spaces  ")); // Should print "spaces multiple"
        System.out.println(pr.reverseWords("  leading and trailing spaces  ")); // Should print "spaces trailing and leading"
        System.out.println(pr.reverseWords("     ")); // Should print ""
        System.out.println(pr.reverseWords("Mixed CASE words")); // Should print "words CASE Mixed"
        System.out.println(pr.reverseWords("special characters !@#")); // Should print "!@# characters special"
        System.out.println(pr.reverseWords("123 456 789")); // Should print "789 456 123"
        System.out.println(pr.reverseWords("a very long string with many many words to test the performance of the function")); // Should print "function the of performance the test to words many many with string long very a"
        System.out.println(pr.reverseWords("unicode characters 你好 世界")); // Should print "世界 你好 characters unicode"
    }


}
