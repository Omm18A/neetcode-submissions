class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;int j=0;int prev=0;int curr=0;
        int total=nums1.length+nums2.length;
        for(int k=0;k<=total/2;k++){
            prev=curr;
            if(i<nums1.length && (j>=nums2.length || nums1[i]<=nums2[j])){
                curr=nums1[i];i++;
            }
            else{
                curr=nums2[j];j++;
            }
        }
        if(total%2==0){
            return (prev+curr)/2.0;
        }
        else{
            return curr;
        }
    }
}
