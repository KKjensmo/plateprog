package platevelger;

public class VinylPlate {

	public VinylPlate() {
	}

	public VinylPlate(String artist, String tittel) {
		this.artist = artist;
		this.tittel = tittel;
	}

	
	
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

	@Override
	public String toString() {
		return "VinylPlate [artist=" + artist + ", tittel=" + tittel
				+ ", fullnavn=" + fullnavn + "]";
	}
	
}
