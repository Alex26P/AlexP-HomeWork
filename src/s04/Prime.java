package s04;

// Prime number: a whole number greater than 1, that can only be divided into 1 or itself

public class Prime {

	public static void main(String[] args) {

		System.out.println(isPrime(9));
	}

	private static boolean isPrime(int n) {

		for (int x = 2; x < n; x++) {
			// skip 1 and start from 2 (x=2)- because it can be divided by 1

			if (n % 2 == 0) {
				// n=9, so: n%2,n%3....increment x by 1 each time, until it gets to 8
				// skip 9 because it can be divided by 9 - so skip 1 and itself
				// (n % nr == 0 ): if n is divisible into the number, it returns a 0

				return true;
			}
		}
		return false;
	}
}
