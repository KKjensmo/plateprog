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
	
	//toString
	public String toString() {
		return artist + " - " + title;
	}
	
}
