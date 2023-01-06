package romanLeet;

import java.util.Arrays;

public class roman {

	public static void main(String[] args) {
		String s = "IIIIXIIIII";
		System.out.println(romanToInt(s));
	}

	static char[] roman = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
	static int[] num = { 1, 5, 10, 50, 100, 500, 1000 };

	public static int romanToInt(String s) {
		int ans = 0;
		int[] val = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			val[i] = retVal(s.charAt(i));
		}
		int i = 0;
		for (; i < s.length() - 1; i++) {
			if (val[i] < val[i + 1]) {
				ans += val[i + 1] - val[i];
				i++;
			} else {
				ans += val[i];
			}
		}
		if (i != s.length()) {
			ans += val[i++];
		}
		return ans;

	}

	public static int retVal(char s) {
		int val = 0;
		for (int i = 0; i < 7; i++) {
			if (s == roman[i])
				return num[i];
		}
		return -1;
	};
}
