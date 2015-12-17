package strategy;

import java.util.Random;

/**
 * {@link Strategy} that randomly selects a {@link Shape}.
 *
 */
public class RandomStrategy implements Strategy {

	@Override
	public Shape select() {
		Random random = new Random();
		return Shape.values()[random.nextInt(3)];
	}

}
