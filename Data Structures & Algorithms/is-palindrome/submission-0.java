class Solution {
    public boolean isPalindrome(String s) {
              String f="";
       

          for(int i=0; i<s.length(); i++){
              if(Character.isLetterOrDigit(s.charAt(i))){
                  f+= Character.toLowerCase(s.charAt(i));
              }
          }
          int i=0; 
          int j= f.length()-1;
     while(i<j){
         if(f.charAt(i)!= f.charAt(j))return false;
         i++;
         j--;
     }

     return true;
    }
}
