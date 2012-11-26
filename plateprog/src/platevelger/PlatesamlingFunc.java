package platevelger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PlatesamlingFunc {


	
	//lager et nytt VinylPlate objekt hver gang den blir kalt
	//bruker gir input og resultatet lagres som en egen string
	
	public static void addPlate(){

		VinylPlate p = new VinylPlate();
		p.artist = JOptionPane.showInputDialog("Artist name: ");
		p.tittel = JOptionPane.showInputDialog("Record name: ");
		p.fullnavn = p.artist.concat(" - " + p.tittel);
		PlateSamling.samling.add(p);

	}

	//lager et StringBuilder objekt
	//for hver plate i platesamlingen lager den en string i JoPtionpane med plate.fullnavn og et linjeskift
	public static void printPlateSamling(){

		StringBuilder builder = new StringBuilder(PlateSamling.samling.size());
		for(VinylPlate plate : PlateSamling.samling){
			builder.append(  plate.fullnavn + "\n");
		}
		//this works :D
		JOptionPane.showMessageDialog(null, builder.toString());

	}
	
	public static void printArtists(){
		StringBuilder builder = new StringBuilder(PlateSamling.samling.size());
		for(VinylPlate plate : PlateSamling.samling){
			builder.append(plate.artist + "\n");
		}
		JOptionPane.showMessageDialog(null, builder.toString());
	}

	//velger ut en random vinyl
	public static void randomVinyl(){

		int r = (int) (Math.random()*PlateSamling.samling.size());
		VinylPlate chosen = PlateSamling.samling.get(r);
		JOptionPane.showMessageDialog(null, chosen.fullnavn);

	}

}

