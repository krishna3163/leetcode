import java.util.Scanner;

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int swap = 1; // Start from 1 because first element is always unique
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[swap] = nums[i];
                swap++;
            }
        }
        
        return swap;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        
        // Read array elements
        System.out.print("Enter sorted array elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        // Create solution instance and call method
        Solution solution = new Solution();
        int result = solution.removeDuplicates(nums);
        
        // Print results
        System.out.println("Number of unique elements: " + result);
        System.out.print("Unique elements: ");
        for (int i = 0; i < result; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        
        sc.close();
    }
}