package romanLeet;

public class count_digits_of_number {

	public static void main(String[] args) {
		int a = 1248;
		System.out.println(countDigits(a));

	}

	static int count = 0;

	public static int countDigits(int num) {
		int val = num % 10;
		int num2 = num;
		int length = (int) (Math.log10(num) + 1);
		
		for (int i = 0; i < length; i++) {
			if (num2 % val == 0) {
				count++;
				System.out.println(num2 + " " + val);
			}
			num = num / 10;
			val = num % 10;
		}
		return count;
	}

}
