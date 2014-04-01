package platevelger;

public class VinylPlate {


	

	//VARIABLES
	
	//releaseyr som string? hvordan få jtextfield til å vise int
	public String artist;
	public String title;
	//public String fullnavn;
	public String label;
	public String releaseyr;


	//CONSTRUCTORS

	public VinylPlate() {
	}

	public VinylPlate(String artist, String tittel) {
		this.artist = artist;
		this.title = tittel;
	}

	public VinylPlate(String artist, String title, String label){
		this.artist = artist;
		this.title = title;
		this.label = label;
	}

	public VinylPlate(String artist, String title, String label, String release){
		this.artist = artist;
		this.title = title;
		this.label = label;
		this.releaseyr = release;
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

	public String getReleaseyr(){
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

	public void setReleaseYr(String year){
		this.releaseyr = year;
	}

	//toString
	
	public String toString() {
		return artist + " - " + title;
	}

}
