package com.leetcode.P01_TwoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}

/*
Complexity Analysis

    Time complexity: O(n). We traverse the list containing nn elements only once. Each lookup in the table costs only O(1) time.

    Space complexity: O(n). The extra space required depends on the number of items stored in the hash table, which stores at most nn elements.

 */