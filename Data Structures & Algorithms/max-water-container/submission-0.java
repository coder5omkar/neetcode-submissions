class Solution {
    public int maxArea(int[] heights) {

        int left = 0;
        int right = heights.length-1;
        int maxWater = 0 ;

        while(left<right){

            int w = right-left;
            int hei = Math.min(heights[left] , heights[right]);

            int area = w * hei;

            maxWater = Math.max(maxWater, area);
            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
        }
        
        return maxWater;
    }
}
