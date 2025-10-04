class Solution {
    public int maxArea(int[] height) {
        int left = 0;                  // Start from the left end
        int right = height.length - 1; // Start from the right end
        int maxArea = 0;               // To store the maximum area

        while (left < right) {
            // Calculate  current area
            int width = right - left;
            int currentHeight = Math.min(height[left], height[right]);
            int area = width * currentHeight;

            // Update maxArea if current area is larger
            maxArea = Math.max(maxArea, area);

            // Move the pointer pointing to the smaller height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
