class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer>a=new HashSet<>();
        int max=0;
        for(int i=0;i<nums.length;i++){
            a.add(nums[i]);
            max=Math.max(max,nums[i]); 
        }
        int min=0;
        for(int i=0;i<nums.length;i++){
            if(a.contains(nums[i]>0)){
                min=Math.min(min,nums[i]);
            } 
        }
        for(int i=1;i<max;i++){
            if(!a.contains(i)){
                return i;
            }
        }
        return max+1;
    }
}