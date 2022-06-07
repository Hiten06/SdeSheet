/*
            In this we have given two sorted array we have to sort the two arrays and return the sorted array contd is the 1st array is greater than 2nd array
            1st array size is m+n and 2nd array is n
            Time Complexity O(m+n) and Space Complexity o(1);            
*/

public int[] twoSortedArrays(int[] arr1,int[] arr2,int m ,int n){
        int i = m-1;
        int j = n-1;
        int index = m+n-1;
        while(i>=0 && j>=0){
            if(arr1[i]<arr2[j]){
                arr1[index] = arr2[j];
                j--;
            }else{
                arr1[index] = arr1[i];
                i--;
            }
            index--;
        }
        while(j>=0){
            arr1[index] = arr2[j];
            j--;
            index--;
        }
        return arr1;
}

/*
   Optimal Approach is we used gap method  where we first find gap = m+n/2 m=size arr1 n=size arr2 Ceil function(i.e 3.5=4) 
   we keep first pointer at 0 and another one at gap we keep maintain the gap and reduce each gap divide by 2 untill 
   it greater 0 we swap the array if ele at ith index is greater and ele at gap indx 
 */

public void swap(int[] arr,int i , int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
     public void merge(int[] nums1, int m, int[] nums2, int n) {
            for(int i=m;i<m+n;i++){
                nums1[i]=nums2[i-m];
            }       
         
            for(double gap = (m+n)/2.0;gap>0;gap=gap/2.0){
                int jstart =(int)Math.ceil(gap);
                for(int i =0,j=jstart;j<m+n;i++,j++){
                    if(nums1[i]> nums1[j]){
                        swap(nums1,i,j);
                    }
                }
                if(jstart == 1){break;}
            }
          
    }
