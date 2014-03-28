package platevelger;

public class VinylPlate {

	//bygge inn info om record label og utgivelsesår?
	
	/*
	 * public String label;
	 * public int releaseyr;
	 * 
	 */
	
	public String artist;
	public String tittel;
	public String fullnavn;

	
	public String printFullnavn(){
		return this.fullnavn;
	}
	
	public String printArtist(){
		return this.artist;
	}
	
	public String printTittel(){
		return this.tittel;
	}
	
}
