package de.holisticon.melaneko.rps.strategy;

import static org.junit.Assert.*;

import org.junit.Test;

import strategy.AlwaysPaperStrategy;
import strategy.Shape;
import strategy.Strategy;

/**
 * Unit tests for {@link AlwaysPaperStrategy}.
 * 
 */
public class AlwaysPaperStrategyTest {

	@Test
	public void selectsAlwaysPaper() throws Exception {
		Strategy strategy = new AlwaysPaperStrategy();
		for (int i = 0; i < 10; i++) {
			Shape shape = strategy.select();
			assertEquals(Shape.PAPER, shape);
		}
	}
}
