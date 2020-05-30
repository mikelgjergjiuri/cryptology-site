/** 
 * RSA.java
 *
 * Title:			RSA
 * Description:	
 * @author			chilukas
 * @version			
 */

package RSA;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import java.lang.Object;
import java.lang.StrictMath;
import java.math.BigInteger;
import java.lang.Number;
import java.lang.Character;


public class RSA extends javax.swing.JApplet {

// IMPORTANT: Source code between BEGIN/END comment pair will be regenerated
// every time the form is saved. All manual changes will be overwritten.
// BEGIN GENERATED CODE
	// member declarations
	javax.swing.JPanel jPanelMain = new javax.swing.JPanel();
	javax.swing.JLabel jLabelCaption1 = new javax.swing.JLabel();
	javax.swing.JPanel jPanelP = new javax.swing.JPanel();
	javax.swing.JTextField jTextFieldInputP = new javax.swing.JTextField();
	javax.swing.JLabel jLabelP = new javax.swing.JLabel();
	javax.swing.JPanel jPanelQ = new javax.swing.JPanel();
	javax.swing.JTextField jTextFieldInputQ = new javax.swing.JTextField();
	javax.swing.JLabel jLabelQ = new javax.swing.JLabel();
	javax.swing.JPanel jPanel_E = new javax.swing.JPanel();
	javax.swing.JTextField jTextFieldInputE = new javax.swing.JTextField();
	javax.swing.JLabel jLabel_E = new javax.swing.JLabel();
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
	javax.swing.JButton jButtonE = new javax.swing.JButton();
// END GENERATED CODE
	
	javax.swing.JOptionPane jOptionPane1 = new javax.swing.JOptionPane();
	boolean isStandalone = false;
	BigInteger P,Q,E,D,M,N;
	String sInputP,sInputQ,sInputE;
	int block;
	String sPlain,sEncrypt;
	long   iPlain[],iEncrypt[];
	int    iePlain[],ipEncrypt[];
	char cPlain[],cEncrypt[];
	BigInteger plainBlocks	[], plainBlocks1 [];
	BigInteger EncryptBlocks [], EncryptBlocks1 []	;
	
	
	public RSA() {
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
		jPanelMain.setBorder(new javax.swing.plaf.BorderUIResource.TitledBorderUIResource(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, false), "R.S.A", 4, 2, new java.awt.Font("Dialog", 1, 12), java.awt.Color.darkGray));
		jPanelMain.setLayout(null);
		jPanelMain.setLocation(new java.awt.Point(0, 0));
		jPanelMain.setSize(new java.awt.Dimension(880, 570));
		jPanelMain.setVisible(true);
		jLabelCaption1.setBackground(java.awt.Color.white);
		jLabelCaption1.setFont(new java.awt.Font("SansSerif", 2, 14));
		jLabelCaption1.setForeground(java.awt.Color.gray);
		jLabelCaption1.setLocation(new java.awt.Point(30, 20));
		jLabelCaption1.setOpaque(true);
		jLabelCaption1.setSize(new java.awt.Dimension(350, 30));
		jLabelCaption1.setText("Enter Prime Numbers P and Q, Greater then 25");
		jLabelCaption1.setVisible(true);
		jPanelP.setBackground(java.awt.Color.white);
		jPanelP.setBorder(new javax.swing.plaf.BorderUIResource.TitledBorderUIResource(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, false), "P", 4, 2, new java.awt.Font("Dialog", 1, 12), java.awt.Color.magenta));
		jPanelP.setLayout(null);
		jPanelP.setLocation(new java.awt.Point(40, 50));
		jPanelP.setSize(new java.awt.Dimension(110, 50));
		jPanelP.setVisible(true);
		jTextFieldInputP.setBorder(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(0, java.awt.Color.lightGray, new java.awt.Color(178, 178, 178)));
		jTextFieldInputP.setLocation(new java.awt.Point(20, 20));
		jTextFieldInputP.setSize(new java.awt.Dimension(80, 20));
		jTextFieldInputP.setToolTipText("Enter P, a prime number");
		jTextFieldInputP.setVisible(true);
		jLabelP.setBackground(java.awt.Color.white);
		jLabelP.setBorder(new javax.swing.plaf.BorderUIResource.BevelBorderUIResource(0));
		jLabelP.setForeground(java.awt.Color.magenta);
		jLabelP.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabelP.setLocation(new java.awt.Point(20, 20));
		jLabelP.setSize(new java.awt.Dimension(80, 20));
		jLabelP.setToolTipText("Click to change P");
		jLabelP.setVisible(false);
		jPanelQ.setBackground(java.awt.Color.white);
		jPanelQ.setBorder(new javax.swing.plaf.BorderUIResource.TitledBorderUIResource(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, false), "Q", 4, 2, new java.awt.Font("Dialog", 1, 12), java.awt.Color.magenta));
		jPanelQ.setLayout(null);
		jPanelQ.setLocation(new java.awt.Point(150, 50));
		jPanelQ.setSize(new java.awt.Dimension(110, 50));
		jPanelQ.setToolTipText("a");
		jPanelQ.setVisible(true);
		jTextFieldInputQ.setBorder(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(0, java.awt.Color.lightGray, new java.awt.Color(178, 178, 178)));
		jTextFieldInputQ.setLocation(new java.awt.Point(20, 20));
		jTextFieldInputQ.setSize(new java.awt.Dimension(80, 20));
		jTextFieldInputQ.setToolTipText("Enter Q, a Prime Number");
		jTextFieldInputQ.setVisible(true);
		jLabelQ.setBackground(java.awt.Color.white);
		jLabelQ.setBorder(new javax.swing.plaf.BorderUIResource.BevelBorderUIResource(0));
		jLabelQ.setForeground(java.awt.Color.magenta);
		jLabelQ.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabelQ.setLocation(new java.awt.Point(20, 20));
		jLabelQ.setSize(new java.awt.Dimension(80, 20));
		jLabelQ.setToolTipText("Click To change Q");
		jLabelQ.setVisible(false);
		jPanel_E.setBackground(java.awt.Color.white);
		jPanel_E.setBorder(new javax.swing.plaf.BorderUIResource.TitledBorderUIResource(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, false), "E", 4, 2, new java.awt.Font("Dialog", 1, 12), java.awt.Color.magenta));
		jPanel_E.setLayout(null);
		jPanel_E.setLocation(new java.awt.Point(370, 50));
		jPanel_E.setSize(new java.awt.Dimension(110, 50));
		jPanel_E.setVisible(false);
		jTextFieldInputE.setBorder(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(0, java.awt.Color.lightGray, new java.awt.Color(178, 178, 178)));
		jTextFieldInputE.setLocation(new java.awt.Point(20, 20));
		jTextFieldInputE.setSize(new java.awt.Dimension(80, 20));
		jTextFieldInputE.setToolTipText("Enter E, a number relatively prime to M");
		jTextFieldInputE.setVisible(true);
		jLabel_E.setBackground(java.awt.Color.white);
		jLabel_E.setBorder(new javax.swing.plaf.BorderUIResource.BevelBorderUIResource(0));
		jLabel_E.setForeground(java.awt.Color.magenta);
		jLabel_E.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabel_E.setLocation(new java.awt.Point(20, 20));
		jLabel_E.setSize(new java.awt.Dimension(80, 20));
		jLabel_E.setText("99999");
		jLabel_E.setToolTipText("click to change E");
		jLabel_E.setVisible(false);
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
		jPanelN.setLocation(new java.awt.Point(260, 150));
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
		jPanelE.setLocation(new java.awt.Point(20, 220));
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
		jPanelD.setLocation(new java.awt.Point(260, 220));
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
		jButtonE.setFont(new java.awt.Font("Serif", 2, 18));
		jButtonE.setLocation(new java.awt.Point(360, 110));
		jButtonE.setSize(new java.awt.Dimension(120, 30));
		jButtonE.setText("Continue");
		jButtonE.setVisible(false);
		getContentPane().setLayout(null);
		setLocation(new java.awt.Point(0, 0));

		jPanelMain.add(jLabelCaption1);
		jPanelMain.add(jPanelP);
		jPanelMain.add(jPanelQ);
		jPanelMain.add(jPanel_E);
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
		jPanelMain.add(jButtonE);
		jPanelP.add(jTextFieldInputP);
		jPanelP.add(jLabelP);
		jPanelQ.add(jTextFieldInputQ);
		jPanelQ.add(jLabelQ);
		jPanel_E.add(jTextFieldInputE);
		jPanel_E.add(jLabel_E);
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
		jLabelP.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jLabelPMouseClicked(e);
			}
		});
		jLabel_E.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jLabel_EMouseClicked(e);
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
		jButtonE.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonEMouseClicked(e);
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
		RSA applet = new RSA();
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
	
		sInputP = jTextFieldInputP.getText();
 		sInputQ = jTextFieldInputQ.getText();
 		sInputP = sInputP.trim();
 		sInputQ = sInputQ.trim();
 		int aerr =0;
 		int berr =0;
 		//checking if numbers are entered for all inputs
	 	for(int i=0;i<sInputP.length();i++)
	 		if (!Character.isDigit(sInputP.charAt(i)))
	 			aerr =1;
		for(int i=0;i<sInputQ.length();i++)
	 		if (!Character.isDigit(sInputQ.charAt(i)))
	 			berr =1;
	 	//checking if any input is not entered 
	 	// if not calling  popup window with error message
	 	// also calling if inputs are not numbers 
	 	if(sInputP.length() ==  0) 
	 		popup("P not entered");
	 	else if(aerr== 1)
	 		popup("P should be a Prime Number");
	 	else if(sInputQ.length() ==  0) 
	 		popup("Q not entered");
	 	else if(berr== 1)
	 		popup("Q  should be a Prime Number");
		else
			{
								// converting the input strings in to integers
			BigInteger P=new BigInteger(sInputP);
			BigInteger Q=new BigInteger(sInputQ);
										// calculating the key idata
 		
 			if (!P.isProbablePrime(10))
 				popup("P should be a Prime Number");
 			else if(!Q.isProbablePrime(10))
 				popup("Q should be a Prime Number"); 		
 			else
 				{
 				M = (P).multiply(Q);
		 		N =((P).subtract(BigInteger.valueOf(1))).multiply((Q).subtract(BigInteger.valueOf(1)));
				block =0;
				BigInteger Power = new BigInteger("26");
				BigInteger twentysixPower = Power.pow(block);
				boolean bbb;
				while(bbb=twentysixPower.compareTo(M) <=0)		
					{
					block =block +1;
					twentysixPower = Power.pow(block);
					}
				block = block -1;
		
				if (block < 2 )
					{popup("Numbers are very small to work, Please Choose Bigger Prime Numbers");}
				else
					{
										// removing the intial form and button
					jTextFieldInputP.setVisible(false);
					jTextFieldInputQ.setVisible(false);
					jLabelCaption1.setText("Enter E and click on the Continue Button");
					jButtonKeyReset.setText("Reset P or Q");
					jPanel_E.setVisible(true);
					jButtonE.setText("Continue");
					jButtonE.setVisible(true);
					jButtonKeyReset.setVisible(false);
					jLabelP.setVisible(true);		
					jLabelQ.setVisible(true);
								//setting output for the key data
					jLabelP.setText(sInputP);
					jLabelQ.setText(sInputQ);
		
										// displaying the key data
					jLabelM.setText("P * Q  = "+ M.toString());
					jLabelN.setText("(P - 1) * (Q - 1) = "+ N.toString());
									// setting the all the information to visible			
					jPanelM.setVisible(true);
					jPanelN.setVisible(true);
					jTextFieldInputE.setVisible(true);
					jLabel_E.setVisible(false);

		
					}
				}
			}
	}
	
	public void jButtonEMouseClicked(java.awt.event.MouseEvent e) {
	
		sInputE = jTextFieldInputE.getText();
 		sInputE= sInputE.trim();
 		int aerr =0;
 		//checking if numbers are entered for all inputs
	 	for(int i=0;i<sInputE.length();i++)
	 		if (!Character.isDigit(sInputE.charAt(i)))
	 			aerr =1;
	 	//checking if any input is not entered 
	 	// if not calling  popup window with error message
	 	// also calling if inputs are not numbers 
	 	if(sInputE.length() ==  0) 
	 		popup("E  not entered");
	 	else if(aerr== 1)
	 		popup("E  should be a number");
		else
			{
									// converting the input strings in to integers
			boolean bbb;		  
			BigInteger EE = new BigInteger(sInputE);
			E = EE;
			if	(bbb = BigInteger.valueOf(1).compareTo(N.gcd(E)) != 0)
				popup("Invalid E: E should be a number relatively prime to N");
			else
				{
				D = E.modInverse(N);
										// removing the intial form and button
				jTextFieldInputE.setVisible(false);
				jLabelCaption1.setText("To Change P,Q,E, click on the Values");
										//setting output for the key data
				jLabel_E.setText(sInputE);
												// displaying the key data
				jLabelE.setText(E.toString());
				jLabelD.setText("(E * D) =  1 mod N -> D = "+ D.toString());
				jLabelPublic.setText("(E, M) = ("+ E.toString()+", "+ M.toString()+")");
				jLabelPrivate.setText("(D) = ("+ D.toString()+")");
										// setting the all the information to visible			
				jPanelPublic.setVisible(true);
				jCheckBoxDetail.setVisible(true);
				jPanelPrivate.setVisible(true);
				jPanelD.setVisible(true);
				jPanelE.setVisible(true);
				jLabel_E.setVisible(true);
				jInternalPlain.setVisible(true);
				jInternalEncrypt.setVisible(true);
				jButtonDecrypt.setVisible(true);
				jButtonEncrypt.setVisible(true);
				jButtonE.setVisible(false);
				
				}
			}
	
	}
	
	public void jLabelPMouseClicked(java.awt.event.MouseEvent e) {
	jTextFieldInputP.setVisible(true);
	jTextFieldInputQ.setVisible(true);
	jButtonKeyReset.setVisible(true);
	jLabelP.setVisible(false);
	jLabelP.setVisible(false);
	}
		
	public void jLabel_EMouseClicked(java.awt.event.MouseEvent e) {
		jTextFieldInputE.setVisible(true);
		jLabel_E.setVisible(false);
		jButtonE.setText("Reset E");
		jButtonE.setVisible(true);
	
	}
	
	public void jCheckBoxDetailItemStateChanged(java.awt.event.ItemEvent e) {
	
	if ( e.getStateChange() == ItemEvent.SELECTED )
		jScrollPaneDetails.setVisible(true); 
    else
		jScrollPaneDetails.setVisible(false);  
	}
	
	public void jButtonEncryptMouseClicked(java.awt.event.MouseEvent e) {
	
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
			plainBlocks[i] = (plainBlocks1[i]).modPow(E,M);
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
		}									
	}
	
	public void jButtonDecryptMouseClicked(java.awt.event.MouseEvent e) {
	
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
		EncryptBlocks[i] = (EncryptBlocks1[i]).modPow(D,M);
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
		
		
		
	public void popup(String sError)
	{
	
 	getToolkit().beep();
 	jOptionPane1.showMessageDialog(this,sError,"Error",JOptionPane.ERROR_MESSAGE);
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
	else  return '2';
	}
	
	public void encryptDetail()
	{
		String details;
		BigInteger valueTwentySix = new BigInteger("26");
		String OutString = "plain text value = \n\t ";
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
		String OutString = "cipher text value = \n\t ";
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
	
	
					
} //End Applet
