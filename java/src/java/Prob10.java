package java;
public class Prob10 {

	public static void main(String[] args) {
		System.out.println("The sum of all the primes below two million is "+ mainRoutine(2000000));
	}

	public static long mainRoutine(int threshold) {
		long sumOfPrime = 0;
		long counter = 0;
		while (counter < threshold) {
			if (isPrime(counter)) {
				sumOfPrime = sumOfPrime + counter;
			}
			counter++;
		}
		return sumOfPrime;
	}

	public static boolean isPrime(long n) {
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

