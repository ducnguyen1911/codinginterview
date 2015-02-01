package arraysstrings;

import java.util.ArrayList;
import java.util.List;

public class ArraysStrings {

	/*-----------------------------------------------------------------------------
	 * MAIN FUNCTION
	 * ----------------------------------------------------------------------------
	 */
	
	/**
	 * Run a test and check time of that test.
	 */
	private void runTests() {
		System.out.println("Start...");
		long startTime = System.nanoTime();
		
		// run the method
		System.out.println("Result: " + isUniqueChar("qwertyuiopasdfghjklzxcvbnm123456789!@#$%^&*()_+"));
		
		long endTime = System.nanoTime();
		long duration = (endTime - startTime) / 1000000 ;
		System.out.println("End. Execution time is: " + duration);		
	}
	
	/**
	 * Main function
	 * @param args
	 */
	public static void main(String[] args) {
		ArraysStrings as = new ArraysStrings();
		as.runTests();
		
		int i = 3;
		System.out.println(1 << i);
		
	}
	
	/*-----------------------------------------------------------------------------
	 * PROBLEMS
	 * ----------------------------------------------------------------------------
	 */
	
	/**
	 * Problem 1: check if a string has all unique characters.
	 * @param str
	 * @return
	 */
	private boolean isUniqueChar(String str){
		// suppose the string is an ASCII string --> there are 256 chars.
		// if it is stored with Unicode UTF-8: use 4 Bytes for encoding chars.
		if (str.length() > 256) {
			return false;
		}
		
		List<Character> uniqueChars = new ArrayList<Character>();
		for (char c : str.toCharArray()) {
			if (uniqueChars.contains(c)) {
				return false;
			} else {
				uniqueChars.add(c);
			}
		}
		return true;
	}
	
	
}
	
	
