package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
	//1. Write a static method called intArraySorted. 
	//   This method takes in an array of integers
	//   and it returns a boolean.
	//   The method returns true if the integer
	//   array is in ascending order and false otherwise
	static boolean intArraySorted(int[] nums) {
		boolean ascending = true;
		for(int i = 0;i<nums.length-1;i++) {
			if(nums[i] < nums[i+1] || nums[i] == nums[i+1]) {
				continue;
			}
			else {
				ascending = false;
				break;
			}
		}
		return ascending;
	}
	
	//2. Write a static method called doubleArraySorted. 
	//   This method takes in an array of doubles
	//   and it returns a boolean.
	//   The method returns true if the double
	//   array is in ascending order and false otherwise

	static boolean doubleArraySorted(double[] doubles) {
		boolean ascending = true; 
		for(int i = 0;i<doubles.length-1;i++) {
			if(doubles[i] < doubles[i+1] || doubles[i] == doubles[i+1]) {
				continue;
			} 
			else {
				ascending = false;
				break; 
			}
		}
		return ascending; 
	}
	//3. Write a static method called charArraySorted. 
	//   This method takes in an array of characters
	//   and it returns a boolean.
	//   The method returns true if the character
	//   array is in alphabetical order and false otherwise
	//   (You can compare characters just like integers)
	static boolean charArraySorted(char[] characters) {
		boolean alphabetical = true; 
		for(int i = 0;i<characters.length-1;i++) {
			if(characters[i] < characters[i+1]) { 
				continue;
			}
			else { 
				alphabetical = false; 
				break; 
			}
		} 
		return alphabetical; 
	}
	
	//4. Write a static method called stringArraySorted. 
	//   This method takes in an array of Strings
	//   and it returns a boolean.
	//   The method returns true if the String
	//   array is in alphabetical order and false otherwise
	//   (Use the compareTo(String) method)
	
	static boolean stringArraySorted(String[] words) {
		boolean alphabetical = true; 
		for(int i = 0;i<words.length-1;i++) {
			if(words[i].charAt(0) < words[i+1].charAt(0)) { 
				continue; 
			}
			else {
				alphabetical = false;
				break;
			}
		}
		return alphabetical;
	}

}
