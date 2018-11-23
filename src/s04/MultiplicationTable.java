package s04;

public class MultiplicationTable {

	public static void main(String[] args) {
		int nr = 6;
		getMultiplication(nr);

	}

	private static int getMultiplication(int nr) {

		int multiplication = 0;

		for (int x = 1; x <= 10; x++) {

			System.out.println(nr + " * " + x + " = " + (nr * x));

		}
		return multiplication;
	}
}