package com.zhanghongze.learning.algorithms.leetcode;

/**
 * https://zhuanlan.zhihu.com/p/39129143
 *
 * 1 2 4 6
 * 3 5 7 8 9
 */
public class L004FindMedianSortedArrays {

    public double findMedianSortedArrays(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;

        if(m>n){
            int [] temp = A;
            A = B;
            B = temp;

            m=A.length;
            n=B.length;
        }

        int iMin = 0;
        int iMax = m;
        int halfLength = (m+n+1)/2;
        while (iMin <= iMax){
            int i = (iMin+iMax)/2;
            int j = halfLength-i;
            if(i<iMax && B[j-1]> A[i]){
                iMin = i+1;
            }else if(i>iMin && B[j]<A[i-1]){
                iMax= i-1;
            }else{
                int maxLeft = 0;
                if(i==0){
                    maxLeft = B[j-1];
                }else if(j==0){
                    maxLeft = A[i-1];
                }else {
                    maxLeft = Math.max(A[i-1], B[j-1]);
                }

                if((m+n)%2 == 1){
                    return maxLeft;
                }

                int minRight=0;
                if(i==m){
                    minRight = B[j];
                }else if(j==n){
                    minRight = A[i];
                }else {
                    minRight = Math.min(A[i],B[j]);
                }

                return (maxLeft+minRight)/2.0;
            }
        }

        return 0.0;
    }

    public static void main(String [] args){
        int A [] = {1,3};
        int B [] = {2};
        L004FindMedianSortedArrays solution = new L004FindMedianSortedArrays();
        double median= solution.findMedianSortedArrays(A, B);
        System.out.println(median);
    }
}
