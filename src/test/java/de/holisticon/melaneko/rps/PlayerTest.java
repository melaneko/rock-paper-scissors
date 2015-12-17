package de.holisticon.melaneko.rps;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

import strategy.AlwaysPaperStrategy;
import strategy.Strategy;

/**
 * Unit tests for {@link Player}.
 *
 */
public class PlayerTest {

	@Test(expected = IllegalArgumentException.class)
	public void requiresAStrategy() throws Exception {
		new Player(null);
	}

	@Test
	public void selectsByStrategy() throws Exception {
		Strategy strategy = spy(AlwaysPaperStrategy.class);
		Player player = new Player(strategy);

		player.select();
		verify(strategy, times(1)).select();
	}
}
