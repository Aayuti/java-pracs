package syit20;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;

public class practical{
		JTabbedPane tb;
		JPanel jp;
		JFrame frame;
		
		
	practical () {
		
		frame = new JFrame();
		frame.setSize(500,500);
		
		tb = new JTabbedPane();
		tb.add("FY", new fy());
		tb.add("SY", new sy());
		
		jp = new JPanel();
		jp.setLayout(new FlowLayout());
		jp.add(tb);
		
		frame.add(jp);
		frame.pack();
		frame.setVisible(true);
	}
	
	
class fy extends JPanel implements ItemListener{
	JComboBox<String> cb;
	JLabel j1;
	fy () {
	 cb = new JComboBox<String>();
	 cb.addItem("---select---");
	 cb.addItem("IT");
	 cb.addItem("BMS");
	 cb.addItem("BMM");
	 cb.addItemListener(this);
	 j1 = new JLabel("courses");
	 add(j1);
	 add(cb);
	}	
	
	public void itemStateChanged(ItemEvent e) {
		
		if (e.getStateChange() == ItemEvent.SELECTED) {
			String s = e.getItem().toString();
		if(s!="---select---")
		{
			JOptionPane.showMessageDialog(null, s);
		}
	 }
  } 
}

class sy extends JPanel {
	ImageIcon ic;
	JLabel j2;
	sy() {
		j2 = new JLabel("");
		ic = new ImageIcon("C:\\Users\\Hp\\Pictures\\Saved Pictures\\hello.jpg");
		j2.setIcon(ic);
		add(j2);
	}
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	new practical();
  }
}

