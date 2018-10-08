//Program: 
//File: NFLplayer.java
//Summary: 
//Author: Brennan M. Schwamb
//Date: October 4, 2018
import java.util.ArrayList;

public class PlayerManager {
	
//ArrayList definition
public static ArrayList Players;
	
//Constructor
public PlayerManager() {
}
	
//Creating toString method
public String toString() {
	return "PlayerManager[" + Players + "]";
}
	    
public static void createPlayers(ArrayList Players) {
	//Creating Players
	Players.add(new NFLplayer("Joe Mixon", "Runningback", 2, 5, 0, 898, 22));
	Players.add(new NFLplayer("Baker Mayfield", "Quarterback", 1, 3, 0, 838, 23));
	Players.add(new NFLplayer("Odell Beckham Jr", "Wide Reciever", 4, 39, 0, 4886, 25));
	Players.add(new NFLplayer("David Johnson", "Runningback", 3, 26, 0, 2030, 26));
	Players.add(new NFLplayer("Doug Baldwin", "Wide Reciever", 7, 44, 0, 5986, 30));
	Players.add(new NFLplayer("Larry Fitzgerald", "Wide Reciever", 14, 110, 0, 15686, 35));
}
//main method	
public static void main(String[] args) {
	
	//Creating ArrayList
	ArrayList Players = new ArrayList();
	createPlayers(Players);
	//Printing list of players
	System.out.println("Players" + Players.toString());
	//showing no argument NFLplayer constructor - to be deleted later
	Players.add(new NFLplayer());
	int i = Players.size();
	i--;
	((NFLplayer) Players.get(i)).setName("Patrick Peterson");
	System.out.println("Players" + Players.toString());
	((NFLplayer) Players.get(i)).setType("Cornerback");
	((NFLplayer) Players.get(i)).setTD(13);
	System.out.println("Players" + Players.toString());
	System.out.println(((NFLplayer) Players.get(6)).getCareerTD());
	System.out.println(((NFLplayer) Players.get(1)).getName());
	System.out.println(((NFLplayer) Players.get(2)).getCareerTackles());
	System.out.println(((NFLplayer) Players.get(3)).getCareerYards());
	//System.out.println(NFLplayer.getAge());
	
}
}