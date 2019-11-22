package event_handling;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class PopUpMenuTest {
	PopUpMenuTest() {
		Frame f = new Frame("PopupMenu");
		PopupMenu p = new PopupMenu();
		MenuItem cut = new MenuItem("Cut");
		cut.setActionCommand("Cut");
		MenuItem copy = new MenuItem("Copy");
		copy.setActionCommand("Copy");
		MenuItem paste = new MenuItem("Paste");
		paste.setActionCommand("Paste");
		p.add(cut);
		p.add(copy);
		p.add(paste);
		f.addMouseListener(new MouseAdapter() {  
            public void mouseClicked(MouseEvent e) {             
                p.show(f , e.getX(), e.getY());
            }                 
         });
		f.add(p);   
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
	public static void main(String args[]) {
		new PopUpMenuTest();
	}
}
