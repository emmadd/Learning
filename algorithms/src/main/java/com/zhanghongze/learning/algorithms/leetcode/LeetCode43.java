package com.zhanghongze.learning.algorithms.leetcode;

public class LeetCode43 {
    public String multiply(String num1, String num2) {
        int result [] = new int [num1.length()+ num2.length()];

        for(int i = num1.length()-1; i>=0;i--){
            for(int j = num2.length()-1; j>=0;j--){
                result[j+i+1] = result[j+i+1] + (num2.charAt(j)-'0') * (num1.charAt(i)-'0');
            }
        }

        int a = 0;
        int b = 0;
        for(int k = result.length-1;k>=0; k--){
            a = (b+ result[k])%10;
            b = (b+ result[k])/10;
            result[k] = a;
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<result.length;i++){
            sb.append(result[i]);
        }

        String l = sb.toString();
        while(l.length()>0 && l.charAt(0)=='0') l = l.substring(1);

        return l;
    }

    public static void main(String [] args){
        LeetCode43 leetCode43 = new LeetCode43();
        leetCode43.multiply("2", "3");
    }
}
