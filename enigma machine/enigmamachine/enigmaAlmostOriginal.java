/** 
 * enigma.java
 *
 * Title:			enigma machine
 * Description:	
 * @author			chilukas
 * @version			
 */

package enigmamachine;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.text.*;

public class enigma extends javax.swing.JApplet {

// IMPORTANT: Source code between BEGIN/END comment pair will be regenerated
// every time the form is saved. All manual changes will be overwritten.
// BEGIN GENERATED CODE
	// member declarations
	javax.swing.JPanel jPanelMain = new javax.swing.JPanel();
	javax.swing.JLabel jLabelTitle = new javax.swing.JLabel();
	javax.swing.JButton jButtonReset = new javax.swing.JButton();
	javax.swing.JInternalFrame jInternalFramePlainText = new javax.swing.JInternalFrame();
	javax.swing.JTextPane jTextPanePlaintext = new javax.swing.JTextPane();
	javax.swing.JTextPane jTextPanePlainStrings = new javax.swing.JTextPane();
	javax.swing.JInternalFrame jInternalFrameCypherText = new javax.swing.JInternalFrame();
	javax.swing.JTextPane jTextPaneCypherText = new javax.swing.JTextPane();
	javax.swing.JTextPane jTextPaneCypherStrings = new javax.swing.JTextPane();
	javax.swing.JSlider jSlider1 = new javax.swing.JSlider();
	javax.swing.JLabel jLabelSlow = new javax.swing.JLabel();
	javax.swing.JLabel jLabelFast = new javax.swing.JLabel();
	javax.swing.JLabel jLabelSpeed = new javax.swing.JLabel();
	javax.swing.JPanel jPanelActiveButtons = new javax.swing.JPanel();
	javax.swing.JLabel jLabelA = new javax.swing.JLabel();
	javax.swing.JLabel jLabelB = new javax.swing.JLabel();
	javax.swing.JLabel jLabelC = new javax.swing.JLabel();
	javax.swing.JLabel jLabelD = new javax.swing.JLabel();
	javax.swing.JLabel jLabelE = new javax.swing.JLabel();
	javax.swing.JLabel jLabelF = new javax.swing.JLabel();
	javax.swing.JLabel jLabelG = new javax.swing.JLabel();
	javax.swing.JLabel jLabelH = new javax.swing.JLabel();
	javax.swing.JLabel jLabelI = new javax.swing.JLabel();
	javax.swing.JLabel jLabelJ = new javax.swing.JLabel();
	javax.swing.JLabel jLabelK = new javax.swing.JLabel();
	javax.swing.JLabel jLabelL = new javax.swing.JLabel();
	javax.swing.JLabel jLabelM = new javax.swing.JLabel();
	javax.swing.JLabel jLabelN = new javax.swing.JLabel();
	javax.swing.JLabel jLabelO = new javax.swing.JLabel();
	javax.swing.JLabel jLabelP = new javax.swing.JLabel();
	javax.swing.JLabel jLabelQ = new javax.swing.JLabel();
	javax.swing.JLabel jLabelR = new javax.swing.JLabel();
	javax.swing.JLabel jLabelS = new javax.swing.JLabel();
	javax.swing.JLabel jLabelT = new javax.swing.JLabel();
	javax.swing.JLabel jLabelU = new javax.swing.JLabel();
	javax.swing.JLabel jLabelV = new javax.swing.JLabel();
	javax.swing.JLabel jLabelW = new javax.swing.JLabel();
	javax.swing.JLabel jLabelX = new javax.swing.JLabel();
	javax.swing.JLabel jLabelY = new javax.swing.JLabel();
	javax.swing.JLabel jLabelZ = new javax.swing.JLabel();
	javax.swing.JPanel jPanelInactiveButtons = new javax.swing.JPanel();
	javax.swing.JLabel jLabel_A = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_J = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_R = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_S = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_K = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_B = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_C = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_L = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_T = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_U = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_V = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_W = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_X = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_Y = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_Z = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_M = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_N = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_O = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_P = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_Q = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_D = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_E = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_F = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_G = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_H = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_I = new javax.swing.JLabel();
	javax.swing.JTextPane jTextPane1 = new javax.swing.JTextPane();
	javax.swing.JLabel jLabelStopAtEndcharacter = new javax.swing.JLabel();
	javax.swing.JLabel jLabelCountinue = new javax.swing.JLabel();
	javax.swing.JButton jButtonencrypt = new javax.swing.JButton();
	javax.swing.JLabel jLabelStrings = new javax.swing.JLabel();
	javax.swing.JLabel jLabelCharacters = new javax.swing.JLabel();
	javax.swing.JPanel jPanelRotor1 = new javax.swing.JPanel();
	javax.swing.JPanel jPanelRotor2 = new javax.swing.JPanel();
	javax.swing.JPanel jPanelRotor3 = new javax.swing.JPanel();
// END GENERATED CODE
	
	javax.swing.JLabel [] row01Labels;
	javax.swing.JLabel [] row02Labels;
	javax.swing.JLabel [] row03Labels;
	javax.swing.JLabel [] row11Labels;
	javax.swing.JLabel [] row12Labels;
	javax.swing.JLabel [] row13Labels;
	
	javax.swing.JLabel [] rowTempLabels0 = new javax.swing.JLabel [26];
	javax.swing.JLabel [] rowTempLabels1 = new javax.swing.JLabel [26];
	javax.swing.JLabel    row01Labeltemp;
	javax.swing.JLabel    row02Labeltemp;
	javax.swing.JLabel    row03Labeltemp;
	javax.swing.JLabel    row11Labeltemp;
	javax.swing.JLabel    row12Labeltemp;
	javax.swing.JLabel    row13Labeltemp;
	int count_chars =1;
	int comboselected1=0, comboselected2=0, comboselected3=0;
	int temp,temp2,resetValue=0;
	int ENCRYPT =1,DECRYPT = 0;
	int workingwithstrings =0;
	int lineinside1=26,lineinside2=26,lineinside3=26,lineoutside1=26,lineoutside2=26,lineoutside3=26;
	int rotor1inside=0,rotor2inside=0,rotor3inside=0,rotor1outside=0,rotor2outside=0,rotor3outside=0;
	Point [] row01Point,row11Point;
	Point [] row02Point,row12Point;
	Point [] row03Point,row13Point;	
	String [] chars= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	String [] row1chars=	{"e","k","m","f","l","g","d","q","v","z","n","t","o","w","y","h","x","u","s","p","a","i","b","r","c","j"};		
	String [] row2chars=	{"a","j","d","k","s","i","r","u","x","b","l","h","w","t","m","c","q","g","z","n","p","y","f","v","o","e"};
	String [] row3chars=	{"b","d","f","h","j","l","c","p","r","t","x","v","z","n","y","e","i","w","g","a","k","m","u","s","q","o"};
												  			  
	char [] resetRowValues=  {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};	
	char [] resetrow01data=	{'e','k','m','f','l','g','d','q','v','z','n','t','o','w','y','h','x','u','s','p','a','i','b','r','c','j'};
	char [] resetrow02data=	{'a','j','d','k','s','i','r','u','x','b','l','h','w','t','m','c','q','g','z','n','p','y','f','v','o','e'};
	char [] resetrow03data=	{'b','d','f','h','j','l','c','p','r','t','x','v','z','n','y','e','i','w','g','a','k','m','u','s','q','o'};

	char [] row11data=  {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};	
	char [] row12data=  {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	char [] row13data=  {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	char [] row01data=	{'e','k','m','f','l','g','d','q','v','z','n','t','o','w','y','h','x','u','s','p','a','i','b','r','c','j'};
	char [] row02data=	{'a','j','d','k','s','i','r','u','x','b','l','h','w','t','m','c','q','g','z','n','p','y','f','v','o','e'};
	char [] row03data=	{'b','d','f','h','j','l','c','p','r','t','x','v','z','n','y','e','i','w','g','a','k','m','u','s','q','o'};

	int letterpositionInwards01=26,letterpositionInwards02=26,letterpositionInwards03=26;
	int letterpositionOutwards01=26,letterpositionOutwards02=26,letterpositionOutwards03=26;
	int preletterpositionInwards03,preletterpositionInwards02, preletterpositionInwards01;
	int preletterpositionOutwards01, preletterpositionOutwards02, preletterpositionOutwards03;

	int letterpositionInwards11=26,letterpositionInwards12=26,letterpositionInwards13=26;
	int letterpositionOutwards11=26,letterpositionOutwards12=26,letterpositionOutwards13=26;
	int preletterpositionInwards13,preletterpositionInwards12, preletterpositionInwards11;
	int preletterpositionOutwards11, preletterpositionOutwards12, preletterpositionOutwards13;
	
	int stopatendofcharacter=0;
	String plainText="",encryptText="";
	char [] temprow0 = new char[26];
 	char [] temprow1 = new char[26];	
	int speed =60;
	int speedconstant=60;
	int encryptdecryptselection =0;
	int appletstarted =0;
	boolean isStandalone = false;
	Queue stringtest =new Queue();
	String workingString="";
	String workingwithString="";
	String [] combovalues ={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	//int [] combointvalues ={"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25"};
	javax.swing.JComboBox jComboBox1 = new javax.swing.JComboBox(combovalues);
	javax.swing.JComboBox jComboBox2 = new javax.swing.JComboBox(combovalues);
	javax.swing.JComboBox jComboBox3 = new javax.swing.JComboBox(combovalues);
	
	int[][] x11points={{25,50},{25,50},{25,50},{25,50},{25,50},{25,50},{25,50},{25,50},{25,50},{25,50},{25,50},{25,50},{25,50},{25,50},{25,50},{25,50},{25,50},{25,50},{25,50},{25,50},{25,50},{25,50},{25,50},{25,50},{25,50},{25,50},{0,0}};
	int[][] y11points={{100,100},{120,120},{140,140},{160,160},{180,180},{200,200},{220,220},{240,240},{260,260},{280,280},{300,300},{320,320},{340,340},{360,360},{380,380},{400,400},{420,420},{440,440},{460,460},{480,480},{500,500},{520,520},{540,540},{560,560},{580,580},{600,600},{0,0}};
	int[][] x12points={{25,25},{25,25},{25,25},{25,25},{25,25},{25,25},{25,25},{25,25},{25,25},{25,25},{25,25},{25,25},{25,25},{0,0}};
	int[][] y12points={{100,120},{140,160},{180,200},{220,240},{260,280},{300,320},{340,360},{380,400},{420,440},{460,480},{500,520},{540,560},{580,600},{0,0}};
	
	int[][] x22points={{150,210},{150,210},{150,210},{150,210},{150,210},{150,210},{150,210},{150,210},{150,210},{150,210},{150,210},{150,210},{150,210},{150,210},{150,210},{150,210},{150,210},{150,210},{150,210},{150,210},{150,210},{150,210},{150,210},{150,210},{150,210},{150,210},{0,0}};
	int[][] y22points={{100,100},{120,120},{140,140},{160,160},{180,180},{200,200},{220,220},{240,240},{260,260},{280,280},{300,300},{320,320},{340,340},{360,360},{380,380},{400,400},{420,420},{440,440},{460,460},{480,480},{500,500},{520,520},{540,540},{560,560},{580,580},{600,600},{0,0}};

	int[][] x33points={{310,370},{310,370},{310,370},{310,370},{310,370},{310,370},{310,370},{310,370},{310,370},{310,370},{310,370},{310,370},{310,370},{310,370},{310,370},{310,370},{310,370},{310,370},{310,370},{310,370},{310,370},{310,370},{310,370},{310,370},{310,370},{310,370},{0,0}};
	int[][] y33points={{100,100},{120,120},{140,140},{160,160},{180,180},{200,200},{220,220},{240,240},{260,260},{280,280},{300,300},{320,320},{340,340},{360,360},{380,380},{400,400},{420,420},{440,440},{460,460},{480,480},{500,500},{520,520},{540,540},{560,560},{580,580},{600,600},{0,0}};

	int [] yrotorpoints={100,120,140,160,180,200,220,240,260,280,300,320,340,360,380,400,420,440,460,480,500,520,540,560,580,600};
	int [] xrotor1points ={90,110};
	int [] xrotor2points ={250,270};
	int [] xrotor3points ={410,430};		
	Polygon[] line11 = new Polygon[27];
	Polygon[] line12 = new Polygon[14];	
	Polygon[] line22 = new Polygon[27];
	Polygon[] line33 = new Polygon[27];

	int[] reflector  =  {1, 0, 3, 2, 5, 4, 7, 6, 9, 8, 11, 10, 13, 12, 15, 14, 17, 16, 19, 18, 21, 20, 23, 22, 25, 24};
	
	int paintinti =0;
	int row1paint= 26;
	int row2paint= 26;
    int row3paint= 26;
    int row1paintreverse= 26;
	int row2paintreverse= 26;
    int row3paintreverse= 26;
	String tempString;

	public enigma() {
	}

    public void paint(java.awt.Graphics g) {
	 
    
    jPanelMain.paint(g);

	g.setColor(Color.darkGray);		
   	for(int i=0;i<26;i++)
   	{
    	g.drawPolygon(line11[i]);
    	g.drawPolygon(line22[i]);
    	g.drawPolygon(line33[i]);
	}
	for(int i=0;i<13;i++)
    	g.drawPolygon(line12[i]);    	

	if (lineinside1 !=26)
		{
		g.setColor(Color.red);		 
		g.drawPolygon(line11[lineinside1]);	
		if (lineinside1%2 ==0)
			g.drawPolygon(line12[lineinside1/2]);			
		else 
			g.drawPolygon(line12[(lineinside1-1)/2]);				
		}
	if (lineinside2 !=26)
		{
		g.setColor(Color.red);		 
		g.drawPolygon(line22[lineinside2]);	
		}
	if (lineinside3 !=26)
		{
		g.setColor(Color.red);		 
		g.drawPolygon(line33[lineinside3]);	
		}
	if (lineoutside1 !=26)
		{
		g.setColor(Color.red);		 
		g.drawPolygon(line11[lineoutside1]);	
		}
	if (lineoutside2 !=26)
		{
		g.setColor(Color.blue);		 
		g.drawPolygon(line22[lineoutside2]);	
		}
	if (lineoutside3 !=26)
		{
		g.setColor(Color.blue);		 
		g.drawPolygon(line33[lineoutside3]);	
		}
		
	if (rotor1inside==1)
		{
		g.setColor(Color.red);	
		g.drawLine(xrotor1points[0],yrotorpoints[letterpositionInwards01],xrotor1points[0]+5,yrotorpoints[letterpositionInwards01]);
		g.drawLine(xrotor1points[0]+5,yrotorpoints[letterpositionInwards01],xrotor1points[1]-5,yrotorpoints[letterpositionInwards11]);
		g.drawLine(xrotor1points[1]-5,yrotorpoints[letterpositionInwards11],xrotor1points[1],yrotorpoints[letterpositionInwards11]);
		}	
	if (rotor2inside==1)
		{
		g.setColor(Color.red);	
		g.drawLine(xrotor2points[0],yrotorpoints[letterpositionInwards02],xrotor2points[0]+5,yrotorpoints[letterpositionInwards02]);
		g.drawLine(xrotor2points[0]+5,yrotorpoints[letterpositionInwards02],xrotor2points[1]-5,yrotorpoints[letterpositionInwards12]);
		g.drawLine(xrotor2points[1]-5,yrotorpoints[letterpositionInwards12],xrotor2points[1],yrotorpoints[letterpositionInwards12]);
		
		}		

	if (rotor3inside==1)
		{
		g.setColor(Color.red);	
		g.drawLine(xrotor3points[0],yrotorpoints[letterpositionInwards03],xrotor3points[0]+5,yrotorpoints[letterpositionInwards03]);
		g.drawLine(xrotor3points[0]+5,yrotorpoints[letterpositionInwards03],xrotor3points[1]-5,yrotorpoints[letterpositionInwards13]);
		g.drawLine(xrotor3points[1]-5,yrotorpoints[letterpositionInwards13],xrotor3points[1],yrotorpoints[letterpositionInwards13]);
		
		}		

	if (rotor1outside==1)
		{
		g.setColor(Color.blue);	
		g.drawLine(xrotor1points[0],yrotorpoints[letterpositionOutwards01],xrotor1points[0]+5,yrotorpoints[letterpositionOutwards01]);
		g.drawLine(xrotor1points[0]+5,yrotorpoints[letterpositionOutwards01],xrotor1points[1]-5,yrotorpoints[letterpositionOutwards11]);
		g.drawLine(xrotor1points[1]-5,yrotorpoints[letterpositionOutwards11],xrotor1points[1],yrotorpoints[letterpositionOutwards11]);
		}		

	if (rotor2outside==1)
		{
		g.setColor(Color.blue);	
		g.drawLine(xrotor2points[0],yrotorpoints[letterpositionOutwards02],xrotor2points[0]+5,yrotorpoints[letterpositionOutwards02]);
		g.drawLine(xrotor2points[0]+5,yrotorpoints[letterpositionOutwards02],xrotor2points[1]-5,yrotorpoints[letterpositionOutwards12]);
		g.drawLine(xrotor2points[1]-5,yrotorpoints[letterpositionOutwards12],xrotor2points[1],yrotorpoints[letterpositionOutwards12]);

			
		}		
	if (rotor3outside==1)
		{
		g.setColor(Color.blue);	
		g.drawLine(xrotor3points[0],yrotorpoints[letterpositionOutwards03],xrotor3points[0]+5,yrotorpoints[letterpositionOutwards03]);
		g.drawLine(xrotor3points[0]+5,yrotorpoints[letterpositionOutwards03],xrotor3points[1]-5,yrotorpoints[letterpositionOutwards13]);
		g.drawLine(xrotor3points[1]-5,yrotorpoints[letterpositionOutwards13],xrotor3points[1],yrotorpoints[letterpositionOutwards13]);
			
		}		


    }
    
    
  
	// Retrieve the value of an applet parameter
	public String getParameter(String key, String def) {
		return isStandalone ? System.getProperty(key, def) :
			(getParameter(key) != null ? getParameter(key) : def);
	}

	// Get info on the applet parameters
	public String[][] getParameterInfo() {
		return null;
	}

	// Get applet information
	public String getAppletInfo() {
		return "Applet Information";
	}

	// Initialize the applet
	public void init() {
		try {
			initComponents();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void initComponents() throws Exception {
// IMPORTANT: Source code between BEGIN/END comment pair will be regenerated
// every time the form is saved. All manual changes will be overwritten.
// BEGIN GENERATED CODE
		// the following code sets the frame's initial state
		jPanelMain.setBackground(java.awt.Color.white);
		jPanelMain.setBorder(new javax.swing.border.LineBorder(java.awt.Color.black, 2, false));
		jPanelMain.setLayout(null);
		jPanelMain.setLocation(new java.awt.Point(0, 0));
		jPanelMain.setSize(new java.awt.Dimension(850, 635));
		jPanelMain.setVisible(true);
		jLabelTitle.setBackground(java.awt.Color.white);
		jLabelTitle.setFont(new java.awt.Font("Monospaced", 3, 24));
		jLabelTitle.setForeground(new java.awt.Color(34, 150, 200));
		jLabelTitle.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabelTitle.setLocation(new java.awt.Point(310, 10));
		jLabelTitle.setOpaque(true);
		jLabelTitle.setSize(new java.awt.Dimension(300, 20));
		jLabelTitle.setText("ENIGMA MACHINE");
		jLabelTitle.setVisible(true);
		jButtonReset.setBorder(new javax.swing.plaf.BorderUIResource.BevelBorderUIResource(0));
		jButtonReset.setLocation(new java.awt.Point(600, 230));
		jButtonReset.setSize(new java.awt.Dimension(170, 20));
		jButtonReset.setText("Set");
		jButtonReset.setToolTipText("Reset to Intial State");
		jButtonReset.setVisible(true);
		jInternalFramePlainText.setBorder(new javax.swing.plaf.BorderUIResource.BevelBorderUIResource(0));
		jInternalFramePlainText.getContentPane().setLayout(null);
		jInternalFramePlainText.setLocation(new java.awt.Point(560, 260));
		jInternalFramePlainText.setSize(new java.awt.Dimension(260, 120));
		jInternalFramePlainText.setTitle("Input");
		jInternalFramePlainText.setVisible(true);
		jTextPanePlaintext.setDoubleBuffered(true);
		jTextPanePlaintext.setEditable(false);
		jTextPanePlaintext.setLocation(new java.awt.Point(2, 2));
		jTextPanePlaintext.setSize(new java.awt.Dimension(258, 90));
		jTextPanePlaintext.setToolTipText("Enter the Plain Text");
		jTextPanePlaintext.setVisible(true);
		jTextPanePlainStrings.setDoubleBuffered(true);
		jTextPanePlainStrings.setLocation(new java.awt.Point(2, 2));
		jTextPanePlainStrings.setSize(new java.awt.Dimension(260, 90));
		jTextPanePlainStrings.setToolTipText("Enter the Plain Text");
		jTextPanePlainStrings.setVisible(false);
		jInternalFrameCypherText.setBorder(new javax.swing.plaf.BorderUIResource.BevelBorderUIResource(0));
		jInternalFrameCypherText.getContentPane().setLayout(null);
		jInternalFrameCypherText.setLocation(new java.awt.Point(560, 510));
		jInternalFrameCypherText.setSize(new java.awt.Dimension(260, 120));
		jInternalFrameCypherText.setTitle("Output");
		jInternalFrameCypherText.setVisible(true);
		jTextPaneCypherText.setEditable(false);
		jTextPaneCypherText.setLocation(new java.awt.Point(2, 2));
		jTextPaneCypherText.setSize(new java.awt.Dimension(258, 90));
		jTextPaneCypherText.setVisible(true);
		jTextPaneCypherStrings.setLocation(new java.awt.Point(2, 2));
		jTextPaneCypherStrings.setSize(new java.awt.Dimension(260, 90));
		jTextPaneCypherStrings.setToolTipText("Enter the Cypher text");
		jTextPaneCypherStrings.setVisible(false);
		jSlider1.setBackground(java.awt.Color.white);
		jSlider1.setLocation(new java.awt.Point(560, 480));
		jSlider1.setMajorTickSpacing(5);
		jSlider1.setMinimum(5);
		jSlider1.setPaintTicks(true);
		jSlider1.setSize(new java.awt.Dimension(260, 30));
		jSlider1.setToolTipText("Speed");
		jSlider1.setValue(60);
		jSlider1.setVisible(true);
		jLabelSlow.setBackground(java.awt.Color.white);
		jLabelSlow.setFont(new java.awt.Font("Dialog", 0, 9));
		jLabelSlow.setForeground(java.awt.Color.lightGray);
		jLabelSlow.setLocation(new java.awt.Point(560, 470));
		jLabelSlow.setSize(new java.awt.Dimension(40, 10));
		jLabelSlow.setText("SLOW");
		jLabelSlow.setVisible(true);
		jLabelFast.setBackground(java.awt.Color.white);
		jLabelFast.setFont(new java.awt.Font("Dialog", 0, 9));
		jLabelFast.setForeground(java.awt.Color.lightGray);
		jLabelFast.setLocation(new java.awt.Point(790, 470));
		jLabelFast.setSize(new java.awt.Dimension(30, 10));
		jLabelFast.setText("FAST");
		jLabelFast.setVisible(true);
		jLabelSpeed.setBackground(java.awt.Color.white);
		jLabelSpeed.setFont(new java.awt.Font("Dialog", 1, 10));
		jLabelSpeed.setForeground(java.awt.Color.lightGray);
		jLabelSpeed.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabelSpeed.setHorizontalTextPosition(javax.swing.JLabel.CENTER);
		jLabelSpeed.setLocation(new java.awt.Point(640, 470));
		jLabelSpeed.setSize(new java.awt.Dimension(100, 10));
		jLabelSpeed.setText("SPEED ( 60 )");
		jLabelSpeed.setVisible(true);
		jPanelActiveButtons.setBackground(java.awt.Color.white);
		jPanelActiveButtons.setLayout(null);
		jPanelActiveButtons.setLocation(new java.awt.Point(540, 72));
		jPanelActiveButtons.setSize(new java.awt.Dimension(290, 100));
		jPanelActiveButtons.setVisible(true);
		jLabelA.setBackground(new java.awt.Color(100, 100, 100));
		jLabelA.setBorder(new javax.swing.plaf.BorderUIResource.BevelBorderUIResource(0));
		jLabelA.setForeground(java.awt.Color.white);
		jLabelA.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabelA.setLocation(new java.awt.Point(10, 10));
		jLabelA.setOpaque(true);
		jLabelA.setSize(new java.awt.Dimension(20, 20));
		jLabelA.setText("a");
		jLabelA.setVisible(true);
		jLabelB.setBackground(new java.awt.Color(100, 100, 100));
		jLabelB.setBorder(new javax.swing.plaf.BorderUIResource.BevelBorderUIResource(0));
		jLabelB.setForeground(java.awt.Color.white);
		jLabelB.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabelB.setLocation(new java.awt.Point(40, 10));
		jLabelB.setOpaque(true);
		jLabelB.setSize(new java.awt.Dimension(20, 20));
		jLabelB.setText("b");
		jLabelB.setVisible(true);
		jLabelC.setBackground(new java.awt.Color(100, 100, 100));
		jLabelC.setBorder(new javax.swing.plaf.BorderUIResource.BevelBorderUIResource(0));
		jLabelC.setForeground(java.awt.Color.white);
		jLabelC.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabelC.setLocation(new java.awt.Point(70, 10));
		jLabelC.setOpaque(true);
		jLabelC.setSize(new java.awt.Dimension(20, 20));
		jLabelC.setText("c");
		jLabelC.setVisible(true);
		jLabelD.setBackground(new java.awt.Color(100, 100, 100));
		jLabelD.setBorder(new javax.swing.plaf.BorderUIResource.BevelBorderUIResource(0));
		jLabelD.setForeground(java.awt.Color.white);
		jLabelD.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabelD.setLocation(new java.awt.Point(100, 10));
		jLabelD.setOpaque(true);
		jLabelD.setSize(new java.awt.Dimension(20, 20));
		jLabelD.setText("d");
		jLabelD.setVisible(true);
		jLabelE.setBackground(new java.awt.Color(100, 100, 100));
		jLabelE.setBorder(new javax.swing.plaf.BorderUIResource.BevelBorderUIResource(0));
		jLabelE.setForeground(java.awt.Color.white);
		jLabelE.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabelE.setLocation(new java.awt.Point(130, 10));
		jLabelE.setOpaque(true);
		jLabelE.setSize(new java.awt.Dimension(20, 20));
		jLabelE.setText("e");
		jLabelE.setVisible(true);
		jLabelF.setBackground(new java.awt.Color(100, 100, 100));
		jLabelF.setBorder(new javax.swing.plaf.BorderUIResource.BevelBorderUIResource(0));
		jLabelF.setForeground(java.awt.Color.white);
		jLabelF.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabelF.setLocation(new java.awt.Point(160, 10));
		jLabelF.setOpaque(true);
		jLabelF.setSize(new java.awt.Dimension(20, 20));
		jLabelF.setText("f");
		jLabelF.setVisible(true);
		jLabelG.setBackground(new java.awt.Color(100, 100, 100));
		jLabelG.setBorder(new javax.swing.plaf.BorderUIResource.BevelBorderUIResource(0));
		jLabelG.setForeground(java.awt.Color.white);
		jLabelG.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabelG.setLocation(new java.awt.Point(190, 10));
		jLabelG.setOpaque(true);
		jLabelG.setSize(new java.awt.Dimension(20, 20));
		jLabelG.setText("g");
		jLabelG.setVisible(true);
		jLabelH.setBackground(new java.awt.Color(100, 100, 100));
		jLabelH.setBorder(new javax.swing.plaf.BorderUIResource.BevelBorderUIResource(0));
		jLabelH.setForeground(java.awt.Color.white);
		jLabelH.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabelH.setLocation(new java.awt.Point(220, 10));
		jLabelH.setOpaque(true);
		jLabelH.setSize(new java.awt.Dimension(20, 20));
		jLabelH.setText("h");
		jLabelH.setVisible(true);
		jLabelI.setBackground(new java.awt.Color(100, 100, 100));
		jLabelI.setBorder(new javax.swing.plaf.BorderUIResource.BevelBorderUIResource(0));
		jLabelI.setForeground(java.awt.Color.white);
		jLabelI.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabelI.setLocation(new java.awt.Point(250, 10));
		jLabelI.setOpaque(true);
		jLabelI.setSize(new java.awt.Dimension(20, 20));
		jLabelI.setText("i");
		jLabelI.setVisible(true);
		jLabelJ.setBackground(new java.awt.Color(100, 100, 100));
		jLabelJ.setBorder(new javax.swing.plaf.BorderUIResource.BevelBorderUIResource(0));
		jLabelJ.setForeground(java.awt.Color.white);
		jLabelJ.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabelJ.setLocation(new java.awt.Point(20, 40));
		jLabelJ.setOpaque(true);
		jLabelJ.setSize(new java.awt.Dimension(20, 20));
		jLabelJ.setText("j");
		jLabelJ.setVisible(true);
		jLabelK.setBackground(new java.awt.Color(100, 100, 100));
		jLabelK.setBorder(new javax.swing.plaf.BorderUIResource.BevelBorderUIResource(0));
		jLabelK.setForeground(java.awt.Color.white);
		jLabelK.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabelK.setLocation(new java.awt.Point(50, 40));
		jLabelK.setOpaque(true);
		jLabelK.setSize(new java.awt.Dimension(20, 20));
		jLabelK.setText("k");
		jLabelK.setVisible(true);
		jLabelL.setBackground(new java.awt.Color(100, 100, 100));
		jLabelL.setBorder(new javax.swing.plaf.BorderUIResource.BevelBorderUIResource(0));
		jLabelL.setForeground(java.awt.Color.white);
		jLabelL.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabelL.setLocation(new java.awt.Point(80, 40));
		jLabelL.setOpaque(true);
		jLabelL.setSize(new java.awt.Dimension(20, 20));
		jLabelL.setText("l");
		jLabelL.setVisible(true);
		jLabelM.setBackground(new java.awt.Color(100, 100, 100));
		jLabelM.setBorder(new javax.swing.plaf.BorderUIResource.BevelBorderUIResource(0));
		jLabelM.setForeground(java.awt.Color.white);
		jLabelM.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabelM.setLocation(new java.awt.Point(110, 40));
		jLabelM.setOpaque(true);
		jLabelM.setSize(new java.awt.Dimension(20, 20));
		jLabelM.setText("m");
		jLabelM.setVisible(true);
		jLabelN.setBackground(new java.awt.Color(100, 100, 100));
		jLabelN.setBorder(new javax.swing.plaf.BorderUIResource.BevelBorderUIResource(0));
		jLabelN.setForeground(java.awt.Color.white);
		jLabelN.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabelN.setLocation(new java.awt.Point(140, 40));
		jLabelN.setOpaque(true);
		jLabelN.setSize(new java.awt.Dimension(20, 20));
		jLabelN.setText("n");
		jLabelN.setVisible(true);
		jLabelO.setBackground(new java.awt.Color(100, 100, 100));
		jLabelO.setBorder(new javax.swing.plaf.BorderUIResource.BevelBorderUIResource(0));
		jLabelO.setForeground(java.awt.Color.white);
		jLabelO.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabelO.setLocation(new java.awt.Point(170, 40));
		jLabelO.setOpaque(true);
		jLabelO.setSize(new java.awt.Dimension(20, 20));
		jLabelO.setText("o");
		jLabelO.setVisible(true);
		jLabelP.setBackground(new java.awt.Color(100, 100, 100));
		jLabelP.setBorder(new javax.swing.plaf.BorderUIResource.BevelBorderUIResource(0));
		jLabelP.setForeground(java.awt.Color.white);
		jLabelP.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabelP.setLocation(new java.awt.Point(200, 40));
		jLabelP.setOpaque(true);
		jLabelP.setSize(new java.awt.Dimension(20, 20));
		jLabelP.setText("p");
		jLabelP.setVisible(true);
		jLabelQ.setBackground(new java.awt.Color(100, 100, 100));
		jLabelQ.setBorder(new javax.swing.plaf.BorderUIResource.BevelBorderUIResource(0));
		jLabelQ.setForeground(java.awt.Color.white);
		jLabelQ.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabelQ.setLocation(new java.awt.Point(230, 40));
		jLabelQ.setOpaque(true);
		jLabelQ.setSize(new java.awt.Dimension(20, 20));
		jLabelQ.setText("q");
		jLabelQ.setVisible(true);
		jLabelR.setBackground(new java.awt.Color(100, 100, 100));
		jLabelR.setBorder(new javax.swing.plaf.BorderUIResource.BevelBorderUIResource(0));
		jLabelR.setForeground(java.awt.Color.white);
		jLabelR.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabelR.setLocation(new java.awt.Point(10, 70));
		jLabelR.setOpaque(true);
		jLabelR.setSize(new java.awt.Dimension(20, 20));
		jLabelR.setText("r");
		jLabelR.setVisible(true);
		jLabelS.setBackground(new java.awt.Color(100, 100, 100));
		jLabelS.setBorder(new javax.swing.plaf.BorderUIResource.BevelBorderUIResource(0));
		jLabelS.setForeground(java.awt.Color.white);
		jLabelS.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabelS.setLocation(new java.awt.Point(40, 70));
		jLabelS.setOpaque(true);
		jLabelS.setSize(new java.awt.Dimension(20, 20));
		jLabelS.setText("s");
		jLabelS.setVisible(true);
		jLabelT.setBackground(new java.awt.Color(100, 100, 100));
		jLabelT.setBorder(new javax.swing.plaf.BorderUIResource.BevelBorderUIResource(0));
		jLabelT.setForeground(java.awt.Color.white);
		jLabelT.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabelT.setLocation(new java.awt.Point(70, 70));
		jLabelT.setOpaque(true);
		jLabelT.setSize(new java.awt.Dimension(20, 20));
		jLabelT.setText("t");
		jLabelT.setVisible(true);
		jLabelU.setBackground(new java.awt.Color(100, 100, 100));
		jLabelU.setBorder(new javax.swing.plaf.BorderUIResource.BevelBorderUIResource(0));
		jLabelU.setForeground(java.awt.Color.white);
		jLabelU.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabelU.setLocation(new java.awt.Point(100, 70));
		jLabelU.setOpaque(true);
		jLabelU.setSize(new java.awt.Dimension(20, 20));
		jLabelU.setText("u");
		jLabelU.setVisible(true);
		jLabelV.setBackground(new java.awt.Color(100, 100, 100));
		jLabelV.setBorder(new javax.swing.plaf.BorderUIResource.BevelBorderUIResource(0));
		jLabelV.setForeground(java.awt.Color.white);
		jLabelV.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabelV.setLocation(new java.awt.Point(130, 70));
		jLabelV.setOpaque(true);
		jLabelV.setSize(new java.awt.Dimension(20, 20));
		jLabelV.setText("v");
		jLabelV.setVisible(true);
		jLabelW.setBackground(new java.awt.Color(100, 100, 100));
		jLabelW.setBorder(new javax.swing.plaf.BorderUIResource.BevelBorderUIResource(0));
		jLabelW.setForeground(java.awt.Color.white);
		jLabelW.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabelW.setLocation(new java.awt.Point(160, 70));
		jLabelW.setOpaque(true);
		jLabelW.setSize(new java.awt.Dimension(20, 20));
		jLabelW.setText("w");
		jLabelW.setVisible(true);
		jLabelX.setBackground(new java.awt.Color(100, 100, 100));
		jLabelX.setBorder(new javax.swing.plaf.BorderUIResource.BevelBorderUIResource(0));
		jLabelX.setForeground(java.awt.Color.white);
		jLabelX.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabelX.setLocation(new java.awt.Point(190, 70));
		jLabelX.setOpaque(true);
		jLabelX.setSize(new java.awt.Dimension(20, 20));
		jLabelX.setText("x");
		jLabelX.setVisible(true);
		jLabelY.setBackground(new java.awt.Color(100, 100, 100));
		jLabelY.setBorder(new javax.swing.plaf.BorderUIResource.BevelBorderUIResource(0));
		jLabelY.setForeground(java.awt.Color.white);
		jLabelY.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabelY.setLocation(new java.awt.Point(220, 70));
		jLabelY.setOpaque(true);
		jLabelY.setSize(new java.awt.Dimension(20, 20));
		jLabelY.setText("y");
		jLabelY.setVisible(true);
		jLabelZ.setBackground(new java.awt.Color(100, 100, 100));
		jLabelZ.setBorder(new javax.swing.plaf.BorderUIResource.BevelBorderUIResource(0));
		jLabelZ.setForeground(java.awt.Color.white);
		jLabelZ.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabelZ.setLocation(new java.awt.Point(250, 70));
		jLabelZ.setOpaque(true);
		jLabelZ.setSize(new java.awt.Dimension(20, 20));
		jLabelZ.setText("z");
		jLabelZ.setVisible(true);
		jPanelInactiveButtons.setBackground(java.awt.Color.white);
		jPanelInactiveButtons.setLayout(null);
		jPanelInactiveButtons.setLocation(new java.awt.Point(540, 72));
		jPanelInactiveButtons.setSize(new java.awt.Dimension(290, 100));
		jPanelInactiveButtons.setVisible(false);
		jLabel_A.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
		jLabel_A.setFocusCycleRoot(true);
		jLabel_A.setForeground(java.awt.Color.darkGray);
		jLabel_A.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabel_A.setLocation(new java.awt.Point(9, 10));
		jLabel_A.setOpaque(true);
		jLabel_A.setSize(new java.awt.Dimension(20, 20));
		jLabel_A.setText("a");
		jLabel_A.setVisible(true);
		jLabel_J.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
		jLabel_J.setFocusCycleRoot(true);
		jLabel_J.setForeground(java.awt.Color.darkGray);
		jLabel_J.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabel_J.setLocation(new java.awt.Point(19, 40));
		jLabel_J.setOpaque(true);
		jLabel_J.setSize(new java.awt.Dimension(20, 20));
		jLabel_J.setText("j");
		jLabel_J.setVisible(true);
		jLabel_R.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
		jLabel_R.setFocusCycleRoot(true);
		jLabel_R.setForeground(java.awt.Color.darkGray);
		jLabel_R.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabel_R.setLocation(new java.awt.Point(9, 70));
		jLabel_R.setOpaque(true);
		jLabel_R.setSize(new java.awt.Dimension(20, 20));
		jLabel_R.setText("r");
		jLabel_R.setVisible(true);
		jLabel_S.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
		jLabel_S.setFocusCycleRoot(true);
		jLabel_S.setForeground(java.awt.Color.darkGray);
		jLabel_S.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabel_S.setLocation(new java.awt.Point(39, 70));
		jLabel_S.setOpaque(true);
		jLabel_S.setSize(new java.awt.Dimension(20, 20));
		jLabel_S.setText("s");
		jLabel_S.setVisible(true);
		jLabel_K.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
		jLabel_K.setFocusCycleRoot(true);
		jLabel_K.setForeground(java.awt.Color.darkGray);
		jLabel_K.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabel_K.setLocation(new java.awt.Point(49, 40));
		jLabel_K.setOpaque(true);
		jLabel_K.setSize(new java.awt.Dimension(20, 20));
		jLabel_K.setText("k");
		jLabel_K.setVisible(true);
		jLabel_B.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
		jLabel_B.setFocusCycleRoot(true);
		jLabel_B.setForeground(java.awt.Color.darkGray);
		jLabel_B.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabel_B.setLocation(new java.awt.Point(39, 10));
		jLabel_B.setOpaque(true);
		jLabel_B.setSize(new java.awt.Dimension(20, 20));
		jLabel_B.setText("b");
		jLabel_B.setVisible(true);
		jLabel_C.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
		jLabel_C.setFocusCycleRoot(true);
		jLabel_C.setForeground(java.awt.Color.darkGray);
		jLabel_C.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabel_C.setLocation(new java.awt.Point(69, 10));
		jLabel_C.setOpaque(true);
		jLabel_C.setSize(new java.awt.Dimension(20, 20));
		jLabel_C.setText("c");
		jLabel_C.setVisible(true);
		jLabel_L.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
		jLabel_L.setFocusCycleRoot(true);
		jLabel_L.setForeground(java.awt.Color.darkGray);
		jLabel_L.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabel_L.setLocation(new java.awt.Point(79, 40));
		jLabel_L.setOpaque(true);
		jLabel_L.setSize(new java.awt.Dimension(20, 20));
		jLabel_L.setText("l");
		jLabel_L.setVisible(true);
		jLabel_T.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
		jLabel_T.setFocusCycleRoot(true);
		jLabel_T.setForeground(java.awt.Color.darkGray);
		jLabel_T.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabel_T.setLocation(new java.awt.Point(69, 70));
		jLabel_T.setOpaque(true);
		jLabel_T.setSize(new java.awt.Dimension(20, 20));
		jLabel_T.setText("t");
		jLabel_T.setVisible(true);
		jLabel_U.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
		jLabel_U.setFocusCycleRoot(true);
		jLabel_U.setForeground(java.awt.Color.darkGray);
		jLabel_U.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabel_U.setLocation(new java.awt.Point(99, 70));
		jLabel_U.setOpaque(true);
		jLabel_U.setSize(new java.awt.Dimension(20, 20));
		jLabel_U.setText("u");
		jLabel_U.setVisible(true);
		jLabel_V.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
		jLabel_V.setFocusCycleRoot(true);
		jLabel_V.setForeground(java.awt.Color.darkGray);
		jLabel_V.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabel_V.setLocation(new java.awt.Point(129, 70));
		jLabel_V.setOpaque(true);
		jLabel_V.setSize(new java.awt.Dimension(20, 20));
		jLabel_V.setText("v");
		jLabel_V.setVisible(true);
		jLabel_W.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
		jLabel_W.setFocusCycleRoot(true);
		jLabel_W.setForeground(java.awt.Color.darkGray);
		jLabel_W.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabel_W.setLocation(new java.awt.Point(159, 70));
		jLabel_W.setOpaque(true);
		jLabel_W.setSize(new java.awt.Dimension(20, 20));
		jLabel_W.setText("w");
		jLabel_W.setVisible(true);
		jLabel_X.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
		jLabel_X.setFocusCycleRoot(true);
		jLabel_X.setForeground(java.awt.Color.darkGray);
		jLabel_X.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabel_X.setLocation(new java.awt.Point(189, 70));
		jLabel_X.setOpaque(true);
		jLabel_X.setSize(new java.awt.Dimension(20, 20));
		jLabel_X.setText("x");
		jLabel_X.setVisible(true);
		jLabel_Y.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
		jLabel_Y.setFocusCycleRoot(true);
		jLabel_Y.setForeground(java.awt.Color.darkGray);
		jLabel_Y.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabel_Y.setLocation(new java.awt.Point(219, 70));
		jLabel_Y.setOpaque(true);
		jLabel_Y.setSize(new java.awt.Dimension(20, 20));
		jLabel_Y.setText("y");
		jLabel_Y.setVisible(true);
		jLabel_Z.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
		jLabel_Z.setFocusCycleRoot(true);
		jLabel_Z.setForeground(java.awt.Color.darkGray);
		jLabel_Z.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabel_Z.setLocation(new java.awt.Point(249, 70));
		jLabel_Z.setOpaque(true);
		jLabel_Z.setSize(new java.awt.Dimension(20, 20));
		jLabel_Z.setText("z");
		jLabel_Z.setVisible(true);
		jLabel_M.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
		jLabel_M.setFocusCycleRoot(true);
		jLabel_M.setForeground(java.awt.Color.darkGray);
		jLabel_M.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabel_M.setLocation(new java.awt.Point(109, 40));
		jLabel_M.setOpaque(true);
		jLabel_M.setSize(new java.awt.Dimension(20, 20));
		jLabel_M.setText("m");
		jLabel_M.setVisible(true);
		jLabel_N.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
		jLabel_N.setFocusCycleRoot(true);
		jLabel_N.setForeground(java.awt.Color.darkGray);
		jLabel_N.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabel_N.setLocation(new java.awt.Point(139, 40));
		jLabel_N.setOpaque(true);
		jLabel_N.setSize(new java.awt.Dimension(20, 20));
		jLabel_N.setText("n");
		jLabel_N.setVisible(true);
		jLabel_O.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
		jLabel_O.setFocusCycleRoot(true);
		jLabel_O.setForeground(java.awt.Color.darkGray);
		jLabel_O.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabel_O.setLocation(new java.awt.Point(169, 40));
		jLabel_O.setOpaque(true);
		jLabel_O.setSize(new java.awt.Dimension(20, 20));
		jLabel_O.setText("o");
		jLabel_O.setVisible(true);
		jLabel_P.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
		jLabel_P.setFocusCycleRoot(true);
		jLabel_P.setForeground(java.awt.Color.darkGray);
		jLabel_P.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabel_P.setLocation(new java.awt.Point(199, 40));
		jLabel_P.setOpaque(true);
		jLabel_P.setSize(new java.awt.Dimension(20, 20));
		jLabel_P.setText("p");
		jLabel_P.setVisible(true);
		jLabel_Q.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
		jLabel_Q.setFocusCycleRoot(true);
		jLabel_Q.setForeground(java.awt.Color.darkGray);
		jLabel_Q.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabel_Q.setLocation(new java.awt.Point(229, 40));
		jLabel_Q.setOpaque(true);
		jLabel_Q.setSize(new java.awt.Dimension(20, 20));
		jLabel_Q.setText("q");
		jLabel_Q.setVisible(true);
		jLabel_D.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
		jLabel_D.setFocusCycleRoot(true);
		jLabel_D.setForeground(java.awt.Color.darkGray);
		jLabel_D.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabel_D.setLocation(new java.awt.Point(99, 10));
		jLabel_D.setOpaque(true);
		jLabel_D.setSize(new java.awt.Dimension(20, 20));
		jLabel_D.setText("d");
		jLabel_D.setVisible(true);
		jLabel_E.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
		jLabel_E.setFocusCycleRoot(true);
		jLabel_E.setForeground(java.awt.Color.darkGray);
		jLabel_E.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabel_E.setLocation(new java.awt.Point(129, 10));
		jLabel_E.setOpaque(true);
		jLabel_E.setSize(new java.awt.Dimension(20, 20));
		jLabel_E.setText("e");
		jLabel_E.setVisible(true);
		jLabel_F.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
		jLabel_F.setFocusCycleRoot(true);
		jLabel_F.setForeground(java.awt.Color.darkGray);
		jLabel_F.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabel_F.setLocation(new java.awt.Point(159, 10));
		jLabel_F.setOpaque(true);
		jLabel_F.setSize(new java.awt.Dimension(20, 20));
		jLabel_F.setText("f");
		jLabel_F.setVisible(true);
		jLabel_G.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
		jLabel_G.setFocusCycleRoot(true);
		jLabel_G.setForeground(java.awt.Color.darkGray);
		jLabel_G.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabel_G.setLocation(new java.awt.Point(189, 10));
		jLabel_G.setOpaque(true);
		jLabel_G.setSize(new java.awt.Dimension(20, 20));
		jLabel_G.setText("g");
		jLabel_G.setVisible(true);
		jLabel_H.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
		jLabel_H.setFocusCycleRoot(true);
		jLabel_H.setForeground(java.awt.Color.darkGray);
		jLabel_H.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabel_H.setLocation(new java.awt.Point(219, 10));
		jLabel_H.setOpaque(true);
		jLabel_H.setSize(new java.awt.Dimension(20, 20));
		jLabel_H.setText("h");
		jLabel_H.setVisible(true);
		jLabel_I.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
		jLabel_I.setFocusCycleRoot(true);
		jLabel_I.setForeground(java.awt.Color.darkGray);
		jLabel_I.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabel_I.setLocation(new java.awt.Point(249, 10));
		jLabel_I.setOpaque(true);
		jLabel_I.setSize(new java.awt.Dimension(20, 20));
		jLabel_I.setText("i");
		jLabel_I.setVisible(true);
		jTextPane1.setLocation(new java.awt.Point(510, 208));
		jTextPane1.setSize(new java.awt.Dimension(310, 22));
		jTextPane1.setText("Choose the Initial Rottor Positions and Click ");
		jTextPane1.setVisible(true);
		jLabelStopAtEndcharacter.setForeground(java.awt.Color.lightGray);
		jLabelStopAtEndcharacter.setLocation(new java.awt.Point(560, 440));
		jLabelStopAtEndcharacter.setSize(new java.awt.Dimension(200, 20));
		jLabelStopAtEndcharacter.setText("Stop at the end of the character");
		jLabelStopAtEndcharacter.setVisible(true);
		jLabelCountinue.setForeground(java.awt.Color.red);
		jLabelCountinue.setLocation(new java.awt.Point(560, 440));
		jLabelCountinue.setSize(new java.awt.Dimension(200, 20));
		jLabelCountinue.setText("Countinue");
		jLabelCountinue.setVisible(false);
		jButtonencrypt.setBorder(new javax.swing.plaf.BorderUIResource.BevelBorderUIResource(0));
		jButtonencrypt.setLocation(new java.awt.Point(560, 390));
		jButtonencrypt.setSize(new java.awt.Dimension(90, 20));
		jButtonencrypt.setText("Start");
		jButtonencrypt.setVisible(false);
		jLabelStrings.setForeground(java.awt.Color.lightGray);
		jLabelStrings.setLocation(new java.awt.Point(560, 420));
		jLabelStrings.setSize(new java.awt.Dimension(200, 20));
		jLabelStrings.setText("Work with Strings");
		jLabelStrings.setToolTipText("Click to work with Strings");
		jLabelStrings.setVisible(true);
		jLabelCharacters.setForeground(java.awt.Color.lightGray);
		jLabelCharacters.setLocation(new java.awt.Point(560, 420));
		jLabelCharacters.setSize(new java.awt.Dimension(200, 20));
		jLabelCharacters.setText("Work with Characters");
		jLabelCharacters.setToolTipText("Click to work with Characters");
		jLabelCharacters.setVisible(false);
		jPanelRotor1.setBackground(new java.awt.Color(225, 225, 225));
		jPanelRotor1.setBorder(new javax.swing.border.LineBorder(java.awt.Color.lightGray, 2, true));
		jPanelRotor1.setLayout(null);
		jPanelRotor1.setLocation(new java.awt.Point(45, 85));
		jPanelRotor1.setSize(new java.awt.Dimension(110, 527));
		jPanelRotor1.setVisible(true);
		jPanelRotor2.setBackground(new java.awt.Color(225, 225, 225));
		jPanelRotor2.setBorder(new javax.swing.border.LineBorder(java.awt.Color.lightGray, 2, true));
		jPanelRotor2.setLayout(null);
		jPanelRotor2.setLocation(new java.awt.Point(205, 85));
		jPanelRotor2.setSize(new java.awt.Dimension(110, 527));
		jPanelRotor2.setVisible(true);
		jPanelRotor3.setBackground(new java.awt.Color(225, 225, 225));
		jPanelRotor3.setBorder(new javax.swing.border.LineBorder(java.awt.Color.lightGray, 2, true));
		jPanelRotor3.setLayout(null);
		jPanelRotor3.setLocation(new java.awt.Point(365, 85));
		jPanelRotor3.setSize(new java.awt.Dimension(110, 527));
		jPanelRotor3.setVisible(true);
		getContentPane().setLayout(null);
		setLocation(new java.awt.Point(0, 0));

		jPanelMain.add(jLabelTitle);
		jPanelMain.add(jButtonReset);
		jPanelMain.add(jInternalFramePlainText);
		jPanelMain.add(jInternalFrameCypherText);
		jPanelMain.add(jSlider1);
		jPanelMain.add(jLabelSlow);
		jPanelMain.add(jLabelFast);
		jPanelMain.add(jLabelSpeed);
		jPanelMain.add(jPanelActiveButtons);
		jPanelMain.add(jPanelInactiveButtons);
		jPanelMain.add(jTextPane1);
		jPanelMain.add(jLabelStopAtEndcharacter);
		jPanelMain.add(jLabelCountinue);
		jPanelMain.add(jButtonencrypt);
		jPanelMain.add(jLabelStrings);
		jPanelMain.add(jLabelCharacters);
		jPanelMain.add(jPanelRotor1);
		jPanelMain.add(jPanelRotor2);
		jPanelMain.add(jPanelRotor3);
		jInternalFramePlainText.getContentPane().add(jTextPanePlaintext);
		jInternalFramePlainText.getContentPane().add(jTextPanePlainStrings);
		jInternalFrameCypherText.getContentPane().add(jTextPaneCypherText);
		jInternalFrameCypherText.getContentPane().add(jTextPaneCypherStrings);
		jPanelActiveButtons.add(jLabelA);
		jPanelActiveButtons.add(jLabelB);
		jPanelActiveButtons.add(jLabelC);
		jPanelActiveButtons.add(jLabelD);
		jPanelActiveButtons.add(jLabelE);
		jPanelActiveButtons.add(jLabelF);
		jPanelActiveButtons.add(jLabelG);
		jPanelActiveButtons.add(jLabelH);
		jPanelActiveButtons.add(jLabelI);
		jPanelActiveButtons.add(jLabelJ);
		jPanelActiveButtons.add(jLabelK);
		jPanelActiveButtons.add(jLabelL);
		jPanelActiveButtons.add(jLabelM);
		jPanelActiveButtons.add(jLabelN);
		jPanelActiveButtons.add(jLabelO);
		jPanelActiveButtons.add(jLabelP);
		jPanelActiveButtons.add(jLabelQ);
		jPanelActiveButtons.add(jLabelR);
		jPanelActiveButtons.add(jLabelS);
		jPanelActiveButtons.add(jLabelT);
		jPanelActiveButtons.add(jLabelU);
		jPanelActiveButtons.add(jLabelV);
		jPanelActiveButtons.add(jLabelW);
		jPanelActiveButtons.add(jLabelX);
		jPanelActiveButtons.add(jLabelY);
		jPanelActiveButtons.add(jLabelZ);
		jPanelInactiveButtons.add(jLabel_A);
		jPanelInactiveButtons.add(jLabel_J);
		jPanelInactiveButtons.add(jLabel_R);
		jPanelInactiveButtons.add(jLabel_S);
		jPanelInactiveButtons.add(jLabel_K);
		jPanelInactiveButtons.add(jLabel_B);
		jPanelInactiveButtons.add(jLabel_C);
		jPanelInactiveButtons.add(jLabel_L);
		jPanelInactiveButtons.add(jLabel_T);
		jPanelInactiveButtons.add(jLabel_U);
		jPanelInactiveButtons.add(jLabel_V);
		jPanelInactiveButtons.add(jLabel_W);
		jPanelInactiveButtons.add(jLabel_X);
		jPanelInactiveButtons.add(jLabel_Y);
		jPanelInactiveButtons.add(jLabel_Z);
		jPanelInactiveButtons.add(jLabel_M);
		jPanelInactiveButtons.add(jLabel_N);
		jPanelInactiveButtons.add(jLabel_O);
		jPanelInactiveButtons.add(jLabel_P);
		jPanelInactiveButtons.add(jLabel_Q);
		jPanelInactiveButtons.add(jLabel_D);
		jPanelInactiveButtons.add(jLabel_E);
		jPanelInactiveButtons.add(jLabel_F);
		jPanelInactiveButtons.add(jLabel_G);
		jPanelInactiveButtons.add(jLabel_H);
		jPanelInactiveButtons.add(jLabel_I);
		getContentPane().add(jPanelMain);

		setSize(new java.awt.Dimension(850, 635));

		// event handling
		jButtonReset.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonResetMouseClicked(e);
			}
		});
		jTextPanePlaintext.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent e) {
				jTextPanePlaintextKeyTyped(e);
			}
		});
		jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent e) {
				jSlider1StateChanged(e);
			}
		});
		jLabelA.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jLabelAMouseClicked(e);
			}
		});
		jLabelB.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jLabelBMouseClicked(e);
			}
		});
		jLabelC.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jLabelCMouseClicked(e);
			}
		});
		jLabelD.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jLabelDMouseClicked(e);
			}
		});
		jLabelE.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jLabelEMouseClicked(e);
			}
		});
		jLabelF.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jLabelFMouseClicked(e);
			}
		});
		jLabelG.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jLabelGMouseClicked(e);
			}
		});
		jLabelH.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jLabelHMouseClicked(e);
			}
		});
		jLabelI.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jLabelIMouseClicked(e);
			}
		});
		jLabelJ.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jLabelJMouseClicked(e);
			}
		});
		jLabelK.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jLabelKMouseClicked(e);
			}
		});
		jLabelL.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jLabelLMouseClicked(e);
			}
		});
		jLabelM.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jLabelMMouseClicked(e);
			}
		});
		jLabelN.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jLabelNMouseClicked(e);
			}
		});
		jLabelO.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jLabelOMouseClicked(e);
			}
		});
		jLabelP.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jLabelPMouseClicked(e);
			}
		});
		jLabelQ.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jLabelQMouseClicked(e);
			}
		});
		jLabelR.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jLabelRMouseClicked(e);
			}
		});
		jLabelS.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jLabelSMouseClicked(e);
			}
		});
		jLabelT.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jLabelTMouseClicked(e);
			}
		});
		jLabelU.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jLabelUMouseClicked(e);
			}
		});
		jLabelV.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jLabelVMouseClicked(e);
			}
		});
		jLabelW.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jLabelWMouseClicked(e);
			}
		});
		jLabelX.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jLabelXMouseClicked(e);
			}
		});
		jLabelY.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jLabelYMouseClicked(e);
			}
		});
		jLabelZ.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jLabelZMouseClicked(e);
			}
		});
		jLabelStopAtEndcharacter.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jLabelStopAtEndcharacterMouseClicked(e);
			}
			public void mouseExited(java.awt.event.MouseEvent e) {
				jLabelStopAtEndcharacterMouseExited(e);
			}
		});
		jLabelStopAtEndcharacter.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
			public void mouseMoved(java.awt.event.MouseEvent e) {
				jLabelStopAtEndcharacterMouseMoved(e);
			}
		});
		jLabelCountinue.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jLabelCountinueMouseClicked(e);
			}
			public void mouseExited(java.awt.event.MouseEvent e) {
				jLabelCountinueMouseExited(e);
			}
		});
		jLabelCountinue.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
			public void mouseMoved(java.awt.event.MouseEvent e) {
				jLabelCountinueMouseMoved(e);
			}
		});
		jButtonencrypt.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonencryptMouseClicked(e);
			}
		});
		jLabelStrings.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jLabelStringsMouseClicked(e);
			}
			public void mouseEntered(java.awt.event.MouseEvent e) {
				jLabelStringsMouseEntered(e);
			}
			public void mouseExited(java.awt.event.MouseEvent e) {
				jLabelStringsMouseExited(e);
			}
		});
		jLabelCharacters.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jLabelCharactersMouseClicked(e);
			}
			public void mouseEntered(java.awt.event.MouseEvent e) {
				jLabelCharactersMouseEntered(e);
			}
			public void mouseExited(java.awt.event.MouseEvent e) {
				jLabelCharactersMouseExited(e);
			}
		});
		addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent e) {
				thisKeyTyped(e);
			}
		});

// END GENERATED CODE
		jComboBox1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				jComboBox1ActionPerformed(e);
			}
		});
		jComboBox2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				jComboBox2ActionPerformed(e);
			}
		});
		jComboBox3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				jComboBox3ActionPerformed(e);
			}
		});
		jComboBox1.setLocation(new java.awt.Point(590, 180));
		jComboBox1.setMaximumRowCount(26);
		jComboBox1.setSelectedIndex(0);
		jComboBox1.setSize(new java.awt.Dimension(50, 20));
		jComboBox1.setBackground(java.awt.Color.white);
		jComboBox1.setVisible(true);
		jPanelMain.add(jComboBox1);
		jComboBox2.setLocation(new java.awt.Point(665, 180));
		jComboBox2.setMaximumRowCount(26);
		jComboBox2.setSelectedIndex(0);
		jComboBox2.setSize(new java.awt.Dimension(50, 20));
		jComboBox2.setBackground(java.awt.Color.white);
		jComboBox2.setVisible(true);
		jPanelMain.add(jComboBox2);
		jComboBox3.setLocation(new java.awt.Point(740, 180));
		jComboBox3.setMaximumRowCount(26);
		jComboBox3.setSelectedIndex(0);
		jComboBox3.setSize(new java.awt.Dimension(50, 20));
		jComboBox3.setBackground(java.awt.Color.white);
		jComboBox3.setVisible(true);
		jPanelMain.add(jComboBox3);
		ButtonGroup group = new ButtonGroup();
		
	    
	    row01Point = new Point[26];
		row02Point = new Point[26];
		row03Point = new Point[26];	
		row11Point = new Point[26];
		row12Point = new Point[26];
		row13Point = new Point[26];	
	    row01Labels=new javax.swing.JLabel[26];
		row02Labels=new javax.swing.JLabel[26];
		row03Labels=new javax.swing.JLabel[26];
		row11Labels=new javax.swing.JLabel[26];
		row12Labels=new javax.swing.JLabel[26];
		row13Labels=new javax.swing.JLabel[26];
	
	for (int i=0;i<26;i++)
		{
		row01Labels[i] = new javax.swing.JLabel(); 
		row01Labels[i].setBackground(java.awt.Color.white);
		row01Labels[i].setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(110, 110, 110)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178,178, 178))));
		row01Labels[i].setForeground(java.awt.Color.darkGray);
		row01Labels[i].setHorizontalAlignment(javax.swing.JLabel.CENTER);
		row01Labels[i].setLocation(new java.awt.Point(5, 5+i*20));
		row01Labels[i].setOpaque(false);
		row01Labels[i].setSize(new java.awt.Dimension(40, 20));
		row01Labels[i].setText(row1chars[i]);
		row01Labels[i].setVisible(true);
		jPanelRotor1.add(row01Labels[i]);
		
		row11Labels[i] = new javax.swing.JLabel(); 
		row11Labels[i].setBackground(java.awt.Color.white);
		row11Labels[i].setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(110, 110, 110)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178))));
		row11Labels[i].setForeground(java.awt.Color.darkGray);
		row11Labels[i].setHorizontalAlignment(javax.swing.JLabel.CENTER);
		row11Labels[i].setLocation(new java.awt.Point(65, 5+i*20));
		row11Labels[i].setOpaque(false);
		row11Labels[i].setSize(new java.awt.Dimension(40, 20));
		row11Labels[i].setText(chars[i]);
		row11Labels[i].setVisible(true);
		jPanelRotor1.add(row11Labels[i]);
		
		row02Labels[i] = new javax.swing.JLabel(); 
		row02Labels[i].setBackground(java.awt.Color.white);
		row02Labels[i].setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(110, 110, 110)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178))));
		row02Labels[i].setForeground(java.awt.Color.darkGray);
		row02Labels[i].setHorizontalAlignment(javax.swing.JLabel.CENTER);
		row02Labels[i].setLocation(new java.awt.Point(5, 5+i*20));
		row02Labels[i].setOpaque(false);
		row02Labels[i].setSize(new java.awt.Dimension(40, 20));
		row02Labels[i].setText(row2chars[i]);
		row02Labels[i].setVisible(true);
		jPanelRotor2.add(row02Labels[i]);
		
		row12Labels[i] = new javax.swing.JLabel(); 
		row12Labels[i].setBackground(java.awt.Color.white);
		row12Labels[i].setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(110, 110, 110)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178))));
		row12Labels[i].setForeground(java.awt.Color.darkGray);
		row12Labels[i].setHorizontalAlignment(javax.swing.JLabel.CENTER);
		row12Labels[i].setLocation(new java.awt.Point(65, 5+i*20));
		row12Labels[i].setOpaque(false);
		row12Labels[i].setSize(new java.awt.Dimension(40, 20));
		row12Labels[i].setText(chars[i]);
		row12Labels[i].setVisible(true);
		jPanelRotor2.add(row12Labels[i]);
		
		row03Labels[i] = new javax.swing.JLabel(); 
		row03Labels[i].setBackground(java.awt.Color.white);
		row03Labels[i].setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(110, 110, 110)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178))));
		row03Labels[i].setForeground(java.awt.Color.darkGray);
		row03Labels[i].setHorizontalAlignment(javax.swing.JLabel.CENTER);
		row03Labels[i].setLocation(new java.awt.Point(5, 5+i*20));
		row03Labels[i].setOpaque(false);
		row03Labels[i].setSize(new java.awt.Dimension(40, 20));
		row03Labels[i].setText(row3chars[i]);
		row03Labels[i].setVisible(true);
		jPanelRotor3.add(row03Labels[i]);
		
		row13Labels[i] = new javax.swing.JLabel(); 
		row13Labels[i].setBackground(java.awt.Color.white);
		row13Labels[i].setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(110, 110, 110)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178))));
		row13Labels[i].setForeground(java.awt.Color.darkGray);
		row13Labels[i].setHorizontalAlignment(javax.swing.JLabel.CENTER);
		row13Labels[i].setLocation(new java.awt.Point(65, 5+i*20));
		row13Labels[i].setOpaque(false);
		row13Labels[i].setSize(new java.awt.Dimension(40, 20));
		row13Labels[i].setText(chars[i]);
		row13Labels[i].setVisible(true);
		jPanelRotor3.add(row13Labels[i]);
	}
		
		row01Labeltemp = new javax.swing.JLabel(); 
		row01Labeltemp.setBackground(java.awt.Color.white);
		row01Labeltemp.setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(110, 110, 110)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178))));
		row01Labeltemp.setForeground(java.awt.Color.darkGray);
		row01Labeltemp.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		row01Labeltemp.setLocation(new java.awt.Point(5, 525));		
		row01Labeltemp.setOpaque(false);
		row01Labeltemp.setSize(new java.awt.Dimension(40, 20));
		row01Labeltemp.setVisible(false);
		jPanelRotor1.add(row01Labeltemp);
		
		row11Labeltemp = new javax.swing.JLabel(); 
		row11Labeltemp.setBackground(java.awt.Color.white);
		row11Labeltemp.setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(110, 110, 110)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178))));
		row11Labeltemp.setForeground(java.awt.Color.darkGray);
		row11Labeltemp.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		row11Labeltemp.setLocation(new java.awt.Point(65, 525));		
		row11Labeltemp.setOpaque(false);
		row11Labeltemp.setSize(new java.awt.Dimension(40, 20));
		row11Labeltemp.setVisible(false);
		jPanelRotor1.add(row11Labeltemp);
		
		row02Labeltemp = new javax.swing.JLabel(); 
		row02Labeltemp.setBackground(java.awt.Color.white);
		row02Labeltemp.setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(110, 110, 110)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178))));
		row02Labeltemp.setForeground(java.awt.Color.darkGray);
		row02Labeltemp.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		row02Labeltemp.setLocation(new java.awt.Point(5, 525));		
		row02Labeltemp.setOpaque(false);
		row02Labeltemp.setSize(new java.awt.Dimension(40, 20));
		row02Labeltemp.setVisible(false);
		jPanelRotor2.add(row02Labeltemp);
		
		row12Labeltemp = new javax.swing.JLabel(); 
		row12Labeltemp.setBackground(java.awt.Color.white);
		row12Labeltemp.setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(110, 110, 110)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178))));
		row12Labeltemp.setForeground(java.awt.Color.darkGray);
		row12Labeltemp.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		row12Labeltemp.setLocation(new java.awt.Point(65, 525));		
		row12Labeltemp.setOpaque(false);
		row12Labeltemp.setSize(new java.awt.Dimension(40, 20));
		row12Labeltemp.setVisible(false);
		jPanelRotor2.add(row12Labeltemp);
		
		row03Labeltemp = new javax.swing.JLabel(); 
		row03Labeltemp.setBackground(java.awt.Color.white);
		row03Labeltemp.setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(110, 110, 110)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178))));
		row03Labeltemp.setForeground(java.awt.Color.darkGray);
		row03Labeltemp.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		row03Labeltemp.setLocation(new java.awt.Point(5, 525));		
		row03Labeltemp.setOpaque(false);
		row03Labeltemp.setSize(new java.awt.Dimension(40, 20));
		row03Labeltemp.setVisible(false);
		jPanelRotor3.add(row03Labeltemp);
		
		row13Labeltemp = new javax.swing.JLabel(); 
		row13Labeltemp.setBackground(java.awt.Color.white);
		row13Labeltemp.setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(110, 110, 110)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178))));
		row13Labeltemp.setForeground(java.awt.Color.darkGray);
		row13Labeltemp.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		row13Labeltemp.setLocation(new java.awt.Point(65, 525));		
		row13Labeltemp.setOpaque(true);
		row13Labeltemp.setSize(new java.awt.Dimension(40, 20));
		row13Labeltemp.setVisible(false);
		jPanelRotor3.add(row13Labeltemp);
		
	for(int i=0;i<27;i++)
     {
    
     line11[i]= new Polygon(x11points[i],y11points[i],2);
     line22[i]= new Polygon(x22points[i],y22points[i],2);
     line33[i]= new Polygon(x33points[i],y33points[i],2);
     }
	for(int i=0;i<14;i++)     
	 line12[i]= new Polygon(x12points[i],y12points[i],2);	
	
	}
	

	// Standard method to start the applet
	public void start() {
	
	}

	// Standard method to stop the applet
	public void stop() {
	}

	// Standard method to destroy the applet
	public void destroy() {
	}

	// Main entry point when running standalone
	public static void main(String[] args) {
		enigma applet = new enigma();
		applet.isStandalone = true;
		Frame frame = new Frame();
		frame.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				Frame f = (Frame) e.getSource();
				f.setVisible(false);
				f.dispose();
				System.exit(0);
			}
		});
		frame.setTitle("Applet Frame");
		frame.add( applet, BorderLayout.CENTER );
		applet.init();
		applet.start();
		frame.setSize( 400, 320 );
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation( (d.width - frame.getSize().width) / 2,
			(d.height - frame.getSize().height) / 2);
		frame.setVisible( true );
		
	}
	
	
	
	public void actionall(char letter)
	{
		
		preletterpositionInwards03 =letterpositionInwards03;
		preletterpositionInwards02 =letterpositionInwards02;
		preletterpositionInwards01 =letterpositionInwards01;
		preletterpositionOutwards01 =letterpositionOutwards01;
		preletterpositionOutwards02 =letterpositionOutwards02;
		preletterpositionOutwards03 =letterpositionOutwards03;
		preletterpositionInwards13 =letterpositionInwards13;
		preletterpositionInwards12 =letterpositionInwards12;
		preletterpositionInwards11 =letterpositionInwards11;
		preletterpositionOutwards11 =letterpositionOutwards11;
		preletterpositionOutwards12 =letterpositionOutwards12;
		preletterpositionOutwards13 =letterpositionOutwards13;
		
		
	//jTextPane1 = createTextPane(jTextPane1,count_chars-1,workingString);

		if(count_chars !=1)
		{
			for (int i=1;i<26;i++)
				{
					temprow0[i-1] = row03data[i];
					temprow1[i-1] = row13data[i];
				}	
			temprow0[25] = row03data[0];
			temprow1[25] = row13data[0];		

			for (int i=0;i<26;i++)
				{
					row03data[i] = temprow0[i];
					row13data[i] = temprow1[i];				
				}	
		
			if (((count_chars-1) % 26)== 0)
				{
					for (int i=1;i<26;i++)
					{
						temprow0[i-1] = row02data[i];
						temprow1[i-1] = row12data[i];
					}	
					temprow0[25] = row02data[0];
					temprow1[25] = row12data[0];		

					for (int i=0;i<26;i++)
					{
						row02data[i] = temprow0[i];
						row12data[i] = temprow1[i];				
					}	
				}
			if (((count_chars-1)% 256) == 0)
				{
					for (int i=1;i<26;i++)
					{
						temprow0[i-1] = row02data[i];
						temprow1[i-1] = row12data[i];
					}	
					temprow0[25] = row02data[0];
					temprow1[25] = row12data[0];		

					for (int i=0;i<26;i++)
					{
						row02data[i] = temprow0[i];
						row12data[i] = temprow1[i];				
					}	
				}
		}
	
	
	
		
		for (int i =0; i<26;i++)
			{
				if(letter == row13data[i])
					
					letterpositionInwards13=i;
					
			}
		
		for (int i =0; i<26;i++)
			{
				if( letter== row03data[i])
					{
					
						letterpositionInwards03 = i;
						letterpositionInwards12 = i;
					
						
					}
			}
			
		for (int i =0; i<26;i++)
			{
				if( row12data[letterpositionInwards12]== row02data[i])
					{
						letterpositionInwards02 = i;
						letterpositionInwards11 = i;
					}
			}
		
		for (int i =0; i<26;i++)
			{
				if( row11data[letterpositionInwards11]== row01data[i])
					{
						letterpositionInwards01 = i;
					}
			}	
		
									
		letterpositionOutwards01 = reflector[letterpositionInwards01];
		
		
		for (int i =0; i<26;i++)
			{
				if( row01data[letterpositionOutwards01]== row11data[i])
					{

						letterpositionOutwards11 = i;
						letterpositionOutwards02 = i;
		
					}
			}	
		
		for (int i =0; i<26;i++)
			{
				if( row02data[letterpositionOutwards02]== row12data[i])
					{
						letterpositionOutwards12 = i;
						letterpositionOutwards03 = i;
					}
			}		
			
		for (int i =0; i<26;i++)
			{
				if( row03data[letterpositionOutwards03]== row13data[i])
					{
						letterpositionOutwards13 = i;
					}
			}		
		
		
			
		
		
		new Thread()
		{ 

		public void run() 
		{
		
		if (count_chars != 1)
		{
		dorepaint(26,26,26,26,26,26,0,0,0,0,0,0);
		row03Labels[preletterpositionInwards03].setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(110, 110, 110)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178))));
		row03Labels[preletterpositionInwards03].setForeground(java.awt.Color.darkGray);
		row02Labels[preletterpositionInwards02].setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(110, 110, 110)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178))));
		row02Labels[preletterpositionInwards02].setForeground(java.awt.Color.darkGray);
		row01Labels[preletterpositionInwards01].setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(110, 110, 110)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178))));
		row01Labels[preletterpositionInwards01].setForeground(java.awt.Color.darkGray);
		row03Labels[preletterpositionOutwards03].setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(110, 110, 110)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178))));
		row03Labels[preletterpositionOutwards03].setForeground(java.awt.Color.darkGray);
		row02Labels[preletterpositionOutwards02].setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(110, 110, 110)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178))));
		row02Labels[preletterpositionOutwards02].setForeground(java.awt.Color.darkGray);
		row01Labels[preletterpositionOutwards01].setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(110, 110, 110)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178))));
		row01Labels[preletterpositionOutwards01].setForeground(java.awt.Color.darkGray);
		
		row13Labels[preletterpositionInwards13].setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(110, 110, 110)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178))));
		row13Labels[preletterpositionInwards13].setForeground(java.awt.Color.darkGray);
		row12Labels[preletterpositionInwards12].setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(110, 110, 110)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178))));
		row12Labels[preletterpositionInwards12].setForeground(java.awt.Color.darkGray);
		row11Labels[preletterpositionInwards11].setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(110, 110, 110)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178))));
		row11Labels[preletterpositionInwards11].setForeground(java.awt.Color.darkGray);
		row13Labels[preletterpositionOutwards13].setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(110, 110, 110)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178))));
		row13Labels[preletterpositionOutwards13].setForeground(java.awt.Color.darkGray);
		row12Labels[preletterpositionOutwards12].setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(110, 110, 110)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178))));
		row12Labels[preletterpositionOutwards12].setForeground(java.awt.Color.darkGray);
		row11Labels[preletterpositionOutwards11].setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(110, 110, 110)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178))));
		row11Labels[preletterpositionOutwards11].setForeground(java.awt.Color.darkGray);
		//repaint();
		try {Thread.sleep(speed*20);}catch (InterruptedException ee){}		
		
		
		tempString="";
		tempString= tempString+row03data[25];
		row03Labeltemp.setText(tempString);
		row03Labeltemp.setVisible(true);
		tempString="";
		tempString= tempString+row13data[25];
		row13Labeltemp.setText(tempString);
		row13Labeltemp.setVisible(true);
		
		//dorepaint(26,26,26,26,26,26,0,0,0,0,0,0);
		Point tempPoint0,tempPoint1;
		
		
		for(int j =0; j<20;j++)
			{
			tempPoint0 =row03Labeltemp.getLocation();
			tempPoint1 =row13Labeltemp.getLocation();
			
			tempPoint0.y= tempPoint0.y-1;
			tempPoint1.y= tempPoint1.y-1;
			row03Labeltemp.setLocation(tempPoint0.x,tempPoint0.y);
			row13Labeltemp.setLocation(tempPoint1.x,tempPoint1.y);
			for (int i=0;i<26;i++)
				{
				row03Point[i] =row03Labels[i].getLocation();
				row13Point[i] =row13Labels[i].getLocation();
				row03Point[i].y= row03Point[i].y-1;
				row13Point[i].y= row13Point[i].y-1;				
				row03Labels[i].setLocation(row03Point[i].x,row03Point[i].y);
				row13Labels[i].setLocation(row13Point[i].x,row13Point[i].y);
				}
			
		//	dorepaint();
			try {Thread.sleep(speed/2);}catch (InterruptedException ee){}		
			}
			
		
		for (int i=1;i<26;i++)
			{
				rowTempLabels0[i-1] = row03Labels[i];
				rowTempLabels1[i-1] = row13Labels[i];
			}	
		rowTempLabels0[25] = row03Labels[0];
		rowTempLabels1[25] = row13Labels[0];

		for (int i=0;i<26;i++)
			{
			row03Labels[i] = rowTempLabels0[i];
			row13Labels[i] = rowTempLabels1[i];
			}
		row03Labeltemp.setVisible(false);
		row13Labeltemp.setVisible(false);		
	
			row03Labeltemp.setLocation(5,525);
			row13Labeltemp.setLocation(65,525);			
			row03Labeltemp.setVisible(false);
			row13Labeltemp.setVisible(false);			
	
		
		row03Labels[25].setLocation(5,505);
		row13Labels[25].setLocation(65,505);
		
	//	dorepaint();
	}
		if (((count_chars-1) % 26)== 0 && count_chars >1)
		{
		
		tempString="";
		tempString= tempString+row02data[25];
		row02Labeltemp.setText(tempString);
		row02Labeltemp.setVisible(true);
		tempString="";
		tempString= tempString+row12data[25];
		row12Labeltemp.setText(tempString);
		row12Labeltemp.setVisible(true);
		
		
	//	dorepaint();
		Point tempPoint0,tempPoint1;
		
		
		for(int j =0; j<20;j++)
			{
			tempPoint0 =row02Labeltemp.getLocation();
			tempPoint1 =row12Labeltemp.getLocation();
			
			tempPoint0.y= tempPoint0.y-1;
			tempPoint1.y= tempPoint1.y-1;
			row02Labeltemp.setLocation(tempPoint0.x,tempPoint0.y);
			row12Labeltemp.setLocation(tempPoint1.x,tempPoint1.y);
			for (int i=0;i<26;i++)
				{
				row02Point[i] =row02Labels[i].getLocation();
				row12Point[i] =row12Labels[i].getLocation();
				row02Point[i].y= row02Point[i].y-1;
				row12Point[i].y= row12Point[i].y-1;				
				row02Labels[i].setLocation(row02Point[i].x,row02Point[i].y);
				row12Labels[i].setLocation(row12Point[i].x,row12Point[i].y);
				}
			
		//	dorepaint();
			try {Thread.sleep(speed/2);}catch (InterruptedException ee){}		
			}
			
		
		for (int i=1;i<26;i++)
			{
				rowTempLabels0[i-1] = row02Labels[i];
				rowTempLabels1[i-1] = row12Labels[i];
			}	
		rowTempLabels0[25] = row02Labels[0];
		rowTempLabels1[25] = row12Labels[0];

		for (int i=0;i<26;i++)
			{
			row02Labels[i] = rowTempLabels0[i];
			row12Labels[i] = rowTempLabels1[i];
			}
		row02Labeltemp.setVisible(false);
		row12Labeltemp.setVisible(false);		
	
			row02Labeltemp.setLocation(5,525);
			row12Labeltemp.setLocation(65,525);			
			row02Labeltemp.setVisible(false);
			row12Labeltemp.setVisible(false);			
	
	
		row02Labels[25].setLocation(5,505);
		row12Labels[25].setLocation(65,505);
		String fornow = "";
	//	dorepaint();
		
		}
		
		
	
		if ((count_chars-1)% 256 == 0 && count_chars >1)
		{
			
			
		
		tempString="";
		tempString= tempString+row01data[25];
		row01Labeltemp.setText(tempString);
		row01Labeltemp.setVisible(true);
		tempString="";
		tempString= tempString+row11data[25];
		row11Labeltemp.setText(tempString);
		row11Labeltemp.setVisible(true);
		
		
	//	dorepaint();
		Point tempPoint0,tempPoint1;
		
		for(int j =0; j<20;j++)
			{
			tempPoint0 =row02Labeltemp.getLocation();
			tempPoint1 =row12Labeltemp.getLocation();
			
			tempPoint0.y= tempPoint0.y-1;
			tempPoint1.y= tempPoint1.y-1;
			row02Labeltemp.setLocation(tempPoint0.x,tempPoint0.y);
			row12Labeltemp.setLocation(tempPoint1.x,tempPoint1.y);
			for (int i=0;i<26;i++)
				{
				row02Point[i] =row02Labels[i].getLocation();
				row12Point[i] =row12Labels[i].getLocation();
				row02Point[i].y= row02Point[i].y-1;
				row12Point[i].y= row12Point[i].y-1;				
				row02Labels[i].setLocation(row02Point[i].x,row02Point[i].y);
				row12Labels[i].setLocation(row12Point[i].x,row12Point[i].y);
				}
			
	//	dorepaint();
			try {Thread.sleep(speed/2);}catch (InterruptedException ee){}		
			}
			
		
		for (int i=1;i<26;i++)
			{
				rowTempLabels0[i-1] = row02Labels[i];
				rowTempLabels1[i-1] = row12Labels[i];
			}	
		rowTempLabels0[25] = row02Labels[0];
		rowTempLabels1[25] = row12Labels[0];

		for (int i=0;i<26;i++)
			{
			row02Labels[i] = rowTempLabels0[i];
			row12Labels[i] = rowTempLabels1[i];
			}
		row02Labeltemp.setVisible(false);
		row12Labeltemp.setVisible(false);		
	
			row02Labeltemp.setLocation(5,525);
			row12Labeltemp.setLocation(65,525);			
			row02Labeltemp.setVisible(false);
			row12Labeltemp.setVisible(false);			
	
			
		row02Labels[25].setLocation(5,505);
		row12Labels[25].setLocation(65,505);
		String fornow = "";
		//dorepaint();
		}	
	
		dorepaint(26,26,26,26,26,26,0,0,0,0,0,0);
			plainText = plainText+row03data[letterpositionInwards13];
			if (workingwithstrings == 0)
			jTextPanePlaintext = createTextPane(jTextPanePlaintext,count_chars-1,workingString);
			else
			jTextPanePlainStrings = createTextPane(jTextPanePlainStrings,count_chars-1,workingwithString);
			
		jPanelMain.revalidate();
		jPanelMain.repaint();
		
		
		row13Labels[letterpositionInwards13].setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, java.awt.Color.red)));
		row13Labels[letterpositionInwards13].setForeground(java.awt.Color.red);
		//dorepaint();
		dorepaint(26,26,26,26,26,26,1,0,0,0,0,0);
		try {Thread.sleep(speed*40);}catch (InterruptedException ee){}
		row03Labels[letterpositionInwards03].setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, java.awt.Color.red)));
		row03Labels[letterpositionInwards03].setForeground(java.awt.Color.red);
		//dorepaint();
		dorepaint(letterpositionInwards03,26,26,26,26,26,1,0,0,0,0,0);
		try {Thread.sleep(speed*40);}catch (InterruptedException ee){}

		row12Labels[letterpositionInwards12].setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, java.awt.Color.red)));
		row12Labels[letterpositionInwards12].setForeground(java.awt.Color.red);
		//dorepaint();
		dorepaint(letterpositionInwards03,26,26,26,26,26,1,1,0,0,0,0);
		try {Thread.sleep(speed*40);}catch (InterruptedException ee){}
		row02Labels[letterpositionInwards02].setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, java.awt.Color.red)));
		row02Labels[letterpositionInwards02].setForeground(java.awt.Color.red);
		//dorepaint();
		dorepaint(letterpositionInwards03,letterpositionInwards02,26,26,26,26,1,1,0,0,0,0);
		try {Thread.sleep(speed*40);}catch (InterruptedException ee){}
		
		row11Labels[letterpositionInwards11].setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, java.awt.Color.red)));
		row11Labels[letterpositionInwards11].setForeground(java.awt.Color.red);
		//dorepaint();
		dorepaint(letterpositionInwards03,letterpositionInwards02,26,26,26,26,1,1,1,0,0,0);
		try {Thread.sleep(speed*40);}catch (InterruptedException ee){}
		row01Labels[letterpositionInwards01].setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, java.awt.Color.red)));
		row01Labels[letterpositionInwards01].setForeground(java.awt.Color.red);
		//dorepaint();
		//dorepaint(letterpositionInwards03,letterpositionInwards02,letterpositionInwards01,26,26,26);
		dorepaint(letterpositionInwards03,letterpositionInwards02,letterpositionInwards01,26,26,letterpositionOutwards01,1,1,1,0,0,0);				
		try {Thread.sleep(speed*40);}catch (InterruptedException ee){}
		
	
	
		row01Labels[letterpositionOutwards01].setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, java.awt.Color.blue)));
		row01Labels[letterpositionOutwards01].setForeground(java.awt.Color.blue);
		dorepaint(letterpositionInwards03,letterpositionInwards02,letterpositionInwards01,26,26,letterpositionOutwards01,1,1,1,1,0,0);				
		try {Thread.sleep(speed*40);}catch (InterruptedException ee){}
		row11Labels[letterpositionOutwards11].setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, java.awt.Color.blue)));
		row11Labels[letterpositionOutwards11].setForeground(java.awt.Color.blue);
		//dorepaint();
		dorepaint(letterpositionInwards03,letterpositionInwards02,letterpositionInwards01,26,letterpositionOutwards02,letterpositionOutwards01,1,1,1,1,0,0);	
		try {Thread.sleep(speed*40);}catch (InterruptedException ee){}
		
		row02Labels[letterpositionOutwards02].setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, java.awt.Color.blue)));
		row02Labels[letterpositionOutwards02].setForeground(java.awt.Color.blue);
		dorepaint(letterpositionInwards03,letterpositionInwards02,letterpositionInwards01,26,letterpositionOutwards02,letterpositionOutwards01,1,1,1,1,1,0);	
		try {Thread.sleep(speed*40);}catch (InterruptedException ee){}
		row12Labels[letterpositionOutwards12].setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, java.awt.Color.blue)));
		row12Labels[letterpositionOutwards12].setForeground(java.awt.Color.blue);
//dorepaint();
		dorepaint(letterpositionInwards03,letterpositionInwards02,letterpositionInwards01,letterpositionOutwards03,letterpositionOutwards02,letterpositionOutwards01,1,1,1,1,1,0);				
		try {Thread.sleep(speed*40);}catch (InterruptedException ee){}
		
		row03Labels[letterpositionOutwards03].setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, java.awt.Color.blue)));
		row03Labels[letterpositionOutwards03].setForeground(java.awt.Color.blue);
		dorepaint(letterpositionInwards03,letterpositionInwards02,letterpositionInwards01,letterpositionOutwards03,letterpositionOutwards02,letterpositionOutwards01,1,1,1,1,1,1);				
		try {Thread.sleep(speed*40);}catch (InterruptedException ee){}
		row13Labels[letterpositionOutwards13].setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, java.awt.Color.blue)));
		row13Labels[letterpositionOutwards13].setForeground(java.awt.Color.blue);
		//repaint();
		try {Thread.sleep(speed*40);}catch (InterruptedException ee){}
		
				
		encryptText = encryptText + row13data[letterpositionOutwards13];
		if(workingwithstrings==0)
		jTextPaneCypherText.setText(encryptText);
		else
		jTextPaneCypherStrings.setText(encryptText);
		
		try {Thread.sleep(speed*20);}catch (InterruptedException ee){}		
		
		
		
		count_chars = count_chars+1;
		
		stringtest.dequeue();
		if (resetValue==1)
		{
		inactivate_button();
		reset();
		resetValue=0;
		}
		else if(stopatendofcharacter ==0)
			{
			if (!stringtest.isempty())
				{
				actionnext();
				}
			else if(workingwithstrings ==1)
				jButtonencrypt.setVisible(true);	
			}
		
			
		
		}
	}.start();

	
	}
	
	
	
	public void actionadd(char letter)
	{
	workingString = workingString+letter;
	
	jTextPanePlaintext = createTextPane(jTextPanePlaintext,count_chars-1,workingString);
			
			
		if (stringtest.isempty())
		{
			stringtest.enqueue(letter);
			actionnext();
		}
		else 
			stringtest.enqueue(letter);
	}
	
	
	public void actionnext()
	{
	char nextletter;
	
	if (stopatendofcharacter != 1)
		{
			nextletter = stringtest.LetterNextInQueue();
			actionall(nextletter);
		}
	}
	
	
	public void reset()
	{
		jButtonReset.setText("RESETTING.. Please Wait");
		workingString = "";
		plainText ="";
		encryptText ="";
		speed =0;
		dorepaint(26,26,26,26,26,26,0,0,0,0,0,0);
	
		while (!stringtest.isempty())
		{
		stringtest.dequeue();
		}
	
	
		if (count_chars!=1)
		{
			row03Labels[letterpositionInwards03].setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(100, 100, 100)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178))));
			row03Labels[letterpositionInwards03].setForeground(java.awt.Color.darkGray);
			row02Labels[letterpositionInwards02].setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(100, 100, 100)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178))));
			row02Labels[letterpositionInwards02].setForeground(java.awt.Color.darkGray);
			row01Labels[letterpositionInwards01].setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(100, 100, 100)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178))));
			row01Labels[letterpositionInwards01].setForeground(java.awt.Color.darkGray);
			row03Labels[letterpositionOutwards03].setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(100, 100, 100)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178))));
			row03Labels[letterpositionOutwards03].setForeground(java.awt.Color.darkGray);
			row02Labels[letterpositionOutwards02].setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(100, 100, 100)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178))));
			row02Labels[letterpositionOutwards02].setForeground(java.awt.Color.darkGray);
			row01Labels[letterpositionOutwards01].setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(100, 100, 100)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178))));
			row01Labels[letterpositionOutwards01].setForeground(java.awt.Color.darkGray);
		
			row13Labels[letterpositionInwards13].setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(100, 100, 100)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178))));
			row13Labels[letterpositionInwards13].setForeground(java.awt.Color.darkGray);
			row12Labels[letterpositionInwards12].setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(100, 100, 100)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178))));
			row12Labels[letterpositionInwards12].setForeground(java.awt.Color.darkGray);
			row11Labels[letterpositionInwards11].setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(100, 100, 100)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178))));
			row11Labels[letterpositionInwards11].setForeground(java.awt.Color.darkGray);
			row13Labels[letterpositionOutwards13].setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(100, 100, 100)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178))));
			row13Labels[letterpositionOutwards13].setForeground(java.awt.Color.darkGray);
			row12Labels[letterpositionOutwards12].setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(100, 100, 100)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178))));
			row12Labels[letterpositionOutwards12].setForeground(java.awt.Color.darkGray);
			row11Labels[letterpositionOutwards11].setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(100, 100, 100)), new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178))));
			row11Labels[letterpositionOutwards11].setForeground(java.awt.Color.darkGray);
		}
	
	count_chars = 1;
	for (int i=0;i<26;i++)
		{
				row01Labels[i].setText(chars[(comboselected1+i) % 26]);
				row02Labels[i].setText(chars[(comboselected2+i) % 26]);
				row03Labels[i].setText(chars[(comboselected3+i) % 26]);
				row11Labels[i].setText(row1chars[(comboselected1+i) % 26]);
				row12Labels[i].setText(row2chars[(comboselected2+i) % 26]);
				row13Labels[i].setText(row3chars[(comboselected3+i) % 26]);
				row11data[i] =  resetRowValues[(comboselected1+i) % 26];
				row12data[i] =  resetRowValues[(comboselected2+i) % 26];
				row13data[i] =  resetRowValues[(comboselected3+i) % 26];
				row01data[i] =  resetrow01data[(comboselected1+i) % 26];
				row02data[i] =  resetrow02data[(comboselected2+i) % 26];
				row03data[i] =  resetrow03data[(comboselected3+i) % 26];
		}
	
	resetValue=0;
	speed=speedconstant;
	jTextPanePlaintext.setText("");
	jTextPaneCypherText.setText("");
	jLabelStopAtEndcharacter.setVisible(true);
	jLabelCountinue.setVisible(false);

	activate_button();
	jButtonReset.setText("Reset");
	if (workingwithstrings ==1)
	jButtonencrypt.setVisible(true);
	jTextPanePlaintext.requestFocus();
	}
	
	
	
	public void jButtonResetMouseClicked(java.awt.event.MouseEvent e) {
	speed =0;
	jButtonReset.setText("RESETTING...");
	resetValue=1;
	inactivate_button();
	if(stringtest.isempty())
	reset();
	}
	
	
	public void jComboBox1ActionPerformed(java.awt.event.ActionEvent e) 
		{
		JComboBox cb = (JComboBox)e.getSource();
        String selected = (String)cb.getSelectedItem();
    	for( int i=0;i<26;i++) 
    		{
    		if (selected == chars[i])
    		comboselected1=i;
    		}
		}
	public void jComboBox2ActionPerformed(java.awt.event.ActionEvent e)
		{
		JComboBox cb = (JComboBox)e.getSource();
        String selected = (String)cb.getSelectedItem();
    	for( int i=0;i<26;i++) 
    		{
    		if (selected == chars[i])
    		comboselected2=i;
    		}
    	}	
	public void jComboBox3ActionPerformed(java.awt.event.ActionEvent e) 
		{
		JComboBox cb = (JComboBox)e.getSource();
        String selected = (String)cb.getSelectedItem();
    	for( int i=0;i<26;i++) 
    		{
    		if (selected == chars[i])
    		comboselected3=i;
    		}

		}
	
	public void jLabelAMouseClicked(java.awt.event.MouseEvent e) {
	actionadd('a');

	}
	
	public void jLabelBMouseClicked(java.awt.event.MouseEvent e) {
	actionadd('b');
	}
	
	public void jLabelCMouseClicked(java.awt.event.MouseEvent e) {
	actionadd('c');
	}
	
	public void jLabelDMouseClicked(java.awt.event.MouseEvent e) {
	actionadd('d');}
	
	public void jLabelEMouseClicked(java.awt.event.MouseEvent e) {
	actionadd('e');}
	
	public void jLabelFMouseClicked(java.awt.event.MouseEvent e) {
	actionadd('f');}
	
	public void jLabelGMouseClicked(java.awt.event.MouseEvent e) {
	actionadd('g');}
	
	public void jLabelHMouseClicked(java.awt.event.MouseEvent e) {
	actionadd('h');}
	
	public void jLabelIMouseClicked(java.awt.event.MouseEvent e) {
	actionadd('i');}
	
	public void jLabelJMouseClicked(java.awt.event.MouseEvent e) {
	actionadd('j');}
	
	public void jLabelKMouseClicked(java.awt.event.MouseEvent e) {
	actionadd('k');}
	
	public void jLabelLMouseClicked(java.awt.event.MouseEvent e) {
	actionadd('l');}
	
	public void jLabelMMouseClicked(java.awt.event.MouseEvent e) {
	actionadd('m');}
	
	public void jLabelNMouseClicked(java.awt.event.MouseEvent e) {
	actionadd('n');}
	
	public void jLabelOMouseClicked(java.awt.event.MouseEvent e) {
	actionadd('o');}
	
	public void jLabelPMouseClicked(java.awt.event.MouseEvent e) {
	actionadd('p');}
	
	public void jLabelQMouseClicked(java.awt.event.MouseEvent e) {
	actionadd('q');}
	
	public void jLabelRMouseClicked(java.awt.event.MouseEvent e) {
	actionadd('r');}
	
	public void jLabelSMouseClicked(java.awt.event.MouseEvent e) {
	actionadd('s');}
	
	public void jLabelTMouseClicked(java.awt.event.MouseEvent e) {
	actionadd('t');}
	
	public void jLabelUMouseClicked(java.awt.event.MouseEvent e) {
	actionadd('u');}
	
	public void jLabelVMouseClicked(java.awt.event.MouseEvent e) {
	actionadd('v');}
	
	public void jLabelWMouseClicked(java.awt.event.MouseEvent e) {
	actionadd('w');}
	
	public void jLabelXMouseClicked(java.awt.event.MouseEvent e) {
	actionadd('x');}
	
	public void jLabelYMouseClicked(java.awt.event.MouseEvent e) {
	actionadd('y');}
	
	public void jLabelZMouseClicked(java.awt.event.MouseEvent e) {
	actionadd('z');}
	
	
	
	
	
	public void jSlider1StateChanged(javax.swing.event.ChangeEvent e)
	{
	JSlider source = (JSlider)e.getSource();
	speed = 100- source.getValue();
	speedconstant = speed;
	jLabelSpeed.setText("SPEED ( "+Integer.toString(100-speed)+" )");
	}
																														
	
	public void inactivate_button()
	{
		jPanelActiveButtons.setVisible(false);
		jPanelInactiveButtons.setVisible(true);
	}
	
	
	public void activate_button()
	{	
		jPanelInactiveButtons.setVisible(false);
		jPanelActiveButtons.setVisible(true);
	}	
	
	
	public void dorepaint(int inthree,int intwo,int inone,int outthree,int outtwo,int outone,int r3i, int r2i,int r1i,int r1o, int r2o,int r3o)
    {
     
    lineinside1=inone;
    lineinside2=intwo;
    lineinside3=inthree; 
    lineoutside1 = outone;
    lineoutside2 = outtwo; 
    lineoutside3 = outthree;    
    rotor1inside=r1i;
    rotor2inside=r2i;
    rotor3inside=r3i;
    rotor1outside=r1o;
    rotor2outside=r2o;
    rotor3outside=r3o;          
    repaint();	
   
    }
	
	
	
	private JTextPane createTextPane(javax.swing.JTextPane tempPane, int countupdate, String abcf) {
       
	    String[] initStyles =
                { "red","regular"
                };
       // JTextPane textPane = new JTextPane();
        StyledDocument doc = tempPane.getStyledDocument();
		
	    addStylesToDocument(doc);

        try {
        int temp;
        temp = doc.getLength();
        doc.remove(0,temp);
        temp=-1;
        
            for (int i=0; i < abcf.length(); i++) {
            	
            	temp = 	temp+1;
            	
            	if (countupdate == i)
            	doc.insertString(temp, abcf.substring(i,i+1),
                                 doc.getStyle(initStyles[0]));
                else
                doc.insertString(temp, abcf.substring(i,i+1),
                                              doc.getStyle(initStyles[1]));
            }
        } catch (BadLocationException ble) {
            System.err.println("Couldn't insert initial text into text pane.");
        }

        return tempPane;
    }

    protected void addStylesToDocument(StyledDocument doc) {
        //Initialize some styles.
        Style def = StyleContext.getDefaultStyleContext().
                        getStyle(StyleContext.DEFAULT_STYLE);

        Style regular = doc.addStyle("regular", def);
        StyleConstants.setFontFamily(def, "SansSerif");

        Style s = doc.addStyle("italic", regular);
        StyleConstants.setItalic(s, true);

        s = doc.addStyle("bold", regular);
        StyleConstants.setBold(s, true);

        s = doc.addStyle("small", regular);
        StyleConstants.setFontSize(s, 10);

        s = doc.addStyle("red", regular);
        StyleConstants.setForeground(s, java.awt.Color.red);
       
    }
	


	public void jTextPanePlaintextKeyTyped(java.awt.event.KeyEvent e) {
	char charchar = e.getKeyChar();
	encryptdecryptselection=0;
	if(resetValue!=1)
	{
	int tempop;
	tempop = charchar;
	System.out.println(tempop);
	if (tempop >64 && tempop <91)
	{
		tempop =tempop+32;
		charchar = (char)tempop;
		actionadd(charchar);
	}
	else if (tempop >96 && tempop <123)
	{
		charchar =(char)tempop;
		actionadd(charchar);
	}
	
	else 
		getToolkit().beep();
	
	}
	}
	
	
	
	public void thisKeyTyped(java.awt.event.KeyEvent e) {
	if 	(workingwithstrings !=1)
	jTextPanePlaintext.requestFocus();
	}
	
	public void jLabelStopAtEndcharacterMouseMoved(java.awt.event.MouseEvent e) {
	 jLabelStopAtEndcharacter.setForeground(java.awt.Color.red);
	if 	(workingwithstrings !=1)
	 jTextPanePlaintext.requestFocus();
	}
	
	public void jLabelStopAtEndcharacterMouseExited(java.awt.event.MouseEvent e) {
	jLabelStopAtEndcharacter.setForeground(java.awt.Color.lightGray);
	if 	(workingwithstrings !=1)
	jTextPanePlaintext.requestFocus();
	}
	
	public void jLabelStopAtEndcharacterMouseClicked(java.awt.event.MouseEvent e) {
	jLabelStopAtEndcharacter.setVisible(false);
	jLabelCountinue.setVisible(true);
	stopatendofcharacter =1;
	if 	(workingwithstrings !=1)	
	jTextPanePlaintext.requestFocus();
	}
	
	public void jLabelCountinueMouseClicked(java.awt.event.MouseEvent e) {
	jTextPanePlaintext.requestFocus();
	jLabelStopAtEndcharacter.setVisible(true);
	jLabelCountinue.setVisible(false);
	if (stopatendofcharacter == 1)
		{
		stopatendofcharacter =0;
		actionnext();
		}
	}
	
	public void jLabelCountinueMouseMoved(java.awt.event.MouseEvent e) {
	jLabelCountinue.setForeground(java.awt.Color.green);
	if 	(workingwithstrings !=1)
	jTextPanePlaintext.requestFocus();
	}
	
	public void jLabelCountinueMouseExited(java.awt.event.MouseEvent e) {
	jLabelCountinue.setForeground(java.awt.Color.red);
	if 	(workingwithstrings !=1)
	jTextPanePlaintext.requestFocus();
	}
	
	
	
	public void jLabelStringsMouseClicked(java.awt.event.MouseEvent e) {
	
	workingwithstrings =1;
	String PlainTextString,CypherTextString;
	PlainTextString= jTextPanePlaintext.getText();
	CypherTextString=jTextPaneCypherText.getText();
	speed =0;
	resetValue=1;
	inactivate_button();
	if(stringtest.isempty())
	reset();
	jTextPanePlaintext.setVisible(false);
	jTextPaneCypherText.setVisible(false);
	jTextPanePlainStrings.setVisible(true);
	jTextPaneCypherStrings.setVisible(true);
	jButtonencrypt.setVisible(true);
	jLabelStrings.setVisible(false);
	jLabelCharacters.setVisible(true);
	
	jTextPanePlainStrings.setText(PlainTextString);
	jTextPaneCypherStrings.setText(CypherTextString); 
	}
	
	
	
	public void jLabelStringsMouseEntered(java.awt.event.MouseEvent e) {
	jLabelStrings.setForeground(java.awt.Color.blue);
	}
	
	public void jLabelStringsMouseExited(java.awt.event.MouseEvent e) {
	jLabelStrings.setForeground(java.awt.Color.lightGray);
	}
	
	public void jLabelCharactersMouseClicked(java.awt.event.MouseEvent e) {
	

	speed =0;
	resetValue=1;
	workingwithstrings =0;
	inactivate_button();
	if(stringtest.isempty())
	reset();
	jTextPanePlaintext.setVisible(true);
	jTextPaneCypherText.setVisible(true);
	jTextPanePlainStrings.setVisible(false);
	jTextPaneCypherStrings.setVisible(false);
	;
	jButtonencrypt.setVisible(false);
	
	jLabelCharacters.setVisible(false);
	jLabelStrings.setVisible(true);
	
		jTextPanePlaintext.requestFocus();
		
	}
	
	public void jLabelCharactersMouseEntered(java.awt.event.MouseEvent e) {
	jLabelCharacters.setForeground(java.awt.Color.blue);
	}
	
	public void jLabelCharactersMouseExited(java.awt.event.MouseEvent e) {
	jLabelCharacters.setForeground(java.awt.Color.lightGray);
	}
	
	public void jButtonencryptMouseClicked(java.awt.event.MouseEvent e) {
	
	jButtonencrypt.setVisible(false);
	speed=0;
	resetValue=1;
	
//	if(stringtest.isempty())
	reset();
	String readworkingwithString;
	readworkingwithString=jTextPanePlainStrings.getText();
	int tempop;
	char charchar;
	while (resetValue ==1)
	{
	}
	count_chars=1;
	workingwithString = "";
	for (int i=0;i<readworkingwithString.length();i++)
	{
		tempop = readworkingwithString.charAt(i);
		if (tempop >64 && tempop <91)
		{
			tempop =tempop+32;
			charchar = (char)tempop;
			stringtest.enqueue(charchar);
			workingwithString = workingwithString + charchar;
		}
		else if (tempop >96 && tempop <123)
		{
			charchar =(char)tempop;
			workingwithString = workingwithString + charchar;
			stringtest.enqueue(charchar);
		}
	
	}
	jTextPanePlainStrings.setText(workingwithString);
	actionall(workingwithString.charAt(0));
	
	}



							
	
														
}




class Queue{

Queue_Item first, last,current;

boolean empty()
	{
	return first == null;
	}

boolean isempty()
	{
	if (first == null)
		return true;
	else 
		return false;
	}
void enqueue (char item)
	{
	Queue_Item new_item = new Queue_Item(item);

	if ( first != null)
		{
		last.set_next(new_item);
		last = new_item;
		}
	else
		{
		last = new_item;
		first = last;
		}
	}


char LetterNextInQueue()
	{
	char result = first.get_item();
	return result;
	}
void dequeue ()
	{
		
	if ( first !=null)
		{
		//String result = first.get_item();
		first = first.get_next();
		//return result;
		}
	else
		{
		//return null;
		}
	}
	

}


class Queue_Item
{
	private char item;
	private Queue_Item next;
	
	Queue_Item( char qitem)
	{
		item = qitem;
		next = null;
	}
	
	char get_item()
	{
		return item;
	}
	
	Queue_Item get_next()
	{
	return next;
	}
	
	void set_next (Queue_Item qitem)
	{
		next = qitem;
	}
}