package de.holisticon.melaneko.rps;

import static org.junit.Assert.*;

import org.junit.Test;

import strategy.Shape;

/**
 * Unit tests for {@link Shape}.
 *
 */
public class ShapeTest {

	@Test
	public void scissorsBeatsPaper() throws Exception {
		Result result = Shape.SCISSORS.challenge(Shape.PAPER);
		assertEquals(Result.BEATS, result);
	}

	@Test
	public void scissorsIsBeatenByRock() throws Exception {
		Result result = Shape.SCISSORS.challenge(Shape.ROCK);
		assertEquals(Result.IS_BEATEN, result);
	}

	@Test
	public void scissorsTie() throws Exception {
		Result result = Shape.SCISSORS.challenge(Shape.SCISSORS);
		assertEquals(Result.TIE, result);
	}

	@Test
	public void rockBeatsScissors() throws Exception {
		Result result = Shape.ROCK.challenge(Shape.SCISSORS);
		assertEquals(Result.BEATS, result);
	}

	@Test
	public void rockIsBeatenByPaper() throws Exception {
		Result result = Shape.ROCK.challenge(Shape.PAPER);
		assertEquals(Result.IS_BEATEN, result);
	}

	@Test
	public void rockTie() throws Exception {
		Result result = Shape.ROCK.challenge(Shape.ROCK);
		assertEquals(Result.TIE, result);
	}

	@Test
	public void paperBeatsRock() throws Exception {
		Result result = Shape.PAPER.challenge(Shape.ROCK);
		assertEquals(Result.BEATS, result);
	}

	@Test
	public void paperIsBeatenByScissors() throws Exception {
		Result result = Shape.PAPER.challenge(Shape.SCISSORS);
		assertEquals(Result.IS_BEATEN, result);
	}

	@Test
	public void paperTie() throws Exception {
		Result result = Shape.PAPER.challenge(Shape.PAPER);
		assertEquals(Result.TIE, result);
	}

}
