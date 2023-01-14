package romanLeet;

public class DivideTwoIntegers_medium {

	public static void main(String[] args) {
		int a = -2147483648;

		int b = -1;

		System.out.println(divide1(a, b));
	}

	public static int divide(int dividend, int divisor) {

		if (dividend > 0 || divisor > 0) {
			return (int) Math.ceil(dividend / divisor);
		}
		return (int) Math.floor(dividend / divisor);

	}

	public static int divide1(int dividend, int divisor) {
		int sign, result = 0, value = 31;
		if ((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0))
			sign = 1;
		else
			sign = -1;
		long ldividend = Math.abs((long) dividend);
		long ldivisor = Math.abs((long) divisor);
		while (ldividend >= ldivisor) {
			while (ldividend < ldivisor << value) {
				System.out.println(value);
				value--;
			}
			ldividend -= ldivisor << value;
			result += 1 << value;
		}
		if (result > Integer.MAX_VALUE)
			result = Integer.MAX_VALUE;
		if (dividend == Integer.MIN_VALUE && divisor == -1)
			result = Integer.MAX_VALUE;
		result = sign > 0 ? result : -result;
		return result;
	}
}
