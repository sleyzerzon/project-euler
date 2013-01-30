package prob;
public class Prob006 {

    public static void main(String[] args) {
		System.out.println("The difference between the sum of the squares of the first one hundred natural numbers and the square of the sum is "+mainRoutine(100));
	}

	public static long mainRoutine(int upperLimit){
		long sumOfSquare = 0;
		long squareOfSum = 0;
		for (long i = 1 ; i<=upperLimit; i++){
			sumOfSquare = sumOfSquare + i*i;
			squareOfSum = squareOfSum +i;
		}
		squareOfSum = squareOfSum * squareOfSum;
		return squareOfSum - sumOfSquare;
	}	
}
