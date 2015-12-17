package de.holisticon.melaneko.rps;

import strategy.AlwaysPaperStrategy;
import strategy.RandomStrategy;

/**
 * Starts a Rock-Paper-Scissors game with two players:
 * <ul>
 * <li>Player A: selects always Paper</li>
 * <li>Player B: selects a random shape</li>
 * </ul>
 *
 * The players challenge each other for 100 rounds.
 */
public class Execute {

	public static void main(String[] args) {
		Player playerA = new Player(new AlwaysPaperStrategy());
		Player playerB = new Player(new RandomStrategy());
		Game game = new Game(playerA, playerB);
		ScoreCard scoreCard = game.play(100);
		System.out.println(scoreCard.getReport());

	}
}
