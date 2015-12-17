package de.holisticon.melaneko.rps;

import java.util.Formatter;

import strategy.Shape;

/**
 * Represents a score card that contains information about a game.
 *
 */
public class ScoreCard {

	private int playerAWins;
	private int playerBWins;
	private int ties;

	public ScoreCard() {
	}

	public int getRounds() {
		return playerAWins + playerBWins + ties;
	}

	/**
	 * Adds a new result to the score card.
	 * 
	 * @param result
	 *            The {@link Result} of a {@link Shape} challenging another
	 *            {@link Shape}.
	 * 
	 */
	public void addResult(Result result) {

		switch (result) {
		case BEATS:
			playerAWins++;
			break;

		case IS_BEATEN:
			playerBWins++;
			break;

		case TIE:
			ties++;
			break;

		default:
			break;
		}
	}

	public int getPlayerAWins() {
		return playerAWins;
	}

	public int getPlayerBWins() {
		return playerBWins;
	}

	public int getTies() {
		return ties;
	}

	public String getReport() {
		StringBuilder reportBuilder = new StringBuilder();
		Formatter formatter = new Formatter(reportBuilder);

		formatter.format("Player A wins %d of %d games%n", playerAWins, getRounds());
		formatter.format("Player B wins %d of %d games%n", playerBWins, getRounds());
		formatter.format("Tie: %d of %d games%n", ties, getRounds());

		formatter.close();

		return reportBuilder.toString();
	}
}
