/** 
 * destest.java
 *
 * Title:			desTest
 * Description:	
 * @author			chilukas
 * @version			
 */

package DESsimplfied;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;
import java.lang.Object;

public class TextToCryptCode
 {
 
public  TextToCryptCode()
{
}

 public String[] encodeString1(String s)
  {
  	
  	String[] byteStream = new String[s.length()];
  	int stringLength,k;
  	k =0;
  	stringLength = s.length();
  	for ( int i = 0; i < stringLength; i++)
  		{
  			byteStream[i] = s.substring(i,i+1);
  			  			
  		}		
  			
  
  
  return byteStream;
  	}
  	
  	}