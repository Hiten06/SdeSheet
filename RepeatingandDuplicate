/*
Problem we have given array of size n with ele in the range from 1 to n we have given one number missing in the array and one is duplicate
Approach 1: make an array of size given array if any element come increment it count in dummy array and traverse through dummy array  
if we found 0 at index then the index is missing from given array if count 2 then its the duplicate no TC o(N) and SC O(N)
Approach 2: make an sum from 1 to n and make an sum given from arr element  make an square of the sum from 1 to n and make an square of the sum from arr element 
subtract the sum of square ele from square of array elemnt and subtract sum of arr ele  from 1 to n then solve quadratic equation to get missing and duplicate array
TC O(long long N) SC(1) and not applicable if we have to find more than 1 duplicate and missing element
Approach 3: Find the xor from 1 to n and the given element from array now do the right most bit mask (basically take ele and operation ele'') 
then iterate through element of the array and segregrate the rmsb which have (x) 1 bit and (y)which have 0 bit similarly segregate rmsb which have 1 bit and 0 bit from 1 to n
now those x and y are our duplicate and missing elemnt
*/
 public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        int xor = 0;
        int[] res = new int[2];
        for(int val : arr){
            xor ^= val;
        }
        for(int i=1;i<=arr.size() ;i++){
            xor = xor ^ i;
        }
        int rsb = xor & -xor;
        
        int x=0;
        int y=0;
        
        for(int val : arr){
            if((val & rsb) == 0){
                  x^=val;
            }
            else{
                y^=val;
            }
        }
        for(int i=1;i<=arr.size();i++){
            if((i & rsb)==0){
                x^=i;
            } 
            else{
                y^=i;
            }
        }
        for(int val : arr){
            if(val == x){
                res[0] = y;
                res[1] =x;
                break;
            }
            else if(val == y){
                res[0] = x;
                res[1] = y;
                break;
            }
        }
        return res;
    }
}
