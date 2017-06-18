import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	boolean left = false;
	boolean right = false;
	boolean up = false;
	boolean down = false;
	boolean jump = false;
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			left = false;
			System.out.println("Left stop");
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			right = false;
			System.out.println("Right stop");
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			up = false;
			System.out.println("up stop");
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			down = false;
			System.out.println("down stop");
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			jump = true;
			System.out.println("Jumping");
			jumper();
			
		}
		
		
	}
	
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			left = true;
			System.out.println("Left");
				
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			right = true;
			System.out.println("Right");
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			up = true;
			System.out.println("up");
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			down = true;
			System.out.println("down");
		}
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
 void jumper(){
	 try {
		Thread.sleep(750);
		System.out.println("landed");
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
 }
}
