class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","");
        s=s.toLowerCase();
        String r="";
        for(int i=s.length()-1;i>=0;i--){
            r+=s.charAt(i);
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=r.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
