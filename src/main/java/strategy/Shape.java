package strategy;

import de.holisticon.melaneko.rps.Result;

/**
 * Defines the valid shapes of the game Rock-Paper-Scissors. Each {@link Shape}
 * knows the rules.
 *
 */
public enum Shape {
	ROCK, PAPER, SCISSORS;

	/**
	 * Challenges the current shape with another one.
	 * 
	 * @param shape
	 *            The shape to challenge.
	 * @return the {@link Result}.
	 */
	public Result challenge(Shape shape) {

		if (this.equals(shape)) {
			return Result.TIE;
		}

		switch (this) {

		case SCISSORS:
			if (Shape.PAPER.equals(shape)) {
				return Result.BEATS;
			}
			break;

		case PAPER:
			if (Shape.ROCK.equals(shape)) {
				return Result.BEATS;
			}
			break;

		case ROCK:
			if (Shape.SCISSORS.equals(shape)) {
				return Result.BEATS;
			}
			break;

		}
		return Result.IS_BEATEN;

	}
}
