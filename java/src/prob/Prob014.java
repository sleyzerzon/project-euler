package prob;
public class Prob014 {

    public static void main(String[] args) {
		System.out.println("The starting number, under one million, producing the longest chain is " + mainRoutine(1000000));
	}
	
	public static long mainRoutine(int threshold){
		long maxChainLength = 0;
		long maxStarting = 0;
		for (long i = 1; i < threshold; i++){
			long chainLength = getChainLength(i);
			if (chainLength > maxChainLength){
				maxChainLength = chainLength;
				maxStarting = i;
			}
		}
		return maxStarting;
	}
	
	public static long getChainLength(long i){
		long chainLength = 0;
		long chainElement = i;
		while (chainElement != 1){
			chainElement = getNextChainElement(chainElement);
			chainLength++;
		}
		return chainLength;	
	}
	
	public static long getNextChainElement(long i){
		if (i%2 == 0){
			return i/2;
		}else{
			return i*3 + 1;
		}
		
	}
}
