package str_arr;

public class MergeStringsAlternately {

    public String mergeAlternately(String word1, String word2) {

        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i < word1.length() && j < word2.length()) {
            sb.append(word1.charAt(i++));
            sb.append(word2.charAt(j++));
        }
        if (i < word1.length()) {
            sb.append(word1.substring(i));
        }else if (j < word2.length()) {
            sb.append(word2.substring(j));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        MergeStringsAlternately msa = new MergeStringsAlternately();
        System.out.println(msa.mergeAlternately("abc", "pqr"));
        System.out.println(msa.mergeAlternately("ab", "pqrs"));
        System.out.println(msa.mergeAlternately("abcd", "pq"));
    }
}

