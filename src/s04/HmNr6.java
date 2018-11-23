package s04;

import java.util.Arrays;

public class HmNr6 {

	public static void main(String[] args) {

		int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		getReverse(numbers);

		System.out.println("The reverse is: " + Arrays.toString(getReverse(numbers)));

	}

	private static int[] getReverse(int[] numbers) {

		int reverse[] = new int[numbers.length];

		for (int x = 0; x < numbers.length; x++) {

			int r = numbers.length - (x + 1);
			reverse[r] = numbers[x];
		}
		return reverse;
	}
}
