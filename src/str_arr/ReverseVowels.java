package str_arr;


public class ReverseVowels {
    String VOWELS = "aeiouAEIOU";

    public String reverseVowels(String s) {
      int first = 0;
      int second = s.length() - 1;
      char[] arr = s.toCharArray();
      while (first < second) {
          if (!isInVowelsString(arr[first])) {
              first++;
          } else if (!isInVowelsString(arr[second])) {
              second--;
          } else {
              swap(arr, first++, second--);
          }
      }


      return new String(arr);
    }

    void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    boolean isInVowelsString(char c) {
        return VOWELS.indexOf(c) != -1;
    }

    public static void main(String[] args) {
        ReverseVowels rv = new ReverseVowels();
        System.out.println(rv.reverseVowels("hello"));
        System.out.println(rv.reverseVowels("leetcode"));
    }

}


