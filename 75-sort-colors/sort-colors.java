class Solution {
    public void sortColors(int[] nums) {
        int red = 0; 
        int white = 0;
        int blue = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                red++;
            }
            else if(nums[i] == 1){
                white++;
            }
            else if(nums[i] == 2){
                blue++;
            }
        }
        for(int j = 0; j<nums.length; j++){
         if(red > 0){
            nums[j] = 0;
            red--;
         }
         else if(white > 0){
            nums[j] = 1;
            white--;
         }
         else if(blue > 0){
            nums[j] = 2;
            blue--;
         }
        }
    }
}