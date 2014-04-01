package platevelger;

public class VinylPlate {



	//VARIABLES
	public String artist;
	public String title;
	//public String fullnavn;
	public String label;
	public int releaseyr;

	
	//CONSTRUCTORS
	
	public VinylPlate() {
	}

	public VinylPlate(String artist, String tittel) {
		this.artist = artist;
		this.title = tittel;
	}

	//getters
	
	public String getArtist(){
	return this.artist;	
	}
	public String getTitle(){
		return this.title;
	}
	
	public String getLabel(){
		return this.label;
	}
	
	public int getReleaseyr(){
		return this.releaseyr;
	}
	
	//setters
	
	public void setArtist(String artist){
		this.artist = artist;
	}
	
	public void setTitle(String title){
		this.title = title;
	}

	public void setLabel(String label){
		this.label = label;
	}
	
	public void setReleaseYr(int year){
		this.releaseyr = year;
	}
	
	//toString
	public String toString() {
		return artist + " - " + title;
	}
	
}
