package _02_More_Algorithms;

import java.util.List;

import _00_Sorting_Algorithms._00_SortedArrayChecker;
import _01_Searching_Algorithms._00_LinearSearch;

public class Algorithms {
	static boolean doubleArraySorted(List<Double> doubles) {
		boolean ascending = true; 
		for(int i = 0;i<doubles.size()-1;i++) {
			if(doubles.get(i) < doubles.get(i+1) || doubles.get(i) == doubles.get(i+1)) {
				continue;
			} 
			else {
				ascending = false;
				break; 
			}
		}
		return ascending; 
	}
	
	public static int findBrokenEgg(List<String> eggs) {
		for(int i = 0;i<eggs.size();i++) {
			if(eggs.get(i) == "cracked") {
				return i;
			}
		}
		return -1;
	}

	public static Object countPearls(List<Boolean> oysters) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i = 0;i<oysters.size();i++) {
			if(oysters.get(i) == true) {
				count += 1;
			}
		}
		return count;
	}

	public static double findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub
		double tallest = peeps.get(0);
		for(int i = 0;i<peeps.size();i++) {
			if(peeps.get(i) > tallest) {
				tallest = peeps.get(i);
			}
		}
		return tallest;
	}

	public static Object findLongestWord(List<String> words) {
		// TODO Auto-generated method stub
		int longest = words.get(0).length();
		int index = 0;
		for(int i = 0;i<words.size();i++) {
			if(words.get(i).length() > longest) {
				longest = words.get(i).length();
				index = i;
			}
		}
		return words.get(index);
	}

	public static Object containsSOS(List<String> message1) {
		// TODO Auto-generated method stub
		boolean contains = false;
		for(int i = 0;i<message1.size();i++){
			if(message1.get(i).equals("... --- ...")) {
				contains = true;
				break;
			}
		}
		return contains;
	}

	public static List<Double> sortScores(List<Double> results) {
		// TODO Auto-generated method stub
		while(doubleArraySorted(results) == false) {
			for(int i = 0;i<results.size()-1;i++) {
				if(results.get(i) > results.get(i+1)) {
					Double x = results.get(i);
					results.set(i, results.get(i+1));
					results.set(i+1, x);
				}
			}
		}
		return results;
	}
}
