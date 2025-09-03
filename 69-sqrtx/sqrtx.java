class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;

        int left = 1, right = x, ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // To avoid overflow, use division instead of mid*mid
            if (mid <= x / mid) {
                ans = mid;      // mid is a possible answer
                left = mid + 1; // search on right side
            } else {
                right = mid - 1; // search on left side
            }
        }
        return ans;
    }
}
