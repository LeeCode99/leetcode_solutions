package romanLeet;

import java.util.Arrays;

public class maxIceCream_medium {

	public static void main(String[] args) {
		int[] costs = { 1,3,2,4,1 };
		int coins = 7;
		System.out.println(maxIceCream(costs,coins));

	}

	public static int maxIceCream(int[] costs, int coins) {
		int ans = 0;
		int len = costs.length;
		int count = 0;
		int[] arr = new int[len];

		for (int i = 0; i < costs.length; i++) {
			if (costs[i] <= coins) {
				arr[count] = costs[i];
				count++;
		
			}
		}
		if (count == 0)
			return ans;
		
		Arrays.sort(arr);
		
		count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				coins -= arr[i];
				if(coins < 0)
					break;
				count++;
			}
				
		}
		return count;
	}
}
