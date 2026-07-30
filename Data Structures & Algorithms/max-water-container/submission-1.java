class Solution {
    public int maxArea(int[] heights) {

        int l =0 , r = heights.length-1;

        int maxWater = 0;

        while(l<r){

            int width = r-l;
            int hei = Math.min(heights[l] , heights[r]);

            int con = width * hei;

            maxWater = Math.max(maxWater , con);

            if(heights[l]<heights[r]){
                l++;
            }else{
                r--;
            }
        }

        return maxWater;
      
    }
}
