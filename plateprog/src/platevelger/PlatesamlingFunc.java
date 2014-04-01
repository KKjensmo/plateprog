package platevelger;

import java.awt.image.SampleModel;
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
		p.title = JOptionPane.showInputDialog("Record name: ");
		p.label = JOptionPane.showInputDialog("Record Label: ");
		p.releaseyr = JOptionPane.showInputDialog("Release year: ");
		//p.fullnavn = p.artist.concat(" - " + p.title);
		PlateSamling.samling.add(p);
		System.out.println(p);
	}

	//lager et StringBuilder objekt
	//for hver plate i platesamlingen lager den en string i JoPtionpane med plate.fullnavn og et linjeskift
	public static void printPlateSamling(){

		/*for(int i = 0; i < PlateSamling.samling.size(); i++){
			JOptionPane.showMessageDialog(null, PlateSamling.samling.get(i));
		}*/
		
		
		StringBuilder builder = new StringBuilder(PlateSamling.samling.size());
		for(VinylPlate plate : PlateSamling.samling){
			builder.append(  plate.artist + " - " + plate.title + "\n");
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
		JOptionPane.showMessageDialog(null, chosen.artist + " - " + chosen.title);

	}

}

