package leet;

import java.util.HashMap;

/**
 * 
 * My solution to the LeetCode problem: Two_Sum.
 * 
 * n = # of elements
 * m = # of elements in map
 * 
 * Time Complexity  ∊ O(n) (amortised) otherwise ∊ O(n * log(m))
 * Space Complexity ∊ O(n)
 * 
 * @author S_S_P
 *
 */
public class Sol_Two_Sum {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            Integer other = map.get(num);

            if (other != null) {
                return new int[] { i, other };

            } else {
                map.put(target - num, i);
            }
        }

        return null;
    }
}
