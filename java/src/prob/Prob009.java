package prob;
public class Prob009 {

	public static void main(String[] args) {
		System.out.println("The product abc of the only one Pythagorean triplet for which a + b + c = 1000 is "+ mainRoutine(1000));

	}

	public static int mainRoutine(int target) {
		for (int a = 1; a < target; a++) {
			for (int b = 1; b < target; b++) {
				for (int c = 1; c < target; c++) {
					if (isPythagoreanTripletAndSumForTarget(a, b, c, target)) {
						return a * b * c;
					}
				}
			}
		}
		return 0;
	}

	public static boolean isPythagoreanTripletAndSumForTarget(int a, int b,	int c, int target) {
		if (isPythagoreanTriplet(a, b, c) && (a + b + c == target)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isPythagoreanTriplet(int a, int b, int c) {
		if (a * a + b * b == c * c) {
			return true;
		} else {
			return false;
		}
	}
}

