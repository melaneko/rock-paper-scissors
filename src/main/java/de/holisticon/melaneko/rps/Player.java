package de.holisticon.melaneko.rps;

import strategy.Shape;
import strategy.Strategy;

/**
 * Represents a player of a game.
 *
 */
public class Player {

	private Strategy strategy;

	public Player(Strategy strategy) {
		if (strategy == null) {
			throw new IllegalArgumentException("Strategy is undefined.");
		}

		this.strategy = strategy;
	}

	/**
	 * Selects a new {@link Shape} by taking the {@link #strategy} into account.
	 * 
	 * @return the selected {@link Shape}.
	 */
	public Shape select() {
		return strategy.select();
	}

}
