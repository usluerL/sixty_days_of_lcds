package str_arr;

import java.util.Arrays;

public class ProductExceptSelf {

    // 1. Brute Force Solution
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int pro = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i == j) continue;
                pro *= nums[j];

            }
            res[i] = pro;
        }
        return res;
    }

    // Better solution with O(n) space

    public int[] productExceptSelfII(int[] nums) {
        int len = nums.length;
        int[] pre = new int[len];
        int[] post = new int[len];
        int [] ans = new int[len];
        pre[0] = 1;
        post[len - 1] = 1;

        for (int i = 1; i < len; i++) {
            pre[i] = nums[i - 1] * pre[i - 1];
        }

        for (int i = len-2; i >= 0; i--) {
          post[i] = nums[i+1] * post[i+1];
        }

        for (int i = 0; i < len ; i++) {
            ans[i] = post[i] * pre[i];
        }
        return ans;
    }

    public int[] productExceptSelfIII(int[] nums) {
        int len = nums.length;
        int [] ans = new int[len];
        Arrays.fill(ans,1);
        int current = 1;

        for (int i = 0; i < len; i++) {
           ans[i] *= current;
            current *= nums[i];

        }
        current = 1;
        for (int i = len-1; i >= 0; i--) {
            ans[i] *= current;
            current *= nums[i];
        }

        return ans;
    }



    public static void main(String[] args) {
        ProductExceptSelf pr = new ProductExceptSelf();
        int[] nums = {2, 3, 4, 5};
        System.out.println(Arrays.toString(pr.productExceptSelfIII(nums)));
    }


}
