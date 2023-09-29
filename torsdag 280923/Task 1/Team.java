public class Team 
{
	private String teamName;
	private int teamRank;
	private String[] playerName;


	public Team(String teamName) 
	{
		this.teamName=teamName;
	} 

	public void setteamRank(int teamRank)
	{
		this.teamRank=teamRank;
		
	}

	public Integer getteamRank() 
	{
		return teamRank;
	}




	public String toString() 
	{
		return "Team: " + this.teamName + "rank: " + this.teamRank;
	}

}