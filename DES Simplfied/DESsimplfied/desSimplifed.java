/** 
 * desSimplifed.java
 *
 * Title:			Simplified DES
 * Description:	
 * @author			chilukas
 * @version			
 */

package DESsimplfied;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

public class desSimplifed extends javax.swing.JApplet {

// IMPORTANT: Source code between BEGIN/END comment pair will be regenerated
// every time the form is saved. All manual changes will be overwritten.
// BEGIN GENERATED CODE
	// member declarations
	javax.swing.JPanel jPanelMain = new javax.swing.JPanel();
	javax.swing.JLabel jLabelText = new javax.swing.JLabel();
	javax.swing.JLabel jLabelKey = new javax.swing.JLabel();
	javax.swing.JTextField jTextFieldText = new javax.swing.JTextField();
	javax.swing.JTextField jTextFieldKey = new javax.swing.JTextField();
	javax.swing.JLabel jLabelRestrictions1 = new javax.swing.JLabel();
	javax.swing.JLabel jLabelRestrictions2 = new javax.swing.JLabel();
	javax.swing.JLabel jLabelRestrictions3 = new javax.swing.JLabel();
	javax.swing.JButton jButtonEncrypt = new javax.swing.JButton();
	javax.swing.JButton jButtonDecrypt = new javax.swing.JButton();
	javax.swing.JButton jButtonStage1 = new javax.swing.JButton();
	javax.swing.JButton jButtonStage2 = new javax.swing.JButton();
	javax.swing.JButton jButtonStage3 = new javax.swing.JButton();
	javax.swing.JButton jButtonStage4 = new javax.swing.JButton();
	javax.swing.JButton jButtonStage5 = new javax.swing.JButton();
	javax.swing.JButton jButtonStage6 = new javax.swing.JButton();
	javax.swing.JButton jButtonStage7 = new javax.swing.JButton();
	javax.swing.JButton jButtonStage8 = new javax.swing.JButton();
	javax.swing.JButton jButtonStage9 = new javax.swing.JButton();
	javax.swing.JButton jButtonStage10 = new javax.swing.JButton();
	javax.swing.JButton jButtonStage11 = new javax.swing.JButton();
	javax.swing.JButton jButtonStage12 = new javax.swing.JButton();
	javax.swing.JButton jButtonStage13 = new javax.swing.JButton();
	javax.swing.JButton jButtonStage14 = new javax.swing.JButton();
	javax.swing.JButton jButtonStage15 = new javax.swing.JButton();
	javax.swing.JButton jButtonStage16 = new javax.swing.JButton();
	javax.swing.JButton jButtonStage17 = new javax.swing.JButton();
	javax.swing.JButton jButtonStage18 = new javax.swing.JButton();
	javax.swing.JButton jButtonStage19 = new javax.swing.JButton();
	javax.swing.JButton jButtonStage20 = new javax.swing.JButton();
	javax.swing.JButton jButtonStage21 = new javax.swing.JButton();
	javax.swing.JButton jButtonStage22 = new javax.swing.JButton();
	javax.swing.JButton jButtonDecrypt1 = new javax.swing.JButton();
	javax.swing.JButton jButtonDecrypt2 = new javax.swing.JButton();
	javax.swing.JButton jButtonDecrypt3 = new javax.swing.JButton();
	javax.swing.JButton jButtonDecrypt4 = new javax.swing.JButton();
	javax.swing.JButton jButtonDecrypt5 = new javax.swing.JButton();
	javax.swing.JButton jButtonDecrypt7 = new javax.swing.JButton();
	javax.swing.JButton jButtonDecrypt8 = new javax.swing.JButton();
	javax.swing.JButton jButtonDecrypt9 = new javax.swing.JButton();
	javax.swing.JButton jButtonDecrypt6 = new javax.swing.JButton();
	javax.swing.JButton jButtonDecrypt11 = new javax.swing.JButton();
	javax.swing.JButton jButtonDecrypt12 = new javax.swing.JButton();
	javax.swing.JButton jButtonDecrypt13 = new javax.swing.JButton();
	javax.swing.JButton jButtonDecrypt14 = new javax.swing.JButton();
	javax.swing.JButton jButtonDecrypt15 = new javax.swing.JButton();
	javax.swing.JButton jButtonDecrypt16 = new javax.swing.JButton();
	javax.swing.JButton jButtonDecrypt17 = new javax.swing.JButton();
	javax.swing.JButton jButtonDecrypt18 = new javax.swing.JButton();
	javax.swing.JButton jButtonDecrypt19 = new javax.swing.JButton();
	javax.swing.JButton jButtonDecrypt10 = new javax.swing.JButton();
	javax.swing.JButton jButtonDecrypt20 = new javax.swing.JButton();
	javax.swing.JButton jButtonDecrypt21 = new javax.swing.JButton();
	javax.swing.JButton jButtonDecrypt22 = new javax.swing.JButton();
	javax.swing.JButton jButtonNewMessage = new javax.swing.JButton();
	javax.swing.JButton jButtonDecryptAfterEncrypt = new javax.swing.JButton();
	javax.swing.JScrollPane jScrollPaneMessage = new javax.swing.JScrollPane();
	javax.swing.JTextArea jTextFieldMessage = new javax.swing.JTextArea();
// END GENERATED CODE
	javax.swing.JOptionPane jOptionPane1 = new javax.swing.JOptionPane();
	
	designJPanel InputData =new designJPanel();
	designJPanel OutputData =new designJPanel();
	designJPanel LeftData =new designJPanel();
	designJPanel RightData =new designJPanel();
	designJPanel INIkey =new designJPanel();
	designJPanel PermutationData =new designJPanel();
	designJPanel KeyData0 =new designJPanel();
	designJPanel KeyData1 =new designJPanel();
	designJPanel KeyData2 =new designJPanel();
	designJPanel ExpandFun =new designJPanel();
	designJPanel ExpandSeq =new designJPanel();
	designJPanel EOR =new designJPanel();
	designJPanel S1 =new designJPanel();
	designJPanel S2 =new designJPanel();
	designJPanel FunRK =new designJPanel();
	designJPanel LeftData1 =new designJPanel();
	designJPanel RightData1 =new designJPanel();
	designJPanel LeftData2 =new designJPanel();
	designJPanel RightData2 =new designJPanel();
	designJPanel LeftData3 =new designJPanel();
	designJPanel RightData3 =new designJPanel();
	javax.swing.JPanel InputDataPanel =InputData.designJPanel1("Plain Text",60,70,12,12,1,2);
	javax.swing.JPanel OutputDataPanel =OutputData.designJPanel1("Encrypted Message",60,350,12,12,1,2);
	javax.swing.JPanel LeftDataPanel0 =LeftData.designJPanel1(" Left Data 0",40,120,6,6,1,2);
	javax.swing.JPanel LeftDataPanel1 =LeftData1.designJPanel1(" Left Data 1",40,240,6,6,1,2);
	javax.swing.JPanel RightDataPanel1 =RightData1.designJPanel1("Right Data 1",40,240,6,6,1,2);
	javax.swing.JPanel RightDataPanel0 =RightData.designJPanel1("Right Data 0",190,120,6,6,1,2);
	javax.swing.JPanel LeftDataPanel2 =LeftData2.designJPanel1(" Left Data 2",40,280,6,6,1,2);
	javax.swing.JPanel RightDataPanel2 =RightData2.designJPanel1("Right Data 2",40,280,6,6,1,2);
	javax.swing.JPanel LeftDataPanel3 =LeftData3.designJPanel1(" Left Data 3",40,340,6,6,1,2);
	javax.swing.JPanel RightDataPanel3 =RightData3.designJPanel1("Right Data 3",40,340,6,6,1,2);
	javax.swing.JPanel INIkeyPanel =INIkey.designJPanel1(" KEY ",350,70,9,9,1,2);
	javax.swing.JPanel KeyDataPanel0 =KeyData0.designJPanel1(" KEY 1 ",350,120,8,8,1,2);
	javax.swing.JPanel KeyDataPanel1 =KeyData1.designJPanel1(" KEY 2 ",350,180,8,8,1,2);
	javax.swing.JPanel KeyDataPanel2 =KeyData2.designJPanel1(" KEY 3 ",350,240,8,8,1,2);
	javax.swing.JPanel ExpandFunPanel =ExpandFun.designJPanel1(" Expand Function ",570,70,8,8,1,2);
	javax.swing.JPanel ExpandSeqPanel =ExpandSeq.designJPanel1(" Expanded Data ",570,120,8,8,1,2);
	javax.swing.JPanel EORPanel =EOR.designJPanel1("X-OR ",350,240,8,8,1,2);
	javax.swing.JPanel S1Panel =S1.designJPanel1("S-1  Box ",570,240,16,8,2,3);
	javax.swing.JPanel S2Panel =S2.designJPanel1("S-2  Box ",570,240,16,8,2,3);
	javax.swing.JPanel FunRKPanel =FunRK.designJPanel1("f(R,K) ",460,340,6,6,1,2);
	String plainText,keyText;
	//TextToCryptCode crypt=new TextToCryptCode();
	CryptByte Input = new CryptByte();
	CryptByte Key = new CryptByte();
	CryptByte Output = new CryptByte();
	
	int[] InputText = new int[12];
	int[] OutputText = new int[12];
	String[] InputString =  new String[12];
	int[] KeyText = new int[9];
	String[] KeyString =  new String[9];
	int [] leftText0 = new int[6];
	int [] rightText0 = new int[6];
	int [] leftText1 = new int[6];
	int [] rightText1 = new int[6];
	int [] leftText2 = new int[6];
	int [] rightText2 = new int[6];
	int [] leftText3 = new int[6];
	int [] rightText3 = new int[6];
	int [] key0 = new int[8];
	int [] key1 = new int[8];
	int [] key2 = new int[8];
	int [] expandRight = new int[8];
	int [] expand = {1,2,4,3,4,3,5,6};
	int [] XOR = new int[8];
	int [] Fun_RK = new int[6];
	int temp,temp1,k,j;
	String strtemp,strtemp1;
	String message = "";
	String [] S1box = {"101","010","001","110","011","100","111","000",
						"001","100","110","010","000","111","101","011"};
	String [] S2box = {"100","000","110","101","111","001","011","010",
						"101","011","000","111","110","010","001","100"};
						
	String [] leftString0 = new String[6];
	String [] rightString0 = new String[6];
	
	
	boolean isStandalone = false;

	public desSimplifed() {
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
		jPanelMain.setBorder(new javax.swing.plaf.BorderUIResource.TitledBorderUIResource(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, false), "Simplified D.E.S", 4, 2, new java.awt.Font("Monospaced", 1, 12), java.awt.Color.gray));
		jPanelMain.setLayout(null);
		jPanelMain.setLocation(new java.awt.Point(0, 0));
		jPanelMain.setSize(new java.awt.Dimension(880, 600));
		jPanelMain.setVisible(true);
		jLabelText.setBackground(java.awt.Color.white);
		jLabelText.setLocation(new java.awt.Point(70, 60));
		jLabelText.setOpaque(true);
		jLabelText.setSize(new java.awt.Dimension(100, 30));
		jLabelText.setText("Enter Message");
		jLabelText.setVisible(true);
		jLabelKey.setBackground(java.awt.Color.white);
		jLabelKey.setLocation(new java.awt.Point(70, 110));
		jLabelKey.setOpaque(true);
		jLabelKey.setSize(new java.awt.Dimension(100, 30));
		jLabelKey.setText("Enter Key");
		jLabelKey.setToolTipText("Key is 9 bits long");
		jLabelKey.setVisible(true);
		jTextFieldText.setLocation(new java.awt.Point(190, 60));
		jTextFieldText.setSize(new java.awt.Dimension(130, 30));
		jTextFieldText.setToolTipText("Message is 12 bits long");
		jTextFieldText.setVisible(true);
		jTextFieldKey.setLocation(new java.awt.Point(190, 110));
		jTextFieldKey.setSize(new java.awt.Dimension(130, 30));
		jTextFieldKey.setVisible(true);
		jLabelRestrictions1.setBackground(java.awt.Color.white);
		jLabelRestrictions1.setForeground(java.awt.Color.lightGray);
		jLabelRestrictions1.setLocation(new java.awt.Point(370, 60));
		jLabelRestrictions1.setOpaque(true);
		jLabelRestrictions1.setSize(new java.awt.Dimension(220, 20));
		jLabelRestrictions1.setText("Input is 0's and 1's only");
		jLabelRestrictions1.setVisible(true);
		jLabelRestrictions2.setBackground(java.awt.Color.white);
		jLabelRestrictions2.setForeground(java.awt.Color.lightGray);
		jLabelRestrictions2.setLocation(new java.awt.Point(370, 90));
		jLabelRestrictions2.setOpaque(true);
		jLabelRestrictions2.setSize(new java.awt.Dimension(240, 20));
		jLabelRestrictions2.setText("Message is 12 bits long");
		jLabelRestrictions2.setVisible(true);
		jLabelRestrictions3.setBackground(java.awt.Color.white);
		jLabelRestrictions3.setForeground(java.awt.Color.lightGray);
		jLabelRestrictions3.setLocation(new java.awt.Point(370, 120));
		jLabelRestrictions3.setOpaque(true);
		jLabelRestrictions3.setSize(new java.awt.Dimension(210, 20));
		jLabelRestrictions3.setText("Key is 9 bits long");
		jLabelRestrictions3.setVisible(true);
		jButtonEncrypt.setLocation(new java.awt.Point(100, 460));
		jButtonEncrypt.setSize(new java.awt.Dimension(140, 30));
		jButtonEncrypt.setText("Encrypt");
		jButtonEncrypt.setVisible(true);
		jButtonDecrypt.setLocation(new java.awt.Point(360, 460));
		jButtonDecrypt.setSize(new java.awt.Dimension(140, 30));
		jButtonDecrypt.setText("Decrypt");
		jButtonDecrypt.setVisible(true);
		jButtonStage1.setLocation(new java.awt.Point(100, 460));
		jButtonStage1.setSize(new java.awt.Dimension(140, 30));
		jButtonStage1.setText("Next Step");
		jButtonStage1.setVisible(false);
		jButtonStage2.setLocation(new java.awt.Point(100, 460));
		jButtonStage2.setSize(new java.awt.Dimension(140, 30));
		jButtonStage2.setText("Next Step");
		jButtonStage2.setVisible(false);
		jButtonStage3.setLocation(new java.awt.Point(100, 460));
		jButtonStage3.setSize(new java.awt.Dimension(140, 30));
		jButtonStage3.setText("Next Step");
		jButtonStage3.setVisible(false);
		jButtonStage4.setLocation(new java.awt.Point(100, 460));
		jButtonStage4.setSize(new java.awt.Dimension(140, 30));
		jButtonStage4.setText("Next Step");
		jButtonStage4.setVisible(false);
		jButtonStage5.setLocation(new java.awt.Point(100, 460));
		jButtonStage5.setSize(new java.awt.Dimension(140, 30));
		jButtonStage5.setText("Next Step");
		jButtonStage5.setVisible(false);
		jButtonStage6.setLocation(new java.awt.Point(100, 460));
		jButtonStage6.setSize(new java.awt.Dimension(140, 30));
		jButtonStage6.setText("Next Step");
		jButtonStage6.setVisible(false);
		jButtonStage7.setLocation(new java.awt.Point(100, 460));
		jButtonStage7.setSize(new java.awt.Dimension(140, 30));
		jButtonStage7.setText("Next Step");
		jButtonStage7.setVisible(false);
		jButtonStage8.setLocation(new java.awt.Point(100, 460));
		jButtonStage8.setSize(new java.awt.Dimension(140, 30));
		jButtonStage8.setText("Next Step");
		jButtonStage8.setVisible(false);
		jButtonStage9.setLocation(new java.awt.Point(100, 460));
		jButtonStage9.setSize(new java.awt.Dimension(140, 30));
		jButtonStage9.setText("Next Step");
		jButtonStage9.setVisible(false);
		jButtonStage10.setLocation(new java.awt.Point(100, 460));
		jButtonStage10.setSize(new java.awt.Dimension(140, 30));
		jButtonStage10.setText("Next Step");
		jButtonStage10.setVisible(false);
		jButtonStage11.setLocation(new java.awt.Point(100, 460));
		jButtonStage11.setSize(new java.awt.Dimension(140, 30));
		jButtonStage11.setText("Next Step");
		jButtonStage11.setVisible(false);
		jButtonStage12.setLocation(new java.awt.Point(100, 460));
		jButtonStage12.setSize(new java.awt.Dimension(140, 30));
		jButtonStage12.setText("Next Step");
		jButtonStage12.setVisible(false);
		jButtonStage13.setLocation(new java.awt.Point(100, 460));
		jButtonStage13.setSize(new java.awt.Dimension(140, 30));
		jButtonStage13.setText("Next Step");
		jButtonStage13.setVisible(false);
		jButtonStage14.setLocation(new java.awt.Point(100, 460));
		jButtonStage14.setSize(new java.awt.Dimension(140, 30));
		jButtonStage14.setText("Next Step");
		jButtonStage14.setVisible(false);
		jButtonStage15.setLocation(new java.awt.Point(100, 460));
		jButtonStage15.setSize(new java.awt.Dimension(140, 30));
		jButtonStage15.setText("Next Step");
		jButtonStage15.setVisible(false);
		jButtonStage16.setLocation(new java.awt.Point(100, 460));
		jButtonStage16.setSize(new java.awt.Dimension(140, 30));
		jButtonStage16.setText("Next Step");
		jButtonStage16.setVisible(false);
		jButtonStage17.setLocation(new java.awt.Point(100, 460));
		jButtonStage17.setSize(new java.awt.Dimension(140, 30));
		jButtonStage17.setText("Next Step");
		jButtonStage17.setVisible(false);
		jButtonStage18.setLocation(new java.awt.Point(100, 460));
		jButtonStage18.setSize(new java.awt.Dimension(140, 30));
		jButtonStage18.setText("Next Step");
		jButtonStage18.setVisible(false);
		jButtonStage19.setLocation(new java.awt.Point(100, 460));
		jButtonStage19.setSize(new java.awt.Dimension(140, 30));
		jButtonStage19.setText("Next Step");
		jButtonStage19.setVisible(false);
		jButtonStage20.setLocation(new java.awt.Point(100, 460));
		jButtonStage20.setSize(new java.awt.Dimension(140, 30));
		jButtonStage20.setText("Next Step");
		jButtonStage20.setVisible(false);
		jButtonStage21.setLocation(new java.awt.Point(100, 460));
		jButtonStage21.setSize(new java.awt.Dimension(140, 30));
		jButtonStage21.setText("Next Step");
		jButtonStage21.setVisible(false);
		jButtonStage22.setLocation(new java.awt.Point(100, 460));
		jButtonStage22.setSize(new java.awt.Dimension(140, 30));
		jButtonStage22.setText("Next Step");
		jButtonStage22.setVisible(false);
		jButtonDecrypt1.setLocation(new java.awt.Point(100, 460));
		jButtonDecrypt1.setSize(new java.awt.Dimension(140, 30));
		jButtonDecrypt1.setText("Next Step");
		jButtonDecrypt1.setVisible(false);
		jButtonDecrypt2.setLocation(new java.awt.Point(100, 460));
		jButtonDecrypt2.setSize(new java.awt.Dimension(140, 30));
		jButtonDecrypt2.setText("Next Step");
		jButtonDecrypt2.setVisible(false);
		jButtonDecrypt3.setLocation(new java.awt.Point(100, 460));
		jButtonDecrypt3.setSize(new java.awt.Dimension(140, 30));
		jButtonDecrypt3.setText("Next Step");
		jButtonDecrypt3.setVisible(false);
		jButtonDecrypt4.setLocation(new java.awt.Point(100, 460));
		jButtonDecrypt4.setSize(new java.awt.Dimension(140, 30));
		jButtonDecrypt4.setText("Next Step");
		jButtonDecrypt4.setVisible(false);
		jButtonDecrypt5.setLocation(new java.awt.Point(100, 460));
		jButtonDecrypt5.setSize(new java.awt.Dimension(140, 30));
		jButtonDecrypt5.setText("Next Step");
		jButtonDecrypt5.setVisible(false);
		jButtonDecrypt7.setLocation(new java.awt.Point(100, 460));
		jButtonDecrypt7.setSize(new java.awt.Dimension(140, 30));
		jButtonDecrypt7.setText("Next Step");
		jButtonDecrypt7.setVisible(false);
		jButtonDecrypt8.setLocation(new java.awt.Point(100, 460));
		jButtonDecrypt8.setSize(new java.awt.Dimension(140, 30));
		jButtonDecrypt8.setText("Next Step");
		jButtonDecrypt8.setVisible(false);
		jButtonDecrypt9.setLocation(new java.awt.Point(100, 460));
		jButtonDecrypt9.setSize(new java.awt.Dimension(140, 30));
		jButtonDecrypt9.setText("Next Step");
		jButtonDecrypt9.setVisible(false);
		jButtonDecrypt6.setLocation(new java.awt.Point(100, 460));
		jButtonDecrypt6.setSize(new java.awt.Dimension(140, 30));
		jButtonDecrypt6.setText("Next Step");
		jButtonDecrypt6.setVisible(false);
		jButtonDecrypt11.setLocation(new java.awt.Point(100, 460));
		jButtonDecrypt11.setSize(new java.awt.Dimension(140, 30));
		jButtonDecrypt11.setText("Next Step");
		jButtonDecrypt11.setVisible(false);
		jButtonDecrypt12.setLocation(new java.awt.Point(100, 460));
		jButtonDecrypt12.setSize(new java.awt.Dimension(140, 30));
		jButtonDecrypt12.setText("Next Step");
		jButtonDecrypt12.setVisible(false);
		jButtonDecrypt13.setLocation(new java.awt.Point(100, 460));
		jButtonDecrypt13.setSize(new java.awt.Dimension(140, 30));
		jButtonDecrypt13.setText("Next Step");
		jButtonDecrypt13.setVisible(false);
		jButtonDecrypt14.setLocation(new java.awt.Point(100, 460));
		jButtonDecrypt14.setSize(new java.awt.Dimension(140, 30));
		jButtonDecrypt14.setText("Next Step");
		jButtonDecrypt14.setVisible(false);
		jButtonDecrypt15.setLocation(new java.awt.Point(100, 460));
		jButtonDecrypt15.setSize(new java.awt.Dimension(140, 30));
		jButtonDecrypt15.setText("Next Step");
		jButtonDecrypt15.setVisible(false);
		jButtonDecrypt16.setLocation(new java.awt.Point(100, 460));
		jButtonDecrypt16.setSize(new java.awt.Dimension(140, 30));
		jButtonDecrypt16.setText("Next Step");
		jButtonDecrypt16.setVisible(false);
		jButtonDecrypt17.setLocation(new java.awt.Point(100, 460));
		jButtonDecrypt17.setSize(new java.awt.Dimension(140, 30));
		jButtonDecrypt17.setText("Next Step");
		jButtonDecrypt17.setVisible(false);
		jButtonDecrypt18.setLocation(new java.awt.Point(100, 460));
		jButtonDecrypt18.setSize(new java.awt.Dimension(140, 30));
		jButtonDecrypt18.setText("Next Step");
		jButtonDecrypt18.setVisible(false);
		jButtonDecrypt19.setLocation(new java.awt.Point(100, 460));
		jButtonDecrypt19.setSize(new java.awt.Dimension(140, 30));
		jButtonDecrypt19.setText("Next Step");
		jButtonDecrypt19.setVisible(false);
		jButtonDecrypt10.setLocation(new java.awt.Point(100, 460));
		jButtonDecrypt10.setSize(new java.awt.Dimension(140, 30));
		jButtonDecrypt10.setText("Next Step");
		jButtonDecrypt10.setVisible(false);
		jButtonDecrypt20.setLocation(new java.awt.Point(100, 460));
		jButtonDecrypt20.setSize(new java.awt.Dimension(140, 30));
		jButtonDecrypt20.setText("Next Step");
		jButtonDecrypt20.setVisible(false);
		jButtonDecrypt21.setLocation(new java.awt.Point(100, 460));
		jButtonDecrypt21.setSize(new java.awt.Dimension(140, 30));
		jButtonDecrypt21.setText("Next Step");
		jButtonDecrypt21.setVisible(false);
		jButtonDecrypt22.setLocation(new java.awt.Point(100, 460));
		jButtonDecrypt22.setSize(new java.awt.Dimension(140, 30));
		jButtonDecrypt22.setText("Next Step");
		jButtonDecrypt22.setVisible(false);
		jButtonNewMessage.setLocation(new java.awt.Point(100, 460));
		jButtonNewMessage.setSize(new java.awt.Dimension(180, 30));
		jButtonNewMessage.setText("Work with New Message");
		jButtonNewMessage.setVisible(false);
		jButtonDecryptAfterEncrypt.setLocation(new java.awt.Point(360, 460));
		jButtonDecryptAfterEncrypt.setSize(new java.awt.Dimension(140, 30));
		jButtonDecryptAfterEncrypt.setText("Decrypt");
		jButtonDecryptAfterEncrypt.setVisible(false);
		jScrollPaneMessage.setAutoscrolls(true);
		jScrollPaneMessage.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.HAND_CURSOR));
		jScrollPaneMessage.setFocusable(false);
		jScrollPaneMessage.setLocation(new java.awt.Point(10, 500));
		jScrollPaneMessage.setSize(new java.awt.Dimension(800, 90));
		jScrollPaneMessage.setVerticalScrollBarPolicy(javax.swing.JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		jScrollPaneMessage.setVisible(false);
		jTextFieldMessage.setBorder(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178)));
		jTextFieldMessage.setEditable(false);
		jTextFieldMessage.setFont(new java.awt.Font("Dialog", 1, 11));
		jTextFieldMessage.setForeground(new java.awt.Color(128, 128, 64));
		jTextFieldMessage.setVisible(true);
		getContentPane().setLayout(null);
		setLocation(new java.awt.Point(0, 0));

		jPanelMain.add(jLabelText);
		jPanelMain.add(jLabelKey);
		jPanelMain.add(jTextFieldText);
		jPanelMain.add(jTextFieldKey);
		jPanelMain.add(jLabelRestrictions1);
		jPanelMain.add(jLabelRestrictions2);
		jPanelMain.add(jLabelRestrictions3);
		jPanelMain.add(jButtonEncrypt);
		jPanelMain.add(jButtonDecrypt);
		jPanelMain.add(jButtonStage1);
		jPanelMain.add(jButtonStage2);
		jPanelMain.add(jButtonStage3);
		jPanelMain.add(jButtonStage4);
		jPanelMain.add(jButtonStage5);
		jPanelMain.add(jButtonStage6);
		jPanelMain.add(jButtonStage7);
		jPanelMain.add(jButtonStage8);
		jPanelMain.add(jButtonStage9);
		jPanelMain.add(jButtonStage10);
		jPanelMain.add(jButtonStage11);
		jPanelMain.add(jButtonStage12);
		jPanelMain.add(jButtonStage13);
		jPanelMain.add(jButtonStage14);
		jPanelMain.add(jButtonStage15);
		jPanelMain.add(jButtonStage16);
		jPanelMain.add(jButtonStage17);
		jPanelMain.add(jButtonStage18);
		jPanelMain.add(jButtonStage19);
		jPanelMain.add(jButtonStage20);
		jPanelMain.add(jButtonStage21);
		jPanelMain.add(jButtonStage22);
		jPanelMain.add(jButtonDecrypt1);
		jPanelMain.add(jButtonDecrypt2);
		jPanelMain.add(jButtonDecrypt3);
		jPanelMain.add(jButtonDecrypt4);
		jPanelMain.add(jButtonDecrypt5);
		jPanelMain.add(jButtonDecrypt7);
		jPanelMain.add(jButtonDecrypt8);
		jPanelMain.add(jButtonDecrypt9);
		jPanelMain.add(jButtonDecrypt6);
		jPanelMain.add(jButtonDecrypt11);
		jPanelMain.add(jButtonDecrypt12);
		jPanelMain.add(jButtonDecrypt13);
		jPanelMain.add(jButtonDecrypt14);
		jPanelMain.add(jButtonDecrypt15);
		jPanelMain.add(jButtonDecrypt16);
		jPanelMain.add(jButtonDecrypt17);
		jPanelMain.add(jButtonDecrypt18);
		jPanelMain.add(jButtonDecrypt19);
		jPanelMain.add(jButtonDecrypt10);
		jPanelMain.add(jButtonDecrypt20);
		jPanelMain.add(jButtonDecrypt21);
		jPanelMain.add(jButtonDecrypt22);
		jPanelMain.add(jButtonNewMessage);
		jPanelMain.add(jButtonDecryptAfterEncrypt);
		jPanelMain.add(jScrollPaneMessage);
		jScrollPaneMessage.getViewport().add(jTextFieldMessage);
		getContentPane().add(jPanelMain);

		setSize(new java.awt.Dimension(880, 600));

		// event handling
		jButtonEncrypt.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonEncryptMouseClicked(e);
			}
		});
		jButtonDecrypt.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonDecryptMouseClicked(e);
			}
		});
		jButtonStage1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonStage1MouseClicked(e);
			}
		});
		jButtonStage2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonStage2MouseClicked(e);
			}
		});
		jButtonStage3.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonStage3MouseClicked(e);
			}
		});
		jButtonStage4.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonStage4MouseClicked(e);
			}
		});
		jButtonStage5.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonStage5MouseClicked(e);
			}
		});
		jButtonStage6.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonStage6MouseClicked(e);
			}
		});
		jButtonStage7.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonStage7MouseClicked(e);
			}
		});
		jButtonStage8.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonStage8MouseClicked(e);
			}
		});
		jButtonStage9.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonStage9MouseClicked(e);
			}
		});
		jButtonStage10.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonStage10MouseClicked(e);
			}
		});
		jButtonStage11.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonStage11MouseClicked(e);
			}
		});
		jButtonStage12.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonStage12MouseClicked(e);
			}
		});
		jButtonStage13.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonStage13MouseClicked(e);
			}
		});
		jButtonStage14.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonStage14MouseClicked(e);
			}
		});
		jButtonStage15.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonStage15MouseClicked(e);
			}
		});
		jButtonStage16.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonStage16MouseClicked(e);
			}
		});
		jButtonStage17.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonStage17MouseClicked(e);
			}
		});
		jButtonStage18.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonStage18MouseClicked(e);
			}
		});
		jButtonStage19.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonStage19MouseClicked(e);
			}
		});
		jButtonStage20.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonStage20MouseClicked(e);
			}
		});
		jButtonStage21.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonStage21MouseClicked(e);
			}
		});
		jButtonStage22.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonStage22MouseClicked(e);
			}
		});
		jButtonDecrypt1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonDecrypt1MouseClicked(e);
			}
		});
		jButtonDecrypt2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonDecrypt2MouseClicked(e);
			}
		});
		jButtonDecrypt3.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonDecrypt3MouseClicked(e);
			}
		});
		jButtonDecrypt4.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonDecrypt4MouseClicked(e);
			}
		});
		jButtonDecrypt5.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonDecrypt5MouseClicked(e);
			}
		});
		jButtonDecrypt7.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonDecrypt7MouseClicked(e);
			}
		});
		jButtonDecrypt8.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonDecrypt8MouseClicked(e);
			}
		});
		jButtonDecrypt9.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonDecrypt9MouseClicked(e);
			}
		});
		jButtonDecrypt6.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonDecrypt6MouseClicked(e);
			}
		});
		jButtonDecrypt11.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonDecrypt11MouseClicked(e);
			}
		});
		jButtonDecrypt12.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonDecrypt12MouseClicked(e);
			}
		});
		jButtonDecrypt13.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonDecrypt13MouseClicked(e);
			}
		});
		jButtonDecrypt14.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonDecrypt14MouseClicked(e);
			}
		});
		jButtonDecrypt15.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonDecrypt15MouseClicked(e);
			}
		});
		jButtonDecrypt16.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonDecrypt16MouseClicked(e);
			}
		});
		jButtonDecrypt17.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonDecrypt17MouseClicked(e);
			}
		});
		jButtonDecrypt18.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonDecrypt18MouseClicked(e);
			}
		});
		jButtonDecrypt19.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonDecrypt19MouseClicked(e);
			}
		});
		jButtonDecrypt10.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonDecrypt10MouseClicked(e);
			}
		});
		jButtonDecrypt20.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonDecrypt20MouseClicked(e);
			}
		});
		jButtonDecrypt21.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonDecrypt21MouseClicked(e);
			}
		});
		jButtonDecrypt22.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonDecrypt22MouseClicked(e);
			}
		});
		jButtonNewMessage.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonNewMessageMouseClicked(e);
			}
		});
		jButtonDecryptAfterEncrypt.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonDecryptAfterEncryptMouseClicked(e);
			}
		});

// END GENERATED CODE

		jTextFieldMessage.setText(message);

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
		desSimplifed applet = new desSimplifed();
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
		frame.setSize( 890, 540 );
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation( (d.width - frame.getSize().width) / 2,
			(d.height - frame.getSize().height) / 2);
		frame.setVisible( true );
	}
	
	public void jButtonEncryptMouseClicked(java.awt.event.MouseEvent e)
	 {
		
		new Thread()
		{     
		public void run() 
		{
	 	int plainBitsError, keyBitsError,encodeBits;
	 	plainBitsError=0;
	 	keyBitsError=0;
	 	plainText = jTextFieldText.getText();
	 	keyText = jTextFieldKey.getText();
	 	
	 	
	 	if(plainText.length() != 12) 
	 		ErrorPopup("Plain Test should of size 12 only");
	 		
	 	else if(keyText.length() != 9) 
	 		ErrorPopup("Plain Test should of size 9 only");
	 	
	 	else
	 		{
		 	for (int i = 0; i<12; i++)
				{
				encodeBits = Input.Encode(plainText.substring(i,i+1));
				if (encodeBits == -1)
				plainBitsError =1;
		 		else 
				InputText[i] = encodeBits;
				}
			for (int i = 0; i<9; i++)
				{
				encodeBits = Key.Encode(keyText.substring(i,i+1));
				if (encodeBits == -1)
				keyBitsError =1;
				else 
				KeyText[i] = encodeBits;
				}

			if (plainBitsError == 1)
			ErrorPopup("Invalid Message entered, Message should be a binary number of size 12 bits");
			
			else if(keyBitsError ==1)
			ErrorPopup("Invalid Key entered, Key should be a binary number of size 9 bits");
			
			else
				{
				for (int i = 0; i<12; i++)
					{
					InputString[i] = plainText.substring(i,i+1);
					}
		 		for (int i = 0; i<9; i++)
					{
					KeyString[i] = keyText.substring(i,i+1);
					}
			
				InputData.addDataDesignJPanel(InputString);
		 		INIkey.addDataDesignJPanel(KeyString);
			 	jPanelMain.removeAll();
		 	 	jPanelMain.add(InputDataPanel);
	 			jPanelMain.add(INIkeyPanel);
		 		jPanelMain.add(jButtonStage1);
			 	jButtonStage1.setVisible(true);
		 		
			 	
		 		jPanelMain.add(jScrollPaneMessage);
		 		jScrollPaneMessage.setVisible(true);
		 		jPanelMain.repaint();
			 	}
			 	for(int i=0;i<8;i++)
				{
				ExpandFun.upDateDataDesignJPanel(i,Integer.toString(expand[i]));
				}
					 
					}
	 	/*for (int i=0;i<12;i++)
	 	OutputData.upDateDataDesignJPanel(i,Integer.toString(OutputText[i]));
	 	for (int i=0;i<8;i++)
	 	ExpandFun.upDateDataDesignJPanel(i,Integer.toString(expand[i]));
	 	
	 	S1.addDataDesignJPanel(S1box);
	 	S2.addDataDesignJPanel(S2box);
	 	jPanelMain.add(OutputDataPanel);
	 	jPanelMain.add(jButtonDecrypt);
	 	jPanelMain.revalidate();
	 	jPanelMain.repaint();*/
	 	} 
	 	}.start();	
	 	message = message + "\n -----------------------------"+ "\n Encryption " + "\n -----------------------------\n";
		jTextFieldMessage.setText(message);
	}// Encrypt button close
	
	public void jButtonDecryptMouseClicked(java.awt.event.MouseEvent e) {
	new Thread()
		{     
		public void run() 
		{
	 	int encryptedBitsError, keyBitsError,encodeBits;
	 	encryptedBitsError=0;
	 	keyBitsError=0;
	 	plainText = jTextFieldText.getText();
	 	keyText = jTextFieldKey.getText();
	 	
	 	
	 	if(plainText.length() != 12) 
	 		ErrorPopup("Encrypted Message should of size 12 only");
	 		
	 	else if(keyText.length() != 9) 
	 		ErrorPopup("Key should of size 9 only");
	 	
	 	else
	 		{
		 	for (int i = 0; i<12; i++)
				{
				encodeBits = Output.Encode(plainText.substring(i,i+1));
				if (encodeBits == -1)
				encryptedBitsError =1;
		 		else 
				OutputText[i] = encodeBits;
				}
			for (int i = 0; i<9; i++)
				{
				encodeBits = Key.Encode(keyText.substring(i,i+1));
				if (encodeBits == -1)
				keyBitsError =1;
				else 
				KeyText[i] = encodeBits;
				}

			if (encryptedBitsError == 1)
			ErrorPopup("Invalid Message entered, Message should be a binary number of size 12 bits");
			
			else if(keyBitsError ==1)
			ErrorPopup("Invalid Key entered, Key should be a binary number of size 9 bits");
			
			else
				{
				for (int i = 0; i<12; i++)
					{
					InputString[i] = plainText.substring(i,i+1);
					}
		 		for (int i = 0; i<9; i++)
					{
					KeyString[i] = keyText.substring(i,i+1);
					}
				OutputDataPanel.setLocation(60,70);
				OutputData.addDataDesignJPanel(InputString);
		 		INIkey.addDataDesignJPanel(KeyString);
			 	jPanelMain.removeAll();
		 	 	jPanelMain.add(OutputDataPanel);
	 			jPanelMain.add(INIkeyPanel);
		 		jPanelMain.add(jButtonDecrypt1);
		 		jPanelMain.add(jScrollPaneMessage);
			 	jButtonDecrypt1.setVisible(true);
		 		
			 	
		 		jPanelMain.revalidate();
		 		jPanelMain.repaint();
			 	}
			 	for(int i=0;i<8;i++)
				{
				ExpandFun.upDateDataDesignJPanel(i,Integer.toString(expand[i]));
				}
				
	 		}
	 	/*for (int i=0;i<12;i++)
	 	OutputData.upDateDataDesignJPanel(i,Integer.toString(OutputText[i]));
	 	for (int i=0;i<8;i++)
	 	ExpandFun.upDateDataDesignJPanel(i,Integer.toString(expand[i]));
	 	
	 	S1.addDataDesignJPanel(S1box);
	 	S2.addDataDesignJPanel(S2box);
	 	jPanelMain.add(OutputDataPanel);
	 	jPanelMain.add(jButtonDecrypt);
	 	jPanelMain.revalidate();
	 	jPanelMain.repaint();*/
	 	} 
	 	}.start();
	 message = message + "\n -----------------------------"+ "\n Decryption " + "\n -----------------------------\n";
			jScrollPaneMessage.setVisible(true);				
				jTextFieldMessage.setText(message);
	 
	}// Dencrypt button close
	
	public void jButtonStage1MouseClicked(java.awt.event.MouseEvent e) {
	message = message + "\n>>\nSpliting the Initial Message bits in to two groups";
	message = message + "\nSelecting the key for stage one i =1, For encryption KEY(i)= 8 bits are selected starting form the i'th bit";
	jScrollPaneMessage.setVisible(true);
	jTextFieldMessage.setText(message);
	new Thread()
		{     
		public void run() 
		{
		
		jPanelMain.remove(jButtonStage1);
	 	
		jPanelMain.add(LeftDataPanel0);
		jPanelMain.add(RightDataPanel0);
		try {Thread.sleep(1000);}catch (InterruptedException ee){}	
		
		for (int i =0;i<6;i++)
		{
		leftText0[i] = InputText[i];
		rightText0[i] = InputText[i+6];
		}
		jPanelMain.repaint();
		InputData.highlightDesignJPanel(0,5,"red");
		LeftData.highlightDesignJPanel(0,5,"red");
		jPanelMain.repaint();
				for(int i=0;i<6;i++)
		leftString0[i]=Integer.toString(leftText0[i]);
		LeftData.addDataDesignJPanel(leftString0);
		try {Thread.sleep(1000);}catch (InterruptedException ee){}	
		InputData.highlightDesignJPanel(0,5,"black");
		LeftData.highlightDesignJPanel(0,5,"black");
		RightData.highlightDesignJPanel(0,5,"red");
		InputData.highlightDesignJPanel(6,11,"red");
		jPanelMain.repaint();
		for(int i=0;i<6;i++)
		rightString0[i]=Integer.toString(rightText0[i]);
		RightData.addDataDesignJPanel(rightString0);
		try {Thread.sleep(1000);}catch (InterruptedException ee){}	
		
		InputData.highlightDesignJPanel(6,11,"black");
		RightData.highlightDesignJPanel(0,5,"black");
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(2000);}catch (InterruptedException ee){}	
		jPanelMain.add(KeyDataPanel0);

		INIkey.highlightDesignJPanel(0,7,"red");
		for(int i=0;i<8;i++)
		{
		KeyData0.upDateDataDesignJPanel(i,KeyString[i]);
		key0[i]=KeyText[i];
		jPanelMain.repaint();
		}
		INIkey.highlightDesignJPanel(0,7,"black");
		jPanelMain.add(jButtonStage2);
		jButtonStage2.setVisible(true);
		//jPanelMain.revalidate();
		jPanelMain.repaint();
		} 
	 	}.start();
		
	}// Stage1 button close
	
	public void jButtonStage2MouseClicked(java.awt.event.MouseEvent e) {
		message = message +"\n>>\nExpand the Right 6 bits using the Expand Function";
		jTextFieldMessage.setText(message);
	new Thread()
		{     
		public void run() 
		{
		jButtonStage2.setVisible(false);
		jPanelMain.add(ExpandFunPanel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		
		jPanelMain.revalidate();
		jPanelMain.repaint();
		jPanelMain.add(ExpandSeqPanel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		for( int i =0;i<8;i++)
		{
			j = expand[i];
			expandRight[i] = rightText0[j-1];
			RightData.highlightDesignJPanel(j-1,j-1,"red");
			ExpandSeq.upDateDataDesignJPanel(i,Integer.toString(rightText0[j-1]));
			jPanelMain.revalidate();
			jPanelMain.repaint();
			try {Thread.sleep(2000);}catch (InterruptedException ee){}	
			RightData.highlightDesignJPanel(j-1,j-1,"black");
			jPanelMain.revalidate();
			jPanelMain.repaint();
		}
		jPanelMain.revalidate();
		jPanelMain.repaint();
		//try {Thread.sleep(2000);}catch (InterruptedException ee){}	
		
		////
		jPanelMain.remove(jButtonStage2);	
		jPanelMain.add(jButtonStage3);
		jButtonStage3.setVisible(true);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		} 
		}.start();
	}
	
	public void jButtonStage3MouseClicked(java.awt.event.MouseEvent e) {
		message = message +"\n>>\nXOR on Key #1 and Expanded Right Block";
		jTextFieldMessage.setText(message);
		
	new Thread()
		{     
		public void run() 
		{
		
		jButtonStage3.setVisible(false);
		jPanelMain.remove(ExpandFunPanel);
		for(int i=0;i<9;i++)
		{
		ExpandSeqPanel.setLocation(570,140+i*5);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(100);}catch (InterruptedException ee){}	
		}
		
		for(int i=0;i<45;i++)
		{
		
		ExpandSeqPanel.setLocation(570-i*5,180);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(100);}catch (InterruptedException ee){}	
		}
		jPanelMain.add(EORPanel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		

		for (int i = 8;i>0;i--)
		{
			KeyData0.highlightDesignJPanel(i-1,i-1,"red");
			ExpandSeq.highlightDesignJPanel(i-1,i-1,"red");	
			k = (key0[i-1]+ expandRight[i-1]) % 2 ;
			XOR[i-1] = k; 
			EOR.upDateDataDesignJPanel(i-1,Integer.toString(k));
			try {Thread.sleep(500);}catch (InterruptedException ee){}	
			KeyData0.highlightDesignJPanel(i-1,i-1,"black");
			ExpandSeq.highlightDesignJPanel(i-1,i-1,"black");
			
		}
		try {Thread.sleep(1000);}catch (InterruptedException ee){}
		jPanelMain.remove(jButtonStage3);	
		jPanelMain.add(jButtonStage4);
		jButtonStage4.setVisible(true);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		
	
	
		} 
		}.start();
	}
	
	public void jButtonStage4MouseClicked(java.awt.event.MouseEvent e) {
		message = message +"\n>>\nThe First 4 bits of XOR used to pick the value from S-box1";
		jTextFieldMessage.setText(message);
	new Thread()
		{     
		public void run() 
		{
		jButtonStage4.setVisible(false);
		jPanelMain.remove(ExpandSeqPanel);
		
		
		jPanelMain.revalidate();
		jPanelMain.repaint();		
		try {Thread.sleep(1000);}catch (InterruptedException ee){}	
		S1.addDataDesignJPanel(S1box);
		S2.addDataDesignJPanel(S2box);
		jPanelMain.add(S1Panel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(1000);}catch (InterruptedException ee){}	
		jPanelMain.add(FunRKPanel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		EOR.highlightDesignJPanel(0,3,"red");	
		try {Thread.sleep(200);}catch (InterruptedException ee){}	
	
		temp = XOR[0]*8 +XOR[1]*4+XOR[2]*2+XOR[3]*1;
		S1.highlightDesignJPanel(temp,temp,"red");	
		strtemp = S1box[temp];
		Fun_RK[0]=Integer.parseInt(strtemp.substring(0,1));
		Fun_RK[1]=Integer.parseInt(strtemp.substring(1,2));
		Fun_RK[2]=Integer.parseInt(strtemp.substring(2,3));
		for (int i =0;i<3;i++)
			FunRK.upDateDataDesignJPanel(i,Integer.toString(Fun_RK[i]));
		try {Thread.sleep(1000);}catch (InterruptedException ee){}	
		S1.highlightDesignJPanel(temp,temp,"black");	
		EOR.highlightDesignJPanel(0,3,"black");	
		jPanelMain.remove(jButtonStage4);	
		jPanelMain.add(jButtonStage5);
		jButtonStage5.setVisible(true);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		} 
		}.start();
	
	}
	
	public void jButtonStage5MouseClicked(java.awt.event.MouseEvent e) {
		message = message +"\n>>\nThe Last 4 bits of XOR used to pick the value from S-box2";
		jTextFieldMessage.setText(message);
	new Thread()
		{     
		public void run() 
		{
		jButtonStage5.setVisible(false);
		try {Thread.sleep(1000);}catch (InterruptedException ee){}	
		jPanelMain.remove(S1Panel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(200);}catch (InterruptedException ee){}	
		jPanelMain.add(S2Panel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(200);}catch (InterruptedException ee){}	
		temp = XOR[4]*8 +XOR[5]*4+XOR[6]*2+XOR[7]*1;
		S2.highlightDesignJPanel(temp,temp,"red");
		EOR.highlightDesignJPanel(4,7,"red");		
		strtemp1 = S2box[temp];
		Fun_RK[3]=Integer.parseInt(strtemp1.substring(0,1));
		Fun_RK[4]=Integer.parseInt(strtemp1.substring(1,2));
		Fun_RK[5]=Integer.parseInt(strtemp1.substring(2,3));
		for (int i =3;i<6;i++)
		FunRK.upDateDataDesignJPanel(i,Integer.toString(Fun_RK[i]));
		try {Thread.sleep(1000);}catch (InterruptedException ee){}	
		S2.highlightDesignJPanel(temp,temp,"black");	
		EOR.highlightDesignJPanel(4,7,"black");	
		jPanelMain.revalidate();
		jPanelMain.repaint();
		jPanelMain.remove(jButtonStage5);	
		jPanelMain.add(jButtonStage6);
		jButtonStage6.setVisible(true);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		} 
		}.start();
	}
	
	public void jButtonStage6MouseClicked(java.awt.event.MouseEvent e) {
		message = message +"\n>>\nNow ExOR the Left data and f(R0, K1)";
		jTextFieldMessage.setText(message);
	new Thread()
		{     
		public void run() 
		{
		jPanelMain.remove(EORPanel);	
		jPanelMain.remove(S2Panel);		
		jButtonStage6.setVisible(false);
		for(int i=0;i<85;i++)
		{
		FunRKPanel.setLocation(460-i*5,340);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(100);}catch (InterruptedException ee){}	
		}
		for(int i=0;i<33;i++)
		{
		FunRKPanel.setLocation(40,340-i*5);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(200);}catch (InterruptedException ee){}	
		}
		
		jPanelMain.add(RightDataPanel1);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		
		for (int i = 6;i>0;i--)
		{
			LeftData.highlightDesignJPanel(i-1,i-1,"red");
			FunRK.highlightDesignJPanel(i-1,i-1,"red");	
			k = (leftText0[i-1]+ Fun_RK[i-1]) % 2 ;
			XOR[i-1] = k; 
			rightText1[i-1]=k;
			RightData1.upDateDataDesignJPanel(i-1,Integer.toString(k));
			jPanelMain.revalidate();
			jPanelMain.repaint();
			try {Thread.sleep(1000);}catch (InterruptedException ee){}	
			LeftData.highlightDesignJPanel(i-1,i-1,"black");
			FunRK.highlightDesignJPanel(i-1,i-1,"black");
			jPanelMain.revalidate();
			jPanelMain.repaint();	
		
		}
		jPanelMain.remove(jButtonStage6);	
		jPanelMain.add(jButtonStage7);
		jButtonStage7.setVisible(true);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		} 
		}.start();
	}
	
	public void jButtonStage7MouseClicked(java.awt.event.MouseEvent e) {
		message = message +"\n>>\nMove Right data 0 in to Left Data 1";
		jTextFieldMessage.setText(message);
	new Thread()
		{     
		public void run() 
		{
		jButtonStage7.setVisible(false);
		jPanelMain.remove(FunRKPanel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		for(int i=0;i<31;i++)
		{
		RightDataPanel1.setLocation(40+i*5,240);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(200);}catch (InterruptedException ee){}	
		}
		try {Thread.sleep(1000);}catch (InterruptedException ee){}		
		jPanelMain.add(LeftDataPanel1);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		for(int i=0;i<6;i++)
			{
			leftText1[i]=rightText0[i];
			LeftData1.upDateDataDesignJPanel(i,Integer.toString(rightText0[i]));
			
			}
		jPanelMain.remove(jButtonStage7);	
		jPanelMain.add(jButtonStage8);
		jButtonStage8.setVisible(true);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		
		} 
		}.start();
	}
	
	public void jButtonStage8MouseClicked(java.awt.event.MouseEvent e) {
		message = message +"\n>>\n Selecting the key for stage two,for encryption KEY(2)= 8 bits are selected starting form the 2'th bit";
		jTextFieldMessage.setText(message);
	new Thread()
		{     
		public void run() 
		{
		jButtonStage8.setVisible(false);
		for(int i=0;i<13;i++)
		{
		LeftDataPanel1.setLocation(40,240-i*5);
		RightDataPanel1.setLocation(190,240-i*5);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(100);}catch (InterruptedException ee){}	
		}
		jPanelMain.add(KeyDataPanel1);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		INIkey.highlightDesignJPanel(1,8,"red");
		jPanelMain.revalidate();
		jPanelMain.repaint();
		for(int i=0;i<8;i++)
		{
		KeyData1.upDateDataDesignJPanel(i,KeyString[i+1]);
		key1[i]=KeyText[i+1];
		jPanelMain.repaint();
		}
		INIkey.highlightDesignJPanel(1,8,"black");
		jPanelMain.revalidate();
		jPanelMain.repaint();
		jPanelMain.add(jButtonStage9);
		jButtonStage9.setVisible(true);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		} 
		}.start();
	}
	
	public void jButtonStage9MouseClicked(java.awt.event.MouseEvent e) {
		message = message + "\n>>\nExpand the Right 6 bits using the Expand Function";
		jTextFieldMessage.setText(message);
	new Thread()
		{     
		public void run() 
		{
		jButtonStage9.setVisible(false);
		try {Thread.sleep(200);}catch (InterruptedException ee){}
		jPanelMain.add(ExpandFunPanel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		ExpandSeq.addDataDesignJPanel();
		jPanelMain.add(ExpandSeqPanel);
		ExpandSeqPanel.setLocation(570,180);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		for( int i =0;i<8;i++)
		{
			j = expand[i];
			expandRight[i] = rightText1[j-1];
			RightData1.highlightDesignJPanel(j-1,j-1,"red");
			ExpandSeq.upDateDataDesignJPanel(i,Integer.toString(rightText1[j-1]));
			jPanelMain.revalidate();
			jPanelMain.repaint();
			try {Thread.sleep(2000);}catch (InterruptedException ee){}	
			RightData1.highlightDesignJPanel(j-1,j-1,"black");
			jPanelMain.revalidate();
			jPanelMain.repaint();
		}
		jPanelMain.revalidate();
		jPanelMain.repaint();
		//try {Thread.sleep(2000);}catch (InterruptedException ee){}	
		
		////
		jPanelMain.remove(jButtonStage9);	
		jPanelMain.add(jButtonStage10);
		jButtonStage10.setVisible(true);
		jPanelMain.revalidate();
		jPanelMain.repaint();
	
		} 
		}.start();
	}
	
	public void jButtonStage10MouseClicked(java.awt.event.MouseEvent e) {
		message = message + "\n>>\nXOR on Key #2 and Expanded Right Block";
		jTextFieldMessage.setText(message);
		new Thread()
		{     
		public void run() 
		{
		
		jButtonStage10.setVisible(false);
		jPanelMain.remove(ExpandFunPanel);
		for(int i=0;i<12;i++)
		{
		ExpandSeqPanel.setLocation(570,180+i*5);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(100);}catch (InterruptedException ee){}	
		}
		
		for(int i=0;i<45;i++)
		{
		
		ExpandSeqPanel.setLocation(570-i*5,235);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(100);}catch (InterruptedException ee){}	
		}
		
		EOR.addDataDesignJPanel();
		
		EORPanel.setLocation(350,280);
		jPanelMain.add(EORPanel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		

		for (int i = 8;i>0;i--)
		{
			KeyData1.highlightDesignJPanel(i-1,i-1,"red");
			ExpandSeq.highlightDesignJPanel(i-1,i-1,"red");	
			k = (key1[i-1]+ expandRight[i-1]) % 2 ;
			XOR[i-1] = k; 
			EOR.upDateDataDesignJPanel(i-1,Integer.toString(k));
			try {Thread.sleep(500);}catch (InterruptedException ee){}	
			KeyData1.highlightDesignJPanel(i-1,i-1,"black");
			ExpandSeq.highlightDesignJPanel(i-1,i-1,"black");
			
		}
		try {Thread.sleep(1000);}catch (InterruptedException ee){}
		jPanelMain.remove(jButtonStage10);	
		jPanelMain.add(jButtonStage11);
		jButtonStage11.setVisible(true);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		} 
		}.start();
	}
	
	public void jButtonStage11MouseClicked(java.awt.event.MouseEvent e) {
		message = message +"\n>>\nThe First 4 bits of XOR used to pick the value from S-box1";
		jTextFieldMessage.setText(message);
		new Thread()
		{     
		public void run() 
		{
		jButtonStage11.setVisible(false);
		jPanelMain.remove(ExpandSeqPanel);
		jPanelMain.revalidate();
		jPanelMain.repaint();		
		S1Panel.setLocation(570,280);
		S2Panel.setLocation(570,280);		
		jPanelMain.add(S1Panel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(1000);}catch (InterruptedException ee){}	
		FunRKPanel.setLocation(460,380);
		FunRK.addDataDesignJPanel();	
		jPanelMain.add(FunRKPanel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		EOR.highlightDesignJPanel(0,3,"red");	
		try {Thread.sleep(200);}catch (InterruptedException ee){}	
		temp = XOR[0]*8 +XOR[1]*4+XOR[2]*2+XOR[3]*1;
		S1.highlightDesignJPanel(temp,temp,"red");	
		strtemp = S1box[temp];
		Fun_RK[0]=Integer.parseInt(strtemp.substring(0,1));
		Fun_RK[1]=Integer.parseInt(strtemp.substring(1,2));
		Fun_RK[2]=Integer.parseInt(strtemp.substring(2,3));
		for (int i =0;i<3;i++)
			FunRK.upDateDataDesignJPanel(i,Integer.toString(Fun_RK[i]));
		try {Thread.sleep(1000);}catch (InterruptedException ee){}	
		S1.highlightDesignJPanel(temp,temp,"black");	
		EOR.highlightDesignJPanel(0,3,"black");	
		jPanelMain.remove(jButtonStage11);	
		jPanelMain.add(jButtonStage12);
		jButtonStage12.setVisible(true);
		jPanelMain.revalidate();
		jPanelMain.repaint();
	
		} 
		}.start();
	}
	
	public void jButtonStage12MouseClicked(java.awt.event.MouseEvent e) {
	
		message = message + "\n>>\nThe Last 4 bits of XOR used to pick the value from S-box2";
		jTextFieldMessage.setText(message);
		new Thread()
		{     
		public void run() 
		{
		jButtonStage12.setVisible(false);
		try {Thread.sleep(500);}catch (InterruptedException ee){}	
		jPanelMain.remove(S1Panel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(200);}catch (InterruptedException ee){}	
		jPanelMain.add(S2Panel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(200);}catch (InterruptedException ee){}	
		temp = XOR[4]*8 +XOR[5]*4+XOR[6]*2+XOR[7]*1;
		S2.highlightDesignJPanel(temp,temp,"red");
		EOR.highlightDesignJPanel(4,7,"red");		
		strtemp1 = S2box[temp];
		Fun_RK[3]=Integer.parseInt(strtemp1.substring(0,1));
		Fun_RK[4]=Integer.parseInt(strtemp1.substring(1,2));
		Fun_RK[5]=Integer.parseInt(strtemp1.substring(2,3));
		for (int i =3;i<6;i++)
		FunRK.upDateDataDesignJPanel(i,Integer.toString(Fun_RK[i]));
		try {Thread.sleep(1000);}catch (InterruptedException ee){}	
		S2.highlightDesignJPanel(temp,temp,"black");	
		EOR.highlightDesignJPanel(4,7,"black");	
		jPanelMain.revalidate();
		jPanelMain.repaint();
		jPanelMain.remove(jButtonStage12);	
		jPanelMain.add(jButtonStage13);
		jButtonStage13.setVisible(true);
		jPanelMain.revalidate();
		jPanelMain.repaint();
	
		} 
		}.start();
	}
	
	public void jButtonStage13MouseClicked(java.awt.event.MouseEvent e) {
		message = message + "\n>>\nNow ExOR the Left data and f(R1, K2)";
		jTextFieldMessage.setText(message);
		new Thread()
		{     
		public void run() 
		{
		jPanelMain.remove(EORPanel);	
		jPanelMain.remove(S2Panel);	
		jButtonStage13.setVisible(false);
		for(int i=0;i<85;i++)
		{
		FunRKPanel.setLocation(460-i*5,380);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(100);}catch (InterruptedException ee){}	
		}
		for(int i=0;i<31;i++)
		{
		FunRKPanel.setLocation(40,380-i*5);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(100);}catch (InterruptedException ee){}	
		}
		
		jPanelMain.add(RightDataPanel2);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		
		for (int i = 6;i>0;i--)
		{
			LeftData1.highlightDesignJPanel(i-1,i-1,"red");
			FunRK.highlightDesignJPanel(i-1,i-1,"red");	
			k = (leftText1[i-1]+ Fun_RK[i-1]) % 2 ;
			XOR[i-1] = k; 
			rightText2[i-1]=k;
			RightData2.upDateDataDesignJPanel(i-1,Integer.toString(k));
			jPanelMain.revalidate();
			jPanelMain.repaint();
			try {Thread.sleep(1000);}catch (InterruptedException ee){}	
			LeftData1.highlightDesignJPanel(i-1,i-1,"black");
			FunRK.highlightDesignJPanel(i-1,i-1,"black");
			jPanelMain.revalidate();
			jPanelMain.repaint();	
		
		}
		jPanelMain.remove(jButtonStage13);	
		jPanelMain.add(jButtonStage14);
		jButtonStage14.setVisible(true);
		jPanelMain.revalidate();
		jPanelMain.repaint();
	
		} 
		}.start();
	}
	
	public void jButtonStage14MouseClicked(java.awt.event.MouseEvent e) {
		message = message + "\n>>\nMove Right Data 1 in to Left Data 2";
		jTextFieldMessage.setText(message);
		new Thread()
		{     
		public void run()
		{
		jButtonStage14.setVisible(false);
		jPanelMain.remove(FunRKPanel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		for(int i=0;i<31;i++)
		{
		RightDataPanel2.setLocation(40+i*5,280);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(200);}catch (InterruptedException ee){}	
		}
		try {Thread.sleep(1000);}catch (InterruptedException ee){}		
		jPanelMain.add(LeftDataPanel2);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		for(int i=0;i<6;i++)
			{
			leftText2[i]=rightText1[i];
			LeftData2.upDateDataDesignJPanel(i,Integer.toString(rightText1[i]));
			
			}
		jPanelMain.remove(jButtonStage14);	
		jPanelMain.add(jButtonStage15);
		jButtonStage15.setVisible(true);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		} 
		}.start();
	}
	
	public void jButtonStage15MouseClicked(java.awt.event.MouseEvent e) {
		message = message + "\n>>\nKEY(3)= 8 bits are selected starting form the 3'rd bit, on reaching last bit move to First bit ";
		jTextFieldMessage.setText(message);
		new Thread()
		{     
		public void run()
		{

		jButtonStage15.setVisible(false);
		for(int i=0;i<9;i++)
		{
		LeftDataPanel2.setLocation(40,280-i*5);
		RightDataPanel2.setLocation(190,280-i*5);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(100);}catch (InterruptedException ee){}	
		}
		jPanelMain.add(KeyDataPanel2);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		INIkey.highlightDesignJPanel(2,8,"red");
		INIkey.highlightDesignJPanel(0,0,"red");
		jPanelMain.revalidate();
		jPanelMain.repaint();
		for(int i=0;i<8;i++)
		{
		KeyData2.upDateDataDesignJPanel(i,KeyString[(i+2)%9]);
		key2[i]=KeyText[(i+2)%9];
		jPanelMain.repaint();
		}
		INIkey.highlightDesignJPanel(0,0,"black");
		INIkey.highlightDesignJPanel(2,8,"black");
		jPanelMain.revalidate();
		jPanelMain.repaint();
		jPanelMain.remove(jButtonStage15);	
		jPanelMain.add(jButtonStage16);
		jButtonStage16.setVisible(true);
		jPanelMain.revalidate();
		jPanelMain.repaint();

		} 
		}.start();
	}
	
	public void jButtonStage16MouseClicked(java.awt.event.MouseEvent e) {
		message = message +"\n>>\nExpand the Right 6 bits using the Expand Function";
		jTextFieldMessage.setText(message);
		new Thread()
		{     
		public void run()
		{
		jButtonStage16.setVisible(false);
		try {Thread.sleep(200);}catch (InterruptedException ee){}
		jPanelMain.add(ExpandFunPanel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		ExpandSeq.addDataDesignJPanel();
		jPanelMain.add(ExpandSeqPanel);
		ExpandSeqPanel.setLocation(570,240);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		for( int i =0;i<8;i++)
		{
			j = expand[i];
			expandRight[i] = rightText2[j-1];
			RightData2.highlightDesignJPanel(j-1,j-1,"red");
			ExpandSeq.upDateDataDesignJPanel(i,Integer.toString(rightText2[j-1]));
			jPanelMain.revalidate();
			jPanelMain.repaint();
			try {Thread.sleep(2000);}catch (InterruptedException ee){}	
			RightData2.highlightDesignJPanel(j-1,j-1,"black");
			jPanelMain.revalidate();
			jPanelMain.repaint();
		}
		jPanelMain.revalidate();
		jPanelMain.repaint();
		//try {Thread.sleep(2000);}catch (InterruptedException ee){}	
		
		////
		jPanelMain.remove(jButtonStage16);	
		jPanelMain.add(jButtonStage17);
		jButtonStage17.setVisible(true);
		jPanelMain.revalidate();
		jPanelMain.repaint();
	
		

		} 
		}.start();
	}
	
	public void jButtonStage17MouseClicked(java.awt.event.MouseEvent e) {
		message = message + "\n>>\n XOR on Key #3 and Expanded Right Block";
		jTextFieldMessage.setText(message);
		new Thread()
		{     
		public void run()
		{
		jButtonStage17.setVisible(false);
		jPanelMain.remove(ExpandFunPanel);
		for(int i=0;i<10;i++)
		{
		ExpandSeqPanel.setLocation(570,240+i*5);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(100);}catch (InterruptedException ee){}	
		}
		
		for(int i=0;i<45;i++)
		{
		
		ExpandSeqPanel.setLocation(570-i*5,290);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(100);}catch (InterruptedException ee){}	
		}
		EOR.addDataDesignJPanel();
		EORPanel.setLocation(350,340);
		jPanelMain.add(EORPanel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		

		for (int i = 8;i>0;i--)
		{
			KeyData2.highlightDesignJPanel(i-1,i-1,"red");
			ExpandSeq.highlightDesignJPanel(i-1,i-1,"red");	
			k = (key2[i-1]+ expandRight[i-1]) % 2 ;
			XOR[i-1] = k; 
			EOR.upDateDataDesignJPanel(i-1,Integer.toString(k));
			try {Thread.sleep(500);}catch (InterruptedException ee){}	
			KeyData2.highlightDesignJPanel(i-1,i-1,"black");
			ExpandSeq.highlightDesignJPanel(i-1,i-1,"black");
			
		}
		try {Thread.sleep(1000);}catch (InterruptedException ee){}
		jPanelMain.remove(jButtonStage17);	
		jPanelMain.add(jButtonStage18);
		jButtonStage18.setVisible(true);
		jPanelMain.revalidate();
		jPanelMain.repaint();



		} 
		}.start();
	}
	
	public void jButtonStage18MouseClicked(java.awt.event.MouseEvent e) {
		message = message + "\n>>\nThe First 4 bits of XOR used to pick the value from S-box1";
		jTextFieldMessage.setText(message);
		new Thread()
		{     
		public void run()
		{
		jButtonStage18.setVisible(false);
		jPanelMain.remove(ExpandSeqPanel);
		jPanelMain.revalidate();
		jPanelMain.repaint();		
		
		S1Panel.setLocation(570,340);
		S2Panel.setLocation(570,340);		
		jPanelMain.add(S1Panel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(1000);}catch (InterruptedException ee){}	
		FunRKPanel.setLocation(460,440);
		FunRK.addDataDesignJPanel();	
		jPanelMain.add(FunRKPanel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		EOR.highlightDesignJPanel(0,3,"red");	
		try {Thread.sleep(200);}catch (InterruptedException ee){}	
	
		temp = XOR[0]*8 +XOR[1]*4+XOR[2]*2+XOR[3]*1;
		S1.highlightDesignJPanel(temp,temp,"red");	
		strtemp = S1box[temp];
		Fun_RK[0]=Integer.parseInt(strtemp.substring(0,1));
		Fun_RK[1]=Integer.parseInt(strtemp.substring(1,2));
		Fun_RK[2]=Integer.parseInt(strtemp.substring(2,3));
		for (int i =0;i<3;i++)
			FunRK.upDateDataDesignJPanel(i,Integer.toString(Fun_RK[i]));
		try {Thread.sleep(1000);}catch (InterruptedException ee){}	
		S1.highlightDesignJPanel(temp,temp,"black");	
		EOR.highlightDesignJPanel(0,3,"black");	
		jPanelMain.remove(jButtonStage18);	
		jPanelMain.add(jButtonStage19);
		jButtonStage19.setVisible(true);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		} 
		}.start();
	}
	
	public void jButtonStage19MouseClicked(java.awt.event.MouseEvent e) {
		message = message + "\n>>\nThe Last 4 bits of XOR used to pick the value from S-box2";
		jTextFieldMessage.setText(message);
	new Thread()
		{     
		public void run()
		{
		jButtonStage19.setVisible(false);
		try {Thread.sleep(500);}catch (InterruptedException ee){}	
		jPanelMain.remove(S1Panel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(200);}catch (InterruptedException ee){}	
		jPanelMain.add(S2Panel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(200);}catch (InterruptedException ee){}	
		temp = XOR[4]*8 +XOR[5]*4+XOR[6]*2+XOR[7]*1;
		S2.highlightDesignJPanel(temp,temp,"red");
		EOR.highlightDesignJPanel(4,7,"red");		
		strtemp1 = S2box[temp];
		Fun_RK[3]=Integer.parseInt(strtemp1.substring(0,1));
		Fun_RK[4]=Integer.parseInt(strtemp1.substring(1,2));
		Fun_RK[5]=Integer.parseInt(strtemp1.substring(2,3));
		for (int i =3;i<6;i++)
		FunRK.upDateDataDesignJPanel(i,Integer.toString(Fun_RK[i]));
		try {Thread.sleep(1000);}catch (InterruptedException ee){}	
		S2.highlightDesignJPanel(temp,temp,"black");	
		EOR.highlightDesignJPanel(4,7,"black");	
		jPanelMain.revalidate();
		jPanelMain.repaint();
		jPanelMain.remove(jButtonStage19);	
		jPanelMain.add(jButtonStage20);
		jButtonStage20.setVisible(true);
		jPanelMain.revalidate();
		jPanelMain.repaint();


		} 
		}.start();
	}
	
	public void jButtonStage20MouseClicked(java.awt.event.MouseEvent e) {
		message = message + "\n>>\n	Now ExOR the Left data and f(R2, K3,)";	
		jTextFieldMessage.setText(message);
	new Thread()
		{     
		public void run()
		{
		jPanelMain.remove(EORPanel);	
		jPanelMain.remove(S2Panel);
		jButtonStage20.setVisible(false);
		for(int i=0;i<85;i++)
		{
		FunRKPanel.setLocation(460-i*5,440);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(100);}catch (InterruptedException ee){}	
		}
		for(int i=0;i<31;i++)
		{
		FunRKPanel.setLocation(40,440-i*5);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(100);}catch (InterruptedException ee){}	
		}
		
		jPanelMain.add(RightDataPanel3);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		
		for (int i = 6;i>0;i--)
		{
			LeftData2.highlightDesignJPanel(i-1,i-1,"red");
			FunRK.highlightDesignJPanel(i-1,i-1,"red");	
			k = (leftText2[i-1]+ Fun_RK[i-1]) % 2 ;
			XOR[i-1] = k; 
			rightText3[i-1]=k;
			RightData3.upDateDataDesignJPanel(i-1,Integer.toString(k));
			jPanelMain.revalidate();
			jPanelMain.repaint();
			try {Thread.sleep(1000);}catch (InterruptedException ee){}	
			LeftData2.highlightDesignJPanel(i-1,i-1,"black");
			FunRK.highlightDesignJPanel(i-1,i-1,"black");
			jPanelMain.revalidate();
			jPanelMain.repaint();	
		
		}
		jPanelMain.remove(jButtonStage20);	
		jPanelMain.add(jButtonStage21);
		jButtonStage21.setVisible(true);
		jPanelMain.revalidate();
		jPanelMain.repaint();
	


		} 
		}.start();
	}
	
	public void jButtonStage21MouseClicked(java.awt.event.MouseEvent e) {
		message = message + "\n>>\nMove Right Data 2 in to  Left Data 3";
		jTextFieldMessage.setText(message);
	new Thread()
		{     
		public void run()
		{
		jButtonStage21.setVisible(false);
		jPanelMain.remove(FunRKPanel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		for(int i=0;i<31;i++)
		{
		RightDataPanel3.setLocation(40+i*5,340);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(200);}catch (InterruptedException ee){}	
		}
		try {Thread.sleep(1000);}catch (InterruptedException ee){}		
		jPanelMain.add(LeftDataPanel3);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		for(int i=0;i<6;i++)
			{
			leftText3[i]=rightText2[i];
			LeftData3.upDateDataDesignJPanel(i,Integer.toString(rightText2[i]));
			
			}
		jPanelMain.remove(jButtonStage21);	
		jPanelMain.add(jButtonStage22);
		jButtonStage22.setVisible(true);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		

		} 
		}.start();
	}
	
	public void jButtonStage22MouseClicked(java.awt.event.MouseEvent e) {
		message = message + "\n>>\nWe can have any number of rounds\nWe are using only 3 round \nso this is our encrypted message";
		jTextFieldMessage.setText(message);
	new Thread()
		{     
		public void run()
		{

		jButtonStage22.setVisible(false);
		for(int i=0;i<9;i++)
		{
		LeftDataPanel3.setLocation(40,340-i*5);
		RightDataPanel3.setLocation(190,340-i*5);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(100);}catch (InterruptedException ee){}	
		}
		for (int i =0;i<6;i++)
		{
		 OutputText[i+6] = leftText3[i];
		 OutputText[i]=  rightText3[i];
		}
		jPanelMain.add(OutputDataPanel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		RightData3.highlightDesignJPanel(0,5,"red");
		jPanelMain.repaint();
		for(int i=0;i<6;i++)
			{

			OutputData.upDateDataDesignJPanel(i,Integer.toString(OutputText[i]));
			jPanelMain.revalidate();
			jPanelMain.repaint();
			}
		RightData3.highlightDesignJPanel(0,5,"black");
		jPanelMain.repaint();
		
		LeftData3.highlightDesignJPanel(0,5,"red");
		jPanelMain.repaint();
		for(int i=6;i<12;i++)
			{

			OutputData.upDateDataDesignJPanel(i,Integer.toString(OutputText[i]));
			jPanelMain.revalidate();
			jPanelMain.repaint();
			}
		LeftData3.highlightDesignJPanel(0,5,"black");
		jPanelMain.repaint();
		
		
		
		jPanelMain.remove(jButtonStage22);	
		jPanelMain.add(jButtonDecryptAfterEncrypt);
		jPanelMain.add(jButtonNewMessage);
		jButtonDecryptAfterEncrypt.setVisible(true);
		jButtonNewMessage.setVisible(true);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		
		} 
		}.start();
	}
	
	
	public void jButtonDecryptAfterEncryptMouseClicked(java.awt.event.MouseEvent e) {
		message = message + "\n -----------------------------"+ "\n Decryption Countinued After Encryption " + "\n -----------------------------\n";
		jTextFieldMessage.setText(message);
	
	new Thread()
		{     
		public void run() 
		{
		jPanelMain.removeAll();
		
		jPanelMain.add(jScrollPaneMessage);
		
		
		
		jPanelMain.add(OutputDataPanel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		for(int i=0;i<57;i++)
		{
		OutputDataPanel.setLocation(60,350-i*5);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(20);}catch (InterruptedException ee){}	
		}
		
		jPanelMain.add(jButtonDecrypt1);
		jButtonDecrypt1.setVisible(true);
		jPanelMain.revalidate();
	 	jPanelMain.repaint();
	 	
	 	} 
	 	}.start();
	}
	

	public void jButtonDecrypt1MouseClicked(java.awt.event.MouseEvent e) {
	message = message + "\n>>\nSpliting the Initial Message bits in to two groups";
	message = message + "\nSelecting the key for stage one i =1, for decryption KEY(i)= 8 bits are selected starting form the (n-i+1)th = 3-1+1= 3rd bit ";
		
		jTextFieldMessage.setText(message);
	
	new Thread()
		{     
		public void run() 
		{	
		
		jTextFieldMessage.setText(message);
		jButtonDecrypt1.setVisible(false);
		
		
	 	jPanelMain.revalidate();
		jPanelMain.repaint();
		
		LeftData.addDataDesignJPanel();
		RightData.addDataDesignJPanel();
		jPanelMain.add(LeftDataPanel0);
		jPanelMain.add(RightDataPanel0);
		try {Thread.sleep(1000);}catch (InterruptedException ee){}	
		
		for (int i =0;i<6;i++)
		{
		leftText0[i] = OutputText[i];
		rightText0[i] = OutputText[i+6];
		}
		jPanelMain.repaint();
		OutputData.highlightDesignJPanel(0,5,"red");
		LeftData.highlightDesignJPanel(0,5,"red");
		jPanelMain.repaint();
				for(int i=0;i<6;i++)
		leftString0[i]=Integer.toString(leftText0[i]);
		LeftData.addDataDesignJPanel(leftString0);
		try {Thread.sleep(2000);}catch (InterruptedException ee){}	
		OutputData.highlightDesignJPanel(0,5,"black");
		LeftData.highlightDesignJPanel(0,5,"black");
		RightData.highlightDesignJPanel(0,5,"red");
		OutputData.highlightDesignJPanel(6,11,"red");
		jPanelMain.repaint();
		for(int i=0;i<6;i++)
		rightString0[i]=Integer.toString(rightText0[i]);
		RightData.addDataDesignJPanel(rightString0);
		try {Thread.sleep(2000);}catch (InterruptedException ee){}	
		
		OutputData.highlightDesignJPanel(6,11,"black");
		RightData.highlightDesignJPanel(0,5,"black");
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(1000);}catch (InterruptedException ee){}	
		KeyData2.addDataDesignJPanel();
		KeyDataPanel2.setLocation(350,120);
		jPanelMain.add(INIkeyPanel);
		jPanelMain.add(KeyDataPanel2);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		INIkey.highlightDesignJPanel(0,0,"red");
		INIkey.highlightDesignJPanel(2,8,"red");
		for(int i=0;i<8;i++)
		{
		KeyData2.upDateDataDesignJPanel(i,KeyString[(i+2)%9]);
		key2[i]=KeyText[(i+2)%9];
		jPanelMain.repaint();
		}
		INIkey.highlightDesignJPanel(0,0,"black");
		INIkey.highlightDesignJPanel(2,8,"black");
		jPanelMain.revalidate();
		jPanelMain.repaint();
		jPanelMain.remove(jButtonDecrypt1);	
		jPanelMain.add(jButtonDecrypt2);
		jButtonDecrypt2.setVisible(true);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		} 
		}.start();
	}
	
	public void jButtonDecrypt2MouseClicked(java.awt.event.MouseEvent e) {
		message = message +"\n>>\nExpand the Right 6 bits using the Expand Function";
		jTextFieldMessage.setText(message);
	
	new Thread()
		{     
		public void run() 
		{	
		jButtonDecrypt2.setVisible(false);
		try {Thread.sleep(200);}catch (InterruptedException ee){}
		jPanelMain.add(ExpandFunPanel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		ExpandSeqPanel.setLocation(570,120);
		ExpandSeq.addDataDesignJPanel();
		jPanelMain.add(ExpandSeqPanel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		for( int i =0;i<8;i++)
		{
			j = expand[i];
			expandRight[i] = rightText0[j-1];
			RightData.highlightDesignJPanel(j-1,j-1,"red");
			ExpandSeq.upDateDataDesignJPanel(i,Integer.toString(rightText0[j-1]));
			jPanelMain.revalidate();
			jPanelMain.repaint();
			try {Thread.sleep(2000);}catch (InterruptedException ee){}	
			RightData.highlightDesignJPanel(j-1,j-1,"black");
			jPanelMain.revalidate();
			jPanelMain.repaint();
		}
		jPanelMain.revalidate();
		jPanelMain.repaint();
		//try {Thread.sleep(2000);}catch (InterruptedException ee){}	
		
		////
		jPanelMain.remove(jButtonDecrypt2);	
		jPanelMain.add(jButtonDecrypt3);
		jButtonDecrypt3.setVisible(true);
		jPanelMain.revalidate();
		jPanelMain.repaint();
	
		
		} 
		}.start();
	}
		
	public void jButtonDecrypt3MouseClicked(java.awt.event.MouseEvent e) {
		message = message + "\n>>\n	XOR on Key #3 and Expanded Right Block";
		jTextFieldMessage.setText(message);
	
	new Thread()
		{     
		public void run() 
		{	
		jButtonDecrypt3.setVisible(false);
		jPanelMain.remove(ExpandFunPanel);
		for(int i=0;i<11;i++)
		{
		ExpandSeqPanel.setLocation(570,120+i*5);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(100);}catch (InterruptedException ee){}	
		}
		
		for(int i=0;i<45;i++)
		{
		
		ExpandSeqPanel.setLocation(570-i*5,170);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(100);}catch (InterruptedException ee){}	
		}
		EORPanel.setLocation(350,220);
		EOR.addDataDesignJPanel();
		jPanelMain.add(EORPanel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		

		for (int i = 8;i>0;i--)
		{
			KeyData2.highlightDesignJPanel(i-1,i-1,"red");
			ExpandSeq.highlightDesignJPanel(i-1,i-1,"red");	
			k = (key2[i-1]+ expandRight[i-1]) % 2 ;
			XOR[i-1] = k; 
			EOR.upDateDataDesignJPanel(i-1,Integer.toString(k));
			try {Thread.sleep(500);}catch (InterruptedException ee){}	
			KeyData2.highlightDesignJPanel(i-1,i-1,"black");
			ExpandSeq.highlightDesignJPanel(i-1,i-1,"black");
			
		}
		try {Thread.sleep(1000);}catch (InterruptedException ee){}
		jPanelMain.remove(jButtonDecrypt3);	
		jPanelMain.add(jButtonDecrypt4);
		jButtonDecrypt4.setVisible(true);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		
	
	
		} 
		}.start();
	}
		
	public void jButtonDecrypt4MouseClicked(java.awt.event.MouseEvent e) {
		message = message + "\n>>\nThe First 4 bits of XOR used to pick the value from S-box1";
		jTextFieldMessage.setText(message);
	
	new Thread()
		{     
		public void run() 
		{	
		jButtonDecrypt4.setVisible(false);
		jPanelMain.remove(ExpandSeqPanel);
		jPanelMain.revalidate();
		jPanelMain.repaint();		
		
		S1Panel.setLocation(570,220);
		S2Panel.setLocation(570,220);		
		jPanelMain.add(S1Panel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(1000);}catch (InterruptedException ee){}	
		FunRK.addDataDesignJPanel();	
		FunRKPanel.setLocation(460,340);
		jPanelMain.add(FunRKPanel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		EOR.highlightDesignJPanel(0,3,"red");	
		try {Thread.sleep(200);}catch (InterruptedException ee){}	
	
		temp = XOR[0]*8 +XOR[1]*4+XOR[2]*2+XOR[3]*1;
		S1.highlightDesignJPanel(temp,temp,"red");	
		strtemp = S1box[temp];
		Fun_RK[0]=Integer.parseInt(strtemp.substring(0,1));
		Fun_RK[1]=Integer.parseInt(strtemp.substring(1,2));
		Fun_RK[2]=Integer.parseInt(strtemp.substring(2,3));
		for (int i =0;i<3;i++)
			FunRK.upDateDataDesignJPanel(i,Integer.toString(Fun_RK[i]));
		try {Thread.sleep(1000);}catch (InterruptedException ee){}	
		S1.highlightDesignJPanel(temp,temp,"black");	
		EOR.highlightDesignJPanel(0,3,"black");	
		jPanelMain.remove(jButtonDecrypt4);	
		jPanelMain.add(jButtonDecrypt5);
		jButtonDecrypt5.setVisible(true);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		} 
		}.start();
	}
		
	public void jButtonDecrypt5MouseClicked(java.awt.event.MouseEvent e) {
		message = message + "\n>>\nThe Last 4 bits of XOR used to pick the value from S-box2";
		jTextFieldMessage.setText(message);
	
	new Thread()
		{     
		public void run() 
		{	
		jButtonDecrypt5.setVisible(false);
		jPanelMain.remove(S1Panel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(200);}catch (InterruptedException ee){}
		try {Thread.sleep(500);}catch (InterruptedException ee){}	
		jPanelMain.add(S2Panel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(200);}catch (InterruptedException ee){}	
		temp = XOR[4]*8 +XOR[5]*4+XOR[6]*2+XOR[7]*1;
		S2.highlightDesignJPanel(temp,temp,"red");
		EOR.highlightDesignJPanel(4,7,"red");		
		strtemp1 = S2box[temp];
		Fun_RK[3]=Integer.parseInt(strtemp1.substring(0,1));
		Fun_RK[4]=Integer.parseInt(strtemp1.substring(1,2));
		Fun_RK[5]=Integer.parseInt(strtemp1.substring(2,3));
		for (int i =3;i<6;i++)
		FunRK.upDateDataDesignJPanel(i,Integer.toString(Fun_RK[i]));
		try {Thread.sleep(1000);}catch (InterruptedException ee){}	
		S2.highlightDesignJPanel(temp,temp,"black");	
		EOR.highlightDesignJPanel(4,7,"black");	
		jPanelMain.revalidate();
		jPanelMain.repaint();
		jPanelMain.remove(jButtonDecrypt5);	
		jPanelMain.add(jButtonDecrypt6);
		jButtonDecrypt6.setVisible(true);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		
		} 
		}.start();
	}
		
	public void jButtonDecrypt6MouseClicked(java.awt.event.MouseEvent e) {
		message = message +"\n>>\nNow ExOR the Left data and f(R0, K3)";	
		jTextFieldMessage.setText(message);
	
	new Thread()
		{     
		public void run() 
		{	
		jButtonDecrypt6.setVisible(false);
		jPanelMain.remove(EORPanel);	
		jPanelMain.remove(S2Panel);	
		jPanelMain.revalidate();
		jPanelMain.repaint();
		LeftDataPanel1.setLocation(40,240);	
		RightDataPanel1.setLocation(40,240);
		LeftData1.addDataDesignJPanel();
		RightData1.addDataDesignJPanel();
		jButtonStage6.setVisible(false);
		for(int i=0;i<85;i++)
		{
		FunRKPanel.setLocation(460-i*5,340);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(100);}catch (InterruptedException ee){}	
		}
		for(int i=0;i<33;i++)
		{
		FunRKPanel.setLocation(40,340-i*5);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(100);}catch (InterruptedException ee){}	
		}
		
		jPanelMain.add(RightDataPanel1);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		
		for (int i = 6;i>0;i--)
		{
			LeftData.highlightDesignJPanel(i-1,i-1,"red");
			FunRK.highlightDesignJPanel(i-1,i-1,"red");	
			k = (leftText0[i-1]+ Fun_RK[i-1]) % 2 ;
			XOR[i-1] = k; 
			rightText1[i-1]=k;
			RightData1.upDateDataDesignJPanel(i-1,Integer.toString(k));
			jPanelMain.revalidate();
			jPanelMain.repaint();
			try {Thread.sleep(1000);}catch (InterruptedException ee){}	
			LeftData.highlightDesignJPanel(i-1,i-1,"black");
			FunRK.highlightDesignJPanel(i-1,i-1,"black");
			jPanelMain.revalidate();
			jPanelMain.repaint();	
		
		}
		jPanelMain.remove(jButtonDecrypt6);	
		jPanelMain.add(jButtonDecrypt7);
		jButtonDecrypt7.setVisible(true);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		} 
		}.start();
	}
		
	public void jButtonDecrypt7MouseClicked(java.awt.event.MouseEvent e) {
		message = message + "\n>>\nMove Right Data  in to  Left Data 1";
		jTextFieldMessage.setText(message);
	
	new Thread()
		{     
		public void run() 
		{	
		jButtonDecrypt7.setVisible(false);
		jPanelMain.remove(FunRKPanel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		for(int i=0;i<31;i++)
		{
		RightDataPanel1.setLocation(40+i*5,240);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(200);}catch (InterruptedException ee){}	
		}
		try {Thread.sleep(1000);}catch (InterruptedException ee){}		
		jPanelMain.add(LeftDataPanel1);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		for(int i=0;i<6;i++)
			{
			leftText1[i]=rightText0[i];
			LeftData1.upDateDataDesignJPanel(i,Integer.toString(rightText0[i]));
			
			}
		jPanelMain.remove(jButtonDecrypt7);	
		jPanelMain.add(jButtonDecrypt8);
		jButtonDecrypt8.setVisible(true);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		
		} 
		}.start();
	}
	
	public void jButtonDecrypt8MouseClicked(java.awt.event.MouseEvent e) {
		message = message +"\n>>\n Selecting the key for stage two i =2,for decryption KEY(2)= 8 bits are selected starting form the (n-i+1)th = 3-2+1 =2nd bit";
		jTextFieldMessage.setText(message);
	
	new Thread()
		{     
		public void run() 
		{	
		jButtonDecrypt8.setVisible(false);
		for(int i=0;i<13;i++)
		{
		LeftDataPanel1.setLocation(40,240-i*5);
		RightDataPanel1.setLocation(190,240-i*5);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(100);}catch (InterruptedException ee){}	
		}
		KeyData1.addDataDesignJPanel();
		jPanelMain.add(KeyDataPanel1);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		INIkey.highlightDesignJPanel(1,8,"red");
		jPanelMain.revalidate();
		jPanelMain.repaint();
		for(int i=0;i<8;i++)
		{
		KeyData1.upDateDataDesignJPanel(i,KeyString[i+1]);
		key1[i]=KeyText[i+1];
		jPanelMain.repaint();
		}
		INIkey.highlightDesignJPanel(1,8,"black");
		jPanelMain.revalidate();
		jPanelMain.repaint();
		jPanelMain.remove(jButtonDecrypt8);
		jPanelMain.add(jButtonDecrypt9);
		jButtonDecrypt9.setVisible(true);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		} 
		}.start();
	}
	
	public void jButtonDecrypt9MouseClicked(java.awt.event.MouseEvent e) {
		message = message +"\n>>\nExpand the Right 6 bits using the Expand Function";
		jTextFieldMessage.setText(message);
	
	new Thread()
		{     
		public void run() 
		{	
		jButtonDecrypt9.setVisible(false);
		try {Thread.sleep(200);}catch (InterruptedException ee){}
		jPanelMain.add(ExpandFunPanel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		ExpandSeq.addDataDesignJPanel();
		jPanelMain.add(ExpandSeqPanel);
		ExpandSeqPanel.setLocation(570,180);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		for( int i =0;i<8;i++)
		{
			j = expand[i];
			expandRight[i] = rightText1[j-1];
			RightData1.highlightDesignJPanel(j-1,j-1,"red");
			ExpandSeq.upDateDataDesignJPanel(i,Integer.toString(rightText1[j-1]));
			jPanelMain.revalidate();
			jPanelMain.repaint();
			try {Thread.sleep(2000);}catch (InterruptedException ee){}	
			RightData1.highlightDesignJPanel(j-1,j-1,"black");
			jPanelMain.revalidate();
			jPanelMain.repaint();
		}
		jPanelMain.revalidate();
		jPanelMain.repaint();
		//try {Thread.sleep(2000);}catch (InterruptedException ee){}	
		
		////
		jPanelMain.remove(jButtonDecrypt9);	
		jPanelMain.add(jButtonDecrypt10);
		jButtonDecrypt10.setVisible(true);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		} 
		}.start();
	}
	
	public void jButtonDecrypt10MouseClicked(java.awt.event.MouseEvent e) {
		message = message + "\n>>\n	XOR on Key #2 and Expanded Right Block";
		jTextFieldMessage.setText(message);
	new Thread()
		{     
		public void run() 
		{	
		jButtonDecrypt10.setVisible(false);
		jPanelMain.remove(ExpandFunPanel);
		for(int i=0;i<12;i++)
		{
		ExpandSeqPanel.setLocation(570,180+i*5);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(100);}catch (InterruptedException ee){}	
		}
		
		for(int i=0;i<45;i++)
		{
		
		ExpandSeqPanel.setLocation(570-i*5,235);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(100);}catch (InterruptedException ee){}	
		}
		
		EOR.addDataDesignJPanel();
		
		EORPanel.setLocation(350,280);
		jPanelMain.add(EORPanel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		

		for (int i = 8;i>0;i--)
		{
			KeyData1.highlightDesignJPanel(i-1,i-1,"red");
			ExpandSeq.highlightDesignJPanel(i-1,i-1,"red");	
			k = (key1[i-1]+ expandRight[i-1]) % 2 ;
			XOR[i-1] = k; 
			EOR.upDateDataDesignJPanel(i-1,Integer.toString(k));
			try {Thread.sleep(500);}catch (InterruptedException ee){}	
			KeyData1.highlightDesignJPanel(i-1,i-1,"black");
			ExpandSeq.highlightDesignJPanel(i-1,i-1,"black");
			
		}
		try {Thread.sleep(1000);}catch (InterruptedException ee){}
		jPanelMain.remove(jButtonDecrypt10);	
		jPanelMain.add(jButtonDecrypt11);
		jButtonDecrypt11.setVisible(true);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		
		} 
		}.start();
	}
	
	public void jButtonDecrypt11MouseClicked(java.awt.event.MouseEvent e) {
		message = message + "\n>>\nThe First 4 bits of XOR used to pick the value from S-box1";
		jTextFieldMessage.setText(message);
	new Thread()
		{     
		public void run() 
		{	
		jButtonDecrypt11.setVisible(false);
		jPanelMain.remove(ExpandSeqPanel);
		jPanelMain.revalidate();
		jPanelMain.repaint();		
		S1Panel.setLocation(570,280);
		S2Panel.setLocation(570,280);		
		jPanelMain.add(S1Panel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(1000);}catch (InterruptedException ee){}	
		FunRKPanel.setLocation(460,380);
		FunRK.addDataDesignJPanel();	
		jPanelMain.add(FunRKPanel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		EOR.highlightDesignJPanel(0,3,"red");	
		try {Thread.sleep(200);}catch (InterruptedException ee){}	
		temp = XOR[0]*8 +XOR[1]*4+XOR[2]*2+XOR[3]*1;
		S1.highlightDesignJPanel(temp,temp,"red");	
		strtemp = S1box[temp];
		Fun_RK[0]=Integer.parseInt(strtemp.substring(0,1));
		Fun_RK[1]=Integer.parseInt(strtemp.substring(1,2));
		Fun_RK[2]=Integer.parseInt(strtemp.substring(2,3));
		for (int i =0;i<3;i++)
			FunRK.upDateDataDesignJPanel(i,Integer.toString(Fun_RK[i]));
		try {Thread.sleep(1000);}catch (InterruptedException ee){}	
		S1.highlightDesignJPanel(temp,temp,"black");	
		EOR.highlightDesignJPanel(0,3,"black");	
		jPanelMain.remove(jButtonDecrypt11);	
		jPanelMain.add(jButtonDecrypt12);
		jButtonDecrypt12.setVisible(true);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		
		} 
		}.start();
	}
	
	public void jButtonDecrypt12MouseClicked(java.awt.event.MouseEvent e) {
		message = message + "\n>>\nThe Last 4 bits of XOR used to pick the value from S-box2";
		jTextFieldMessage.setText(message);
	new Thread()
		{     
			
		public void run() 
		{
		jButtonDecrypt12.setVisible(false);
		try {Thread.sleep(500);}catch (InterruptedException ee){}	
		jPanelMain.remove(S1Panel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(200);}catch (InterruptedException ee){}	
		jPanelMain.add(S2Panel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(200);}catch (InterruptedException ee){}	
		temp = XOR[4]*8 +XOR[5]*4+XOR[6]*2+XOR[7]*1;
		S2.highlightDesignJPanel(temp,temp,"red");
		EOR.highlightDesignJPanel(4,7,"red");		
		strtemp1 = S2box[temp];
		Fun_RK[3]=Integer.parseInt(strtemp1.substring(0,1));
		Fun_RK[4]=Integer.parseInt(strtemp1.substring(1,2));
		Fun_RK[5]=Integer.parseInt(strtemp1.substring(2,3));
		for (int i =3;i<6;i++)
		FunRK.upDateDataDesignJPanel(i,Integer.toString(Fun_RK[i]));
		try {Thread.sleep(1000);}catch (InterruptedException ee){}	
		S2.highlightDesignJPanel(temp,temp,"black");	
		EOR.highlightDesignJPanel(4,7,"black");	
		jPanelMain.revalidate();
		jPanelMain.repaint();
		jPanelMain.remove(jButtonDecrypt12);	
		jPanelMain.add(jButtonDecrypt13);
		jButtonDecrypt13.setVisible(true);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		
		} 
		}.start();
	}
	
	public void jButtonDecrypt13MouseClicked(java.awt.event.MouseEvent e) {
		message = message +"\n>>\nNow ExOR the Left data and f(R1, K2)";		
		jTextFieldMessage.setText(message);
	new Thread()
		{     
		public void run() 
		{	
		jButtonDecrypt13.setVisible(false);
		jPanelMain.remove(EORPanel);	
		jPanelMain.remove(S2Panel);
		jPanelMain.revalidate();
		jPanelMain.repaint();	
		LeftDataPanel2.setLocation(40,280);	
		RightDataPanel2.setLocation(40,280);
		LeftData2.addDataDesignJPanel();
		RightData2.addDataDesignJPanel();
		jButtonStage13.setVisible(false);
		for(int i=0;i<85;i++)
		{
		FunRKPanel.setLocation(460-i*5,380);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(100);}catch (InterruptedException ee){}	
		}
		for(int i=0;i<31;i++)
		{
		FunRKPanel.setLocation(40,380-i*5);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(100);}catch (InterruptedException ee){}	
		}
		
		jPanelMain.add(RightDataPanel2);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		
		for (int i = 6;i>0;i--)
		{
			LeftData1.highlightDesignJPanel(i-1,i-1,"red");
			FunRK.highlightDesignJPanel(i-1,i-1,"red");	
			k = (leftText1[i-1]+ Fun_RK[i-1]) % 2 ;
			XOR[i-1] = k; 
			rightText2[i-1]=k;
			RightData2.upDateDataDesignJPanel(i-1,Integer.toString(k));
			jPanelMain.revalidate();
			jPanelMain.repaint();
			try {Thread.sleep(1000);}catch (InterruptedException ee){}	
			LeftData1.highlightDesignJPanel(i-1,i-1,"black");
			FunRK.highlightDesignJPanel(i-1,i-1,"black");
			jPanelMain.revalidate();
			jPanelMain.repaint();	
		
		}
		jPanelMain.remove(jButtonDecrypt13);	
		jPanelMain.add(jButtonDecrypt14);
		jButtonDecrypt14.setVisible(true);
		jPanelMain.revalidate();
		jPanelMain.repaint();
	
		} 
		}.start();
	}
	
	public void jButtonDecrypt14MouseClicked(java.awt.event.MouseEvent e) {
		message = message + "\n>>\nMove Right Data 1 in to  Left Data 2";
		jTextFieldMessage.setText(message);
	new Thread()
		{     
		public void run() 
		{	
		jButtonDecrypt14.setVisible(false);
		jPanelMain.remove(FunRKPanel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		for(int i=0;i<31;i++)
		{
		RightDataPanel2.setLocation(40+i*5,280);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(200);}catch (InterruptedException ee){}	
		}
		try {Thread.sleep(1000);}catch (InterruptedException ee){}		
		jPanelMain.add(LeftDataPanel2);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		for(int i=0;i<6;i++)
			{
			leftText2[i]=rightText1[i];
			LeftData2.upDateDataDesignJPanel(i,Integer.toString(rightText1[i]));
			
			}
		jPanelMain.remove(jButtonDecrypt14);	
		jPanelMain.add(jButtonDecrypt15);
		jButtonDecrypt15.setVisible(true);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		
		} 
		}.start();
	}
	
	public void jButtonDecrypt15MouseClicked(java.awt.event.MouseEvent e) {
		message = message + "\nSelecting the key for stage three. i =3, For decryption KEY(i)= 8 bits are selected starting form the (n-i+1)th = 3-3+1 = 1st bit";	
		jTextFieldMessage.setText(message);
	new Thread()
		{     
		public void run() 
		{	
		jButtonDecrypt15.setVisible(false);
		for(int i=0;i<9;i++)
		{
		LeftDataPanel2.setLocation(40,280-i*5);
		RightDataPanel2.setLocation(190,280-i*5);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(100);}catch (InterruptedException ee){}	
		}
		
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(2000);}catch (InterruptedException ee){}
		KeyDataPanel0.setLocation(350,240);
		jPanelMain.add(KeyDataPanel0);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(1000);}catch (InterruptedException ee){}	
		
		INIkey.highlightDesignJPanel(0,7,"red");
		for(int i=0;i<8;i++)
		{
		KeyData0.upDateDataDesignJPanel(i,KeyString[i]);
		key0[i]=KeyText[i];
		jPanelMain.repaint();
		}
		INIkey.highlightDesignJPanel(0,7,"black");
		jPanelMain.remove(jButtonDecrypt15);
		jPanelMain.add(jButtonDecrypt16);
		jButtonDecrypt16.setVisible(true);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		} 
		}.start();
	}
	
	public void jButtonDecrypt16MouseClicked(java.awt.event.MouseEvent e) {
		message = message +"\n>>\nExpand the Right 6 bits using the Expand Function";
		jTextFieldMessage.setText(message);
	new Thread()
		{     
		public void run() 
		{	
		jButtonDecrypt16.setVisible(false);
		try {Thread.sleep(200);}catch (InterruptedException ee){}
		jPanelMain.add(ExpandFunPanel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		ExpandSeq.addDataDesignJPanel();
		jPanelMain.add(ExpandSeqPanel);
		ExpandSeqPanel.setLocation(570,240);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		for( int i =0;i<8;i++)
		{
			j = expand[i];
			expandRight[i] = rightText2[j-1];
			RightData2.highlightDesignJPanel(j-1,j-1,"red");
			ExpandSeq.upDateDataDesignJPanel(i,Integer.toString(rightText2[j-1]));
			jPanelMain.revalidate();
			jPanelMain.repaint();
			try {Thread.sleep(2000);}catch (InterruptedException ee){}	
			RightData2.highlightDesignJPanel(j-1,j-1,"black");
			jPanelMain.revalidate();
			jPanelMain.repaint();
		}
		jPanelMain.revalidate();
		jPanelMain.repaint();
		//try {Thread.sleep(2000);}catch (InterruptedException ee){}	
		
		////
		jPanelMain.remove(jButtonDecrypt16);	
		jPanelMain.add(jButtonDecrypt17);
		jButtonDecrypt17.setVisible(true);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		
		} 
		}.start();
	}
	
	public void jButtonDecrypt17MouseClicked(java.awt.event.MouseEvent e) {
		message = message + "\n>>\n	XOR on Key #1 and Expanded Right Block";
		jTextFieldMessage.setText(message);
	new Thread()
		{     
		public void run() 
		{	
		jButtonDecrypt17.setVisible(false);
		jPanelMain.remove(ExpandFunPanel);
		for(int i=0;i<10;i++)
		{
		ExpandSeqPanel.setLocation(570,240+i*5);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(100);}catch (InterruptedException ee){}	
		}
		
		for(int i=0;i<45;i++)
		{
		
		ExpandSeqPanel.setLocation(570-i*5,290);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(100);}catch (InterruptedException ee){}	
		}
		EOR.addDataDesignJPanel();
		EORPanel.setLocation(350,340);
		jPanelMain.add(EORPanel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		

		for (int i = 8;i>0;i--)
		{
			KeyData0.highlightDesignJPanel(i-1,i-1,"red");
			ExpandSeq.highlightDesignJPanel(i-1,i-1,"red");	
			k = (key0[i-1]+ expandRight[i-1]) % 2 ;
			XOR[i-1] = k; 
			EOR.upDateDataDesignJPanel(i-1,Integer.toString(k));
			try {Thread.sleep(500);}catch (InterruptedException ee){}	
			KeyData0.highlightDesignJPanel(i-1,i-1,"black");
			ExpandSeq.highlightDesignJPanel(i-1,i-1,"black");
			
		}
		try {Thread.sleep(1000);}catch (InterruptedException ee){}
		jPanelMain.remove(jButtonDecrypt17);	
		jPanelMain.add(jButtonDecrypt18);
		jButtonDecrypt18.setVisible(true);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		
		} 
		}.start();
	}
	
	public void jButtonDecrypt18MouseClicked(java.awt.event.MouseEvent e) {
		message = message + "\n>>\nThe First 4 bits of XOR used to pick the value from S-box1";
		jTextFieldMessage.setText(message);
	new Thread()
		{     
		public void run() 
		{	
		jButtonDecrypt18.setVisible(false);
		jPanelMain.remove(ExpandSeqPanel);
		jPanelMain.revalidate();
		jPanelMain.repaint();		
		
		S1Panel.setLocation(570,340);
		S2Panel.setLocation(570,340);		
		jPanelMain.add(S1Panel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(1000);}catch (InterruptedException ee){}	
		FunRKPanel.setLocation(460,440);
		FunRK.addDataDesignJPanel();	
		jPanelMain.add(FunRKPanel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		EOR.highlightDesignJPanel(0,3,"red");	
		try {Thread.sleep(200);}catch (InterruptedException ee){}	
	
		temp = XOR[0]*8 +XOR[1]*4+XOR[2]*2+XOR[3]*1;
		S1.highlightDesignJPanel(temp,temp,"red");	
		strtemp = S1box[temp];
		Fun_RK[0]=Integer.parseInt(strtemp.substring(0,1));
		Fun_RK[1]=Integer.parseInt(strtemp.substring(1,2));
		Fun_RK[2]=Integer.parseInt(strtemp.substring(2,3));
		for (int i =0;i<3;i++)
			FunRK.upDateDataDesignJPanel(i,Integer.toString(Fun_RK[i]));
		try {Thread.sleep(1000);}catch (InterruptedException ee){}	
		S1.highlightDesignJPanel(temp,temp,"black");	
		EOR.highlightDesignJPanel(0,3,"black");	
		jPanelMain.remove(jButtonDecrypt18);	
		jPanelMain.add(jButtonDecrypt19);
		jButtonDecrypt19.setVisible(true);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		
		} 
		}.start();
	}
	
	public void jButtonDecrypt19MouseClicked(java.awt.event.MouseEvent e) {
		message = message + "\n>>\nThe Last 4 bits of XOR used to pick the value from S-box2";
		jTextFieldMessage.setText(message);
	new Thread()
		{     
		public void run() 
		{	
		jButtonDecrypt19.setVisible(false);
		try {Thread.sleep(500);}catch (InterruptedException ee){}	
		jPanelMain.remove(S1Panel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(200);}catch (InterruptedException ee){}	
		jPanelMain.add(S2Panel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(200);}catch (InterruptedException ee){}	
		temp = XOR[4]*8 +XOR[5]*4+XOR[6]*2+XOR[7]*1;
		S2.highlightDesignJPanel(temp,temp,"red");
		EOR.highlightDesignJPanel(4,7,"red");		
		strtemp1 = S2box[temp];
		Fun_RK[3]=Integer.parseInt(strtemp1.substring(0,1));
		Fun_RK[4]=Integer.parseInt(strtemp1.substring(1,2));
		Fun_RK[5]=Integer.parseInt(strtemp1.substring(2,3));
		for (int i =3;i<6;i++)
		FunRK.upDateDataDesignJPanel(i,Integer.toString(Fun_RK[i]));
		try {Thread.sleep(1000);}catch (InterruptedException ee){}	
		S2.highlightDesignJPanel(temp,temp,"black");	
		EOR.highlightDesignJPanel(4,7,"black");	
		jPanelMain.revalidate();
		jPanelMain.repaint();
		jPanelMain.remove(jButtonDecrypt19);	
		jPanelMain.add(jButtonDecrypt20);
		jButtonDecrypt20.setVisible(true);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		
		} 
		}.start();
	}
	
	public void jButtonDecrypt20MouseClicked(java.awt.event.MouseEvent e) {
		message = message +"\n>>\nNow ExOR the Left data and f(R2, K1)";		
		jTextFieldMessage.setText(message);
	new Thread()
		{     
		public void run() 
		{	
		jPanelMain.remove(EORPanel);	
		jPanelMain.remove(S2Panel);	
		jButtonDecrypt20.setVisible(false);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		LeftDataPanel3.setLocation(40,340);	
		RightDataPanel3.setLocation(40,340);
		LeftData3.addDataDesignJPanel();
		RightData3.addDataDesignJPanel();		
		for(int i=0;i<85;i++)
		{
		FunRKPanel.setLocation(460-i*5,440);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(100);}catch (InterruptedException ee){}	
		}
		for(int i=0;i<31;i++)
		{
		FunRKPanel.setLocation(40,440-i*5);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(100);}catch (InterruptedException ee){}	
		}
		
		jPanelMain.add(RightDataPanel3);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		
		for (int i = 6;i>0;i--)
		{
			LeftData2.highlightDesignJPanel(i-1,i-1,"red");
			FunRK.highlightDesignJPanel(i-1,i-1,"red");	
			k = (leftText2[i-1]+ Fun_RK[i-1]) % 2 ;
			XOR[i-1] = k; 
			rightText3[i-1]=k;
			RightData3.upDateDataDesignJPanel(i-1,Integer.toString(k));
			jPanelMain.revalidate();
			jPanelMain.repaint();
			try {Thread.sleep(1000);}catch (InterruptedException ee){}	
			LeftData2.highlightDesignJPanel(i-1,i-1,"black");
			FunRK.highlightDesignJPanel(i-1,i-1,"black");
			jPanelMain.revalidate();
			jPanelMain.repaint();	
		
		}
		jPanelMain.remove(jButtonDecrypt20);	
		jPanelMain.add(jButtonDecrypt21);
		jButtonDecrypt21.setVisible(true);
		jPanelMain.revalidate();
		jPanelMain.repaint();
	
		
		} 
		}.start();
	}
	
	public void jButtonDecrypt21MouseClicked(java.awt.event.MouseEvent e) {
		message = message + "\n>>\nMove Right Data 2 in to  Left Data 3";
		jTextFieldMessage.setText(message);
	new Thread()
		{     
		public void run() 
		{	
		jButtonDecrypt21.setVisible(false);
		jPanelMain.remove(FunRKPanel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		for(int i=0;i<31;i++)
		{
		RightDataPanel3.setLocation(40+i*5,340);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(200);}catch (InterruptedException ee){}	
		}
		try {Thread.sleep(1000);}catch (InterruptedException ee){}		
		jPanelMain.add(LeftDataPanel3);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		for(int i=0;i<6;i++)
			{
			leftText3[i]=rightText2[i];
			LeftData3.upDateDataDesignJPanel(i,Integer.toString(rightText2[i]));
			
			}
		jPanelMain.remove(jButtonDecrypt21);	
		jPanelMain.add(jButtonDecrypt22);
		jButtonDecrypt22.setVisible(true);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		
		} 
		}.start();
	}
	
	public void jButtonDecrypt22MouseClicked(java.awt.event.MouseEvent e) {
		message = message + "\n---> This is the plain message you entered";
		jTextFieldMessage.setText(message);
	new Thread()
		{     
		public void run()
		{

		jButtonDecrypt22.setVisible(false);
		for(int i=0;i<9;i++)
		{
		LeftDataPanel3.setLocation(40,340-i*5);
		RightDataPanel3.setLocation(190,340-i*5);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		try {Thread.sleep(100);}catch (InterruptedException ee){}	
		}
		for (int i =0;i<6;i++)
		{
		 InputText[i+6] = leftText3[i];
		 InputText[i]=  rightText3[i];
		}
		InputDataPanel.setLocation(60,350);
		InputData.addDataDesignJPanel();
		jPanelMain.add(InputDataPanel);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		RightData3.highlightDesignJPanel(0,5,"red");
		jPanelMain.revalidate();
		jPanelMain.repaint();
		for(int i=0;i<6;i++)
			{

			InputData.upDateDataDesignJPanel(i,Integer.toString(InputText[i]));
			jPanelMain.revalidate();
			jPanelMain.repaint();
			}
		RightData3.highlightDesignJPanel(0,5,"black");
		jPanelMain.revalidate();
		jPanelMain.repaint();
		LeftData3.highlightDesignJPanel(0,5,"red");
		jPanelMain.revalidate();
		jPanelMain.repaint();
		for(int i=6;i<12;i++)
			{

			InputData.upDateDataDesignJPanel(i,Integer.toString(InputText[i]));
			jPanelMain.revalidate();
			jPanelMain.repaint();
			}
		LeftData3.highlightDesignJPanel(0,5,"black");
		jPanelMain.revalidate();
		jPanelMain.repaint();
		
		
		
		jPanelMain.remove(jButtonDecrypt22);	
		jPanelMain.add(jButtonNewMessage);
		jButtonNewMessage.setVisible(true);
		jPanelMain.revalidate();
		jPanelMain.repaint();
		
		} 
		}.start();
	}
	
	public void jButtonNewMessageMouseClicked(java.awt.event.MouseEvent e) {
		jPanelMain.removeAll();
		jTextFieldText.setText("");
	 	jTextFieldKey.setText("");
		jPanelMain.add(jLabelText);
		jPanelMain.add(jLabelKey);
		jPanelMain.add(jTextFieldText);
		jPanelMain.add(jTextFieldKey);
		jPanelMain.add(jLabelRestrictions1);
		jPanelMain.add(jLabelRestrictions2);
		jPanelMain.add(jLabelRestrictions3);
		jPanelMain.add(jButtonEncrypt);
		jPanelMain.add(jButtonDecrypt);
		jPanelMain.revalidate();
	 	jPanelMain.repaint();
	}
	
	public void ErrorPopup(String message)	
	{
	jOptionPane1.showMessageDialog(this,message,"Error",JOptionPane.ERROR_MESSAGE);
	}
	
																																																
}
