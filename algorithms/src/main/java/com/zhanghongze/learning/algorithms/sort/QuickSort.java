package com.zhanghongze.learning.algorithms.sort;

public class QuickSort<T extends Comparable<T>> {

    public void sort(T []arr){
        sort(arr,0, arr.length-1);
    }

    public void sort(T [] arr, int l, int h){
        if(h<=l){
            return;
        }

        int j = partition(arr, l, h);
        sort(arr,l, j-1);
        sort(arr, j+1, h);
    }

    private int partition(T [] arr, int l, int h){
        int i = l;
        int j = h+1;

        T v = arr[l];
        while(true) {
            while (arr[--j].compareTo(v) > 0 && j != l) ;
            while (arr[++i].compareTo(v) < 0 && i != h) ;


            if (i >= j) {
                break;
            }

            T temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }

        T temp = arr[j];
        arr[j] = arr[l];
        arr[l] = temp;

        return j;
    }

    private static int findKthLargest(int[] nums, int begin, int end, int k) {
        if (begin + 1 == end && k == 1) return nums[0];

        final int pos = partition(nums, begin, end - 1);
        final int len = pos - begin;

        if (len == k) {
            return nums[pos-1];
        } else if (len < k) {
            return findKthLargest(nums, pos, end, k - len);
        } else {
            return findKthLargest(nums, begin, pos, k);
        }
    }
    private static void quickSort(int[] nums, int left, int right) {
        if (left < right) {
            final int pos = partition(nums, left, right);
            quickSort(nums, left, pos - 1);
            quickSort(nums, pos + 1, right);
        }
    }
    private static int partition(int[] nums, int i, int j) {
        final int pivot = nums[i];
        while (i < j) {
            while (i < j && nums[j] >= pivot) --j;
            nums[i] = nums[j];
            while(i < j && nums[i] <= pivot) ++i;
            nums[j] = nums[i];
        }
        nums[i] = pivot;
        return i;
    }

    public static void main(String [] args){
        QuickSort quickSort = new QuickSort();

        Integer[] a = {9,8,7,6,5,4,3,2,1};

//        int[] a = {3,8,7,6,5,4,2,9,1};
//
//        int k = findKthLargest(a, 0, a.length,2);
//        System.out.println("第K大的元素："+k);

        quickSort.sort(a);

        for(int i=0;i< a.length;i++){
            System.out.println(a[i]);
        }
    }
}
