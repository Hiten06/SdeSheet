/*Problem statement is we have given the array [1,2,3,4]  where we have to find maximum profit and  we have to buy stock on each day and sell it to gain max profit 
Brute force approach 
iterate through day 0(idx = 0) i.e arr[idx] find the maximum day on which its sell the stock to attain max profit we iterate throught idx+1 to n-1 (arr size) 
so that if we find max day then subtract the max profit - arr[ele] to get our max profit  iterate through each next day to get the max profit

Time Complexity O(n^2) and  Space Complexity O(n) to store the profit of each day
*/

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        ArrayList<Integer> maxDiff = new ArrayList<Integer>();
        for(int i=0;i<prices.size();i++){
            int maxele = findMax(prices,i+1, prices.get(i));
            if(maxele-prices.get(i) < 0){maxDiff.add(0);}else{maxDiff.add(maxele-prices.get(i));}
        }
        return Collections.max(maxDiff);
    }
    public static int findMax(ArrayList<Integer> prices, int indx,int curr){
        int max = -1;
        for(int j=indx;j<prices.size();j++){
            if(prices.get(j) > max){
               max= prices.get(j);
            }
        }
        return max;
    }
}

/*Optimal Approach here is keep the track of minimum prices at day so that we can find the difference max profit between minimal day and max day 
   TIme Complexity o(N) and Space Scomplexity 0(1)
*/

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int min = Integer.MAX_VALUE,max =0;
       
        for(int i=0;i<prices.size();i++){
            min=Math.min(min,prices.get(i));
            max=Math.max(max,prices.get(i)-min);
        }
        return max;
    }
    
}
