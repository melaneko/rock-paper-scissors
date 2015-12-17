package strategy;

/**
 * {@link Strategy} that always selects {@link Shape#PAPER}.
 *
 */
public class AlwaysPaperStrategy implements Strategy {

	@Override
	public Shape select() {
		return Shape.PAPER;
	}

}
