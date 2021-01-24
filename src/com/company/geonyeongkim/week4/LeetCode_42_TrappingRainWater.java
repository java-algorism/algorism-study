package com.company.geonyeongkim.week4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by geonyeong.kim on 2021-01-24
 */
public class LeetCode_42_TrappingRainWater {

    public int trap(int[] height) {
        int answer = 0;
        for (int i = 0; i < height.length - 1; i++) {

            if (height[i] > height[i + 1]) {

                int h = height[i];
                int cnt = 0;
                boolean flag = false;
                List<int[]> list = new ArrayList<>();

                for (int j = i + 1; j < height.length; j++) {
                    if (height[j] >= h) {
                        i = j - 1;
                        flag = true;
                        break;
                    }
                    cnt += (h - height[j]);
                    list.add(new int[]{j, (h - height[j])});
                }
                if (flag) {
                    answer += cnt;
                    for (int[] ints : list) {
                        height[ints[0]] += ints[1];
                    }
                }
            }
        }

        for (int i = height.length - 1; i > 0; i--) {
            if (height[i] > height[i - 1]) {

                int h = height[i];
                int cnt = 0;
                boolean flag = false;

                for (int j = i - 1; j >= 0; j--) {
                    if (height[j] >= h) {
                        i = j + 1;
                        flag = true;
                        break;
                    }
                    cnt += (h - height[j]);
                }
                if (flag) {
                    answer += cnt;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        LeetCode_42_TrappingRainWater trappingRainWater = new LeetCode_42_TrappingRainWater();
        int ans1 = trappingRainWater.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});
        System.out.println(ans1);

        int ans2 = trappingRainWater.trap(new int[]{4, 2, 0, 3, 2, 5});
        System.out.println(ans2);

        int ans3 = trappingRainWater.trap(new int[]{4, 2, 3});
        System.out.println(ans3);
    }
}
