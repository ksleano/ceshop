package ceshop;

import java.util.HashMap;
import java.util.Map;

public class TenSum {

	public static void main(String[] args) {
		int[] iList = {10,10,5,5,7,2,3,4,8,6,1,9,0};
		
		sum(iList);

	}
	
	/**
	 * Print out combinations that add up to 10
	 * @param iList list of integers
	 */
	public static void sum(int[] nums) {
		// brute force will iterate over the array 2 times O(n^2) looking for a match. Using the value itself as an key in a map reduces the search time for a pair.
		Map<Integer, Integer> m = new HashMap<>();
		int sum = 10;
		for(int i = 0; i < nums.length; i++) {
			int complement = sum - nums[i];
			
			// check if the complement already exists, if so print out the result and continue
			if(m.containsKey(complement)) {
				System.out.printf("%d + %d = %d \n", m.get(complement), nums[i], sum);
				continue;
			}

			m.put(nums[i], nums[i]);
		}
//		System.out.println(m);
	}

}
