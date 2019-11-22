package event_handling;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Kite_Awt extends Frame{
	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(100, 100, 100, 100);
		g.setColor(Color.green);
		g.fillOval(110, 150, 30, 30);
		g.fillOval(150, 110, 30, 30);
		g.setColor(Color.blue);
		g.drawLine(130, 130, 180, 180);
		g.fillOval(190, 190, 35, 35);
		g.drawLine(210, 210, 240, 280);
	}
	public static void main(String args[]) {
		Kite_Awt k= new Kite_Awt();
		k.setSize(350, 350);
		k.setVisible(true);
		k.setLayout(null);
		k.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
}
