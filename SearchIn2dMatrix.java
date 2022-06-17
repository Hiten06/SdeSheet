/*
   Here we have given an 2d array where each row is sorted from left to right so we have to find the element present or not in matrix 
   Approach 1: We iterate through each row and check if each element is equal to the  element we are searching if its  then return true else false TC O(n^2) and SC O(1)
   Approach 2: we can use binary search since all elements are present in non increasing order that is sorted we placed left index at 0 and right index at m*n-1
   then mid = (row+col)/2 so we convert  row  idnx and col indx to elements present in matrix and vice versa consider 2d matrix as 1d matrix 
   we get index in single rows so that why we are converting
   (if we given row and col (3x3 matrix mat[row][col] mat[1][2] is equal to 5th element(from 0 based  index) in the matrix) for eg r = 1 and c= 2  ele = 3*1+2 i.e noofrows * row + col)
   (if we given element (3x3 matrix we have given 5th element which is equal to row =1 and col=2)  row = 5/3=1 and col = 5%3 =2)
   and we run the algorithm of binary search here the TC O(logn) and SC O(1)
*/

import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	static boolean findTargetInMatrix(ArrayList<ArrayList<Integer>> mat, int m, int n, int target) {
		// Write your code here.
        int left =0 , right = m*n-1;
        while(left<=right){
            int mid = (left+right)/2;
            int r = mid / n;
            int c = mid % n;
            if(mat.get(r).get(c)  == target){
                return true;
            }
            else if (mat.get(r).get(c) < target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return false;
	}
}


/*
Search in 2d matrix 2(leet code) here it is an second question where have given 2d matrix which is sorted from left to right i.e row and from top to bottom i.e column
So here the basic Approach as first question which give  TC O(n^2) and SC O(1)
Appraoch 2: here we keep row at index 0 and col = column size of matrix  we iterate both row and col simultaneously if we find the searching element we return it else return -1 
here both rows and columns are sorted so what we do if we get element greater than we are searching so we reduce column to 1 and 
if we get smaller element than we are searching we inc row to 1 TC O(n) and SC o(1)
*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row =0;
        int col=matrix[0].length-1;
        
        while((row >= 0 && row < matrix.length) && (col >= 0 && col <  matrix[row].length)){
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] > target){
                col=col-1;
            }
            else{
                row=row+1;
            }
        }
        return false;
    }
}
