package com.zhanghongze.learning.algorithms.sort;

import java.util.Arrays;

public class BubbleSort<T extends Comparable<T>> {

    public void sort(T [] arr){
        for(int i = arr.length-1; i>0; i--){
            boolean isSort = true;
            for(int j = 0; j<i; j++){
                if(arr[j].compareTo(arr[j+1])>0){
                    T temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;

                    isSort = false;
                }
            }

            if(isSort){
                break;
            }
        }
    }

    public static void main(String [] args){
        BubbleSort bubbleSort = new BubbleSort();

//        Integer[] a = {9,8,7,6,5,4,3,2,1};

        Integer[] a = {3,8,7,6,5,4,2,9,1};

        bubbleSort.sort(a);

        for(int i=0;i< a.length;i++){
            System.out.println(a[i]);
        }
    }
}
