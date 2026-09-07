class Solution {
    public int maxProfit(int[] prices) {
      ;int maxp=0;int min=Integer.MAX_VALUE;
      for(int i=0;i<prices.length;i++){
        if(prices[i]<min){
            min=Math.min(prices[i],min);
        }
        else{
            int temp=prices[i]-min;
            maxp=Math.max(temp,maxp);
        }        
      }     
      return maxp; 
    }
}
