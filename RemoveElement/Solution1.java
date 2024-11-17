package RemoveElement;

public class Solution1 {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;

        int final_arr = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[final_arr] = nums[i];
                final_arr++;
            }
        }
        return final_arr;
    }
}
