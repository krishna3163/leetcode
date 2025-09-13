class Solution {
    public int mySqrt(int x) {
        for(int i = 0; i< x ; i++){
            if(i != x){
              int j = (int) Math.sqrt(x);
              return j;

            }
        }
        return 0;
    }
}