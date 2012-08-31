public class Prob5 {

    public static void main(String[] args) {
		System.out.println("The smallest positive number that is evenly divisible by all of the numbers from 1 to 20 is "+ smallestNumberEvenlyDivisibleByRange(1,20));
	}
	
	
	public static long smallestNumberEvenlyDivisibleByRange(long start, long end){
		long result = 0;
		long i = 1;
		while(true){
			if (isEvenlyDivisibleByRange(i,start,end)){
				result = i;
				break;
			}
			i++;
		}
		return result;
		
	}

	public static boolean isEvenlyDivisibleByRange(long target,long start, long end){
		boolean result = true;
		for (long i = start; i <= end; i++){
			if (target % i != 0){
				result = false;
			}
		}
		if (result){
			System.out.println("BINGO");
		}
		return result;
	}
}
