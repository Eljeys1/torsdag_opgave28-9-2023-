public class Main
{
	public static void main(String[] args)
	{
		Team team1=new Team("Heroes");

		team1.setteamRank(3);


		Team team2=new Team("Villains");
		team2.setteamRank(8);


		Team team3=new Team("Villagers");
		team3.setteamRank(2);


		Team team4=new Team("Fishingmen");
		team4.setteamRank(5);

		Team team5=new Team("Farmers");
		team5.setteamRank(7);



		System.out.println(team1);
		System.out.println(team2);
		System.out.println(team3);
		System.out.println(team4);
		System.out.println(team5);
	}
}