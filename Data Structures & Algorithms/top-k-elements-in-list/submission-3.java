class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer, Integer> map = new HashMap();
       for(int n:nums){
        map.put(n, map.getOrDefault(n,0)+1);
       }

        PriorityQueue<int[]> que = new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            que.offer(new int[]{entry.getValue() , entry.getKey()});

            if(que.size()>k){
                que.poll();
            }
        }

        int[] ans = new int[k];

        for(int i = 0 ; i<k ; i++){
            ans[i] = que.poll()[1];
        }

        return ans;

    }
}
