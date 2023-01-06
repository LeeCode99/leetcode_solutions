package romanLeet;

public class medianOfSortedArray2 {

	public static void main(String[] args) {
		int[] nums1 = { 0, 0, 0, 0, 0 };
		int[] nums2 = { -1, 0, 0, 0, 0, 0, 1 };
		System.out.println(findMedianSortedArrays(nums1, nums2));
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int length = 0;
		
		
		if((nums1.length + nums2.length) % 2 == 0)
			length = (nums1.length + nums2.length)/2 + 1;
		else 
			length = (nums1.length + nums2.length)/2;
		
			
		
		
		
	}
}
