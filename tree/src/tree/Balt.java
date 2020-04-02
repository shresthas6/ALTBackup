package tree;
import java.awt.*;
//import java.awt.GridBagConstraints;
//import java.awt.GridBagLayout;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.*;    
public class Balt {  
	
	public static int ahr;
	public static int amin;
	public static ArrayList<String> contacts = new ArrayList<>();
	public String cName,cNum;
	
	public static void ShowImage(String filepath)
	{
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BufferedImage img = null;
		try
		{
			img = ImageIO.read(new File(filepath));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		JLabel lbl = new JLabel();
		lbl.setIcon(new ImageIcon(img));
		frame.getContentPane().add(lbl,BorderLayout.CENTER);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	
	public static void main(String[] args) {  

		
	Thread object = new Thread(new AlarmThread());
	object.start();

    JFrame f = new JFrame("Assisted Living Tool");  
    JPanel panel = new JPanel(new GridBagLayout());
    f.getContentPane().add(panel,BorderLayout.NORTH);
    
    GridBagConstraints c = new GridBagConstraints();
    String filepath = "src\\tree\\red.jpg";
	BufferedImage img = null;
	try
	{
		img = ImageIO.read(new File(filepath));
	}
	catch (Exception e)
	{
		e.printStackTrace();
	}
    JLabel lbl = new JLabel();
    lbl.setIcon(new ImageIcon(img));
    c.gridx = 4;
    c.gridy = 6;
    
    f.getContentPane().add(lbl,BorderLayout.WEST);
    
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
    JTextArea tf =new JTextArea(10,20);  
    tf.setPreferredSize(new Dimension(450,150));
    //tf.setBounds(50,100,95,30);  
    panel.add(tf,c);
    
    JButton b1 = new JButton("To Do Lists");  
    JButton b2 = new JButton("Set New Alarm");
    JButton b3 = new JButton("Add Contacts");
    JButton b4 = new JButton("View Contacts");
    b1.setBounds(3,3,1000,1000);  
    b2.setBounds(4,3,1000,1000);
    c.gridx = 3;
    c.gridy = 3;
    panel.add(b1,c);
    c.gridx = 3;
    c.gridy = 4;
    panel.add(b2,c);
    c.gridy = 5;
    panel.add(b3,c);
    c.gridy = 6;
    panel.add(b4,c);
    
    
    b1.addActionListener(new ActionListener()
    {  

        public void actionPerformed(ActionEvent e)
        {  
            //ShowImage("C:\\Users\\USER\\Desktop\\red.jpg");
        	tf.setText("Create the list to add all the Alarms");  
        }  
    });  
    
    b2.addActionListener(new ActionListener()
    {  

        public void actionPerformed(ActionEvent e)
        {  
            new Dialog();
        }  
    });  
    
    b3.addActionListener(new ActionListener()
    {  
        public void actionPerformed(ActionEvent e)
        {  
        	Frame f1=new JFrame("Add New Contact");   
        	
            String cName = JOptionPane.showInputDialog(f1,"Enter Name: ");
            String cNum = JOptionPane.showInputDialog(f1,"Enter Phone Number: ");
            
            contacts.add(cName+" : "+cNum);
        }  
    }); 
    
    b4.addActionListener(new ActionListener()
    {  
        public void actionPerformed(ActionEvent e)
        {  
        	String all = "";
        	for(int i = 0; i < contacts.size(); i++) //cars name of arraylist
            {
        		all = all + "\r\n" + contacts.get(i);	
            }
            System.out.println(all);
            tf.setText(all);
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
