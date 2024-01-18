package com.Junit;

import java.util.HashMap;

public class ContainsDuplicate {

	public boolean checkDuplicate(int arr[]) {

		HashMap<Integer, Integer> map = new HashMap();

		for (int i = 0; i < arr.length; i++) {

			if (map.containsKey(arr[i])) {

				return true;

			}

			map.put(arr[i], i);

		}

		return false;
	}

}
