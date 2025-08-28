class Solution {
    public int numIdenticalPairs(int[] nums) {
        int res = 0;
        Map<Integer, Integer> freq = new HashMap<>();
        for(int n : nums){
            if(freq.containsKey(n)){
                res += freq.get(n);
                freq.put(n, freq.get(n)+1);
            }
            else
                freq.put(n, 1);
        }
        return res;   
    }
}
/*         Method 3
----------------------------
  Time Complexity: O(n)
  Space Complexity: O(n)
---------------------------*/