/*
   Count Inversion here our problem is to count the no of steps the arrays become sorted for e.g if our array is 1,2,3,4 count =0 as it is sorted  and  4,3,2,1 then count=4
   as we have to sort the array it is given in descending array
   Approach 1: here what we can do we take each elements and from each elements  we iterate from next to the arr.length and 
   inc count if we found element less than the current elements So the TC O(n^2) and SC O(1)
   Optimized Approach is we use Merge sort Algorithm and there time complexity is O(nlogn) and SC O(1) here what we do while merging 2 sorted array 
   we keep one ptr to left array and scnd ptr to right array if we found out that left ptr element is greater than right ptr element and we increment count to left.length-i  
   bcz here left array is sorted if first element of left is greater than right first element than entire left arrays elements are greater so we increment the count
*/

import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getInversions(long arr[], int n) {
        // Write your code here.
        mergeSort(arr,0,n-1);
        return count;
    }
    static long count=0;
    public static long[] merge2Sort(long[] left ,long[] right){
        int i =0,j=0;
        int k=0;
        long[] merged = new long[left.length+right.length];
        while( i < left.length && j < right.length){
            if(left[i] <= right[j]){
                merged[k] = left[i];
                i++;
                k++;
            }
            else{
                count+=(left.length-i);
                merged[k]= right[j];
                j++;
                k++;
            }
        }
        
        while(i< left.length){
            merged[k]=left[i];
            i++;
            k++;
        }
        while(j < right.length){
            merged[k]=right[j];
            j++;
            k++;
        }
        return merged;
    }
    public static long[] mergeSort(long[] arr ,int start,int end){
        if(start  == end){
            long[] base = new long[1];
            base[0]=arr[start];
            return base;
        }
        int mid = (start+end)/2;
        long[] left = mergeSort(arr,start,mid);
        long[] right = mergeSort(arr,mid+1,end);
        long[] merged = merge2Sort(left,right);
        return merged;
    }
}
