class Solution {
    public int climbStairs(int n) {

        if(n<=2) return n;

        int stp1 =2;
        int stp2 =1;

        for(int i =3 ; i<=n ; i++){
            int add = stp1+stp2;
            stp2 = stp1;
            stp1 = add;
        }
        return stp1;
    }
}
