package com.company.geonyeongkim.week14;

public class LeetCode_189_RotateArray {

    public void rotate(int[] nums, int k) {
        while(k-- > 0) {
            int tmp = nums[nums.length - 1];
            for (int i = nums.length - 2; i >= 0 ; i--) {
                nums[i + 1] = nums[i];
            }
            nums[0] = tmp;
        }
    }

    public static void main(String[] args) {
        LeetCode_189_RotateArray rotateArray = new LeetCode_189_RotateArray();
        rotateArray.rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
        rotateArray.rotate(new int[]{-1, -100, 3, 99}, 2);
        rotateArray.rotate(new int[]{1, 2}, 3);
    }
}
