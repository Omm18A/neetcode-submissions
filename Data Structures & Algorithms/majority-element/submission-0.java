class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        int max=0;
        int key=0;
        for(Map.Entry<Integer, Integer>a:h.entrySet()){
            if(a.getValue()>max){
                max=Math.max(max,a.getValue());
                key=a.getKey();
            }
            
        }
        return key;
    }
}