package romanLeet;

import java.util.Arrays;
import java.util.Collections;

public class Longest_common_prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String longestCommonPrefix(String[] strs) {
		String ans = "";
		if (strs[0].charAt(0) != strs[1].charAt(0) || strs.length == 1)
			return ans;

		int[] arr = new int[strs.length];
		for (int i = 0; i < strs.length; i++) {
			arr[i] = strs[i].length();
		}
		int min = Collections.min(Arrays.asList(arr));

		ans = strs[0].substring(0, 1);

		for (int i = 1; i < min; i++) {
			for (int j = 0; j < strs.length; j++) {
				if (!check(strs[j], i, ans))
					return ans;
			}
			ans = strs[0].substring(0, i + 1);
		}
		return ans;
	}

	public boolean check(String str, int index, String s) {
		if (str.substring(0, index) == s)
			return true;
		return false;
	}

}
