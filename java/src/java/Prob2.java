package java;
public class Prob2 {

    public static void main(String[] args) {
		int result = 0;
		int n = 0;
		int fib = 0;
		do{
			if (fib % 2 == 1){
				result = result + fib;
			}
			fib = fibonaci(n);
			n++;
		}while(fib < 4000000);
		
		System.out.println("The sum of the even-valued terms considering the terms in the Fibonacci sequence whose values do not exceed four million is "+result);
	}
	
	public static int fibonaci(int n){
		 if (n <= 1)
		      return 1;
		  else
		      return fibonaci (n-1) + fibonaci (n-2);
	}
}