class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
      HashMap<Integer,Integer>a=new HashMap<>();
      for(int i=0;i<nums.length;i++){
        if(a.containsKey(nums[i])){
          int temp=a.get(nums[i]);
          if(Math.abs(i-temp)<=k){
            return true;
          }
          else{
            a.put(nums[i],i);
          }
        }
        else{
          a.put(nums[i],i);
        }
      }
      return false; 
    }
}