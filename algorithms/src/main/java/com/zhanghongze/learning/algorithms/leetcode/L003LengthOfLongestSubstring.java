package com.zhanghongze.learning.algorithms.leetcode;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class L003LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        int [] index = new int[256];
        int ans = 0;
        for(int i=0,j=0; j<s.length();j++){
           i = Math.max(i,index[s.charAt(j)]);
           ans = Math.max(ans, j+1-i);

           index[s.charAt(j)]= j+1;
        }

        return ans;
    }

    public static void main(String [] args){
        L003LengthOfLongestSubstring leetCode = new L003LengthOfLongestSubstring();
        int i = leetCode.lengthOfLongestSubstring("abcabcbb");

        System.out.println(i);
    }
}
