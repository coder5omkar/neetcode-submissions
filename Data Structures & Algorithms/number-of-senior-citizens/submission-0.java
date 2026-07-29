class Solution {
    public int countSeniors(String[] details) {

        int[] ar = new int[details.length];

        for(int i = 0 ; i < details.length ; i++){

            ar[i] = Integer.parseInt("" + details[i].charAt(11) + details[i].charAt(12));

        }
        int count = 0;

        for(int a : ar){
            if(a > 60){
                count++;
            }
        }

        return count;
        
    }
}