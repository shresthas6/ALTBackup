package tree;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Dialog {  
JFrame f1;  
Dialog(){  
	f1=new JFrame();   
	
    String shr = JOptionPane.showInputDialog(f1,"Enter Hour:");
    String smin = JOptionPane.showInputDialog(f1,"Enter Min:");
    
    Balt.ahr = Integer.parseInt(shr);
    Balt.amin = Integer.parseInt(smin);
}  
}