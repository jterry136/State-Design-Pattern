/**
 * this state describes when a Game Console is using a Nintendo console.
 * @author Jonathan Terry
 *
 */

public class NintendoState implements State{
	private GameConsole gameConsole;
	private String[] games = {"Animal Crossing", "Pokemon", "Wii Bowling", "Mario Kart", "Mario Party"};
	
	/**
	 * Constructor. Sets the value of this object's gameConsole to the parameter gameConsole
	 * @param gameConsole: A GameConsole object to set this gameConsole variable to
	 */
	public NintendoState(GameConsole gameConsole) {
		this.gameConsole = gameConsole;
	}
	
	/**
	 * This method displays an appropriate message for when the Home button is pressed in this state.
	 * Additionally, it sets the state of the game console to the HomeState
	 */
	public void pressHomeButton() {
		display("Display Home Screen");
		gameConsole.setState(gameConsole.getHomeState());
	}
	
	/**
	 * This method displays an appropriate message for when the Nintendo button is pressed in this state.
	 */
	public void pressNintendoButton() {
		display("You are already viewing Nintendo");
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
	 * This method displays all games held by the Nintendo Console, line by line.
	 */
	public void pressGameButton() {
		display("You have the following games: ");
		for(int i = 0; i < games.length; i++) {
			display(games[i]);
		}
		display("\n");
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
