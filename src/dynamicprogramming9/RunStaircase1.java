package dynamicprogramming9;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class RunStaircase1 {

	private static Map<Integer, BigInteger> results;
	private static int numbCall = 0;
	public static void main(String[] args) {
		RunStaircase1 rs = new RunStaircase1();
		results = new HashMap<Integer, BigInteger>();
		results.put(0, new BigInteger("1"));
		results.put(1, new BigInteger("1"));
		System.out.println(rs.countSteps(10000));
		System.out.println("Total number of calls: " + numbCall);
	}

	/**
	 * Implementation with Dynamic Programming
	 * @param level
	 * @return number of ways for running up a staircase
	 * 
	 * Note: should limit the max value of level to prevent exceptions?
	 * Question: what is max value of a BigInteger?
	 */
	private BigInteger countSteps(int level) {
		numbCall += 1;
//		System.out.println("call count function: " + level);
		if (level < 0) {
			return new BigInteger("0");
		} else if (!results.containsKey(level)) {
			results.put(level, countSteps(level - 3)
					.add(countSteps(level - 2))
					.add(countSteps(level - 1)));
		}
		return results.get(level);
	}
	
	/**
	 * ANALYSIS: 
	 * + Memory: O(n)
	 * + Time: 
	 */
	
}
