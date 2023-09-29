import java.util.ArrayList;
import java.util.Scanner;

public class GameMenu
{
	private ArrayList<String> actions = new ArrayList<String>();

	public GameMenu(ArrayList<String> actions)
	{
		this.actions = actions;
	}

	public void displayMenu()
	{
		for(String action : actions)
		{
			System.out.println(action);
		}
			
			public String getAction();
			{

			 System.out.println("write a number to selec the action " +action);

			 displayMenu();

			 Scanner scanner= new Scanner(System.in);
			 String choice=Scanner.nextLine();

			 return choice;

			}
			
	}
}

