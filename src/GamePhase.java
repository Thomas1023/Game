import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GamePhase {
	JFrame GameFrame = new JFrame();
	JPanel GamePanel = new JPanel();
	final int Width = 750;
	final int Hight = 750;
public static void main(String[] args) {
	GamePhase gp = new GamePhase();
	gp.Setup();
}
public void Setup(){
	GameFrame.add(GamePanel);
	GameFrame.setVisible(true);
	GamePanel.setSize(Width, Hight);
}
}








