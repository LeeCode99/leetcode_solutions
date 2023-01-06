package romanLeet;

public class lengthOfLongestSubstring {

	public static void main(String[] args) {
		String s = "pwwkew";
		System.out.println(lengthOfLongestSubstring(s));
	}

	public static int lengthOfLongestSubstring(String s) {
		int count = 1;
		int second = 1;
		boolean check = false;
		for (int i = 0; i < s.length() - 1; i++) {
			for (int j = i + 1; j < s.length() - 2; j++) {
				if (!s.substring(i, i + 1).equals(s.substring(j, j + 1)))
				{
					count++;
					System.out.println(s.substring(i, i + 1) + " " + s.substring(j, j + 1));
				}
				
				else {
					
					if(second == 1 && count > second)
						second = count;
					
					count = 1;

				}

			}
		}
		
		
		return second;
	}
}
