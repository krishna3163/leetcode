
class Solution {
   public int numIdenticalPairs(int[] nums) {
        int i=0,j=0,c=0;     
        for(i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j])
                    c++;;
            }
        }
        return c;
    }
}
/*    Brute Force (Method 1)
-----------------------------
  Time Complexity: O(n^2)
  Space Complexity: O(1)
----------------------------*/