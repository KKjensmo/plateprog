package platevelger;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class ListView extends JPanel {

	public static void main(String[] args) {
		VinylPlate vp = new VinylPlate("Jimi Hendrix", "Valleys of Neptune");
		PlateSamling.samling.add(vp);
		JFrame psGui = new JFrame();
		psGui.setTitle("Test Panel");

		//adder list view til gui
		ListView listviewGui = new ListView();
		psGui.add(listviewGui);
		psGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		psGui.pack();
		psGui.setVisible(true);
	}

	//oppretter listen av vinylplate objekter til fremvisning
	JList<VinylPlate> collectionList = new JList<VinylPlate>();
	//Default List Model er en modell som organiserer lister
	DefaultListModel<VinylPlate> collectionModel = new DefaultListModel<VinylPlate>();

	//Må han en listener til listmodellen
	MouseListener listListener = new MouseListener() {
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
		}
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
		}
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
		}

		//mouseClicked trigges på press og release combo
		@Override
		public void mouseClicked(MouseEvent e) {
			int index = collectionList.locationToIndex(e.getPoint());
			VinylPlate selectedPlate = PlateSamling.samling.get(index);
			artistText.setText(selectedPlate.artist);
			albumText.setText(selectedPlate.title);

		}
	};

	//JLABELS
	JLabel artistLabel = new JLabel("Artist: ");
	JLabel albumLabel = new JLabel("Album: ");
	JLabel recordLabelLabel = new JLabel("Label: ");
	JLabel releaseYearLabel = new JLabel("Release: ");

	//JTEXTFIELDS
	JTextField artistText = new JTextField(40);
	JTextField albumText = new JTextField(40);
	JTextField recordLabelText = new JTextField(40);
	JTextField releaseYearText = new JTextField(4);

	//method to add all records to the collection
	private void fillModel(){
		for(int i = 0; i< PlateSamling.samling.size(); i++){
			collectionModel.add(i, PlateSamling.samling.get(i));
		}
	}

	//constructor for listView
	public ListView(){
		
		//adds mouselistener
		collectionList.addMouseListener(listListener);
		
		/*
		 * GridBag layout er basically en matrise du kan sette elementer på
		 * gridx setter ny x verdi f eks, må bare oppdateres løpende
		 */
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		//gridbaggin, setter startpunkt
		gbc.gridx = 1;
		gbc.gridy = 0;
		//adder artistlabel osv på gridbagconstraints (derfor adder man x, gbc)
		//adder først på X = 1
		add(artistLabel, gbc);
		gbc.gridy = 1;
		add(albumLabel, gbc);
		gbc.gridy = 2;
		add(recordLabelLabel, gbc);
		gbc.gridy = 3;
		add(releaseYearLabel, gbc);
		
		//+1 X AKSEN, RESET Y
		
		gbc.gridx = 2;
		gbc.gridy = 0;
		add(artistText, gbc);
		gbc.gridy = 1;
		add(albumText, gbc);
		gbc.gridy = 2;
		add(recordLabelText, gbc);
		gbc.gridy = 3;
		add(releaseYearText, gbc);
	
		//usikker på hva som skjer her
		
		collectionList.setModel(collectionModel);
		
		//fyll modellen med samlingen
		
		fillModel();
		
		//reset gridbag
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		//adder samlingen på listeviewet til venste for alt det andre (x = 0)
		add(collectionList, gbc);
	}	
}
