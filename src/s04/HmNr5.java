package s04;

public class HmNr5 {

	public static void main(String[] args) {

		int numbers[] = { 5, 8, 7, 3, 6, 4 };

		int nr = 4;

		System.out.println(searchNumber(numbers, nr));
	}

	private static int searchNumber(int[] numbers, int nr) {

		for (int x = 0; x < numbers.length; x++) {

			if (numbers[x] == nr) {
				if (x == numbers.length - 1) { // ultima pozitie
					return -2;

				} else {
					if (x == numbers.length + 1) { // prima pozitie
					}
				}
			}
		}
		return -1;
	}
}