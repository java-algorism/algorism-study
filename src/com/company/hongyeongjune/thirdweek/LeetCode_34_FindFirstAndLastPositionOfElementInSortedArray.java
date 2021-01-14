package com.company.hongyeongjune.thirdweek;

public class Solution {
    public int[] searchRange(int[] nums, int target) {

        int start = -1;
        int end = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (start == -1) start = i;
                start = Math.min(start, i);
                end = Math.max(end, i);
            }
        }

        int[] answer = {start, end};

        return answer;
    }
}

