class Solution {
    public boolean validPalindrome(String s) {
        if(isPalindrome(s)){
            return true;
        }
        else{
            for(int i=0;i<s.length();i++){
                String temp=s.substring(0,i)+s.substring(i+1);
                if(isPalindrome(temp)){
                    return true;
                }
            }
        }
        return false;   
    }
    public boolean isPalindrome(String s) {   
        int f=0;
        int l=s.length()-1;
        while(f<l){
            if(s.charAt(f)!=s.charAt(l)){
                return false;
            }
            f++;l--;
        }
        return true;
    }
}