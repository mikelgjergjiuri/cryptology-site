/** 
 * simplifiedRSA.java
 *
 * Title:			simplified RAS
 * Description:	
 * @author			chilukas
 * @version			
 */

package simplifiedRSA;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import java.lang.Object;
import java.lang.StrictMath;
import java.math.BigInteger;
import java.lang.Number;
import java.lang.Character;







public class simplifiedRSA extends javax.swing.JApplet {

// IMPORTANT: Source code between BEGIN/END comment pair will be regenerated
// every time the form is saved. All manual changes will be overwritten.
// BEGIN GENERATED CODE
	// member declarations
	javax.swing.JPanel jPanelMain = new javax.swing.JPanel();
	javax.swing.JTextField jTextFieldInput1 = new javax.swing.JTextField();
	javax.swing.JTextField jTextFieldInput2 = new javax.swing.JTextField();
	javax.swing.JTextField jTextFieldInput3 = new javax.swing.JTextField();
	javax.swing.JTextField jTextFieldInput4 = new javax.swing.JTextField();
	javax.swing.JLabel jLabelCaption1 = new javax.swing.JLabel();
	javax.swing.JPanel jPanela = new javax.swing.JPanel();
	javax.swing.JLabel jLabela = new javax.swing.JLabel();
	javax.swing.JPanel jPanelb = new javax.swing.JPanel();
	javax.swing.JLabel jLabelb = new javax.swing.JLabel();
	javax.swing.JPanel jPanela1 = new javax.swing.JPanel();
	javax.swing.JLabel jLabela1 = new javax.swing.JLabel();
	javax.swing.JPanel jPanelb1 = new javax.swing.JPanel();
	javax.swing.JLabel jLabelb1 = new javax.swing.JLabel();
	javax.swing.JPanel jPanelM = new javax.swing.JPanel();
	javax.swing.JScrollPane jScrollPaneM = new javax.swing.JScrollPane();
	javax.swing.JLabel jLabelM = new javax.swing.JLabel();
	javax.swing.JPanel jPanelN = new javax.swing.JPanel();
	javax.swing.JScrollPane jScrollPaneN = new javax.swing.JScrollPane();
	javax.swing.JLabel jLabelN = new javax.swing.JLabel();
	javax.swing.JPanel jPanelE = new javax.swing.JPanel();
	javax.swing.JScrollPane jScrollPaneE = new javax.swing.JScrollPane();
	javax.swing.JLabel jLabelE = new javax.swing.JLabel();
	javax.swing.JPanel jPanelD = new javax.swing.JPanel();
	javax.swing.JScrollPane jScrollPaneD = new javax.swing.JScrollPane();
	javax.swing.JLabel jLabelD = new javax.swing.JLabel();
	javax.swing.JPanel jPanelPublic = new javax.swing.JPanel();
	javax.swing.JScrollPane jScrollPanePublic = new javax.swing.JScrollPane();
	javax.swing.JLabel jLabelPublic = new javax.swing.JLabel();
	javax.swing.JPanel jPanelPrivate = new javax.swing.JPanel();
	javax.swing.JScrollPane jScrollPanePrivate = new javax.swing.JScrollPane();
	javax.swing.JLabel jLabelPrivate = new javax.swing.JLabel();
	javax.swing.JButton jButtonKeyReset = new javax.swing.JButton();
	javax.swing.JButton jButtonEncrypt = new javax.swing.JButton();
	javax.swing.JButton jButtonDecrypt = new javax.swing.JButton();
	javax.swing.JCheckBox jCheckBoxDetail = new javax.swing.JCheckBox();
	javax.swing.JPanel jInternalPlain = new javax.swing.JPanel();
	javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
	javax.swing.JToolBar jToolBar1 = new javax.swing.JToolBar();
	javax.swing.JTextPane jTextPane2 = new javax.swing.JTextPane();
	javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
	javax.swing.JTextPane jTextPanePlain = new javax.swing.JTextPane();
	javax.swing.JPanel jInternalEncrypt = new javax.swing.JPanel();
	javax.swing.JPanel jPanel4 = new javax.swing.JPanel();
	javax.swing.JToolBar jToolBar2 = new javax.swing.JToolBar();
	javax.swing.JTextPane jTextPane3 = new javax.swing.JTextPane();
	javax.swing.JScrollPane jScrollPane2 = new javax.swing.JScrollPane();
	javax.swing.JTextPane jTextPaneEncrypt = new javax.swing.JTextPane();
	javax.swing.JScrollPane jScrollPaneDetails = new javax.swing.JScrollPane();
	javax.swing.JTextPane jTextPaneDetails = new javax.swing.JTextPane();
// END GENERATED CODE
	javax.swing.JOptionPane jOptionPane1 = new javax.swing.JOptionPane();
	
	String sInput1,sInput2,sInput3,sInput4; // strings to read the input(a,b,a`,b`)
	BigInteger a,b,a1,b1;							// integers to hold a,b,a`,b`
	BigInteger M,E,D,N	;
	BigInteger oneValue = new BigInteger("1");		
	String powerstoten[] = {"1","2","3","4","5","6","7","8","9","10"};
	int block;
	boolean isStandalone = false;
	String sPlain,sEncrypt;
	long   iPlain[],iEncrypt[];
	int    iePlain[],ipEncrypt[];
	char cPlain[],cEncrypt[];
	int waitTime=20;
	BigInteger plainBlocks	[], plainBlocks1 [];
	BigInteger EncryptBlocks [], EncryptBlocks1 []	;
	int pB;
	int detailsSelected;

	public simplifiedRSA() {
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
		jPanelMain.setBorder(new javax.swing.plaf.BorderUIResource.TitledBorderUIResource(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, false), "Simplified R.S.A", 4, 2, new java.awt.Font("Dialog", 1, 12), java.awt.Color.darkGray));
		jPanelMain.setLayout(null);
		jPanelMain.setLocation(new java.awt.Point(0, 0));
		jPanelMain.setSize(new java.awt.Dimension(880, 570));
		jPanelMain.setVisible(true);
		jTextFieldInput1.setBorder(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(0, java.awt.Color.lightGray, new java.awt.Color(178, 178, 178)));
		jTextFieldInput1.setLocation(new java.awt.Point(60, 70));
		jTextFieldInput1.setSize(new java.awt.Dimension(80, 20));
		jTextFieldInput1.setToolTipText("Enter a number");
		jTextFieldInput1.setVisible(true);
		jTextFieldInput2.setBorder(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(0, java.awt.Color.lightGray, new java.awt.Color(178, 178, 178)));
		jTextFieldInput2.setLocation(new java.awt.Point(170, 70));
		jTextFieldInput2.setSize(new java.awt.Dimension(80, 20));
		jTextFieldInput2.setToolTipText("Enter a number");
		jTextFieldInput2.setVisible(true);
		jTextFieldInput3.setBorder(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(0, java.awt.Color.lightGray, new java.awt.Color(178, 178, 178)));
		jTextFieldInput3.setLocation(new java.awt.Point(280, 70));
		jTextFieldInput3.setSize(new java.awt.Dimension(80, 20));
		jTextFieldInput3.setToolTipText("Enter a number");
		jTextFieldInput3.setVisible(true);
		jTextFieldInput4.setBorder(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(0, java.awt.Color.lightGray, new java.awt.Color(178, 178, 178)));
		jTextFieldInput4.setLocation(new java.awt.Point(390, 70));
		jTextFieldInput4.setSize(new java.awt.Dimension(80, 20));
		jTextFieldInput4.setToolTipText("Enter a number");
		jTextFieldInput4.setVisible(true);
		jLabelCaption1.setBackground(java.awt.Color.white);
		jLabelCaption1.setFont(new java.awt.Font("SansSerif", 2, 14));
		jLabelCaption1.setForeground(java.awt.Color.gray);
		jLabelCaption1.setLocation(new java.awt.Point(30, 20));
		jLabelCaption1.setOpaque(true);
		jLabelCaption1.setSize(new java.awt.Dimension(350, 30));
		jLabelCaption1.setText(" Enter 4 Numbers : A,B,A1,B1");
		jLabelCaption1.setVisible(true);
		jPanela.setBackground(java.awt.Color.white);
		jPanela.setBorder(new javax.swing.plaf.BorderUIResource.TitledBorderUIResource(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, false), "A", 4, 2, new java.awt.Font("Dialog", 1, 12), java.awt.Color.magenta));
		jPanela.setLayout(null);
		jPanela.setLocation(new java.awt.Point(40, 50));
		jPanela.setSize(new java.awt.Dimension(110, 50));
		jPanela.setToolTipText("Enter a number");
		jPanela.setVisible(true);
		jLabela.setBackground(java.awt.Color.white);
		jLabela.setBorder(new javax.swing.plaf.BorderUIResource.BevelBorderUIResource(0));
		jLabela.setForeground(java.awt.Color.magenta);
		jLabela.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabela.setLocation(new java.awt.Point(20, 20));
		jLabela.setSize(new java.awt.Dimension(80, 20));
		jLabela.setToolTipText("click to change the value of a");
		jLabela.setVisible(true);
		jPanelb.setBackground(java.awt.Color.white);
		jPanelb.setBorder(new javax.swing.plaf.BorderUIResource.TitledBorderUIResource(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, false), "B", 4, 2, new java.awt.Font("Dialog", 1, 12), java.awt.Color.magenta));
		jPanelb.setLayout(null);
		jPanelb.setLocation(new java.awt.Point(150, 50));
		jPanelb.setSize(new java.awt.Dimension(110, 50));
		jPanelb.setToolTipText("Enter a number");
		jPanelb.setVisible(true);
		jLabelb.setBackground(java.awt.Color.white);
		jLabelb.setBorder(new javax.swing.plaf.BorderUIResource.BevelBorderUIResource(0));
		jLabelb.setForeground(java.awt.Color.magenta);
		jLabelb.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabelb.setLocation(new java.awt.Point(20, 20));
		jLabelb.setSize(new java.awt.Dimension(80, 20));
		jLabelb.setToolTipText("click to change the value of b");
		jLabelb.setVisible(true);
		jPanela1.setBackground(java.awt.Color.white);
		jPanela1.setBorder(new javax.swing.plaf.BorderUIResource.TitledBorderUIResource(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, false), "A1", 4, 2, new java.awt.Font("Dialog", 1, 12), java.awt.Color.magenta));
		jPanela1.setLayout(null);
		jPanela1.setLocation(new java.awt.Point(260, 50));
		jPanela1.setSize(new java.awt.Dimension(110, 50));
		jPanela1.setToolTipText("Enter a number");
		jPanela1.setVisible(true);
		jLabela1.setBackground(java.awt.Color.white);
		jLabela1.setBorder(new javax.swing.plaf.BorderUIResource.BevelBorderUIResource(0));
		jLabela1.setForeground(java.awt.Color.magenta);
		jLabela1.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabela1.setLocation(new java.awt.Point(20, 20));
		jLabela1.setSize(new java.awt.Dimension(80, 20));
		jLabela1.setToolTipText("click to change the value of a'");
		jLabela1.setVisible(true);
		jPanelb1.setBackground(java.awt.Color.white);
		jPanelb1.setBorder(new javax.swing.plaf.BorderUIResource.TitledBorderUIResource(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, false), "B1", 4, 2, new java.awt.Font("Dialog", 1, 12), java.awt.Color.magenta));
		jPanelb1.setLayout(null);
		jPanelb1.setLocation(new java.awt.Point(370, 50));
		jPanelb1.setSize(new java.awt.Dimension(110, 50));
		jPanelb1.setToolTipText("enter a number");
		jPanelb1.setVisible(true);
		jLabelb1.setBackground(java.awt.Color.white);
		jLabelb1.setBorder(new javax.swing.plaf.BorderUIResource.BevelBorderUIResource(0));
		jLabelb1.setForeground(java.awt.Color.magenta);
		jLabelb1.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabelb1.setLocation(new java.awt.Point(20, 20));
		jLabelb1.setSize(new java.awt.Dimension(80, 20));
		jLabelb1.setToolTipText("click to change the value of b'");
		jLabelb1.setVisible(true);
		jPanelM.setBackground(java.awt.Color.white);
		jPanelM.setBorder(new javax.swing.plaf.BorderUIResource.TitledBorderUIResource(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, false), " M ", 4, 2, new java.awt.Font("Dialog", 1, 18), java.awt.Color.blue));
		jPanelM.setLayout(null);
		jPanelM.setLocation(new java.awt.Point(20, 150));
		jPanelM.setSize(new java.awt.Dimension(230, 70));
		jPanelM.setVisible(false);
		jScrollPaneM.setAlignmentX(0.1F);
		jScrollPaneM.setAlignmentY(0.1F);
		jScrollPaneM.setLocation(new java.awt.Point(30, 20));
		jScrollPaneM.setSize(new java.awt.Dimension(190, 40));
		jScrollPaneM.setVerticalScrollBarPolicy(javax.swing.JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		jScrollPaneM.setVisible(true);
		jLabelM.setBackground(java.awt.Color.white);
		jLabelM.setBorder(new javax.swing.plaf.BorderUIResource.BevelBorderUIResource(0));
		jLabelM.setForeground(java.awt.Color.blue);
		jLabelM.setOpaque(true);
		jLabelM.setVisible(true);
		jPanelN.setBackground(java.awt.Color.white);
		jPanelN.setBorder(new javax.swing.plaf.BorderUIResource.TitledBorderUIResource(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, false), "N", 4, 2, new java.awt.Font("Dialog", 1, 18), java.awt.Color.blue));
		jPanelN.setLayout(null);
		jPanelN.setLocation(new java.awt.Point(260, 220));
		jPanelN.setSize(new java.awt.Dimension(230, 70));
		jPanelN.setVisible(false);
		jScrollPaneN.setLocation(new java.awt.Point(30, 20));
		jScrollPaneN.setSize(new java.awt.Dimension(190, 40));
		jScrollPaneN.setVerticalScrollBarPolicy(javax.swing.JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		jScrollPaneN.setVisible(true);
		jLabelN.setBackground(java.awt.Color.white);
		jLabelN.setBorder(new javax.swing.plaf.BorderUIResource.BevelBorderUIResource(0));
		jLabelN.setForeground(java.awt.Color.blue);
		jLabelN.setOpaque(true);
		jLabelN.setVisible(true);
		jPanelE.setBackground(java.awt.Color.white);
		jPanelE.setBorder(new javax.swing.plaf.BorderUIResource.TitledBorderUIResource(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, false), "E", 4, 2, new java.awt.Font("Dialog", 1, 18), java.awt.Color.blue));
		jPanelE.setLayout(null);
		jPanelE.setLocation(new java.awt.Point(260, 150));
		jPanelE.setSize(new java.awt.Dimension(230, 70));
		jPanelE.setVisible(false);
		jScrollPaneE.setLocation(new java.awt.Point(30, 20));
		jScrollPaneE.setSize(new java.awt.Dimension(190, 40));
		jScrollPaneE.setVerticalScrollBarPolicy(javax.swing.JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		jScrollPaneE.setVisible(true);
		jLabelE.setBackground(java.awt.Color.white);
		jLabelE.setBorder(new javax.swing.plaf.BorderUIResource.BevelBorderUIResource(0));
		jLabelE.setForeground(java.awt.Color.blue);
		jLabelE.setOpaque(true);
		jLabelE.setVisible(true);
		jPanelD.setBackground(java.awt.Color.white);
		jPanelD.setBorder(new javax.swing.plaf.BorderUIResource.TitledBorderUIResource(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, false), "D", 4, 2, new java.awt.Font("Dialog", 1, 18), java.awt.Color.blue));
		jPanelD.setLayout(null);
		jPanelD.setLocation(new java.awt.Point(20, 220));
		jPanelD.setSize(new java.awt.Dimension(230, 70));
		jPanelD.setVisible(false);
		jScrollPaneD.setLocation(new java.awt.Point(30, 20));
		jScrollPaneD.setSize(new java.awt.Dimension(190, 40));
		jScrollPaneD.setVerticalScrollBarPolicy(javax.swing.JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		jScrollPaneD.setVisible(true);
		jLabelD.setBackground(java.awt.Color.white);
		jLabelD.setBorder(new javax.swing.plaf.BorderUIResource.BevelBorderUIResource(0));
		jLabelD.setForeground(java.awt.Color.blue);
		jLabelD.setOpaque(true);
		jLabelD.setVisible(true);
		jPanelPublic.setBackground(java.awt.Color.white);
		jPanelPublic.setBorder(new javax.swing.plaf.BorderUIResource.TitledBorderUIResource(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, false), "Public Key", 4, 2, new java.awt.Font("Dialog", 1, 12), java.awt.Color.pink));
		jPanelPublic.setLayout(null);
		jPanelPublic.setLocation(new java.awt.Point(260, 290));
		jPanelPublic.setSize(new java.awt.Dimension(230, 70));
		jPanelPublic.setVisible(false);
		jScrollPanePublic.setLocation(new java.awt.Point(30, 20));
		jScrollPanePublic.setSize(new java.awt.Dimension(190, 40));
		jScrollPanePublic.setVerticalScrollBarPolicy(javax.swing.JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		jScrollPanePublic.setVisible(true);
		jLabelPublic.setBackground(java.awt.Color.white);
		jLabelPublic.setBorder(new javax.swing.plaf.BorderUIResource.BevelBorderUIResource(0));
		jLabelPublic.setForeground(java.awt.Color.pink);
		jLabelPublic.setOpaque(true);
		jLabelPublic.setVisible(true);
		jPanelPrivate.setBackground(java.awt.Color.white);
		jPanelPrivate.setBorder(new javax.swing.plaf.BorderUIResource.TitledBorderUIResource(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, false), "Private Key", 4, 2, new java.awt.Font("Dialog", 1, 12), java.awt.Color.pink));
		jPanelPrivate.setLayout(null);
		jPanelPrivate.setLocation(new java.awt.Point(20, 290));
		jPanelPrivate.setSize(new java.awt.Dimension(230, 70));
		jPanelPrivate.setVisible(false);
		jScrollPanePrivate.setLocation(new java.awt.Point(30, 20));
		jScrollPanePrivate.setSize(new java.awt.Dimension(190, 40));
		jScrollPanePrivate.setVerticalScrollBarPolicy(javax.swing.JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		jScrollPanePrivate.setVisible(true);
		jLabelPrivate.setBackground(java.awt.Color.white);
		jLabelPrivate.setBorder(new javax.swing.plaf.BorderUIResource.BevelBorderUIResource(0));
		jLabelPrivate.setForeground(java.awt.Color.pink);
		jLabelPrivate.setOpaque(true);
		jLabelPrivate.setVisible(true);
		jButtonKeyReset.setBackground(java.awt.Color.lightGray);
		jButtonKeyReset.setBorder(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(142, 142, 142)));
		jButtonKeyReset.setFont(new java.awt.Font("Serif", 2, 18));
		jButtonKeyReset.setIconTextGap(10);
		jButtonKeyReset.setLocation(new java.awt.Point(170, 110));
		jButtonKeyReset.setSize(new java.awt.Dimension(150, 30));
		jButtonKeyReset.setText("S T A R T");
		jButtonKeyReset.setVisible(true);
		jButtonEncrypt.setBackground(new java.awt.Color(206, 206, 255));
		jButtonEncrypt.setBorder(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(0, new java.awt.Color(205, 205, 255), new java.awt.Color(144, 144, 178)));
		jButtonEncrypt.setLocation(new java.awt.Point(370, 400));
		jButtonEncrypt.setSize(new java.awt.Dimension(160, 30));
		jButtonEncrypt.setText(">>> E N C R Y P T >>>");
		jButtonEncrypt.setVisible(false);
		jButtonDecrypt.setBackground(new java.awt.Color(206, 206, 255));
		jButtonDecrypt.setBorder(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(0, new java.awt.Color(205, 205, 255), new java.awt.Color(144, 144, 178)));
		jButtonDecrypt.setLocation(new java.awt.Point(370, 500));
		jButtonDecrypt.setSize(new java.awt.Dimension(160, 30));
		jButtonDecrypt.setText("<<< D E C R Y P T <<<");
		jButtonDecrypt.setVisible(false);
		jCheckBoxDetail.setBackground(java.awt.Color.white);
		jCheckBoxDetail.setBorder(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178)));
		jCheckBoxDetail.setLocation(new java.awt.Point(380, 450));
		jCheckBoxDetail.setSize(new java.awt.Dimension(140, 20));
		jCheckBoxDetail.setText("Explanation");
		jCheckBoxDetail.setVisible(false);
		jInternalPlain.setBackground(new java.awt.Color(86, 92, 140));
		jInternalPlain.setLayout(null);
		jInternalPlain.setLocation(new java.awt.Point(30, 370));
		jInternalPlain.setSize(new java.awt.Dimension(340, 170));
		jInternalPlain.setVisible(false);
		jPanel2.setLayout(null);
		jPanel2.setLocation(new java.awt.Point(5, 5));
		jPanel2.setSize(new java.awt.Dimension(330, 160));
		jPanel2.setVisible(true);
		jToolBar1.setBackground(new java.awt.Color(206, 206, 255));
		jToolBar1.setLayout(null);
		jToolBar1.setLocation(new java.awt.Point(0, 0));
		jToolBar1.setSize(new java.awt.Dimension(330, 25));
		jToolBar1.setVisible(true);
		jTextPane2.setBackground(new java.awt.Color(204, 204, 255));
		jTextPane2.setEditable(false);
		jTextPane2.setFont(new java.awt.Font("SansSerif", 1, 13));
		jTextPane2.setLocation(new java.awt.Point(30, 0));
		jTextPane2.setSize(new java.awt.Dimension(100, 25));
		jTextPane2.setText("P L A I N");
		jTextPane2.setVisible(true);
		jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		jScrollPane1.setLocation(new java.awt.Point(3, 30));
		jScrollPane1.setSize(new java.awt.Dimension(324, 128));
		jScrollPane1.setVisible(true);
		jTextPanePlain.setAutoscrolls(false);
		jTextPanePlain.setBorder(new javax.swing.border.LineBorder(java.awt.Color.black, 1, false));
		jTextPanePlain.setVisible(true);
		jInternalEncrypt.setBackground(new java.awt.Color(86, 92, 140));
		jInternalEncrypt.setLayout(null);
		jInternalEncrypt.setLocation(new java.awt.Point(530, 370));
		jInternalEncrypt.setSize(new java.awt.Dimension(340, 170));
		jInternalEncrypt.setVisible(false);
		jPanel4.setLayout(null);
		jPanel4.setLocation(new java.awt.Point(5, 5));
		jPanel4.setSize(new java.awt.Dimension(330, 160));
		jPanel4.setVisible(true);
		jToolBar2.setBackground(new java.awt.Color(206, 206, 255));
		jToolBar2.setLayout(null);
		jToolBar2.setLocation(new java.awt.Point(0, 0));
		jToolBar2.setSize(new java.awt.Dimension(330, 25));
		jToolBar2.setVisible(true);
		jTextPane3.setBackground(new java.awt.Color(204, 204, 255));
		jTextPane3.setEditable(false);
		jTextPane3.setFont(new java.awt.Font("SansSerif", 1, 13));
		jTextPane3.setLocation(new java.awt.Point(30, 0));
		jTextPane3.setSize(new java.awt.Dimension(100, 25));
		jTextPane3.setText("E N C R Y P T E D");
		jTextPane3.setVisible(true);
		jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		jScrollPane2.setLocation(new java.awt.Point(3, 30));
		jScrollPane2.setSize(new java.awt.Dimension(324, 128));
		jScrollPane2.setVisible(true);
		jTextPaneEncrypt.setAutoscrolls(false);
		jTextPaneEncrypt.setBorder(new javax.swing.border.LineBorder(java.awt.Color.black, 1, false));
		jTextPaneEncrypt.setVisible(true);
		jScrollPaneDetails.setHorizontalScrollBarPolicy(javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		jScrollPaneDetails.setLocation(new java.awt.Point(510, 50));
		jScrollPaneDetails.setSize(new java.awt.Dimension(369, 310));
		jScrollPaneDetails.setVisible(false);
		jTextPaneDetails.setEditable(false);
		jTextPaneDetails.setFont(new java.awt.Font("Dialog", 1, 11));
		jTextPaneDetails.setForeground(new java.awt.Color(128, 128, 64));
		jTextPaneDetails.setText("Details will be updated on encryption or decryption");
		jTextPaneDetails.setVisible(true);
		getContentPane().setLayout(null);
		setLocation(new java.awt.Point(0, 0));

		jPanelMain.add(jTextFieldInput1);
		jPanelMain.add(jTextFieldInput2);
		jPanelMain.add(jTextFieldInput3);
		jPanelMain.add(jTextFieldInput4);
		jPanelMain.add(jLabelCaption1);
		jPanelMain.add(jPanela);
		jPanelMain.add(jPanelb);
		jPanelMain.add(jPanela1);
		jPanelMain.add(jPanelb1);
		jPanelMain.add(jPanelM);
		jPanelMain.add(jPanelN);
		jPanelMain.add(jPanelE);
		jPanelMain.add(jPanelD);
		jPanelMain.add(jPanelPublic);
		jPanelMain.add(jPanelPrivate);
		jPanelMain.add(jButtonKeyReset);
		jPanelMain.add(jButtonEncrypt);
		jPanelMain.add(jButtonDecrypt);
		jPanelMain.add(jCheckBoxDetail);
		jPanelMain.add(jInternalPlain);
		jPanelMain.add(jInternalEncrypt);
		jPanelMain.add(jScrollPaneDetails);
		jPanela.add(jLabela);
		jPanelb.add(jLabelb);
		jPanela1.add(jLabela1);
		jPanelb1.add(jLabelb1);
		jPanelM.add(jScrollPaneM);
		jScrollPaneM.getViewport().add(jLabelM);
		jPanelN.add(jScrollPaneN);
		jScrollPaneN.getViewport().add(jLabelN);
		jPanelE.add(jScrollPaneE);
		jScrollPaneE.getViewport().add(jLabelE);
		jPanelD.add(jScrollPaneD);
		jScrollPaneD.getViewport().add(jLabelD);
		jPanelPublic.add(jScrollPanePublic);
		jScrollPanePublic.getViewport().add(jLabelPublic);
		jPanelPrivate.add(jScrollPanePrivate);
		jScrollPanePrivate.getViewport().add(jLabelPrivate);
		jInternalPlain.add(jPanel2);
		jPanel2.add(jToolBar1);
		jPanel2.add(jScrollPane1);
		jToolBar1.add(jTextPane2);
		jScrollPane1.getViewport().add(jTextPanePlain);
		jInternalEncrypt.add(jPanel4);
		jPanel4.add(jToolBar2);
		jPanel4.add(jScrollPane2);
		jToolBar2.add(jTextPane3);
		jScrollPane2.getViewport().add(jTextPaneEncrypt);
		jScrollPaneDetails.getViewport().add(jTextPaneDetails);
		getContentPane().add(jPanelMain);

		setSize(new java.awt.Dimension(880, 570));

		// event handling
		jLabela.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jLabelaMouseClicked(e);
			}
		});
		jLabelb.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jLabelbMouseClicked(e);
			}
		});
		jLabela1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jLabela1MouseClicked(e);
			}
		});
		jLabelb1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jLabelb1MouseClicked(e);
			}
		});
		jButtonKeyReset.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonKeyResetMouseClicked(e);
			}
		});
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
		jCheckBoxDetail.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent e) {
				jCheckBoxDetailItemStateChanged(e);
			}
		});

// END GENERATED CODE
		
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
		simplifiedRSA applet = new simplifiedRSA();
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
	
	public void jButtonKeyResetMouseClicked(java.awt.event.MouseEvent e) {
 		sInput1 = jTextFieldInput1.getText();
 		sInput2 = jTextFieldInput2.getText();
 		sInput3 = jTextFieldInput3.getText();
 		sInput4 = jTextFieldInput4.getText();
 		int aerr =0;
 		int berr =0;
 		int a1err =0;
 		int b1err=0;
 		//checking if numbers are entered for all inputs
	 	for(int i=0;i<sInput1.length();i++)
	 		if (!Character.isDigit(sInput1.charAt(i)))
	 			aerr =1;
		for(int i=0;i<sInput2.length();i++)
	 		if (!Character.isDigit(sInput2.charAt(i)))
	 			berr =1;
	 	for(int i=0;i<sInput3.length();i++)
	 		if (!Character.isDigit(sInput3.charAt(i)))
	 			a1err =1;
	 	for(int i=0;i<sInput4.length();i++)
	 		if (!Character.isDigit(sInput4.charAt(i)))
	 			b1err =1;	 			
	 	//checking if any input is not entered 
	 	// if not calling  popup window with error message
	 	// also calling if inputs are not numbers 
	 	if(sInput1.length() ==  0) 
	 		popup("a  not entered");
	 	else if(aerr== 1)
	 		popup("a  should be a number");
	 	else if(sInput2.length() ==  0) 
	 		popup("b  not entered");
	 	else if(berr== 1)
	 		popup("b  should be a number");
	 	else if(sInput3.length() ==  0) 
	 		popup("a` not entered");
	 	else if(a1err== 1)
	 		popup("a`  should be a number");
	 	else if(sInput4.length() ==  0) 
	 		popup("b` not entered");
	 	else if(b1err== 1)
	 		popup("b`  should be a number");
		else
		{
									// converting the input strings in to integers
		  
		BigInteger a=new BigInteger(sInput1);
		BigInteger b=new BigInteger(sInput2);
		BigInteger a1=new BigInteger(sInput3);
		BigInteger b1=new BigInteger(sInput4);
										// calculating the key idata
 		M = (a.multiply(b)).subtract(oneValue);
		E = (a1.multiply(M)).add(a);
		D = (b1.multiply(M)).add(b);
		N = (E.multiply(D)).divide(M);
		block =0;
		BigInteger Power = new BigInteger("26");
		BigInteger twentysixPower = Power.pow(block);
		boolean bbb;
		while(bbb=twentysixPower.compareTo(N) <=0)		
		{
		block =block +1;
		twentysixPower = Power.pow(block);
		}
		block = block -1;
		
		if (block < 2 )
			{popup("Numbers are very smal to work");}
		else
		{
										// removing the intial form and button
		
		jTextFieldInput1.setVisible(false);
		jTextFieldInput2.setVisible(false);
		jTextFieldInput3.setVisible(false);
		jTextFieldInput4.setVisible(false);
		jLabelCaption1.setText("To Change A,B,A1,B1 click on them");
		jButtonKeyReset.setText("Reset Key");
		
										//setting output for the key data
		jLabela.setText(sInput1);
		jLabelb.setText(sInput2);
		jLabela1.setText(sInput3);
		jLabelb1.setText(sInput4);
		
										// displaying the key data
		jLabelE.setText("(A1 * M) + A = "+ E.toString());
		jLabelD.setText("(B1 * M) + B = "+ D.toString());
		jLabelN.setText("((E  * D) -1) / M = "+ N.toString());
		jLabelM.setText("(A  * B) - 1 = "+ M.toString());	
		jLabelPublic.setText("(E, N) = ("+ E.toString()+", "+ N.toString()+")");
		jLabelPrivate.setText("(D) = ("+ D.toString()+")");
										// setting the all the information to visible			
		jPanelPublic.setVisible(true);
		jCheckBoxDetail.setVisible(true);
		jPanelPrivate.setVisible(true);
		jLabela.setVisible(true);
		jLabelb.setVisible(true);
		jLabela1.setVisible(true);
		jLabelb1.setVisible(true);	
		jPanela.setVisible(true);
		jPanelb.setVisible(true);
		jPanela1.setVisible(true);
		jPanelb1.setVisible(true);
		jPanelM.setVisible(true);
		jPanelN.setVisible(true);
		jPanelD.setVisible(true);
		jPanelE.setVisible(true);
		jInternalPlain.setVisible(true);
		jInternalEncrypt.setVisible(true);
		jButtonDecrypt.setVisible(true);
		jButtonEncrypt.setVisible(true);
		jButtonKeyReset.setVisible(true);
		
		}
		}
	}
	
	
	
	
	
	public void jButtonEncryptMouseClicked(java.awt.event.MouseEvent e)
	{
	
	sPlain = jTextPanePlain.getText();			// reading the plain text
	sPlain = sPlain.trim();						// removing the spaces 
	sPlain = sPlain.toLowerCase();				// converting to lower case
	while(sPlain.length() % block !=0)			// padding at end 
		sPlain=sPlain+"z";
	cPlain = new char[sPlain.length()];
	iPlain = new long[sPlain.length()];
	cPlain = sPlain.toCharArray();
												// encoding the plain text in to numbers
	for (int i =0;i<sPlain.length();i++)
		{
		iPlain[i] = encode(cPlain[i]);
		}
	int Error =1;
	for (int i =0;i<sPlain.length();i++)
		if (iPlain[i] == -1)
				Error = 0;						// if non character -1 is returned so error
	if (Error == 0)
	{
	
	popup("Invalid Plain Text, Only Character allowed");
	
	}
	else
		{
	
	
		int no_of_blocks = sPlain.length() / block;
		plainBlocks	 = new BigInteger[no_of_blocks];
		plainBlocks1 = new BigInteger[no_of_blocks];
		BigInteger tempblockValue;
		BigInteger valueTwentySix = new BigInteger("26");
												// adding the values in each block	
												// changing the 26 base to base 10		
		for (int i =0,j=0; i<sPlain.length() ;i=i+block,j++)
			{
				plainBlocks1[j] =BigInteger.valueOf(0);
				for (int l=0;l<block;l++)
				{
				tempblockValue = (BigInteger.valueOf(iPlain[i+l])).multiply(valueTwentySix.pow(l));
				plainBlocks1[j]=plainBlocks1[j].add(tempblockValue);
				}
			}
		
												// encrypting the blocks
		for (int i =0; i<no_of_blocks;i++)
			{
			plainBlocks[i] = (plainBlocks1[i].multiply(E)).remainder(N);
			}
		iePlain = new int[sPlain.length()+no_of_blocks];
		int k =0;
		BigInteger itemp;
														// changing from base 10 to based 26
		for (int i =0; i<no_of_blocks;i++)
		{
			itemp = plainBlocks[i];
			for( int j = block+1; j>0;j--)
				{
				iePlain[k]= (itemp.remainder(valueTwentySix)).intValue();
				itemp = itemp.divide(valueTwentySix);
				k++;
				}
		}	
		String temp ="";
												// decoding the number to get character	
		for (int i =0; i<k;i++)
			{
			temp = temp +decode(iePlain[i]);
			}	

		encryptDetail();						// show the details
		jTextPanePlain.setText(sPlain);
		jTextPaneEncrypt.setText(temp);
		}										// Error Condition close
	}											// Event Encrypt close
	
	public void jButtonDecryptMouseClicked(java.awt.event.MouseEvent e)
	{
	sEncrypt = jTextPaneEncrypt.getText();		// reading the plain text
	jTextPanePlain.setText(sEncrypt);
	sEncrypt = sEncrypt.trim();					// removing the spaces 
	sEncrypt = sEncrypt.toLowerCase();			// converting to lower case
	while(sEncrypt.length() % (block+1) !=0)	// padding at end 
		sEncrypt=sEncrypt+"z";
	
	cEncrypt = new char[sEncrypt.length()];
	iEncrypt = new long[sEncrypt.length()];
	cEncrypt = sEncrypt.toCharArray();
												// encoding the plain text in to numbers
	for (int i =0;i<sEncrypt.length();i++)
		{
		iEncrypt[i] = encode(cEncrypt[i]);
		}
	int no_of_blocks = sEncrypt.length() / (block +1);
	EncryptBlocks	= new BigInteger[no_of_blocks];
	EncryptBlocks1  = new BigInteger[no_of_blocks];	
	BigInteger tempblockValue;
	BigInteger valueTwentySix = new BigInteger("26");
	
	for (int i =0,j=0; i<sEncrypt.length();i=i+block+1,j++)
		{
			EncryptBlocks1[j] =BigInteger.valueOf(0);
			for (int l=0;l<block+1;l++)
			{
			tempblockValue = (BigInteger.valueOf(iEncrypt[i+l])).multiply(valueTwentySix.pow(l));
			EncryptBlocks1[j]=EncryptBlocks1[j].add(tempblockValue);
			}
		}
	for (int i =0; i<no_of_blocks;i++)
		{
		EncryptBlocks[i] = (EncryptBlocks1[i].multiply(D)).remainder(N);
		}
	ipEncrypt = new int[sEncrypt.length()-no_of_blocks];
	int k =0;
	BigInteger itemp;
													// changing from base 10 to based 26
	for (int i =0; i<no_of_blocks;i++)
	{
		itemp = EncryptBlocks[i];
		for( int j = block; j>0;j--)
			{
			ipEncrypt[k]= (itemp.remainder(valueTwentySix)).intValue();
			itemp = itemp.divide(valueTwentySix);
			k++;
			}
	}	
	String temp ="";
												// decoding the number to get character	
	for (int i =0; i<k;i++)
		{
		temp = temp +decode(ipEncrypt[i]);
		}	

	
	decryptDetail();						// show the details
	jTextPaneEncrypt.setText(sEncrypt);
	jTextPanePlain.setText(temp);
	
	
	}

										// function to convert alphabets to numbers
	public long encode(char chr)
	{
	
	if (chr ==  'a') return 0;
	else if ( chr == 'b' ) return 1;
	else if ( chr == 'c' ) return 2;
	else if ( chr == 'd' ) return 3;
	else if ( chr == 'e' ) return 4;
	else if ( chr == 'f' ) return 5;
	else if ( chr == 'g' ) return 6;
	else if ( chr == 'h' ) return 7;
	else if ( chr == 'i' ) return 8;
	else if ( chr == 'j' ) return 9;
	else if ( chr == 'k' ) return 10;
	else if ( chr == 'l' ) return 11;
	else if ( chr == 'm' ) return 12;
	else if ( chr == 'n' ) return 13;
	else if ( chr == 'o' ) return 14;
	else if ( chr == 'p' ) return 15;
	else if ( chr == 'q' ) return 16;
	else if ( chr == 'r' ) return 17;
	else if ( chr == 's' ) return 18;
	else if ( chr == 't' ) return 19;
	else if ( chr == 'u' ) return 20;
	else if ( chr == 'v' ) return 21;
	else if ( chr == 'w' ) return 22;
	else if ( chr == 'x' ) return 23;
	else if ( chr == 'y' ) return 24;
	else if ( chr == 'z' ) return 25;
	else  return -1;
	}
										// end function to convert alphabets to numbers	
										// function to convert numbers to alphabets									
	public char decode(int num)
	{
	if ( num == 0 ) return 'a';
	else if (num ==  1 ) return 'b';
	else if ( num == 2 ) return 'c';
	else if ( num == 3 ) return 'd';
	else if ( num == 4 ) return 'e';
	else if ( num == 5 ) return 'f';
	else if ( num == 6 ) return 'g';
	else if ( num == 7 ) return 'h';
	else if ( num == 8 ) return 'i';
	else if ( num == 9 ) return 'j';
	else if ( num == 10 ) return 'k';
	else if ( num == 11 ) return 'l';
	else if ( num == 12 ) return 'm';
	else if ( num == 13 ) return 'n';
	else if ( num == 14 ) return 'o';
	else if ( num == 15 ) return 'p';
	else if ( num == 16 ) return 'q';
	else if ( num == 17 ) return 'r';
	else if ( num == 18 ) return 's';
	else if ( num == 19 ) return 't';
	else if ( num == 20 ) return 'u';
	else if ( num == 21 ) return 'v';
	else if ( num == 22 ) return 'w';
	else if ( num == 23 ) return 'x';
	else if ( num == 24 ) return 'y';
	else if ( num == 25 ) return 'z';
	else  return '1';
	}
											// method to show the details while encryption
											// does no do any calculations but just displays details
	public void encryptDetail()
	{
		String details;
		BigInteger valueTwentySix = new BigInteger("26");
		String OutString = "plain text value = \n\t";
		OutString = OutString +cPlain[0]+": "+iPlain[0] +"* 26 ^ 0 = "+iPlain[0]*(26^0) +"\n";
		for(int i=1;i<block;i++)
		{	
			
			if (iPlain[i]>9)
				OutString = OutString+ "\t+ " +cPlain[i]+": "+ iPlain[i]+"* 26 ^ "+i+" = "+ (valueTwentySix.pow(i)).multiply(BigInteger.valueOf(iPlain[i]))+"\n";
			else
				OutString = OutString+ "\t+ " +cPlain[i]+":  "+ iPlain[i]+"* 26 ^ "+i+" = "+(valueTwentySix.pow(i)).multiply(BigInteger.valueOf(iPlain[i]))+"\n";
		}
		OutString = OutString+"\t\t-------------------------------------"; 
		OutString = OutString+"\n\t\t = " + plainBlocks1[0].toString();	
		String OutString2 = "";
		BigInteger itemp;
		int OutPlain;
		itemp = plainBlocks[0];
		boolean bb;
		
			while(bb = itemp.compareTo(BigInteger.valueOf(0))>0)
				{
				OutPlain= (itemp.remainder(valueTwentySix)).intValue();
				OutString2 =OutString2+"\n\t26| "+itemp+"     - "+OutPlain+" - " + decode(OutPlain);
				OutString2 = OutString2 +"\n\t    ";
				for (int i=0; i<((itemp.toString()).length() +1+ ((itemp.toString()).length())/2);i++)
				OutString2 =OutString2 +"-";
				itemp = itemp.divide(valueTwentySix);
				}
		
		
		OutString2= OutString2+"\n\t"+ plainBlocks[0].toString()+" = ";
		
		for (int i =0; i<block+1;i++)
		{
		OutString2= OutString2+decode(iePlain[i]);
		}
		
		details = "--------------------------\n"+
   		          "         Encryption        " +
                 "\n--------------------------"+
		          "\n\nCalculate the block size" +
		          "\n\tfloor[ln("+(N.subtract(BigInteger.valueOf(1))).toString()+"/ln(26)] ="+Integer.toString(block)+
		          "\n\nConvert the first block in to number form"+
		          "\n"+OutString+
		          "\n\nApply encryption formula on plain text number.\nEncryption = (E * plaintext Number) MOD N"+
		          "\n"+E.toString()+" * "+ plainBlocks1[0].toString() +" MOD "+(N.subtract(BigInteger.valueOf(1))).toString() +" = "+plainBlocks[0].toString()+
		          "\n\nConvert Encrypted Number to String of Characters"+
		          "\n\t"+OutString2 +
		          "\n\n Same procedure is repeated for the remaining blocks of data";
		jTextPaneDetails.setText(details);
		}
		
		
											// method to show the details while decryption
											// does no do any calculations but just displays details	
		public void decryptDetail()
	{
	
		String details;
		BigInteger valueTwentySix = new BigInteger("26");
		String OutString = "cipher text value = \n\t";
		OutString = OutString +cEncrypt[0]+": "+iEncrypt[0] +"* 26 ^ 0= "+iEncrypt[0]*(26^0) +"\n";;
		for(int i=1;i<block+1;i++)
		{
		
		if (iPlain[i]>9)
				OutString = OutString+ "\t+ " +cEncrypt[i]+": "+ iEncrypt[i]+"* 26 ^ "+i+" = "+ (valueTwentySix.pow(i)).multiply(BigInteger.valueOf(iEncrypt[i]))+"\n";
			else
			OutString = OutString+ "\t+ " +cEncrypt[i]+":  "+ iEncrypt[i]+"* 26 ^ "+i+" = "+(valueTwentySix.pow(i)).multiply(BigInteger.valueOf(iEncrypt[i]))+"\n";
		}
		OutString = OutString+"\t\t-------------------------------------"; 
		OutString = OutString+"\n\t\t = " + EncryptBlocks1[0].toString();	
		String OutString2;
		OutString2 = "";
		BigInteger itemp;
		int OutPlain;
		itemp = EncryptBlocks[0];

		boolean bb;
		
			while(bb = itemp.compareTo(BigInteger.valueOf(0))>0)
				{
				OutPlain= (itemp.remainder(valueTwentySix)).intValue();
				OutString2 =OutString2+"\n\t26| "+itemp+"     - "+OutPlain+" - " + decode(OutPlain);
				OutString2 = OutString2 +"\n\t    ";
				for (int i=0; i<((itemp.toString()).length() +1+ ((itemp.toString()).length())/2);i++)
				OutString2 =OutString2 +"-";
				itemp = itemp.divide(valueTwentySix);
				}
		
		
		OutString2= OutString2+"\n\t"+ EncryptBlocks[0].toString()+" = ";
		
		for (int i =0; i<block;i++)
		{
		OutString2= OutString2+decode(ipEncrypt[i]);
		}
		
		
		details = "--------------------------\n"+
   		          "         Decryption        " +
                 "\n--------------------------"+
		          "\n\nCalculate the block size" +
		          "\n\tceling[ln("+(N.subtract(BigInteger.valueOf(1))).toString()+"/ln(26)] ="+Integer.toString(block+1)+
		          "\n\nConvert the first block in to number form"+
		          "\n"+OutString+
		          "\n\nApply decryption formula on ciphertext.\nDecryption = (D * ciphertext) MOD N"+
		          "\n"+E.toString()+" * "+ EncryptBlocks1[0].toString() +" MOD "+(N.subtract(BigInteger.valueOf(1))).toString() +" = "+EncryptBlocks[0].toString()+
		          "\n\nConvert Encrypted Number to a String of Characters"+
		          "\n\t"+OutString2 +
		          "\n\n Same procedure is repeated for the remaining blocks of data";
		jTextPaneDetails.setText(details);
		}			
	
												// event to set is details are to be shown or not 
												// using the check box "Explanation"
	public void jCheckBoxDetailItemStateChanged(java.awt.event.ItemEvent e) {
	  
   
   if ( e.getStateChange() == ItemEvent.SELECTED )

     jScrollPaneDetails.setVisible(true); 
    else
     jScrollPaneDetails.setVisible(false);   	  
    }
	
	
	
										// event to close the error popup window
		
	public void jLabelaMouseClicked(java.awt.event.MouseEvent e) {
	inputDisplay();
	}
	
	public void jLabelbMouseClicked(java.awt.event.MouseEvent e) {
	inputDisplay();
	}
	
	public void jLabela1MouseClicked(java.awt.event.MouseEvent e) {
	inputDisplay();
	}
	
	public void jLabelb1MouseClicked(java.awt.event.MouseEvent e) {
	inputDisplay();
	}
	
										// error popup window calling method	
	public void popup(String sError)
	{
	
 	getToolkit().beep();
 	jOptionPane1.showMessageDialog(this,sError,"Error",JOptionPane.ERROR_MESSAGE);
	}
										// end popup window caliing method		
	public void inputDisplay()
	{
	jLabela.setVisible(false);
	jLabelb.setVisible(false);
	jLabela1.setVisible(false);
	jLabelb1.setVisible(false);		
	jTextFieldInput1.setVisible(true);
	jTextFieldInput2.setVisible(true);
	jTextFieldInput3.setVisible(true);
	jTextFieldInput4.setVisible(true);
	}		
}

