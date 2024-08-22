package sliding_window;

public class MaxAvgSubArr {
    public double findMaxAverage(int[] nums, int k) {
        int first = 0;
        int second = k;
        int len = nums.length;
        double sum = 0.0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double max = sum;
        if (len == k) return sum / len;
        while (second < len) {
            int num2 = nums[second];
            int num1 = nums[first];
            sum += num2 - num1;
            max = Math.max(max, sum);
            first++;
            second++;
        }
        return max / k;
    }

    public static void main(String[] args) {
        MaxAvgSubArr maxAvgSubArr = new MaxAvgSubArr();
        int[] arr = {6, 8, 6, 8, 0, 4, 1, 2, 9, 9};
        System.out.println(maxAvgSubArr.findMaxAverage(arr, 2));
    }
}
