package com.zhanghongze.learning.algorithms.leetcode;

public class LeetCode42 {
    public int trap(int[] height) {
        if(height == null || height.length<2){
            return 0;
        }

        int leftMax = height[0];
        int rightMax = height[height.length-1];

        int start = 0;
        int end = height.length-1;

        int sum = 0;

        while (start<=end){
            leftMax = Math.max(leftMax, height[start]);
            rightMax = Math.max(rightMax, height[end]);

            if(leftMax < rightMax){
                sum = sum+ leftMax-height[start];
                start ++;
            }else {
                sum = sum+ rightMax-height[end];
                end --;
            }
        }

        return sum;
    }
}
