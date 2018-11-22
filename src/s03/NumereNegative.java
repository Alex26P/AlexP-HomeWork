package s03;

public class NumereNegative {
	public static void main(String args[]) {
		int numbers[] = { 6, -5, 66, -78, 65, 9 };
		int total = negativeNumbers(numbers);
		System.out.println("The number of negative numbers: " + total);
	}

	public static int negativeNumbers(int[] count) {
		int negative = 0;
		for (int x = 0; x < count.length; x++) {
			if (count[x] < 0) {
				negativeNumbers = count[x];
			}
			return negative;
		}

	}
}
//	m-am impotmolit........ :| ...
// am schimbat de atatea ori, ca deja nu mai stiu ce am vrut sa fac..