package event_handling;
import java.awt.*;
import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class BorderLayoutTest {
	public static void main(String args[]) {
		JFrame f= new JFrame("Border Layout");
		//f.setLayout(new BorderLayout());
		JButton b1 = new JButton("1");
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		JButton b2 = new JButton("2");
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		JButton b3 = new JButton("3");
		b3.setBackground(Color.black);
		b3.setForeground(Color.white);
		JButton b4 = new JButton("4");
		b4.setBackground(Color.black);
		b4.setForeground(Color.white);
		JButton b5 = new JButton("5");
		b5.setBackground(Color.black);
		b5.setForeground(Color.white);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		f.add(b1,BorderLayout.NORTH);
		f.add(b2,BorderLayout.SOUTH);
		f.add(b3,BorderLayout.EAST);
		f.add(b4,BorderLayout.WEST);
		f.add(b5,BorderLayout.CENTER);
		f.setSize(600, 600);
		f.setVisible(true);
		
	}
}
