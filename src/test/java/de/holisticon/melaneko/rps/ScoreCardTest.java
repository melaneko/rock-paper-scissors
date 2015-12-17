package de.holisticon.melaneko.rps;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for {@link ScoreCard}.
 *
 */
public class ScoreCardTest {

	@Test
	public void countsPlayerAWin() throws Exception {
		ScoreCard scoreCard = new ScoreCard();
		scoreCard.addResult(Result.BEATS);

		assertThat(scoreCard.getPlayerAWins(), is(equalTo(1)));
		assertThat(scoreCard.getPlayerBWins(), is(equalTo(0)));
		assertThat(scoreCard.getTies(), is(equalTo(0)));
	}

	@Test
	public void countsPlayerBWin() throws Exception {
		ScoreCard scoreCard = new ScoreCard();
		scoreCard.addResult(Result.IS_BEATEN);

		assertThat(scoreCard.getPlayerAWins(), is(equalTo(0)));
		assertThat(scoreCard.getPlayerBWins(), is(equalTo(1)));
		assertThat(scoreCard.getTies(), is(equalTo(0)));
	}

	@Test
	public void countsTies() throws Exception {
		ScoreCard scoreCard = new ScoreCard();
		scoreCard.addResult(Result.TIE);

		assertThat(scoreCard.getPlayerAWins(), is(equalTo(0)));
		assertThat(scoreCard.getPlayerBWins(), is(equalTo(0)));
		assertThat(scoreCard.getTies(), is(equalTo(1)));
	}

	@Test
	public void countsRounds() throws Exception {
		ScoreCard scoreCard = new ScoreCard();
		scoreCard.addResult(Result.BEATS);
		scoreCard.addResult(Result.BEATS);
		scoreCard.addResult(Result.BEATS);

		assertThat(scoreCard.getRounds(), is(equalTo(3)));
	}

	@Test
	public void counterSumEqualsRounds() throws Exception {
		ScoreCard scoreCard = new ScoreCard();
		scoreCard.addResult(Result.BEATS);
		scoreCard.addResult(Result.BEATS);
		scoreCard.addResult(Result.IS_BEATEN);
		scoreCard.addResult(Result.IS_BEATEN);
		scoreCard.addResult(Result.IS_BEATEN);
		scoreCard.addResult(Result.TIE);

		int counterSum = scoreCard.getPlayerAWins() + scoreCard.getPlayerBWins() + scoreCard.getTies();
		assertThat(scoreCard.getRounds(), is(equalTo(counterSum)));
	}

	@Test
	public void generatesReport() throws Exception {
		ScoreCard scoreCard = new ScoreCard();
		scoreCard.addResult(Result.BEATS);
		scoreCard.addResult(Result.IS_BEATEN);
		scoreCard.addResult(Result.IS_BEATEN);
		scoreCard.addResult(Result.TIE);

		String report = scoreCard.getReport().toString();
		assertThat(report, containsString("Player A wins 1 of 4 games"));
		assertThat(report, containsString("Player B wins 2 of 4 games"));
		assertThat(report, containsString("Tie: 1 of 4 games"));
	}

}
