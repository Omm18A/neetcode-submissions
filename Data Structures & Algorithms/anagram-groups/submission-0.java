class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>a=new HashMap<>();
        for(String s:strs){
            char[]c=s.toCharArray();
            Arrays.sort(c);
            String d=new String(c);
            if(a.containsKey(d)){
                a.get(d).add(s);
            }
            else{
                a.put(d,new ArrayList<>());
                a.get(d).add(s);
            }
        }
        return new ArrayList<>(a.values());
    }
}
