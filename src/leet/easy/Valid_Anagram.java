package leet.easy;

import java.util.Arrays;

/**
 * 
 * My solution to the LeetCode problem: Valid_Anagram
 * 
 * n = # of char in @param s and t  
 * 
 * Time Complexity ∊ O(n log(n)) 
 * Space Complexity ∊ O(n) 
 *
 * @author S_S_P
 *
 */
public class Valid_Anagram {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;
        if (s.equals(t))
            return true;

        char[] t_arr = t.toCharArray();
        char[] s_arr = s.toCharArray();

        Arrays.sort(t_arr);
        Arrays.sort(s_arr);

        return Arrays.toString(s_arr).equals(Arrays.toString(t_arr));

    }
}
