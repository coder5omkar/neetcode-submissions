class Solution {
    public int lengthOfLastWord(String s) {

        String[] ar = s.split(" ");

        int length = 0;

        String ls = ar[ar.length -1];

        length = ls.length();

        return length;
        
    }
}