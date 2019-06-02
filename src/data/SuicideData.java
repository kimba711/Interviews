package data;

public class SuicideData extends Node {

	String country;
	int year;
	String ageRange;
	String gender;
	int numSuicides;
	
	public SuicideData(String country, int year, String ageRange, String gender, int numSuicides) {
		this.key = country + "-"  + String.valueOf(year) + "-" + "gender" + "-" + ageRange; 
		this.value = numSuicides;
		this.country = country;
		this.year = year;
		this.ageRange = ageRange;
		this.gender = gender;
		this.ageRange = ageRange;
	}

}
