class Solution {
    public void reverseString(char[] s) {
      
       helper(s , 0 , s.length-1);
   
    } 
    private void  helper(char[] s ,int start ,int end){
         if(end <= start){
            return;
        }

         //use swap char
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;

 helper(s , start + 1 , end - 1);


       }
       
    }
