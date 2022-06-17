
/*
    Here we are merging overlapping intervals we have given the arrays of intervals where start and end points are given 
    we have to merge and make a single point Approach here we first sort the Array on the basis of start points and 
    then we store the first start and end points and then loop the merging intervals arrays 
    if we got our end points is less than the second interval start points then we merge 
    if not then we put the array as it is and iterate over second merging interval 
    TC O(interval size) and SC O(1) because we r returning the list so output size is not consider in Space complexity
*/


import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static List<Interval> mergeIntervals(Interval[] intervals) {
        // write your code here.
        
        List<Interval> ARR = new ArrayList<>();
        if(intervals.length == 0 || intervals == null){
            return new ArrayList<>();
        }
       Arrays.sort(intervals, (Interval a, Interval b) -> a.start - b.start);
        int st = intervals[0].start;
        int en = intervals[0].finish;
        for(int i=1;i<intervals.length;i++){
            if(intervals[i].start <= en){
               en = Math.max(en,intervals[i].finish); 
            }
            else{
                ARR.add(new Interval(st,en));
                st = intervals[i].start;
                en = intervals[i].finish;
            }
        }
        ARR.add(new Interval(st,en));
        return ARR;
    }
}
