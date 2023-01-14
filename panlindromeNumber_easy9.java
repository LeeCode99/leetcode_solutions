package romanLeet;

import java.util.Arrays;

public class panlindromeNumber_easy9 {

	public static void main(String[] args) {

		System.out.println(isPalindrome(100));

	}

	public static boolean isPalindrome(int x) {
		if (x < 0)
			return false;

		int n = x;
		int count = 0;
		while (n > 0) {
			count++;
			n /= 10;
		}
		n = x;

		int[] arr = new int[count];
		while (n > 0) {
			arr[count - 1] = n % 10;
			n /= 10;
			count--;
		}

		n = x;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != x % 10)
				return false;
			x /= 10;
		}
		return true;

	}
}
