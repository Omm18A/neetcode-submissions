class Solution {
    public int mySqrt(int x) {
        int max=0;
        if(x==0){
            return 0;
        }
        if(x==1){
            return 1;
        }
        for(int i=1;i<=Math.sqrt(x);i++){
            if(i*i<=x){
                max=Math.max(max,i);
            }
        }
       return max; 
    }
}