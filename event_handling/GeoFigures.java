package event_handling;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class GeoFigures extends Frame{
	public void paint(Graphics w) {
		w.setColor(Color.green);
		w.drawRect(10,70,200,100);
		w.setColor(Color.red);
		w.fillRect(10, 190, 300, 100);
		w.setColor(Color.white);
		w.drawLine(10, 210, 290, 210);
		w.setColor(Color.red);
		w.drawLine(10, 350, 200, 350);
		/*w.setColor(Color.blue);
		w.drawOval(10, 400, 325, 325);*/
		Color c = new Color(138, 72, 67);
		w.setColor(c);
		w.fillOval(135, 530, 70, 70);
		w.setColor(Color.black);
		w.drawOval(145, 540, 50, 50);
		w.drawOval(155, 550, 30, 30);
		w.setColor(c);
		w.drawRect(155, 400, 30, 140);
		w.drawRect(155, 590, 30, 136);
		w.drawRect(10, 550, 140, 30);
		w.drawRect(195, 550, 140, 30);
		w.fill3DRect(450, 600, 100, 100, true);
		w.drawRoundRect(10, 50, 100, 60, 100, 190);
		w.setColor(Color.red);
		w.fillRect(500, 100, 150, 150);
		w.setColor(Color.green);
		w.fillOval(530, 200, 50, 50);
		w.fillOval(600, 140, 50, 50);
		w.drawLine(530, 150, 630, 190);
	}
	public static void main(String args[]) {
		GeoFigures g= new GeoFigures();
		g.setSize(1300, 800);
		g.setVisible(true);
		//g.setBackground(Color.black);
		g.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
}