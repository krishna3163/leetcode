class Solution {
    public boolean isPerfectSquare(int num) {
        long left = 1, right = num;   // search between 1 and num

        while (left <= right) {
            long mid = (left + right) / 2;   // middle number
            long sq = mid * mid;             // square of mid

            if (sq == num) return true;      // found perfect square
            else if (sq < num) left = mid + 1; // move right
            else right = mid - 1;              // move left
        }

        return false;   // no perfect square found
    }
}
