package event_handling;
import java.awt.*;
import java.awt.event.*;
public class FrameCreate {

	public static void main(String args[]) {
		Frame f= new Frame("GUI Components");
		f.setVisible(true);
		f.setSize(600, 800);
		f.setBackground(Color.blue);
		f.setLayout(null);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		Label l= new Label("I am Label");
		l.setBounds(200, 50, 100, 50);
		f.add(l);
		TextField t1, t2;
		t1= new TextField("I am TextField1");
		t1.setEchoChar('*');
		t1.setBounds(200,150, 200,30);
		t2= new TextField("I am TextField2");
		t2.setBounds(200,200, 200,30);
		f.add(t1);
		f.add(t2);
		
		TextArea a1, a2;
		a1= new TextArea("Write here.....");
		a1.setBounds(200, 270, 200, 80);
		a2= new TextArea("Write here.....");
		a2.setBounds(200, 370, 200, 80);
		f.add(a1);
		f.add(a2);
		List l1= new List(5);
		l1.setBounds(200, 470, 200, 80);
		l1.add("Item1");
		l1.add("Item2");
		l1.add("Item3");
		l1.add("Item4");
		f.add(l1);
		Checkbox c1= new Checkbox("Click",true);
		c1.setBounds(200, 560, 200, 20);
		f.add(c1);
		CheckboxGroup cbg= new CheckboxGroup();
		Checkbox r1= new Checkbox("Item1",cbg,true);
		r1.setBounds(200, 590, 200, 20);
		Checkbox r2= new Checkbox("Item2",cbg,false);
		r2.setBounds(200, 610, 200, 20);
		Checkbox r3= new Checkbox("Item3",cbg,false);
		r3.setBounds(200, 630, 200, 20);
		f.add(r1);
		f.add(r2);
		f.add(r3);
	}
}