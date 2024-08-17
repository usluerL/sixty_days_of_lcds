package str_arr;

public class IncreasingTripletSubsequence {
    public static boolean increasingTriplet(int[] nums) {
        int count = 2;
        int prev = nums[0];
        int min = nums[0];


        for (int i = 0; i < nums.length - 1; i++) {
            if (nums.length < 3) return false;
            int next = nums[i + 1];
            min = Math.min(min, next);
            if (next > prev) {
                count--;
                min = prev;
                prev = next;
            } else {
                if (next > min) {
                    count = 1;
                    prev = next;
                }
            }
            if (count == 0) return true;
        }

        return false;
    }

    public static boolean increasingTripletII(int[] nums) {
        int len = nums.length;
        if (len < 3) return false;
        int fistSmall = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= fistSmall) {
                fistSmall = num;
            } else if (num <= secondSmall) {
                secondSmall = num;
            } else return true;

        }
        return false;
    }


    public static void main(String[] args) {
        // Test cases
        int[][] testCases = {
                // Standard cases
                {0, 4, 1, 2},  // True: (1, 2, 3) or (2, 3, 4) or (1, 3, 5)
                {5, 1, 5, 5, 2, 5, 4, 5},  // True: (1, 2, 5)
                {5, 4, 3, 2, 1},  // False: No increasing triplet

                // Edge cases
                {1, 1, 1, 1, 1},  // False: All elements are the same
                {1, 2, 1, 2, 1, 2},  // False: Not enough distinct elements
                {1, 2, 3},  // True: (1, 2, 3) directly
                {3, 1, 4, 2},  // True: (1, 4, 2) but only looking for (1, 2, 4)
                {3, 2, 1, 5, 4, 2},  // False:

                // Large input
                {1, 5, 2, 3, 6, 7, 8, 10, 11, 12, 13},  // True: (1, 2, 3) or (2, 3, 6) or (3, 6, 7) etc.
                {Integer.MAX_VALUE, Integer.MAX_VALUE - 1, Integer.MAX_VALUE - 2}  // False: All elements are decreasing
        };

        // Expected results
        boolean[] expectedResults = {true,  // {1, 2, 3, 4, 5}
                true,  // {5, 1, 5, 5, 2, 5, 4, 5}
                false, // {5, 4, 3, 2, 1}
                false, // {1, 1, 1, 1, 1}
                false, // {1, 2, 1, 2, 1, 2}
                true,  // {1, 2, 3}
                false, // {3, 1, 4, 2}
                true,  // {3, 2, 1, 5, 4, 2}
                false,  // {1, 5, 2, 3, 6, 7, 8, 10, 11, 12, 13}
                false  // {Integer.MAX_VALUE, Integer.MAX_VALUE - 1, Integer.MAX_VALUE - 2}
        };

        // Running the test cases
        for (int i = 0; i < testCases.length; i++) {
            boolean result = increasingTriplet(testCases[i]);
            System.out.println("Test case " + (i + 1) + ": " + result + " (Expected: " + expectedResults[i] + ")");
        }
    }


}
