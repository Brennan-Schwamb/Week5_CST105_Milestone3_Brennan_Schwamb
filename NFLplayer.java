//Program: Milestone 2
//File: NFLplayer.java
//Summary: Gets and sets NFL player stats
//Author: Brennan M. Schwamb
//Date: October 6, 2018


public class NFLplayer 
{

	// variable declaration
	private String name;
	private String playerType;   
	private int yearsPro;
	private int careerTD;
	private int careerTackles;
	private double careerYards;
	private static int age;
	//Constructors	
	public NFLplayer() {
		name = null;
		playerType = null;
		yearsPro = 0;
		careerTD = 0;
		careerTackles = 0;
		careerYards = 0;
		age = 0;
	
	}
	public NFLplayer(String name, 
					 String playerType, 
					 int yearsPro, 
					 int careerTD, 
					 int careerTackles,
					 double careerYards,
					 int age)
					
					 {
		this.name = name;
		this.playerType = playerType;
		this.yearsPro = yearsPro;
		this.careerTD = careerTD;
		this.careerTackles = careerTackles;
		this.careerYards = careerYards;
		this.age = age;
	
}

	// Methods
		
	public void setName(String newName) {
	// Set Name 
		name = newName;
	}
	public void setType(String newPlayerType){
		// Set Type
		playerType = newPlayerType;
	}
		public void setYears(int newYearsPro){
			//Set years Pro
			yearsPro = newYearsPro;
		} 
		public void setTD(int newCareerTD){
			// Set Career TD's 
			careerTD = newCareerTD;
		}
		public void setTackle(int newCareerTackles){
			// Set Career Tackles 
			careerTackles = newCareerTackles;
		}
		public void setYards(int newCareerYards){
			// Set Career Yards
			careerYards = newCareerYards;
		}
		public String getName(){
			// Get player name 
			return name;
		}
		public String getPlayerType(){
			// Get player type
			return playerType;
		}
		public int getYearsPro(){
			// Get years Pro
			return yearsPro;
		}
		public int getCareerTD(){
			// Get career TD's
			return careerTD;
		}
		public int getCareerTackles(){
			// Get career tackles 
			return careerTackles;
		}
		public double getCareerYards(){
			// Get career Yards
			return careerYards;
		}
		public static int getAge(){
			// Get player age 
			return age;
		}
	    public double getAverageTDPerYear(){
	        // Get Average Touchdowns 
	        return (careerTD / yearsPro);
	    }
	    public double getAverageTacklesPerYear() {
	        // Returns average tackles per year
	        return (careerTD / yearsPro);
	    }
	    public double getAverageYardsPerYear(){
	        // Returns average yards per year 
	        return (careerYards / yearsPro);
	    
	    }
	        // To string method 
	    public String toString() {

	        return "[" + this.name + ", " + this.playerType + "]";

	    }
	
}



