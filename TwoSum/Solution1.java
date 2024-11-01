package TwoSum;

public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        // solution with two for loops (more memory usage)
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return nums;
    }
}