import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		
		System.out.println("Please type your name:");
		Scanner scanner =new Scanner(System.in);

		String input = scanner.nextLine();

		System.out.println("Hello " +input);

		System.out.println("How old are you?");

		String age = scanner.nextline();

		System.out.println(age);
		int i =Integer.parseInt(age);
		
		int retirement=67 - age;

		System.out.println("you may retire in " +retirement);


 


	}
}