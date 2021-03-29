package com.company.geonyeongkim.week4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by geonyeong.kim on 2021-01-23
 */
public class Boj9205_맥주마시면서걸어가기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        for (int i = 0; i < tc; i++) {
            int marketCnt = sc.nextInt();
            sc.nextLine();

            boolean[] visit = new boolean[marketCnt + 2];
            int[][] point = new int[marketCnt + 2][2];
            Queue<int[]> queue = new LinkedList<>();


            for (int j = 0; j < marketCnt + 2; j++) {
                point[j][0] = sc.nextInt();
                point[j][1] = sc.nextInt();
            }

            int[] start = point[0];
            int[] end = point[marketCnt + 1];

            queue.add(start);
            visit[0] = true;

            String answer = "sad";
            while (!queue.isEmpty()) {

                int[] curr = queue.poll();

                if(curr == end) {
                    answer = "happy";
                    break;
                }

                for (int j = 0; j < marketCnt + 2; j++) {
                    if(!visit[j] && (Math.abs( point[j][0] - curr[0]) + Math.abs(point[j][1] - curr[1])) <= 1000) {
                        queue.add(point[j]);
                        visit[j] = true;
                    }
                }
            }
            System.out.println(answer);
        }
    }
}
