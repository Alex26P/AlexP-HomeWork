package s03;

public class NrMinim {

	public static void main(String[] args) {

		/*
		 * int[] minimum = { 7, 9, 4, 6, 2 }; Arrays.sort(minimum);
		 * 
		 * System.out.println("Minimum: " + minimum[0]);
		 */

		/*
		 * int[] number = { 7, 9, 4, 6, 2 }; Arrays.sort(number);
		 * 
		 * int minimum = number[0]; System.out.println("Minimum: " + minimum);
		 */

		// "0" because this method sorts the array into ascending numerical order
		// meaning the minimum value will always be at the first position

		// to find Maximum: int maximum = number[number.length - 1];
		// System.out.println("Maximum: " + maximum);
		// ".length-1" because the maximum value will always be at the last position

		int numbers[] = { 7, 9, 4, 6, 2 };

		int min = minValue(numbers);
		System.out.println("Minimum Value is: " + min);

	}

	public static int minValue(int[] value) {

		int minValue = value[0];

		for (int v = 1; v < value.length; v++) {
			if (value[v] < minValue) {

				minValue = value[v];
			}
		}
		return minValue;
	}
}