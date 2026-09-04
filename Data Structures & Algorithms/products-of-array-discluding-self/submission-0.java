class Solution {
    public int[] productExceptSelf(int[] nums) {
        int a[]=new int[nums.length];
        int i=0;int prefix=1;
        while(i<nums.length){
            a[i]=prefix; 
            prefix*=nums[i];
            i++;
        }
        int postfix=1;
        for(int j=nums.length-1;j>=0;j--){
            a[j]*=postfix;
            postfix*=nums[j];
        }
        return a;
    }
}  
