package picker.view;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class PickerDisplay
{
	public String getUserString(String message)
	{
		String answer = JOptionPane.showInputDialog(message);
		return answer;
	}
	
	public void showSomething(String message)
	{
		JOptionPane.showMessageDialog(null, message);
	}
	
	public int askUserGame(String message)
	{
		UIManager.put("OptionPane.yesButtonText", "Randomly Select!");
		UIManager.put("OptionPane.noButtonText", "Add or Remove a Game!");
		UIManager.put("OptionPane.cancelButtonText", "Quit");
		int answer = JOptionPane.showConfirmDialog(null, message);
		return answer;
	}
	
	public String getUserGame(String message)
	{
		UIManager.put("OptionPane.yesButtonText", "Add");
		UIManager.put("OptionPane.cancelButtonText", "Remove");
		String answer = JOptionPane.showInputDialog(null, message, "Game Name");
		return answer;
	}
	
	public int addOption()
	{
		int answer = JOptionPane.NO_OPTION;
		return answer;
	}
	
	public int leaveOption()
	{
		int answer = JOptionPane.CANCEL_OPTION;
		return answer;
	}
}
