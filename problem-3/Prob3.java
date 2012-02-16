import java.util.SortedSet;
import java.util.TreeSet;

public class Prob3 {

  public static void main(String[] args) {
		long target = new Long("600851475143");
		System.out.println("The largest prime factor of the number 600851475143 is "+largestPrimeFactor(target));	
	}
	
	public static SortedSet<Long> primeFactor(long arg){
		SortedSet<Long> primeFactorSet = new TreeSet<Long>();
	    for (int i = 2; i <= arg; i++) {
	    	while (arg % i == 0) {
	    		primeFactorSet.add((long) i);
			  	arg = arg / i;
		  	}
      }
		return primeFactorSet;
	}
	
	public static long largestPrimeFactor(long arg){
		SortedSet<Long> primeFactorSet = primeFactor(arg);
		return primeFactorSet.last();
	}
}
