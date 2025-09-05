class Solution {
    public int maxSubArray(int[] nums) {
       
        int currentsum = 0;
        int maxsum = nums[0];
        for(int i=0; i<nums.length; i++){
            if(currentsum <0){
                currentsum=0;
            }
            currentsum = currentsum+nums[i];
            maxsum = Math.max(currentsum, maxsum);
        }
        return maxsum;
    }
}