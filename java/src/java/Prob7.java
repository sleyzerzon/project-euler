package java;
public class Prob7 {

    public static void main(String[] args) {
		System.out.println("The 10001st prime number is " + mainRoutine(10001));
	}

	public static long mainRoutine(int target) {
		int position = 0;
		int counter = 0;
		while (position != target) {
			counter++;
			if (isPrime(counter)) {
				position++;
			}
		}
		return counter;
	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		for (int i = 2; i <= Math.sqrt(n) + 1; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}