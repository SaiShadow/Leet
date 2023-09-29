package leet.easy;

/**
 * 
 * My solution to the LeetCode problem: Sort Array By Parity
 * 
 * n = # of elements in @param
 * 
 * Time Complexity ∊ 
 * Space Complexity ∊
 *
 * @author S_S_P
 *
 */
public class Sort_Array_By_Parity {
    public int[] sortArrayByParity(int[] nums) {

        int length = nums.length;
        int start = 0;
        int end = length - 1;
        int[] sol = new int[length];

        for (int i = 0; i < length; i++) {
            int n = nums[i];
            if (nums[i] % 2 == 0) {
                // even
                sol[start++] = n;
            } else {
                // odd
                sol[end--] = n;
            }
        }
        return sol;
    }

}
