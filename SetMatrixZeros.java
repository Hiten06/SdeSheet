/*The brute force approach is to make the pair class of row and columns if we found any cell = 0 then add it into array list and set correponding rows and columns = 0 
   Time Complexity O(n*m) and space Complexity o(n)*/
   
  class Solution {
    
    class Pair{
        int r;
        int c;
        public Pair(int r , int c){
            this.r=r;
            this.c=c;
        }
    }
    public void setZeroes(int[][] matrix) {
        List<Pair> cell = findZeros(matrix);
        for(int i=0;i<cell.size();i++){
             int r = cell.get(i).r;
             int c = cell.get(i).c;
             set(matrix,r,c);
        }
        
    }
    
    public void set(int[][] matrix,int r, int c){
        for(int i=0;i<matrix.length;i++){
            matrix[i][c]=0;
        }
        for(int j=0;j<matrix[0].length;j++){
            matrix[r][j]=0;
        }
    }
    public List<Pair> findZeros(int[][] matrix){
        List<Pair> cells = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                 if(matrix[i][j] == 0){
                     cells.add(new Pair(i,j));
                 }
            }
        }
        return cells;
    }
}

// Optimized Approach Time Complexity O(m*n) Space Complexity O(m+n) take an extra row field and col field make the corresponding row and colomn 0 
public class Solution {
    public static void setZeros(int matrix[][]) {
        // Write your code here..
        int[]  rows = new int[matrix.length];
        Arrays.fill(rows,-1);
        int[] col = new int[matrix[0].length];
        Arrays.fill(col,-1);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                     rows[i] =0;
                     col[j] =0 ;
                }
            }
        }
        
        for(int i=0;i<rows.length;i++){
            if(rows[i] == 0){
                setMatrixRows(matrix,i);
            }
        }
        
        for(int i=0;i<col.length;i++){
            if(col[i] == 0){
              setMatrixCols(matrix,i);
            }
        }
    }
    public static void setMatrixRows(int[][] matrix,int field){
        for(int j=0;j<matrix[0].length;j++){
            matrix[field][j]=0;
        }
    }
    public static void setMatrixCols(int[][] matrix,int field){
        for(int i=0;i<matrix.length;i++){
            matrix[i][field]=0;
        }
    }

}


/*Most Optimal Approach here instead of taking seperate rows and columns arrays we take the first row of matrix as column array 
and first column in matrix as an row arrays we take setRows  variable as false because ours rows and column collides*/

class Solution{
   public static void setZeros(int[][] matrix){
       boolean setRows = false;
       for(int i=0;i<matrix.length;i++){
          for(int j=0;j<matrix[0].length;j++){
                    if(matrix[i][j] == 0){
                            matrix[0][j]=0;
                            if(i>0){
                               matrix[i][0]=0;
                            }
                            else{
                               setRows=true;
                            }
                   }
          }
       }
       
       for(int i=1;i<matrix.length;i++){
          for(int j=1;j<matrix[0].length;j++){
                  if(matrix[i][0] == 0 || matrix[0][j] ==0){
                       matrix[i][j]= 0;  
                  }
          }
       }
       
       if(matrix[0][0] == 0){
           for(int i=0;i<matrix.length;i++){
                 matrix[i][0]== 0;
           }
       }
       
       if(setRows == true){
             for(int j =0;j<matrix[0].length;j++){
                       matrix[0][j]= 0;
              }
       }
   }
}
