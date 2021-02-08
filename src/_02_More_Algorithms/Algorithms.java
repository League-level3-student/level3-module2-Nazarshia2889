package _02_More_Algorithms;

import java.util.List;

import _01_Searching_Algorithms._00_LinearSearch;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for(int i = 0;i<eggs.size();i++) {
			if(eggs.get(i) == "cracked") {
				return i;
			}
		}
		return -1;
	}
}
