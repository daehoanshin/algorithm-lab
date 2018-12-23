package tow.sum.hashtable;

import java.util.HashMap;

class Solution {
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) return new int[] { map.get(target - nums[i]), i };
			
			map.put(nums[i], i);

		}

		throw new IllegalArgumentException("No two sum solution");
	}
}

public class Test {
	public static void main(String[] args) {
		int[] nums = { 6, 4, 3, 8, 7, 5, 2 };
		Solution sol = new Solution();
		int[] result = sol.twoSum(nums, 5);
		System.out.println(result[0] + "," + result[1]);
	}
}
