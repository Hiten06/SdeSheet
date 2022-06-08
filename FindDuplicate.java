/*
Approach 1: sort an array and traverse linearly if prev ele == curr ele then return the duplicate element TC O(nlogn) and SC o(1)
Approach 2: create an duplicate array of given size travese linearly in the array and access dup[arr[indx]]+=1 if we get count more than 1 then return the duplicate 
TC O(n) and SC o(n)
Approach 3:  
fast ptr speed = 2x slow ptr speed = x
create the fast ptr and slow ptr traverse untill fast == slow if its equal then start fast from arr[0] 
untill slow == fast return slow thats our duplicate array TC O(n) and SC O(1)
*/



public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
        
        int slow = arr.get(0);
        int fast = arr.get(0);
        do{
            slow= arr.get(slow);
            fast=arr.get(arr.get(fast));
        }while(slow!=fast);
        fast=arr.get(0);
        while(slow!=fast){
            slow=arr.get(slow);
            fast=arr.get(fast);
        }
        return slow;   
    }
}
