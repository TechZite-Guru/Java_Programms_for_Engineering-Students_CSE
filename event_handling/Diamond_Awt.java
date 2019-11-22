package event_handling;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Diamond_Awt extends Frame{
	int on_X[] = {300,400,450,350,250,300,250,450,400,320,280,350,310,340,380,420,350,390,360,340,320,340,360,380,360,350,340,300,400,360};
	int on_Y[] = {200,200,250,400,250,200,250,250,200,200,250,400,250,200,200,250,400,250,200,250,200,200,250,200,250,400,250,200,200,250};
	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillOval(210, 150, 280, 280);
		g.setColor(Color.white);
		for(int i = 1; i < on_X.length; i++) {
	         g.drawLine(on_X[i-1], on_Y[i-1], on_X[i], on_Y[i]);
	    }
	}
	public static void main(String args[]) {
		Diamond_Awt d= new Diamond_Awt();
		d.setTitle("Diamond -Kohinoor");
		d.setSize(700, 600);
		d.setVisible(true);
		d.setLayout(null);
		d.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		
		Label l= new Label("DIAMOND");
		l.setBounds(267, 100, 250, 30);
		l.setForeground(Color.blue);
		d.add(l);
		Font myFont = new Font("Serif",Font.BOLD,33);
		l.setFont(myFont);
		Label l1= new Label("USING JAVA AWT");
		l1.setBounds(240, 460, 285, 30);
		l1.setForeground(Color.red);
		d.add(l1);
		Font myFont1 = new Font("Serif",Font.BOLD,25);
		l1.setFont(myFont1);
	}
}
