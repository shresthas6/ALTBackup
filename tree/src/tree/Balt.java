package tree;
import java.awt.*;
//import java.awt.GridBagConstraints;
//import java.awt.GridBagLayout;
import java.awt.event.*;  
import javax.swing.*;    
public class Balt {  
	
	public static int ahr;
	public static int amin;
	
	public static void main(String[] args) {  
	Thread object = new Thread(new AlarmThread());
	object.start();

    JFrame f = new JFrame("Assisted Living Tool");  
    JPanel panel = new JPanel(new GridBagLayout());
    f.getContentPane().add(panel,BorderLayout.NORTH);
    
    GridBagConstraints c = new GridBagConstraints();
    
    JLabel l1 = new JLabel("My Alarms");

    c.gridx = 0;
    c.gridy = 0;
    c.insets = new Insets(10,10,10,10);
    //c.gridheight = 10;
    //c.gridwidth = 10;
   
    panel.add(l1,c);
    
    c.gridx = 0;
    c.gridy = 1;
    //c.gridheight = 10;
    //c.gridwidth = 10;
    JTextField tf =new JTextField("",50);  
    tf.setPreferredSize(new Dimension(450,150));
    //tf.setBounds(50,100,95,30);  
    panel.add(tf,c);
    
    JButton b1 = new JButton("To Do Lists");  
    JButton b2 = new JButton("Set New Alarm");
    b1.setBounds(3,3,1000,1000);  
    b2.setBounds(4,3,1000,1000);
    c.gridx = 3;
    c.gridy = 3;
    panel.add(b1,c);
    c.gridx = 3;
    c.gridy = 4;
    panel.add(b2,c);
    
    b1.addActionListener(new ActionListener()
    {  

        public void actionPerformed(ActionEvent e)
        {  
            tf.setText("Create the list to"+ "\n"
            		+ " add all the Alarms");  
        }  
    });  
    
    b2.addActionListener(new ActionListener()
    {  

        public void actionPerformed(ActionEvent e)
        {  
            new Dialog();
        }  
    });  
    
    f.pack();
    //f.add(b1);
    //f.add(tf);  
    f.setSize(100,100);  
    //f.setLayout(null);  
    f.setVisible(true);  
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}  
}  
