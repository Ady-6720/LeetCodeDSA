//Used two Pointer method to traverse the array from both of the sid3s
//Also used string functions like Character.isDigit to check if theere is digit at that index, and Character.isLetter to check if there is letter to remove unwanted symbols

class Solution {
    public boolean isPalindrome(String s) {
      
       String fixed_String="";
       for(char c : s.toCharArray()){
           if(Character.isDigit(c)||Character.isLetter(c)){
               fixed_String+=c;
           }
       }
       fixed_String= fixed_String.toLowerCase();
       int  left= 0;
       int right= fixed_String.length()-1;
        while(left<right){
            if(fixed_String.charAt(left) != fixed_String.charAt(right)){
             return false;   
            }
            else{
                left++;
                right--;
            }
        }
        return true;
    } 
}
