package test;
import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame{
	private static final LayoutManager GridLayout = null;
	int weight = 9;
	int height = 9;
	MyFrame(){
		setSize(500, 500);
		setTitle("mineSwepper");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel main = new JPanel();
		JPanel up = new JPanel();
		JPanel down = new JPanel();
		JLabel score = new JLabel("Score : ");
		ImageIcon smile = new ImageIcon("D://smile.png");
		JButton reset = new JButton(smile);
		JLabel time = new JLabel("time : ");
		JButton[][] btn = new JButton[9][9];
		GridLayout layout = new GridLayout(weight, height);
		for(int i = 0; i<9; i++) {
			for(int j = 0; j<9; j++) {
				btn[i][j] = new JButton();
				down.add(btn[i][j]);
				btn[i][j].setPreferredSize(new Dimension(55,39));
			}
		}
		up.add(score);
		up.add(reset);
		up.add(time);
		down.setLayout(layout);
		main.add(up,BorderLayout.NORTH);
		main.add(down);
		this.add(main);
		setVisible(true);
	}
}


public class test {
	public static void main(String[] args) {
		MyFrame frame1 = new MyFrame();
	}
}
