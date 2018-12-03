package s06;

public class Homework03 {
	public static void main(String[] args) {
		int numbers[] = { 2, 5, 7, 8, 3, 9 };
		int sum = 10;
		System.out.println(getEqualSumPairs(numbers, sum));
	}

	private static int getEqualSumPairs(int[] numbers, int sum) {
		int count = 0;
		for (int x = 0; x < numbers.length; x++)
			for (int y = x + 1; y < numbers.length; y++)
				if ((numbers[x] + numbers[y]) == sum)
					count++;
		return count;

	}
}
