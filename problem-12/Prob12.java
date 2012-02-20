public class Prob12 {
    public static void main(String[] args) {
		System.out.println("The value of the first triangle number to have over five hundred divisors is " + mainRoutine());
	}
	
	public static long mainRoutine(){
		long triangleValue = 0;
		long counter = 0;
		boolean found = false;
		while(!found){
			triangleValue = triangleValue + counter;
			counter++;
			if (hasOverFiveHundredDivisors(triangleValue)){
				found = true;
			}
		}
		return triangleValue;
	}

	private static boolean hasOverFiveHundredDivisors(long triangleValue) {
		long counter = 0;
		for (long i = 1; i <= Math.sqrt(triangleValue + 1); i++){
			if (triangleValue % i == 0){
				counter++;
			}
		}
		return (counter*2 > 500) ? true : false;
			 
	}
}
