package event_handling;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BorderLayoutFrame {
	public static void main(String args[]) {
		Frame f= new Frame("Border Layout");
		f.setSize(500, 500);
		f.setVisible(true);
		Button b1= new Button("1");
		b1.setBackground(Color.green);
		Button b2= new Button("2");
		b2.setBackground(Color.green);
		Button b3= new Button("3");
		b3.setBackground(Color.green);
		Button b4= new Button("4");
		b4.setBackground(Color.green);
		Button b5= new Button("5");
		b5.setBackground(Color.red);
		
		f.add(b1,BorderLayout.NORTH);
		f.add(b2,BorderLayout.EAST);
		f.add(b3,BorderLayout.WEST);
		f.add(b4,BorderLayout.SOUTH);
		f.add(b5,BorderLayout.CENTER);
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
}
