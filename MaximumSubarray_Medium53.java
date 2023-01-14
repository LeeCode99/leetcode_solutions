package romanLeet;

import java.util.Arrays;

public class MaximumSubarray_Medium53 {

	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(nums));
	}
	// Using Kadane's Algorithm
	public static int maxSubArray(int[] nums) {
		int curSum = nums[0];
		int maxSum = nums[0]; 
		
		for (int i = 1; i < nums.length; i++) {

			if (curSum < 0) {
				curSum = 0;
			}

			curSum += nums[i];
			
			maxSum = Math.max(maxSum, curSum);

		}

		return maxSum;
	}
}
