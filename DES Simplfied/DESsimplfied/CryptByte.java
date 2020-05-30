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
import java.applet.*;
import javax.swing.*;
import java.lang.Object;

public class CryptByte
{

public CryptByte()
{
}
public int Encode(String read)
{
if (read.equals("0"))return 0;
else if ( read.equals( "1" )) return 1;
else  return -1;
}
}