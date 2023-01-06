package romanLeet;

import java.util.Arrays;

public class medianTwoSortedArray {

	public static void main(String[] args) {
		int[] nums1 = { 0, 0, 0, 0, 0 };
		int[] nums2 = { -1, 0, 0, 0, 0, 0, 1 };
		System.out.println(findMedianSortedArrays(nums1, nums2));

	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] arr = new int[nums1.length + nums2.length];

		int length = nums1.length + nums2.length;

		int ptr1 = 0;
		int ptr2 = 0;

		int min = 0;
		for (int i = 0; i < length; i++) {
			if (ptr1 == nums1.length) {
				min = nums2[ptr2];
				ptr2++;
			} else if (ptr2 == nums2.length) {
				min = nums1[ptr1];
				ptr1++;
			} else if (nums1[ptr1] == nums2[ptr2]) {
				min = nums2[ptr2];
				ptr2++;
			} else if (nums1[ptr1] < nums2[ptr2]) {
				min = nums1[ptr1];
				ptr1++;
			} else if (nums1[ptr1] > nums2[ptr2]) {
				min = nums2[ptr2];
				ptr2++;
			}
			arr[i] = min;
			
		}

		double ans = -1;
		if (length % 2 == 0) {
			ans = ((double) arr[length / 2] + (double) arr[length / 2 - 1]) / 2;
		} else
			ans = arr[length / 2];
		return ans;

	}

}
