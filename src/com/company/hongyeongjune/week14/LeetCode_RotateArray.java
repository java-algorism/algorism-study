package com.company.hongyeongjune.week14;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public void rotate(int[] nums, int k) {
        Deque<Integer> deque = new LinkedList<>();
        for (int num : nums) deque.add(num);

        for (int i = 0; i < k; i++)
            deque.addFirst(deque.pollLast());

        for (int i = 0; i < nums.length; i++) {
            nums[i] = deque.pollFirst();
        }
    }
}
