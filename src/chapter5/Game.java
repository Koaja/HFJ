package chapter5;

public class Game {

	public static void main(String[] args) {

		SimpleDotCom dot = new SimpleDotCom();
		HelperGame helper = new HelperGame();

		int numOfGuesses = 0;

		int rnd = (int) (Math.random() * 4);

		int[] array = { rnd, rnd + 1, rnd + 2 };

		dot.setLocationCells(array);

		boolean isAlive = true;

		while (isAlive) {
			String guess = helper.getUserInput("enter a number");
			String result = dot.checkYourself(guess);
			numOfGuesses++;
			if (result.equals("kill")) {
				isAlive = false;
				System.out.println("You took " + numOfGuesses + " guesses");
			}

		}
	}
}
