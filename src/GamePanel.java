import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements ActionListener, KeyListener {

	@Override
	public void keyPressed(KeyEvent SPACE) {
		System.out.println("pressed");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("Released");
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("Typed");
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Preformed");
		
	}


}
