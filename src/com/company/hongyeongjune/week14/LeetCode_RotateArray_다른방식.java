package com.company.hongyeongjune.week14;

public class Solution_다른방식 {
    public void rotate(int[] nums, int k) {
        int[] temps = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            temps[(i + k) % nums.length] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = temps[i];
        }
    }
}
