class Solution {
    public int search(int[] nums, int target) {

        int n= nums.length-1;

        int left = 0;
        int right = n;

        while(left<=right){
            int mid = left + (right-left)/2; 

            if(nums[mid] == target){
                return mid;
            }

            if(nums[left] < nums[mid] && target < nums[mid]){
                right = mid-1;
            }else{
                left = mid+1;
            }

        }
        return -1;
    }
}
