package de.holisticon.melaneko.rps;

/**
 * Represents a game of Rock-Paper-Scissors.
 */
public class Game {

	private Player playerA;
	private Player playerB;

	public Game(Player playerA, Player playerB) {
		if (playerA == null) {
			throw new IllegalArgumentException("Player A is undefined.");
		}
		if (playerB == null) {
			throw new IllegalArgumentException("Player B is undefined.");
		}

		this.playerA = playerA;
		this.playerB = playerB;
	}

	public ScoreCard play(int rounds) {
		ScoreCard scoreCard = new ScoreCard();
		for (int i = 1; i <= rounds; i++) {
			scoreCard.addResult(playerA.select().challenge(playerB.select()));
		}
		return scoreCard;
	}

}
