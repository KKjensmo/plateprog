package platevelger;

import javax.swing.JFrame;

public class PlatesamlingMain {

	public static void main(String[] args) {
		
		PlatesamlingGui psGui = new PlatesamlingGui();
		psGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		psGui.pack();
		psGui.setVisible(true);
	}
	
}	
