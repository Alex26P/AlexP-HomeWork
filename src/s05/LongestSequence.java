package s05;

public class LongestSequence {

	public static void main(String[] args) {

		int numbers[] = { 1, 1, 3, 3, 6, 4, 7, 7, 7, 9, 9, 9, 9, 9, 3, 6 };

		System.out.println(getSequence(numbers));
	}

	private static int getSequence(int[] numbers) {

		int counter = 0;
		int counter_max = 0; // numele variabilelor fara underscore (counterMax)
		int y;			// declaratia si initializarea pe o singura linie (int y = numbers[0];)
		y = numbers[0];
		for (int x = 1; x < numbers.length; x++) {
			if (numbers[x] == y) {
				counter++;

			} else {
				counter = 1;
			}
			if (counter_max < counter) {
				counter_max = counter;
			}
			y = numbers[x];

		}
		return counter_max;
	}

}
