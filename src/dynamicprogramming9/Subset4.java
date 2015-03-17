package dynamicprogramming9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Subset4 {

	public static void main(String[] args) {
		Subset4 s = new Subset4();
		List<String> lst = s.findSubsets(22);
		System.out.println(lst.size());
//		for (String str : lst) {
//			System.out.println(str);
//		}

	}

	private static Map<Integer, List<String>> results = new HashMap<Integer, List<String>>();

	private List<String> findSubsets(int n){
		if (results.containsKey(n)){
			return results.get(n);
		}
		else {
			List<String> ret = new ArrayList<String>();
			if (n == 1) {
				ret.add("1");
			} else {
				ret.addAll(findSubsets(n-1));
				ret.add(String.valueOf(n));
				List<String> temp = findSubsets(n-1);
				for (String s : temp){
					ret.add(s + ',' + n);
				}
			}
			results.put(n, ret);
			return ret;	
		}
	}

	/*
	* Time: O(2^n)
	* Space: O(2^n). Think in the way that if an element is not in a subset -> 0,
	* or 1 if it is in a subset.
	*/
}
