class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        HashSet<Integer>a=new HashSet<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            a.add(nums[i]);
        }
        for(int num : a){
            if(!a.contains(num - 1)){
                int current = num;
                int length = 1;
                while(a.contains(current + 1)){
                    current++;
                    length++;
                }
                count = Math.max(count, length);
            }
        }
        return count;
    }
}
