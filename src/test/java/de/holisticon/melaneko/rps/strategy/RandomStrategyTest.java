package de.holisticon.melaneko.rps.strategy;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.*;

import org.junit.Test;

import strategy.RandomStrategy;
import strategy.Strategy;

/**
 * Tests for {@link RandomStrategy}.
 *
 */
public class RandomStrategyTest {

	@Test
	public void returnsAShape() throws Exception {
		Strategy strategy = new RandomStrategy();
		assertThat(strategy.select(), is(notNullValue()));
	}
}
