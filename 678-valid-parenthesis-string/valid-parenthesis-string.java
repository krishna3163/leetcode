class Solution {
    public boolean checkValidString(String s) {
        int min = 0;
        int max = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                min++;
                max++;
            }
            else if(c == ')'){
                min--;
                max--;
            }
            else{ //for *
                min--;
                max++;
            }
            //aagar max -ve ho jay 
            if(max < 0){
                return false;
            }
            min = Math.max(min, 0); // min never be -ve

        }
        return min == 0; //because if mean match all then give zero
    }
}