package pl.bjsoft.removeduplicates;

import java.awt.List;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		Object[] intTab = { 1, 2, 3, 1, 1, 2, 5 };

		Set ds = removeDuplicates(intTab);
		System.out.println(ds.toString());

	}

	public static Set removeDuplicates(Object[] input) {

		Set unique = new HashSet();

		for (int i = 0; i < input.length; i++) {
			unique.add(input[i]);

		}

		return unique;
	}

}
