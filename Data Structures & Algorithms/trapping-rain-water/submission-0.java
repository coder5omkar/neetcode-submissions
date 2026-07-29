class Solution {
    public int trap(int[] height) {

        if(height == null || height.length == 0){
            return 0;
        }

        int l = 0 , r = height.length-1;
        int leftMax = height[l] , rigthMax = height[r];
        int res = 0;

        while(l < r){
            if(leftMax < rigthMax) {
                l++;
                leftMax = Math.max(leftMax, height[l]);
                res = res + (leftMax - height[l]);
            } else {
                r--;
                rigthMax = Math.max(rigthMax, height[r]);
                res = res + (rigthMax - height[r]);
            }
        }

        return res;
        
    }
}
