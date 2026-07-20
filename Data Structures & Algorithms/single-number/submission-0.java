class Solution {
    public int singleNumber(int[] nums) {

        Set<Integer> set = new HashSet();
        for(int i = 0 ; i<nums.length ; i++){
            boolean k = false;
            if(set.contains(nums[i])){
                set.remove(nums[i]);
                k = true;
            }
            if(!k) {
                set.add(nums[i]);
            }

        }
        int val =0;
        for(int v : set){
            val = v;
        }
        return val;
        
    }
}
