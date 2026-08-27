class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>h1=new HashMap<>();
        for(int i=0;i<s.length();i++){
            h1.put(s.charAt(i),h1.getOrDefault(s.charAt(i),0)+1);
        }
        if(t.length()==s.length()){
            for(int i=0;i<t.length();i++){
                if(h1.containsKey(t.charAt(i))){
                    if(h1.get(t.charAt(i))<=0){
                        return false;
                    }
                    else{
                        h1.put(t.charAt(i),h1.get(t.charAt(i))-1);
                    }
                }     
                else{
                    return false;
                }
            }
        return true;
        }
        else{
            return false;
        }
        

    }
}
