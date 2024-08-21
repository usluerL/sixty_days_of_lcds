package str_arr;

import java.util.HashMap;
import java.util.Map;

public class MaxNumOfKSumPairs {

   /* You are given an integer array nums and an integer k.

    In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.

    Return the maximum number of operations you can perform on the array.*/


    //

    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        int count = 0;
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        System.out.println(hm);
        for (int num : nums) {
            int complement = k - num;
            if (hm.get(num) <= 0) {
                continue;
            }
            if (hm.containsKey(complement)) {
                if (num == complement && hm.get(complement) > 1) {
                    count++;
                    hm.put(num, hm.get(num) - 2);


                } else if (num != complement && hm.get(complement) > 0) {
                    count++;
                    hm.put(num, hm.get(num) - 1);
                    hm.put(complement, hm.get(complement) - 1);
                }

            }
        }

        return count;
    }


    //better approach no need to 2 pass array. if absent write, for second pass you can check.
    //todo: check again !
    public int maxOperationsII(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            int complement = k - num;
            if (frequencyMap.getOrDefault(complement, 0) > 0) {
                count++;
                frequencyMap.put(complement, frequencyMap.get(complement) - 1);
            } else {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }
        }
        return count;
    }

        public static void main(String[] args) {
        int[] nums = {2, 5, 4, 4, 1, 3, 4, 4, 1, 4, 4, 1, 2, 1, 2, 2, 3, 2, 4, 2};
        MaxNumOfKSumPairs pr = new MaxNumOfKSumPairs();
        System.out.println(pr.maxOperationsII(nums, 3));

    }

}
