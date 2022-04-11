package io.assignments;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinMaxFinderTest {

	@Test
	void findMinMaxtest1() {
		
		MinMaxFinder find = new MinMaxFinder();
		int[] arr2 = {5,39,1,26,86,25};
		int[] arr1 = find.findMinMax(arr2);
		int[] arr3 = {1,86};
		assertArrayEquals(arr1, arr3);
		
	}
	
	@Test
	void findMinMaxtest2() {
		
		MinMaxFinder find = new MinMaxFinder();
		int[] arr2 = {6416,666,6461,161616,51441,64613,646494,5466};
		int[] arr1 = find.findMinMax(arr2);
		int[] arr3 = {666,646494};
		assertArrayEquals(arr1, arr3);
		
	}
	
	@Test
	void findMinMaxtest() {
		
		MinMaxFinder find = new MinMaxFinder();
		int[] arr2 = {58,25,69,75,24,69,852,4632,822,225};
		int[] arr1 = find.findMinMax(arr2);
		int[] arr3 = {24,4632};
		assertArrayEquals(arr1, arr3);
		
	}

}
