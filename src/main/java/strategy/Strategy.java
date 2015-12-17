package strategy;

/**
 * Defines the strategy of how to select a {@link Shape}.
 */
public interface Strategy {

	/**
	 * Selects a shape.
	 * 
	 * @return a {@link Shape}.
	 */
	public Shape select();

}
