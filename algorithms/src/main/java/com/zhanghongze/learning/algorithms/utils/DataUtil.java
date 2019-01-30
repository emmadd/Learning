package com.zhanghongze.learning.algorithms.utils;

public class DataUtil {

    public static void printArray(Object [] arr){
        StringBuilder sb = new StringBuilder();
        for(Object o: arr){
            sb.append(o).append(" ");
        }

        System.out.println(sb.substring(0, sb.length()-1));
    }
}
