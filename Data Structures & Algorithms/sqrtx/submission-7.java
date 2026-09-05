class Solution {
    public int mySqrt(int x) {
        int f=0;int l=x;int res=0;
        while(f<=l){
            int mid=f+(l-f)/2;
            if((long)mid*mid>x){
                l=mid-1;
            }
            else if((long)mid*mid<x){
                f=mid+1;
                res=mid;
            }
            else{
                return mid;
            }
        }
        return res;
    }
}