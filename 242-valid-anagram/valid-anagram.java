class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

      //  crete arr to store frequency
       int [] frequency = new int[26];

       //increment count on t and decrement on s
       for(int i = 0; i<s.length() ; i++){
        frequency[s.charAt(i) - 'a'] ++;
        frequency[t.charAt(i) - 'a'] --;
       }

       for(int count : frequency){
        if(count != 0){
            return false;
        }
       }
       return true;

      
    }
}