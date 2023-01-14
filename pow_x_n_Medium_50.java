package romanLeet;

public class pow_x_n_Medium_50 {

	public static void main(String[] args) {
		double x = 2.1;
		int n = 3;
		System.out.println(myPow(x,n));

	}

	public static double myPow(double x, int n) {
		if (n == 0)
			return 1;
		if (x == 0)
			return 0;

		if (x < 0)
			x = 1 / x;
		double y = x;
		for (int i = 0; i < n-1; i++)
			{
			 x = x*y;

			System.out.println(x);
			}
	
		return x;
	}
}
