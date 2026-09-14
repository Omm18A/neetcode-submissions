class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;int res=Integer.MAX_VALUE;int total=0;
        for(int r=0;r<nums.length;r++){
            total+=nums[r];
            while(total>=target){
                int temp=(r-l)+1;
                res=Math.min(temp,res);
                total-=nums[l];
                l++;
            }
        }
        if(res==Integer.MAX_VALUE){
            return 0;
        }
        else{
            return res;
        }   
    }
}