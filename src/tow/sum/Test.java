package tow.sum;
class Solution {
	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if(target == nums[i] + nums[j]) {
					return new int[] {i, j};
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
}
public class Test {
	public static void main(String[] args) {
		int[] nums = {6,4,3,8,7,5,2};
		Solution sol = new Solution();
		int[] result = sol.twoSum(nums, 5);
		System.out.println(result[0] + "," + result[1]);
	}
}
