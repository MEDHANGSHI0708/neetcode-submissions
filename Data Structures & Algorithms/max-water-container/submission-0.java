class Solution {
    public int maxArea(int[] heights) {

        int max=0;
        int n=heights.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int width=j-i;
                int h=Math.min(heights[i],heights[j]);

                int area=width*h;


                max=Math.max(area,max);
            }
        }
        return max;
        
    }
}
