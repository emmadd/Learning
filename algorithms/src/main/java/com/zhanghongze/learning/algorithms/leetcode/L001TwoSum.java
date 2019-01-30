package com.zhanghongze.learning.algorithms.leetcode;

import java.util.HashMap;
import java.util.Map;

public class L001TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int [] res = new int[2];
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            int n = target - nums[i];
            if(map.containsKey(n)){
                res[0]= map.get(n);
                res[1]= i;
                break;
            }else {
                map.put(nums[i], i);
            }
        }

        return res;
    }

    public static void main(String [] args){
        int [] nums = {2,7,9,11};

        L001TwoSum twoSum = new L001TwoSum();
        int [] res =twoSum.twoSum(nums, 9) ;
        for(int i: res){
            System.out.print(i);
        }
    }
}
