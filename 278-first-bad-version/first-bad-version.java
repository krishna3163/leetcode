/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {

    public int firstBadVersion(int n) {
        int i = 1;
        int j = n;
        int ans =- 1;
        for (; i<= j; ) {
                int mid = i + (j - i) / 2;
                if (isBadVersion(mid) == true) {
                    ans = mid;
                    j = mid - 1;
                } else {
                    i = mid + 1;
                }

            }
        
        return ans;

    }
}