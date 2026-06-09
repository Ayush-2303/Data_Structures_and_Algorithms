class Valid_Palinrome {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() -1;
        //left is always less than right 
        while(left<right){
                //skip and increment from the left if  the character is not a number or digit
            while( left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            //skip and decrement from the right if the character is not a number or digit
            while( left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if ( Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }

            right --;
            left++;
            
        }return true;
    }
}