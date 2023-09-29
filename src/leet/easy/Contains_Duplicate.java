package leet.easy;

import java.util.Arrays;

/**
 * 
 * My solution to the LeetCode problem: Contains_Duplicate
 * 
 * n = # of elements in @param nums
 * 
 * Time Complexity ∊ O(n log(n)) 
 * Space Complexity ∊ O(1)
 *
 * @author S_S_P
 *
 */
public class Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 1; i++) {
            
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
