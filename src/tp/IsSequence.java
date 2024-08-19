package tp;


//todo: optimize the solutions. follow up will be added.

public class IsSequence {
    public boolean isSubsequence(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        if (sLen > tLen) return false;
        if (sLen == 0) return true;
        int first = 0;
        int second = 0;

        while (second < tLen) {
            if (s.charAt(first) == t.charAt(second)) {
                first++;
                if (first == sLen) return true;
            }
            second++;
        }


        return false;
    }

    public static void main(String[] args) {
        IsSequence pr = new IsSequence();
        System.out.println(pr.isSubsequence("qq", ""));
        System.out.println(pr.isSubsequence("acb", "ahbgdc"));

    }
}
