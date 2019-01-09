package com.zhanghongze.learning.algorithms.sort;

public class SelectionSort<T extends Comparable<T>>{

    public static void sort(int a[]){
        for (int i=0; i<a.length-1; i++){
            int min = i;
            for(int j=i+1;j<a.length; j++){
                if(a[j]< a[min]){
                    min = j;
                }
            }

            if(min > i) {
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
        }
    }

    public void sort2(T [] arr){
        for(int i = arr.length-1; i>0;i--){
            int max = i;
            for(int j = 0;j < i;j++){
                if(arr[j].compareTo(arr[max])>0){
                    max = j;
                }
            }

            if(max<i){
                T temp = arr[i];
                arr[i]= arr[max];
                arr[max] = temp;
            }
        }
    }

    public T findKLargest(T [] arr, int k){
        if(k> arr.length){
            throw new RuntimeException("k大于数组长度");
        }
        for(int i = arr.length-1; i>= arr.length-k; i--){
            int max = i;
            for(int j = 0;j < i;j++){
                if(arr[j].compareTo(arr[max])>0){
                    max = j;
                }
            }

            if(max<i){
                T temp = arr[i];
                arr[i]= arr[max];
                arr[max] = temp;
            }
        }

        return (T)arr[arr.length-k];
    }

    public static void main(String [] args){
        Integer a [] = {1,5,2,4,7};

        SelectionSort selectionSort = new SelectionSort();

//        selectionSort.sort2(a);
        Integer k = (Integer)selectionSort.findKLargest(a, 5);
        System.out.println(k);

        for(int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
