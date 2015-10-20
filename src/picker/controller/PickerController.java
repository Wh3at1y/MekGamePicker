package picker.controller;

import picker.view.PickerDisplay;
import java.util.ArrayList;

public class PickerController
{
	private PickerDisplay popUp;
	private ArrayList<String> selectedGames;
	
	//DEFAULT GAMES
	private String blackOps2 = "Black Ops 2";
	private String insurgency = "Insurgency";
	private String mineCraft = "Minecraft";
	private String payDay2 = "Pay Day 2";
	
	private String addedGame1;
	private String addedGame2;
	private String addedGame3;
	
	private int userAnswer;

	public PickerController()
	{
		popUp = new PickerDisplay();
		
		selectedGames = new ArrayList<String>();
		selectedGames.add(blackOps2); selectedGames.add(insurgency); selectedGames.add(mineCraft); selectedGames.add(payDay2);
	}
	
	public void start()
	{
		userAnswer = popUp.askUserGame("Default Selected Games : \n" + blackOps2
				+ "\n" + insurgency + "\n" + mineCraft + "\n" + payDay2 + "\n" + addedGame1);
		
		
		if(userAnswer == popUp.addOption())
		{
			gameAddRemove();
		}
		
		else if(userAnswer == popUp.leaveOption())
		{
			popUp.showSomething("Exiting!");
		}
	}
	
	public void gameAddRemove()
	{
		popUp.showSomething("Holds up to 3 total games.");
		
		addedGame1 = popUp.getUserGame("Enter the name of the game you want to add or remove.");
		selectedGames.add(addedGame1);
		
		start();
	}
	
}
