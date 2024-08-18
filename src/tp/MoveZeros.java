package tp;

import java.util.Arrays;

public class MoveZeros {

    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;

        while (j < nums.length) {
            if (nums[j] != 0) {
                swap(nums, i, j);
                i++;
            }
            j++;
        }
    }
    void swap(int[] nums, int i, int j) {
        if (i==j) return;
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 0,4,0,4,0};

        MoveZeros moveZeros = new MoveZeros();
        moveZeros.moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
