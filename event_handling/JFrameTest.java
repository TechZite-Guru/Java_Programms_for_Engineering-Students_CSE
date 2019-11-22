package event_handling;
import java.awt.Color;
import javax.swing.*;
public class JFrameTest extends JFrame {
	void demoswing() {
		setSize(500,700);
		setVisible(true);
		setLayout(null);
		setTitle("JFrame");
		getContentPane().setBackground(Color.RED);
		JLabel label = new JLabel("Click Me!");
		label.setBounds(10,10, 100,50);
		add(label);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String args[]) {
		JFrameTest j= new JFrameTest();
		j.demoswing();
	}
}
