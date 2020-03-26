package tree;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

class AlarmThread implements Runnable 
{ 
	private boolean exit = false;
    public void run() 
    { 
        try
        { 
        	while (exit == false)
        	{        		LocalTime here = LocalTime.now();
        		if (here.getMinute() == Balt.amin && here.getHour() == Balt.ahr)  //0-23 hours
        		{
        			JFrame f=new JFrame("New One");  
                    final JTextField tf=new JTextField();  
                    tf.setBounds(50,50, 150,20);  
                    JButton b=new JButton("ALARM ON! (Picture & Instruction)");  
                    b.setBounds(50,100,95,30);  
                    b.addActionListener(new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                            tf.setText("Welcome to Javatpoint.");  
                        }  
                    });  
                    f.add(b);f.add(tf);  
                    f.setSize(400,400);  
                    f.setLayout(null);  
                    f.setVisible(true); 
                    
                 // for stopping the thread 
                    
                    
                        exit = true; 
                   

                    
                    break;
        		}
        	
        	}

            
        
  
        } 
        catch (Exception e) 
        { 

            System.out.println (e.getClass().getCanonicalName()); 
        } 
    } 
} 

