class Solution {
    public int maxArea(int[] heights) {
       int i=0;int max=0;int h=Integer.MIN_VALUE;
       int j=heights.length-1;
       while(i<j){
        h=Math.min(heights[i],heights[j]);
        int area=h*(j-i);
        max=Math.max(area,max);
        if(heights[i]>=heights[j])j--;
        else{i++;}
       }
       return max;
    }
}
