class Solution {
    public int maxProfit(int[] prices) {
      int idx=0;int maxp=0;int min=Integer.MAX_VALUE;
      for(int i=0;i<prices.length;i++){
        if(prices[i]<min){
            min=Math.min(prices[i],min);
            idx=i;
        }
        else{
            int temp=prices[i]-min;
            maxp=Math.max(temp,maxp);
        }        
      }     
      return maxp; 
    }
}
