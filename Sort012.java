/*
   In this we can take   three pointer i=0,j=0,k= arr.length-1   if ele is 0 swap ele at arr i,j increment i ,j 
   and if ele is 1 increment i and ele is 2 swap ele at i & k decrement k  loop i untill  k 
*/

public class Solution 
{
    public static void sort012(int[] arr)
    {
        //Write your code here
        int i=0,j=0,k=arr.length-1;
        while(i<=k){    
            if(arr[i] == 0){
               swap(arr,i,j);
                i++;
                j++;
            }
            else if(arr[i]==1){
                i++;
            }
            else{
                swap(arr,i,k);
                k--;
            }
        }
    }
    
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
