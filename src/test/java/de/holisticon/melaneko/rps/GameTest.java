package de.holisticon.melaneko.rps;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

import strategy.AlwaysPaperStrategy;
import strategy.RandomStrategy;

/**
 * Unit tests for {@link Game}.
 *
 */
public class GameTest {

	@Test
	public void scoreCardRoundsEqualGameRounds() throws Exception {
		Game game = new Game(new Player(new AlwaysPaperStrategy()), new Player(new RandomStrategy()));

		ScoreCard scoreCard = game.play(3);
		assertThat(scoreCard.getRounds(), is(equalTo(3)));
	}

	@Test
	public void resetsTheScoreCardForEachGame() throws Exception {
		Game game = new Game(new Player(new AlwaysPaperStrategy()), new Player(new RandomStrategy()));

		ScoreCard scoreCard = game.play(10);
		assertThat(scoreCard.getRounds(), is(equalTo(10)));

		scoreCard = game.play(5);
		assertThat(scoreCard.getRounds(), is(equalTo(5)));
	}

	@Test
	public void letsEachPlayerSelectForEachRound() throws Exception {
		Player playerA = spy(new Player(new AlwaysPaperStrategy()));
		Player playerB = spy(new Player(new AlwaysPaperStrategy()));
		Game game = new Game(playerA, playerB);

		game.play(3);
		verify(playerA, times(3)).select();
		verify(playerB, times(3)).select();
	}

	@Test(expected = IllegalArgumentException.class)
	public void requiresPlayerA() throws Exception {
		new Game(null, new Player(new RandomStrategy()));
	}

	@Test(expected = IllegalArgumentException.class)
	public void requiresPlayerB() throws Exception {
		new Game(new Player(new RandomStrategy()), null);
	}
}
