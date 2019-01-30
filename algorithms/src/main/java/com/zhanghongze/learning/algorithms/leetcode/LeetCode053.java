package com.zhanghongze.learning.algorithms.leetcode;

public class LeetCode053 {

    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length==0){
            return 0;
        }

        int subSum [] =  new int [nums.length];

        subSum[0] = nums[0];

        int max = subSum[0];
        for(int i = 1; i< nums.length;i++){
            if(subSum[i-1] > 0){
                subSum[i] = subSum[i-1] + nums[i];
            }else {
                subSum[i] = nums[i];
            }

            max = Math.max(max, subSum[i]);
        }

        return max;
    }

}
