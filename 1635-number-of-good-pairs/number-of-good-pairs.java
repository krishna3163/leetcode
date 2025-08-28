class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int n: nums)
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        int res = 0;
        for(int c : freq.values()){
            res += c*(c-1)/2;    // Combination formula nC2 = n*n(n-1)/2
        }
        return res;    
    }
}
/*   Combinations (Method 2)
---------------------------------
  Time Complexity: O(n)
  Space Complexity: O(n)
---------------------------------*/