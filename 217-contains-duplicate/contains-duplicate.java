class Solution {
    public boolean containsDuplicate(int[] nums) {
      Set<Integer> kk = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(kk.contains(nums[i])){
                return true;

            }
            else{
                kk.add(nums[i]);
            }
                    
                }
                 return false;

            }
            
        }
       
    