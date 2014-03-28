package platevelger;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import org.w3c.dom.events.EventTarget;


public class PlatesamlingGui extends JPanel {

	//declare buttons
	static JButton addRecord = new JButton("Add a new record");
	static JButton showSamling = new JButton("Show collection");
	static JButton pickRandom = new JButton("Pick a random record");
	static JButton showArtists = new JButton("Show artists");


	public PlatesamlingGui(){

		//set frame title and layout style
		setLayout(new FlowLayout());

		//add buttons
		add(addRecord);
		add(showSamling);
		add(showArtists);
		add(pickRandom);
			
		
		//add listeners
		PressButtonListener buttonListener = new PressButtonListener();
		addRecord.addActionListener(buttonListener);
		showSamling.addActionListener(buttonListener);
		pickRandom.addActionListener(buttonListener);
		showArtists.addActionListener(buttonListener);


	} //endgui

	//actionlistener
	class PressButtonListener implements ActionListener{

				@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

			if(e.getSource() == addRecord){
				PlatesamlingFunc.addPlate();
			}
			else if(e.getSource() == showSamling){
				
				PlatesamlingFunc.printPlateSamling();
			}
			else if(e.getSource() == pickRandom){
				PlatesamlingFunc.randomVinyl();
			}
			else if(e.getSource() == showArtists){
				PlatesamlingFunc.printArtists();
			}
		}

	}

}
