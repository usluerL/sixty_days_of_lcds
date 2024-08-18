package tp;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int maxAr = 0;

        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int width = j - i;
                int h = Math.min(height[j], height[i]);
                int area = width * h;
                maxAr = Math.max(area, maxAr);
            }
        }
        return maxAr;
    }

    public static int maxArea2(int[] height) {
        int len = height.length;
        int maxAr = 0;
        int left = 0;
        int right = len-1;

        while (left < right){
            int w = right-left;
            int h = Math.min(height[right], height[left]);
            int area =  w * h;
            maxAr = Math.max(maxAr,area);

            if (height[left] <= height[right] ) {
                left ++;
            } else right --;
        }
        return maxAr;
    }



        public static void main(String[] args) {
            // Test case 1
            int[] heights1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
            // Expected output: 49

            // Test case 2
            int[] heights2 = {1, 1};
            // Expected output: 1

            // Test case 3
            int[] heights3 = {4, 3, 2, 1, 4};
            // Expected output: 16

            // Test case 4
            int[] heights4 = {1, 2, 1, 2, 1};
            // Expected output: 4

            // Test case 5
            int[] heights5 = {5, 1, 4, 2, 3, 1, 6};
            // Expected output: 30

            // Test case 6
            int[] heights6 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            // Expected output: 25

            // Test case 7
            int[] heights7 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
            // Expected output: 25

            // Test case 8
            int[] heights8 = {7, 1, 2, 3, 9};
            // Expected output: 18

            // Test case 9
            int[] heights9 = {3, 5, 3, 3, 5, 2, 4};
            // Expected output: 15

            // Test case 10
            int[] heights10 = {6, 6, 6, 6, 6, 6, 6};
            // Expected output: 36

            // Print test cases for verification
            System.out.println("Test Case 1: " + maxArea(heights1));
            System.out.println("Test Case 2: " + maxArea(heights2));
            System.out.println("Test Case 3: " + maxArea(heights3));
            System.out.println("Test Case 4: " + maxArea(heights4));
            System.out.println("Test Case 5: " + maxArea(heights5));
            System.out.println("Test Case 6: " + maxArea(heights6));
            System.out.println("Test Case 7: " + maxArea(heights7));
            System.out.println("Test Case 8: " + maxArea(heights8));
            System.out.println("Test Case 9: " + maxArea(heights9));
            System.out.println("Test Case 10: " +maxArea(heights10));

            System.out.println("Test Case 1: " + maxArea2(heights1));
            System.out.println("Test Case 2: " + maxArea2(heights2));
            System.out.println("Test Case 3: " + maxArea2(heights3));
            System.out.println("Test Case 4: " + maxArea2(heights4));
            System.out.println("Test Case 5: " + maxArea2(heights5));
            System.out.println("Test Case 6: " + maxArea2(heights6));
            System.out.println("Test Case 7: " + maxArea2(heights7));
            System.out.println("Test Case 8: " + maxArea2(heights8));
            System.out.println("Test Case 9: " + maxArea2(heights9));
            System.out.println("Test Case 10: " +maxArea2(heights10));
        }
    }


