package com.zhanghongze.learning.algorithms.sort;

public class MergeSort<T extends Comparable<T>> {

    public void sort(T[] arr){
        sort(arr, 0, arr.length-1);
    }

    private void sort(T[] arr, int low, int upper){
        if(upper<= low){
            return ;
        }

        int mid = low + (upper-low)/2;
        sort(arr, low, mid);
        sort(arr, mid+1, upper);

        merge(arr, low, mid, upper);
    }

    private void merge(T[] arr, int low, int mid, int upper){
        System.out.println(low+","+mid+","+upper);
        T [] tempArr = (T[])new Comparable[upper+1];
        int i=low; int j = mid+1;
        for(int k = low;k<=upper;k++){
            tempArr[k]=arr[k];
        }

        for(int k=low;k<=upper;k++){
            if(i>mid){
                arr[k] = tempArr[j++];
            }else if(j>upper){
                arr[k] = tempArr[i++];
            }else if(tempArr[i].compareTo(tempArr[j])>0){
                arr[k] = tempArr[j++];
            }else {
                arr[k] = tempArr[i++];
            }
        }
    }

    public static void main(String [] args){
        MergeSort mergeSort = new MergeSort();

//        Integer[] a = {9,8,7,6,5,4,3,2,1};

        Integer[] a = {3,8,7,6,5,4,2,9,1};

        mergeSort.sort(a);

        for(int i=0;i< a.length;i++){
            System.out.println(a[i]);
        }
    }
}
