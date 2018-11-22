package s04;

//Palindrome number: a number that is the same when you read it forwards or backwards

public class Palindrome {

	public static void main(String[] args) {

		System.out.println(isPalindrome(41014));
	}

//1. reverse the given number
	private static int getReverse(int n) {

		int rev = 0;// this variable hold the reverse number (dummy variable)

		while (n > 0) {
			int r = n % 10;
			rev = rev * 10 + r;
			n /= 10;
		}

		// int r = 41014 % 10 (4) ------------- r=4
		// rev(0) = 0 * 10 + 4 (4) ------------ rev=4
		// 41014 /= 10 (4101) ----------------- n=4101

		// repeat the loop

		// int r = 4101 % 10 (1) -------------- r=1
		// rev(4) = 4 * 10 + 1 (41) ----------- rev=41
		// 4101 /= 10 (410) ------------------- n=410

		// repeat the loop

		// int r = 410 % 10 (0) --------------- r=0
		// rev(41) = 41 * 10 + 0 (410) -------- rev=410
		// 410 /= 10 (41) --------------------- n=41

		// repeat the loop

		// int r = 41 % 10 (1) ---------------- r=1
		// rev(410) = 410 * 10 + 1 (4101) ----- rev=4101
		// 41 /= 10 (4) ----------------------- n=4

		// repeat the loop

		// int r = 4 % 10 (4) ----------------- r=4
		// rev(4101) = 4101 * 10 + 4 (41014) -- rev=41014
		// 4 /= 10 (0) ------------------------ n=0

		// end of the loop (0 is not greater than 0)

		return rev;
	}

//2. compare the given number with reverse
	private static boolean isPalindrome(int n) {

		if (n == getReverse(n)) { // to check if the given number is equal to the number returned by the reverse

			return true;
		}
		return false;
	}
}
