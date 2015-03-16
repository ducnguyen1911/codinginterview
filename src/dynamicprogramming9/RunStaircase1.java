package dynamicprogramming9;

import java.util.HashMap;
import java.util.Map;

public class RunStaircase1 {

	private static Map<Integer, Integer> results;
	private static int numbCall = 0;
	public static void main(String[] args) {
		RunStaircase1 rs = new RunStaircase1();
		results = new HashMap<Integer, Integer>();
		results.put(0, 1);
		results.put(1, 1);
		System.out.println(rs.countSteps(10));
		System.out.println("Total number of calls: " + numbCall);
	}

	/**
	 * Implementation with Dynamic Programming
	 * @param level
	 * @return
	 */
	private int countSteps(int level) {
		numbCall += 1;
		System.out.println("call count function: " + level);
		if (level < 0) {
			return 0;
		} else if (!results.containsKey(level)) {
			results.put(level, countSteps(level - 1) 
							 + countSteps(level - 2)
							 + countSteps(level - 3));
		}
		return results.get(level);
	}
}
