package leet.easy;

/**
 * 
 * My solution to the LeetCode problem: Monotonic Array
 * 
 * n = # of elements in @param nums
 * 
 * Time Complexity ∊ O(n) 
 * Space Complexity ∊ O(1)
 *
 * @author S_S_P
 *
 */
public class Monotonic_Array {
    public boolean isMonotonic(int[] nums) {

        if (nums.length <= 1) {
            return true;
        }

        boolean inc = nums[0] <= nums[nums.length - 1];
        boolean dec = !inc;

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] < nums[i + 1]) {

                if (dec) {
                    return false;
                }

            } else if (nums[i] > nums[i + 1]) {

                if (inc) {
                    return false;
                }
            }
        }
        return true;
    }
}
