package linkedlists;

public class LinkedLists {
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
		LinkedLists as = new LinkedLists();
		as.runTests();
		
		int i = 3;
		System.out.println(1 << i);
		
	}
	
	/*-----------------------------------------------------------------------------
	 * PROBLEMS
	 * ----------------------------------------------------------------------------
	 */
	
	public String isUniqueChar(String str) {
		return null;
	}
}
