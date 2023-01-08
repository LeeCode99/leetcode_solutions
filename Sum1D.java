package romanLeet;

import java.util.Arrays;

public class Sum1D {

	public static void main(String[] args) {

		int[] a = { 1, 1, 1, 1, 1 };
		System.out.println(Arrays.toString(runningSum2(a)));
	}

	public static int[] runningSum(int[] nums) {
		if (nums.length == 1)
			return nums;
		int[] arr = new int[nums.length];
		for (int i = 0; i < arr.length; i++)
			arr[i] = nums[i];

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < i; j++) {
				nums[i] += arr[j];
			}
		}
		return nums;
	}

	public static int[] runningSum2(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			// Result at index `i` is sum of result at `i-1` and element at `i`.
			nums[i] += nums[i - 1];
		}
		return nums;
	}
}
