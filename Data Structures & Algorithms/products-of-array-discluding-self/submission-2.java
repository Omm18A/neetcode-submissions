class Solution {
    public int[] productExceptSelf(int[] nums) {
        int a[]=new int [nums.length];
        int i=0;int prefix=1;
        while(i<nums.length){
            a[i]=prefix;
            prefix*=nums[i];i++;
        }
        int postfix=1;int j=nums.length-1;
        while(j>=0){
            a[j]*=postfix;
            postfix*=nums[j];j--;
        }
        return a;
    }
}  
