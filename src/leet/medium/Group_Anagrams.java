package leet.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * 
 * My solution to the LeetCode problem: Group Anagrams
 * 
 * n = # of elements in @param strs 
 * m = length of String
 * 
 * Time Complexity ∊ O(n * m * log(m))) 
 * Space Complexity ∊ O(n) // Worst Case if none of them are anagrams.
 * 
 * @author S_S_P
 *
 */
public class Group_Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> sol = new ArrayList<>();

        if (strs.length <= 1) {
            List<String> list = Arrays.asList(strs);
            sol.add(list);
            return sol;
        }

        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {

            char[] f = s.toCharArray();
            Arrays.sort(f);

            String first = String.valueOf(f);

            if (map.containsKey(first)) {

                List<String> l = map.get(first);
                l.add(s);

            } else {

                List<String> l = new ArrayList<String>();
                l.add(s);
                map.put(first, l);
            }
        }

        for (String i : map.keySet()) {
            sol.add(map.get(i));
        }

        return sol;
    }
}
