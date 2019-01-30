package com.zhanghongze.learning.algorithms.sort;

public class InsertSort<T extends Comparable<T>> {

    /**
     * 1,2,3,4,5,6
     * @param arr
     */
    public void sort(T [] arr){
        if(arr == null){
            return ;
        }
        if(arr.length <=1){
            return ;
        }
        int n = arr.length;

        for(int i=1;i<n;i++){
            for(int j= i;j>0 && arr[j-1].compareTo(arr[j])>0; j--){
                T temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }
    }
    public static void main(String [] args){
        InsertSort<Integer> insertSort = new InsertSort<Integer>();

//        Integer[] a = {9,8,7,6,5,4,3,2,1};

        Integer[] a = {3,8,7,6,5,4,2,9,1};

        insertSort.sort(a);

        for(int i=0;i< a.length;i++){
            System.out.println(a[i]);
        }
    }

}