package chapter5;

import java.util.ArrayList;

public class DotCom {

	private ArrayList<String> locationCells;
	// int[] locationCells;
	int numOfHits = 0;

	String checkYourself(String userInput) {

		String result = "miss";

		int index = locationCells.indexOf(userInput);

		if (index >= 0) {
			locationCells.remove(index);
		}

		if (locationCells.isEmpty()) {
			result = "kill";
		} else {
			result = "hit";
		}

		System.out.println(result);

		return result;

	}

	void setLocationCells(ArrayList<String> locationCells2) {
		locationCells = locationCells2;
	}
}
