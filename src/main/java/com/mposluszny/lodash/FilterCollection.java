package com.mposluszny.lodash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.github.underscore.lodash.$;

public class FilterCollection {

	public static void main(String[] args) {
		$.filter(Arrays.asList(1, 2, 3), (el) -> el == 2)
		.forEach((el) -> System.out.println(el));

		System.out.println("\n--------------------\n");
		
		$.reject(Arrays.asList(1, 2, 3), (el) -> el == 2)
		 .forEach((el) -> System.out.println(el));

		System.out.println("\n--------------------\n");

		/*
		 * Arrays.asList returns its own implementation of ArrayList which is implemented as a view
		 * of the created array. It does not implement some methods eg. `remove` (does so because
		 * elements of given array won't have to be copied - they're just being wrapped).
		 */
		List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		List<?> evens = $.remove(arr, (el) -> el % 2 == 0);
		List<?> odds = arr;
		
		System.out.println("evens: " + evens);
		System.out.println("odds: " + odds);
		
	}

}
