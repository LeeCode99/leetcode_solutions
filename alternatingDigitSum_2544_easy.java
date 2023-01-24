package romanLeet;

import java.util.ArrayList;

public class alternatingDigitSum_2544_easy {

	public static void main(String[] args) {

		System.out.println(alternateDigitSum(521));

	}

	public static int alternateDigitSum(int n) {

		ArrayList<Integer> list = new ArrayList<>();
		while (n > 0) {
			list.add(n % 10);
			n /= 10;
		}
		int sum = 0;
		boolean sign = false;
		
		
		for (int i = list.size() ; i > 0 ; --i) {
			System.out.println(list.get(i-1));
			if (!sign) {
				sum += list.get(i-1);
				
				sign = true;
			} else {
				sum -= list.get(i-1);
				sign = false;
			}
		}
		return sum;

	}

}
