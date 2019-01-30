package com.zhanghongze.learning.algorithms.leetcode;

import java.util.*;

public class LeetCode056 {

     public static class Interval {
          int start;
          int end;
          Interval() { start = 0; end = 0; }
          Interval(int s, int e) { start = s; end = e; }
     }

    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> results = new ArrayList<Interval>();

        if(intervals== null || intervals.size() == 0){
             return results;
        }

        int [] starts = new int[intervals.size()];
        int [] ends = new int[intervals.size()];

        for(int k =0; k< intervals.size();k++){
            starts[k] = intervals.get(k).start;
            ends[k] = intervals.get(k).end;
        }

        Arrays.sort(starts);
        Arrays.sort(ends);

        int j = 0;
        int i = 0;
        for(;i<starts.length-1; i++){
            if(ends[i]< starts[i+1]){
                results.add(new Interval(starts[j], ends[i]));
                j = i+1;
            }
        }

        results.add(new Interval(starts[j], ends[i]));

        return results;
    }

    public static void main(String [] args){
        LeetCode056 leetCode056 = new LeetCode056();

        List<Interval> intervals = new ArrayList<Interval>();
        intervals.add(new Interval(1,3));
        intervals.add(new Interval(2,6));
        intervals.add(new Interval(8,10));
        intervals.add(new Interval(15,18));


        leetCode056.merge(intervals);
    }
}
