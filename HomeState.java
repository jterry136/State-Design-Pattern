/**
 * This state class describes a state where the Game Console is at a Home Screen
 * @author Jonathan Terry
 *
 */

public class HomeState implements State{
	private GameConsole gameConsole;
	
	/**
	 * Constructor. Sets the value of this object's gameConsole to the parameter gameConsole
	 * @param gameConsole: A GameConsole object to set this gameConsole variable to
	 */
	public HomeState(GameConsole gameConsole) {
		this.gameConsole = gameConsole;
	}
	
	/**
	 * This method displays an appropriate message for when the Home button is pressed in this state.
	 */
	public void pressHomeButton() {
		display("You are already on the HomeScreen");
	}
	
	/**
	 * This method displays an appropriate message for when the Nintendo button is pressed in this state.
	 * Additionally, it sets the state of the game console to the NintendoState
	 */
	public void pressNintendoButton() {
		display("Starting Nintendo...");
		gameConsole.setState(gameConsole.getNintendoState());
	}
	
	/**
	 * This method displays an appropriate message for when the XBox button is pressed in this state.
	 * Additionally, it sets the state of the game console to the XBoxState
	 */
	public void pressXBoxButton() {
		display("Starting XBox...");
		gameConsole.setState(gameConsole.getXBoxState());
	}
	
	/**
	 * This method informs the user that they need to pick a gaming system in order
	 * to play games.
	 */
	public void pressGameButton() {
		display("You have to pick a gaming system to play");
	}
	
	/**
	 * A private helper method. Displays a String in the console; effectively replaces System.out.println.
	 * Used because typing System.out.println 20 times is annoying
	 * @param aString: The String to be displayed
	 */
	private static void display(String aString) {
		System.out.println(aString);
	}
	
	

}
