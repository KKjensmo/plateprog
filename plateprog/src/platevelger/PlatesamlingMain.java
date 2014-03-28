package platevelger;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class PlatesamlingMain {

	public static void main(String[] args) {
		
		PlatesamlingGui psGui = new PlatesamlingGui();
		psGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		psGui.pack();
		psGui.setVisible(true);
		//set center
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		psGui.setLocation(dim.width/2-psGui.getSize().width/2, dim.height/2-psGui.getSize().height/2);
	}
	
}	
