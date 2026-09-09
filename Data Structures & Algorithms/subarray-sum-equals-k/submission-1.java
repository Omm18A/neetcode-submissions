class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>a=new HashMap<>();
        int count=0;int cursum=0;
        a.put(0,1);
        for(int i=0;i<nums.length;i++){
            cursum+=nums[i];
            int diff=cursum-k;
            count+=a.getOrDefault(diff,0);
            a.put(cursum,a.getOrDefault(cursum,0)+1);
        }
        return count;   
    }
}