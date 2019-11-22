package event_handling;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FlowLayoutTest {
	public static void main(String args[]) {
		Frame f = new Frame("Flow Layout");
		f.setSize(800, 500);
		f.setVisible(true);
		Button b1= new Button("aravind babu jagarlamudi");
		b1.setBackground(Color.green);
		Button b2= new Button("aravind babu jagarlamudi");
		b2.setBackground(Color.green);
		Button b3= new Button("aravind babu jagarlamudi");
		b3.setBackground(Color.green);
		Button b4= new Button("aravind babu jagarlamudi");
		b4.setBackground(Color.green);
		Button b5= new Button("aravind babu jagarlamudi");
		b5.setBackground(Color.red);
		
		f.setLayout(new FlowLayout());
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
}
