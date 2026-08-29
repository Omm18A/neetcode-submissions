class Solution {
    public void reverseString(char[] s) {
       String a="";
       for(int i=s.length-1;i>=0;i--){
            a+=s[i];
       }
       for(int i=0;i<s.length;i++){
            s[i]=a.charAt(i);
       }

        
    }
}