package s06;

public class PythagorasTheorem {
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int c = 5;
		System.out.println(isPTheorem(a, b, c));
	}

	private static boolean isPTheorem(int a, int b, int c) {
		int sum = 0;
		int sideA = a * a;
		int sideB = b * b;
		int sideC = c * c;

		sum = sideA + sideB;

		if (sideC == sum) {
			return true;
		}
		return false;
	}
}
