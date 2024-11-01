package TwoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> search = new HashMap<>();
        for (int i = 0 ; i < nums.length ; i++) {
            Integer searchIndex = search.get(nums[i]);
            if (searchIndex != null) {
                return new int[]{i, searchIndex};
            }
            search.put(target - nums[i], i);
        }
        return nums;
    }
}