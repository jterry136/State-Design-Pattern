/**
 * This interface describes a state. There are 4 forced methods, each changes the state of the Game Console
 * @author Jonathan Terry
 */

public interface State {
	public void pressHomeButton();
	public void pressNintendoButton();
	public void pressXBoxButton();
	public void pressGameButton();

}
