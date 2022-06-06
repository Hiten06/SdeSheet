/*
  here we have to find max subarray sum in which all negative and non negative no is given we have to find it the overall sum which is max 
  Brute force approach is we can use 2 for loop for looping inside the subarray and ith for loop the array start from indx and the jth for loop is to loop from ith to 
  arr.length to find the sum of subarray if ours current sum is greater then we stored them as an max sum subaaary for overall array
  Time Complexity o(n^2) and Space Complexity o(1)
  Optimized Approach is Kadane algorithm  where we tak two var currSum ,maxSUm if Our currSum >=0 then currSUm+arr[currid] and if not currSum start with arr[currId]
  then compare the curr SUm with overall Sum  Time Complexity O(n) and Space COmplexity O(1)
*/

public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
       if(n== 1){return arr[0];}
        long currentSum = arr[0];
        long maxSum =arr[0];
        for(int i=1;i<arr.length;i++){
           if(currSum >=0)
               currentSum+=arr[i];
           else
               currSum=arr[i];
          
            if(currentSum > maxSum){
                maxSum=currentSum;
            }
                     
        }
        return maxSum;
	}

}
