/**
 * This class describes a Game Console. It has various states to describe which console is being referred to.
 * @author Jonathan Terry
 *
 */

public class GameConsole {
	private State HomeState;
	private State NintendoState;
	private State xBoxState;
	private State state;
	
	/**
	 * Constructor. Sets the values of all states to new states constructed with this object.
	 * Informs the user the Game Console is Starting Up
	 */
	public GameConsole() {
		System.out.println("Starting up the Game Console \n");
		this.HomeState = new HomeState(this);
		this.NintendoState = new NintendoState(this);
		this.xBoxState = new XBoxState(this);
		this.state = new HomeState(this);
	}
	
	/**
	 * This method sets the current state of the gaming console to whatever state is passed in.
	 * @param state: The State to which the GameConsole should be set.
	 */
	public void setState(State state) {
		this.state = state;
	}
	
	/**
	 * The following 3 methods are getter methods. they return the state object corresponding with their method name.
	 * For example, getHomeState returns this HomeState object
	 * @return: A State object corresponding to the method's name.
	 */
	public State getHomeState() {
		return this.HomeState;
	}
	
	public State getNintendoState() {
		return this.NintendoState;
	}
	
	public State getXBoxState() {
		return this.xBoxState;
	}
	
	/**
	 * This method calls pressHomeButton for the State associated with the state variable.
	 */
	public void pressHomeButton() {
		this.state.pressHomeButton();
	}
	
	/**
	 * This method calls pressNintendoButton for the State associated with the state variable.
	 */
	public void pressNintendoButton() {
		this.state.pressNintendoButton();
	}
	
	/**
	 * This method calls pressXBoxButton for the State associated with the state variable.
	 */
	public void pressXBoxButton() {
		this.state.pressXBoxButton();
	}
	
	/**
	 * This method calls pressGameButton for the State associated with the state variable.
	 */
	public void pressGameButton() {
		this.state.pressGameButton();
	}
	
	
}
