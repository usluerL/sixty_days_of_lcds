package str_arr;

public class GCDofStrings {

    public String gcdOfStrings(String str1, String str2) {
        if (str1.length() < str2.length()) {
            return gcdOfStrings(str2, str1);
        }
        if (str2.isEmpty()) {
            return str1;
        }
        if (str1.startsWith(str2)) {
            return gcdOfStrings(str1.substring(str2.length()), str2);
        }
        return "";
    }



    //Approach 2: GCD of Strings (Optimized), mathematical
    // approach using Euclidean algorithm and also very sophisticated
    public String gcdOfStringsII(String str1, String str2) {
        // Check if concatenating str1 and str2 in both orders gives the same result
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Find the GCD of the lengths of str1 and str2
        int gcdLength = gcd(str1.length(), str2.length());

        // Return the prefix of str1 up to the GCD length
        return str1.substring(0, gcdLength);
    }

    // Helper method to find the GCD of two numbers using the Euclidean algorithm
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }


    public static void main(String[] args) {
        GCDofStrings gcd = new GCDofStrings();
        System.out.println(gcd.gcdOfStrings("ABCABC", "ABC"));
        System.out.println(gcd.gcdOfStrings("ABAB", "ABAB"));
        System.out.println(gcd.gcdOfStrings("ABABAB", "ABAB"));

        System.out.println(gcd.gcdOfStrings("LEET", "CODE"));


        System.out.println(gcd.gcdOfStringsII("ABCABC", "ABC"));
        System.out.println(gcd.gcdOfStringsII("ABAB", "ABAB"));
        System.out.println(gcd.gcdOfStringsII("LEET", "CODE"));
        System.out.println(gcd.gcdOfStringsII("ABABAB", "ABAB"));


    }







}



