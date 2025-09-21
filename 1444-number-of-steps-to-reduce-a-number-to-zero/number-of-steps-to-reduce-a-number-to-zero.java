class Solution {
    public int numberOfSteps(int num) {
        return evenorodd(num , 0);
     
     }
    
    public int evenorodd(int num , int ans){
        if(num == 0){
        return ans;
        }
        if(num%2 == 0){
             return evenorodd(num/2 , ans+1);
        }
        return evenorodd(num-1 , ans + 1);
        

    }
   
}