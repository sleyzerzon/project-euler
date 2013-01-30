package prob;
import java.util.SortedMap;
import java.util.TreeMap;


public class Prob004 {
    public static void main(String[] args) {
		System.out.println("The largest palindrome made from the product of two 3-digit numbers is "+getPalindromFromProduct3Digits());
	}
	
	public static String getPalindromFromProduct3Digits() {
		SortedMap<Integer,String> tmpMap = new TreeMap<Integer, String>();
		for (int i = 999; i >= 100; i--) {
			for (int j = 999; j  >= 100; j--) {
				if (isPalindrom(i * j)) {
					tmpMap.put(i*j, i*j+" made by "+ i +" * "+ j);
				}
			}
		}
		return tmpMap.get(tmpMap.lastKey());
	}

	public static boolean isPalindrom(long number) {
		String target = String.valueOf(number);
		boolean result = false;
		if (target.length() % 2 == 0) {
			String firstHalf = target.substring(0, target.length() / 2);
			String secondHalf = target.substring(target.length() / 2);
			String reversedSecondHalf = reverseString(secondHalf);
			if (firstHalf.equals(reversedSecondHalf))
				result = true;
		} else {
			String firstHalf = target.substring(0, target.length() / 2);
			String secondHalf = target.substring(target.length() / 2 + 1);
			String reversedSecondHalf = reverseString(secondHalf);
			if (firstHalf.equals(reversedSecondHalf))
				result = true;
		}
		return result;
	}

	public static String reverseString(String a) {
		int length = a.length();
		StringBuilder reverse = new StringBuilder();
		for (int i = length; i > 0; --i) {
			char result = a.charAt(i - 1);
			reverse.append(result);
		}
		return reverse.toString();
	}
}