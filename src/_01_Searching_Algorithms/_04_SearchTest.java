package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] words = {"apple", "banana", "orange", "grapes", "blackberry", "strawberries"};
		assertEquals(1, _00_LinearSearch.linearSearch(words, "banana"));
		assertEquals(3, _00_LinearSearch.linearSearch(words, "grapes"));
		assertEquals(-1, _00_LinearSearch.linearSearch(words, "pear"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		assertEquals(8, _01_BinarySearch.binarySearch(nums, 0, nums.length-1, 8));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
	}
}
