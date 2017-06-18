
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GenericRPG implements ActionListener {
	JFrame GameFrame;
	JPanel GP;
	GamePanel GamePanel;
	JButton BStart;
	JButton BInfo;
	JLabel Title;
	public static final int Hight = 750;
	public static final int Width = 750;
	// Migrate
	public static final int MenuState = 1;
	public static final int GameState = 3;
	public static final int NameState = 2;
	public static final int EndState = 4;
	int CState = 1;
	// Migrate
	public static void main(String[] args) {
		GenericRPG gp = new GenericRPG();
		gp.Setup();
	}

	GenericRPG() {
		GameFrame = new JFrame();
		GP = new JPanel();
		GamePanel = new GamePanel();
		BStart = new JButton();
		BInfo = new JButton();
		Title = new JLabel("That Totaly Generic RPG");
	}

	void Setup() {
		GameFrame.addKeyListener(GamePanel);
		GameFrame.add(GamePanel);
		GameFrame.add(GP);
		GP.add(BStart);
		GP.add(BInfo);
		GP.add(Title);

		GameFrame.setVisible(true);
		GameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GameFrame.setSize(Width, Hight);
		GameFrame.setResizable(false);
		BInfo.setText("Info");
		BStart.setText("Start");
		GP.setLayout(null);
		BStart.setBounds(275, 375, 200, 100);
		BInfo.setBounds(275, 275, 200, 100);
		Title.setBounds(30, 190, 750, 75);
		Title.setFont(new Font("Serif", Font.BOLD, 60));
		BInfo.setActionCommand("Info");
		BInfo.addActionListener(this);
		BStart.addActionListener(this);
		Title.setForeground(Color.DARK_GRAY);
		GameFrame.requestFocus();
	}

	public void actionPerformed(ActionEvent e) {
		if ("Info".equals(e.getActionCommand())) {
			JOptionPane.showMessageDialog(null, "Info holder");
		} else if ("Start".equals(e.getActionCommand())) {
			int tutResult = JOptionPane.showConfirmDialog(null, "Would You Like To Enter Tutorial");
			if (tutResult == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(null, "Tutorial Holder");

			} else if (tutResult == JOptionPane.NO_OPTION) {
				CState = 3;
				StateCheck();
			}
		}
	}
	void StateCheck(){
		 if(CState == GameState){
			 GameState();
		 }
			 
		 }
	void GameState(){
		System.out.println("removing");
		GP.remove(Title);
		GP.remove(BInfo);
		GP.remove(BStart);
		GP.repaint();
	 }
}