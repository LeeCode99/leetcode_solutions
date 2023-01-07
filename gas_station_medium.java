package romanLeet;

public class gas_station_medium {

	public static void main(String[] args) {
		int[] gas = { 1, 2, 3, 4, 5 };
		int[] cost = { 3, 4, 5, 1, 2 };
		System.out.println(canCompleteCircuit(gas, cost));
	}

	public static int canCompleteCircuit(int[] gas, int[] cost) {
		int total = 0, avail = 0, ind = 0;
		for (int i = 0; i < gas.length; i++) {
			total += gas[i] - cost[i];
			avail += gas[i] - cost[i];
			if (avail < 0) {
				avail = 0;
				ind = i + 1;
			}
		}
		return total < 0 ? -1 : ind;
	}
}
