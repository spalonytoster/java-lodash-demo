package com.mposluszny.lodash;

import java.util.Arrays;

import com.github.underscore.lodash.$;

public class FilterCollection {

	public static void main(String[] args) {
		$.filter(Arrays.asList(1, 2, 3), (el) -> el == 2)
		.forEach((el) -> System.out.println(el));

		System.out.println("\n--------------------\n");
		
		$.reject(Arrays.asList(1, 2, 3), (el) -> el == 2)
		 .forEach((el) -> System.out.println(el));
	}

}
