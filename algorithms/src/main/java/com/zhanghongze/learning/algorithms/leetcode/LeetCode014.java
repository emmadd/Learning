package com.zhanghongze.learning.algorithms.leetcode;

public class LeetCode014 {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length<=1){
            return "";
        }

        String str0 = strs[0];
        for(int i=0;i<str0.length();i++){
            char c = str0.charAt(i);
            for(int j = 1; j<strs.length;j++){
                if(strs[j].length() == i || strs[j].charAt(i)!= c){
                    return str0.substring(0,i);
                }
            }
        }

        return str0;
    }
}
