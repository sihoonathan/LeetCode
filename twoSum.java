import java.util.HashMap;
import java.util.Map;


class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> buffer = new HashMap<>();

        int[] result = new int[]{};
        for (int i = 0; i < nums.length; i++) {
            if (buffer.containsKey(nums[i])) {
                result = new int[]{buffer.get(nums[i]), i};
                break;
            }

            else {
                buffer.put((target-nums[i]), i);
            }
        }
        return result;
    }
}