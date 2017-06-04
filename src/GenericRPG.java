
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GenericRPG {
	JFrame GameFrame;
	JPanel GamePanel;
	
	public static final int Hight = 750;
public static final int Width = 750;
	public static void main(String[] args) {
	GenericRPG gp = new GenericRPG();
	gp.Setup();
}
	GenericRPG(){
		GameFrame=new JFrame();
		GamePanel=new JPanel();
		Setup();
		}

void Setup(){
	//GameFrame.addKeyListener(GamePanel);
	GameFrame.add(GamePanel);
	GameFrame.setVisible(true);
	GameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
} 
}

   




 

