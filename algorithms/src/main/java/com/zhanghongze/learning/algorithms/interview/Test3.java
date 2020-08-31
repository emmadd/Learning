package com.zhanghongze.learning.algorithms.interview;

public class Test3 {

    public static void main(String [] args){
        Test3 test3 = new Test3();
        int n = test3.dp(5);
        System.out.println(n);
    }

    /**
     * @param n
     * @return
     */
    public int dp(int n){
        int [] dp = new int [n+1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        if(n<3){
            return dp[n];
        }

        for(int i = 3;i<= n; i++){
            dp [i] = dp[i-3] + dp[i-2] + dp[i-1];
        }

        return dp[n];

    }
}
