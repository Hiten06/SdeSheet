/*
     In this we have to give the next permutation of the [1,2,3,4] => [1,2,4,3] i.e lexographically greater 
     Algorithm:-
     i.   find the dip elemnt from the right side 
     ii.  just find greater ele w.r.t dip elemt
     iii. swap the indx at dip, greater ele
     iv.  reverse the element from  dip indx +1  to arr.length-1;
     
     Edge case :- if 4,3,2,1 is there its next permutation is 1,2,3,4  then we have to just reverse and dip func return -1 
     
     Time Complexity O(n) and Space Complexity is O(1)

*/


public class Solution 
{
    
    public static int findDip(ArrayList<Integer> permutation){
        int idx = permutation.size()-2;
        while(idx >=0){
            if(permutation.get(idx) < permutation.get(idx+1)){
                   return idx;
            }
            idx--;
        }
        return -1;
    }
    
    public static int findJustGreater(ArrayList<Integer> permutation,int dip){
        int idx = permutation.size()-1;
        while(idx>=0){
            if(permutation.get(idx) > permutation.get(dip)){
                return idx;
            }
            idx--;
        }
        return -1;    
    }
   public static void swap(ArrayList<Integer> permutation,int i,int j){
       int temp = permutation.get(i);
       permutation.set(i,permutation.get(j));
       permutation.set(j,temp);
   }
    
    public static void reverse(ArrayList<Integer> permutation,int i,int j){
        while(i<j){
            swap(permutation,i,j);
            i++;
            j--;
        }
    }
    
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
		// Write your code here.
        int dip  = findDip(permutation);
        if(dip ==-1){
            reverse(permutation,dip+1,permutation.size()-1);
        }
        else{
            int JustGreat = findJustGreater(permutation,dip);
            swap(permutation,dip,JustGreat);
            reverse(permutation, dip+1,permutation.size()-1);
        }
        return permutation;
	}
}
