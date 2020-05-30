/** 
 * destest.java
 *
 * Title:			desTest
 * Description:	
 * @author			Chilukas
 * @version			
 */

package DESsimplfied;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.lang.Object;
import javax.swing.*;


public class designJPanel

{		javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
		javax.swing.JLabel[] labelInputData;
		int n;

public designJPanel()
{
}
	
public JPanel designJPanel1 (String name, int x, int y, int no_of_labels,int row,int col,int labelcap)

	{
		
		
		n = no_of_labels;
		
		labelInputData = new javax.swing.JLabel[n]; 
		jPanel1.setBorder(new javax.swing.plaf.BorderUIResource.TitledBorderUIResource(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, false), name, 4, 2, new java.awt.Font("Ariel", 1, 10), java.awt.Color.gray));
		jPanel1.setLayout(null);
		jPanel1.setLocation(new java.awt.Point(x,y));
		jPanel1.setSize(new java.awt.Dimension(10*labelcap*(row+1)+10, 10*labelcap*(col+1)+10));
		jPanel1.setVisible(true);
		jPanel1.setBackground(java.awt.Color.white);
		//jPanel1.setBackground(java.awt.SystemColor.blue);
		jPanel1.setOpaque(true);
		
		for (int i = 0; i<n; i++)
			{
			labelInputData[i] = new javax.swing.JLabel();
			jPanel1.add(labelInputData[i]);	
			labelInputData[i].setOpaque(true);	
			labelInputData[i].setBackground(java.awt.Color.white);
			labelInputData[i].setLocation(new java.awt.Point(10*labelcap*((i % row )+1), 10 *labelcap* ((i/row)+1)));
			labelInputData[i].setSize(new java.awt.Dimension(10*labelcap, 10*labelcap));
			//labelInputData[i].setText("56");			
			//labelInputData[i].setVisible(true);
			
			}
		
		return jPanel1;
	} 

	public void addDataDesignJPanel(String[] data)
	
	
	{
			for (int i = 0; i<n; i++)
			{
			   	labelInputData[i].setText(data[i]);	
			   	labelInputData[i].setVisible(true);
				
			}			
			
	
	}
	
	public void addDataDesignJPanel()
	
	
	{
			for (int i = 0; i<n; i++)
			{
			   	labelInputData[i].setText("");	
			   	labelInputData[i].setVisible(true);
				
			}			
			
	
	}
	
	public void addDataDesignJPanel(String[] data, int time)
	
	
	{
			for (int i = 0; i<n; i++)
			{
			   	labelInputData[i].setText(data[i]);	
			   	//try {Thread.sleep(time);}catch (InterruptedException ee){}	
				
			}			
			
	
	}

	public void upDateDataDesignJPanel(int index, String data)
	
	
	{
			
			labelInputData[index].setForeground(java.awt.Color.red);
			labelInputData[index].setText("");	
			labelInputData[index].setText(data);	
			try {Thread.sleep(500);}catch (InterruptedException ee){}	
			labelInputData[index].setForeground(java.awt.Color.black);
	}

	public void highlightDesignJPanel(int s_index, int e_index, String color)
	{
		if (color.equals("red") )
			for (int i=s_index; i<e_index+1;i++)
			labelInputData[i].setForeground(java.awt.Color.red);
		if (color.equals("black") )
			for (int i=s_index; i<e_index+1;i++)
			labelInputData[i].setForeground(java.awt.Color.black);
	}	

	public void highlightDesignJPanel(int index, int time)
	{
		labelInputData[index].setForeground(java.awt.Color.red);
		//try {Thread.sleep(time);}catch (InterruptedException ee){}	
		labelInputData[index].setForeground(java.awt.Color.black);
	}	
} 
