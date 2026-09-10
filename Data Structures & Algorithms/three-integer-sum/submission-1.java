class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>>a=new ArrayList<>();
       Arrays.sort(nums); 
       for(int i=0;i<nums.length-2;i++){
        if(i>0 && nums[i]==nums[i-1]){
            continue;
        }
        int f=i+1;int l=nums.length-1;
        while(f<l && f<nums.length-1){
            int temps=nums[f]+nums[l]+nums[i];
            if (temps==0){
                a.add(Arrays.asList(nums[i],nums[f],nums[l]));
                f++;l--;
                while(f<l && nums[f]==nums[f-1]){
                    f++;
                }
                while(f<l && nums[l]==nums[l+1]){
                    l--;
                }
            }

            else if(temps>0){
                l--;
            }
            else{
                f++;
            }               
        }
       }
       return a;
    }
}
