class Solution {
    public int[] countBits(int n) {
       int ar[]=new int[n+1];
       for(int i=1;i<=n;i++){
        ar[i]=ar[i>>1]+(i&1);
       }
       return ar;
    }
}
