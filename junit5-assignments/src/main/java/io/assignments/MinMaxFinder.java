package io.assignments;

import java.util.Arrays;

public class MinMaxFinder {

	public int[] findMinMax(int[] arr1) {
		
		int arr2[] = new int[2];
		
		Arrays.sort(arr1);
		
		arr2[0] = arr1[0];
		
		arr2[1] = arr1[arr1.length-1];
		
		return arr2;
	}

}
