package leet.easy;

/**
 * 
 * My solution to the LeetCode problem: Valid_Palindrome
 * 
 * n = # of elements in @param  
 * 
 * Time Complexity ∊ 
 * Space Complexity ∊ 
 *
 * @author S_S_P
 *
 */
public class Valid_Palindrome {

    public boolean isPalindrome(String s) {

        s = s.toLowerCase();

        String str = "";

        for (char c : s.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                str += c;
            }
        }
        int j = str.length() - 1;

        if (j <= 0)
            return true;
        int i = 0;

        while (i < str.length() / 2 && j >= str.length() / 2) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            j--;
            i++;
        }
        return true;
    }
}
