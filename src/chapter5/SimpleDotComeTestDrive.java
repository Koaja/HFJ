package chapter5;

public class SimpleDotComeTestDrive {

	public static void main(String[] args) {

		DotCom dot = new DotCom();

		int[] locations = { 2, 3, 4 };
		//dot.setLocationCells(locations);

		String userGuess = "5";

		String result = dot.checkYourself(userGuess);

	}
}
