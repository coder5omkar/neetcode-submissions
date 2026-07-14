class Solution {
    public int[] twoSum(int[] num, int target) {

        int left = 0;
        int right = num.length-1;

        while(left<right){
            int sum = num[left] + num[right];

            if(sum == target){
                return new int[]{left+1, right+1};
            }
            if(sum < target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{};
    }
}
