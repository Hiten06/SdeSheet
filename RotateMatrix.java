/*   In this we have to rotate the matrix in clockwise and anticlockwise direction 
     Approach for clockwise
     take prev , curr ele and take 4 var row,col and lastrow, lastcol in this format we are able to rotate the matrix 

*/

// Clockwise direction

public class Solution {
    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        // Write your code here.
        int row =0;
        int col =0;
        int prev=0,curr=0;
        int lastrow = n;
        int lastcol = m;
        while(row < lastrow && col < lastcol){
            if(row+1 == lastrow || col+1 ==  lastcol){break;}
            prev= mat.get(row+1).get(col);
            for(int i=col;i<lastcol;i++){
                curr = mat.get(row).get(i);
                mat.get(row).set(i,prev);
                prev=curr;
            }
            row++;
            for(int i = row;i<lastrow;i++){
                curr = mat.get(i).get(lastcol-1);
                mat.get(i).set(lastcol-1, prev);
                prev=curr;
            }
            lastcol--;
            if(row < lastrow){
            for(int i=lastcol-1;i>=col;i--){
                curr = mat.get(lastrow-1).get(i);
                mat.get(lastrow-1).set(i,prev);
                prev=curr;
            }
            }
            lastrow--;
            
            if(col < lastcol){
                for(int i=lastrow-1;i>=row;i--){
                     curr = mat.get(i).get(col);
                    mat.get(i).set(col,prev);
                    prev=curr;
                }
            }
            col++;
        }
    }
    // Anticlockwise direction
    public void RotateAnticlock(ArrayList<ArrayList<Integer>> mat,int n, int m){
        int row=0,col=0,prev=0,curr=0;
        int lastrow = n,lastcol=m;
        while(row< lastrow && col < lastcol){
              if(row+1 == lastrow || col+1 == lastcol){break;}
              prev = mat.get(row+1).get(lastcol-1);
              
              for(int i=lastcol-1;i>=col ;i--){
                  curr = mat.get(row).get(i);
                  mat.get(row).set(i,prev);
                  prev=curr;
              }
              row++;
              for(int i=row;i<lastrow;i++){
                  curr=mat.get(i).get(col);
                  mat.get(i).set(col,prev);
                  prev=curr;
              }
              col++;
              if(col < lastcol){
              for(int i=col;i<lastcol;i++){
                  curr=mat.get(lastrow-1).get(i);
                  mat.get(lastrow-1).set(i,prev);
                  prev=curr;
              }
              }
              lastrow--;
              if(row < lastrow){
              for(int i=lastrow-1;i>=row;i--){
                  curr = mat.get(i).get(lastcol-1);
                  mat.get(i).set(lastcol-1,prev);
                  prev=curr;
              }
              }
              lastcol--;
        }
    }
  
}
