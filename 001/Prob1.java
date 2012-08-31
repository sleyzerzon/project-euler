public class Prob1 {

    public static void main(String[] args) {
		int result = 0;
		for (int i = 1; i <1000; i++ ){
			if (i % 3 == 0 || i % 5 == 0){
				result = result + i;
			}
		}
		System.out.println("The sum of all the multiples of 3 or 5 below 1000 is "+result);
	}
}