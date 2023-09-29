package leet.medium;

/**
 * 
 * My solution to the LeetCode problem: Product_of_Array_Except_Self
 * 
 * n = # of elements in @param
 * 
 * Time Complexity ∊ 
 * Space Complexity ∊
 *
 * @author S_S_P
 *
 */
public class Product_of_Array_Except_Self {

    public int[] productExceptSelf(int[] nums) {

        int[] sol = new int[nums.length];
        sol[0] = 1;
        int product = 1;

        for (int i = 0; i < nums.length - 1; i++) {

            product *= nums[i];

            sol[i + 1] = product;

        }
        product = 1;

        for (int i = nums.length - 1; i > 0; i--) {

            product *= nums[i];

            sol[i - 1] *= product;

        }

        return sol;
    }
}