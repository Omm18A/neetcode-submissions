class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> l=new ArrayList<>();
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        int max=nums.length/3;
        for(Map.Entry<Integer,Integer> a:h.entrySet()){
            int g=a.getValue();
            if(g>max){
                l.add(a.getKey());
            }
        }
        return l;
    }
}