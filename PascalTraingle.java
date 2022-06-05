/*
    Approach given n=4  The pascal Traiangle is  1 11 121 1331  so here what we do loop the i from 0 to n and j from 0 to i if our j == 0 and j == i then keep 1 
    and not then we  add the prvious row j-1 and prev row j element to the current rows and set prev rows = curr rows and 
    the rows add in 2d matrix so the time complexity is O(n^2) and Space Complexity is O(n^2) 
*/

public static ArrayList<ArrayList<Long>> printPascal(int n) {
                 // Write your code here.
       ArrayList<ArrayList<Long>> arr = new ArrayList<>();
       ArrayList<Long> row=null;
        ArrayList<Long>prev=null;
        for(int i=0;i<n;i++){
            row=new ArrayList<>();
            for(int j=0;j<=i;j++){
                   if(j== 0 || j== i){
                       row.add(1l);
                   }
                   else{
                       row.add(prev.get(j-1)+prev.get(j));
                   }
            }
            prev=row;
            arr.add(row);
        }
        return arr;
	}
