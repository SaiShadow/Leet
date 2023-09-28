package leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class Solution {

    public static void main(String args[]) {
        System.out.println();
        System.out.println(Arrays.toString(topKFrequent(new int[] { -5, -9, 67, -10, 4, -57, 47, 13, -67, -26, -57, 63,
                38, -68, 62, -45, -37, 95, 49, -91, -53, -42, -33, 80, 78, -30, -36, 22, 9, -86, 79, -1, 44, -92, 30,
                -68, -94, 58, -51, -26, -38, 5, -74, 25, 71, -93, 52, -12, -86, 7, -86, 53, 78, -31, -5, -87, 88, -98,
                -39, 9, 99, 23, 96, -90, 51, -64, 35, -73, 9, 60, -78, 70, 99, 14, 70, 71, -78, 50, 7, 46, -89, 57, -1,
                87, -87, -95, 48, 49, 79, -54, 31, 28, -27, 75, 31, -76, -12, 35, 40, -90, -60, -60, -7, 67, 73, -34,
                -42, -35, 61, 51, 18, 95, 16, 78, -81, -91, -30, 92, 57, -79, 5}, 7)));
    }

    public static int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            if (map.containsKey(i)) {
                map.replace(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        int[] key_arr = map.keySet().stream().mapToInt(Integer::intValue).toArray();

        if (map.keySet().size() == k) {
            return key_arr;
        }

        List<Integer> values = new ArrayList<>(map.values());
        Collections.sort(values);
        Collections.reverse(values);
        values = values.subList(0, k);

        int size = 0;
        int[] sol = new int[k];
        boolean[] seen = new boolean[key_arr.length];

        for (int i : values) {
            for (int j = 0; j < key_arr.length; j++) {

                int key = key_arr[j];

                if (!seen[j] && map.get(key).equals(i)) {

                    sol[size] = key;
                    seen[j] = true;
                    size++;
                    if (size == k) {
                        return sol;
                    }
                }
            }

        }
        return sol;
    }
}