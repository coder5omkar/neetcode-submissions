class Solution {
    public boolean isPalindrome(String s) {

        //   if(s.length()<=2){
        //     if(s.length()==1){
        //         return true;
        //     }else{
        //         if(Character.toLowerCase(s.charAt(0)) == Character.toLowerCase(s.charAt(1)) || !Character.isLetterOrDigit(s.charAt(0)) || !Character.isLetterOrDigit(s.charAt(1))){
        //             return true;
        //         }
        //         else{
        //             return false;
        //         }
        //     }
        // }

        int left = 0;
        int right = s.length()-1;

        while(left<right){

            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }

            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;

        }
        return true;        
    }
}
