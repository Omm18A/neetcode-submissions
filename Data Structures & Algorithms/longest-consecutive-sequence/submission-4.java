class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        HashSet<Integer>a=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            a.add(nums[i]);
        }
        int max=0;
        for(int num:a){
            if(!a.contains(num-1)){
                int curr=num;
                int len=1;
                while(a.contains(curr+1)){
                    curr++;len++;
                }
                max=Math.max(max,len);
            }
        }
        return max;
    }
}
