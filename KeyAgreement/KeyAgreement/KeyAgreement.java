/** 
 * KeyAgreement.java
 *
 * Title:			Diffie-Hellman Key Agreement Protocol
 * Description:	
 * @author			chilukas
 * @version			
 */

package KeyAgreement;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

public class KeyAgreement extends javax.swing.JApplet {

// IMPORTANT: Source code between BEGIN/END comment pair will be regenerated
// every time the form is saved. All manual changes will be overwritten.
// BEGIN GENERATED CODE
	// member declarations
	javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
	javax.swing.JLabel jLabelPrimeP = new javax.swing.JLabel();
	javax.swing.JTextField jTextFieldPrimeP = new javax.swing.JTextField();
	javax.swing.JTextField jTextFieldNumberS = new javax.swing.JTextField();
	javax.swing.JLabel jLabelNumberS = new javax.swing.JLabel();
	javax.swing.JPanel jPanelAlice = new javax.swing.JPanel();
	javax.swing.JLabel jLabel_aa_Alice = new javax.swing.JLabel();
	javax.swing.JLabel jLabelBobPublic = new javax.swing.JLabel();
	javax.swing.JLabel jLabelAliceData = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_a_Alice = new javax.swing.JLabel();
	javax.swing.JTextField jTextFieldAlice_a = new javax.swing.JTextField();
	javax.swing.JButton jButtonAlice_a = new javax.swing.JButton();
	javax.swing.JLabel jLabel_A_Alice = new javax.swing.JLabel();
	javax.swing.JLabel jLabelAlice_A = new javax.swing.JLabel();
	javax.swing.JButton jButtonAlice_A = new javax.swing.JButton();
	javax.swing.JButton jButtonAlice_K = new javax.swing.JButton();
	javax.swing.JLabel jLabelAlice_K = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_Alice_K = new javax.swing.JLabel();
	javax.swing.JLabel jLabelAlice_B = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_Alice_B = new javax.swing.JLabel();
	javax.swing.JLabel jLabelAlice_a = new javax.swing.JLabel();
	javax.swing.JLabel jLabelAlice_BB = new javax.swing.JLabel();
	javax.swing.JPanel jPanelBob = new javax.swing.JPanel();
	javax.swing.JLabel jLabelBob_b = new javax.swing.JLabel();
	javax.swing.JLabel jLabelBobData = new javax.swing.JLabel();
	javax.swing.JLabel jLabelAlicePublic = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_b_Bob = new javax.swing.JLabel();
	javax.swing.JTextField jTextFieldBob_b = new javax.swing.JTextField();
	javax.swing.JButton jButtonBob_b = new javax.swing.JButton();
	javax.swing.JLabel jLabel_B_Bob = new javax.swing.JLabel();
	javax.swing.JLabel jLabelBob_B = new javax.swing.JLabel();
	javax.swing.JButton jButtonBob_B = new javax.swing.JButton();
	javax.swing.JButton jButtonBob_K = new javax.swing.JButton();
	javax.swing.JLabel jLabel_Bob_A = new javax.swing.JLabel();
	javax.swing.JLabel jLabelBob_A = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_Bob_K = new javax.swing.JLabel();
	javax.swing.JLabel jLabelBob_K = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_bb_Bob = new javax.swing.JLabel();
	javax.swing.JLabel jLabelBob_AA = new javax.swing.JLabel();
	javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
	javax.swing.JTextArea jTextAreaOutPutMessage = new javax.swing.JTextArea();
	javax.swing.JLabel jLabelS = new javax.swing.JLabel();
	javax.swing.JLabel jLabelP = new javax.swing.JLabel();
	javax.swing.JButton jButtonSelectPS = new javax.swing.JButton();
	javax.swing.JLabel jLabelPP = new javax.swing.JLabel();
	javax.swing.JLabel jLabelSS = new javax.swing.JLabel();
// END GENERATED CODE

	javax.swing.JOptionPane jOptionPane1 = new javax.swing.JOptionPane();
	String OutPutMessage;
	boolean isStandalone = false;
	int p,s,a,A,b,B,Alice_Key,Bob_Key;
	int tempint;
	String binary_a,binary_b;


	public KeyAgreement() {
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
		jPanel1.setBackground(java.awt.Color.white);
		jPanel1.setBorder(new javax.swing.plaf.BorderUIResource.TitledBorderUIResource(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, false), "Diffie - Hellman Key Agreement ", 4, 2, new java.awt.Font("Dialog", 1, 12), java.awt.Color.black));
		jPanel1.setLayout(null);
		jPanel1.setLocation(new java.awt.Point(0, 0));
		jPanel1.setSize(new java.awt.Dimension(700, 650));
		jPanel1.setVisible(true);
		jLabelPrimeP.setAlignmentX(0.5F);
		jLabelPrimeP.setBackground(java.awt.Color.white);
		jLabelPrimeP.setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.border.SoftBevelBorder(0), new javax.swing.border.SoftBevelBorder(1)));
		jLabelPrimeP.setLocation(new java.awt.Point(190, 40));
		jLabelPrimeP.setOpaque(true);
		jLabelPrimeP.setSize(new java.awt.Dimension(80, 30));
		jLabelPrimeP.setVisible(false);
		jTextFieldPrimeP.setBorder(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178)));
		jTextFieldPrimeP.setLocation(new java.awt.Point(190, 40));
		jTextFieldPrimeP.setSize(new java.awt.Dimension(80, 30));
		jTextFieldPrimeP.setToolTipText("number between 3 - 45000");
		jTextFieldPrimeP.setVisible(true);
		jTextFieldNumberS.setBorder(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178)));
		jTextFieldNumberS.setLocation(new java.awt.Point(500, 40));
		jTextFieldNumberS.setSize(new java.awt.Dimension(80, 30));
		jTextFieldNumberS.setToolTipText("number between 3 - (p-1)");
		jTextFieldNumberS.setVisible(true);
		jLabelNumberS.setAlignmentX(0.5F);
		jLabelNumberS.setBackground(java.awt.Color.white);
		jLabelNumberS.setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.border.SoftBevelBorder(0), new javax.swing.border.SoftBevelBorder(1)));
		jLabelNumberS.setLocation(new java.awt.Point(500, 40));
		jLabelNumberS.setOpaque(true);
		jLabelNumberS.setSize(new java.awt.Dimension(80, 30));
		jLabelNumberS.setVisible(false);
		jPanelAlice.setBackground(java.awt.Color.white);
		jPanelAlice.setBorder(new javax.swing.plaf.BorderUIResource.TitledBorderUIResource(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, false), "Alice", 2, 2, new java.awt.Font("SansSerif", 2, 14), java.awt.Color.darkGray));
		jPanelAlice.setLayout(null);
		jPanelAlice.setLocation(new java.awt.Point(5, 80));
		jPanelAlice.setSize(new java.awt.Dimension(340, 390));
		jPanelAlice.setVisible(true);
		jLabel_aa_Alice.setFont(new java.awt.Font("Dialog", 3, 12));
		jLabel_aa_Alice.setLocation(new java.awt.Point(55, 60));
		jLabel_aa_Alice.setSize(new java.awt.Dimension(10, 30));
		jLabel_aa_Alice.setText("a");
		jLabel_aa_Alice.setVisible(false);
		jLabelBobPublic.setBackground(java.awt.Color.white);
		jLabelBobPublic.setBorder(new javax.swing.border.SoftBevelBorder(0));
		jLabelBobPublic.setFont(new java.awt.Font("SansSerif", 0, 12));
		jLabelBobPublic.setLocation(new java.awt.Point(15, 270));
		jLabelBobPublic.setSize(new java.awt.Dimension(280, 20));
		jLabelBobPublic.setText("Bobs Sent Data");
		jLabelBobPublic.setVisible(true);
		jLabelAliceData.setBackground(java.awt.Color.white);
		jLabelAliceData.setBorder(new javax.swing.border.SoftBevelBorder(0));
		jLabelAliceData.setFont(new java.awt.Font("SansSerif", 0, 12));
		jLabelAliceData.setLocation(new java.awt.Point(15, 20));
		jLabelAliceData.setSize(new java.awt.Dimension(280, 20));
		jLabelAliceData.setText("Alice's Data");
		jLabelAliceData.setVisible(true);
		jLabel_a_Alice.setBackground(java.awt.Color.white);
		jLabel_a_Alice.setFont(new java.awt.Font("SansSerif", 0, 12));
		jLabel_a_Alice.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabel_a_Alice.setLocation(new java.awt.Point(15, 60));
		jLabel_a_Alice.setSize(new java.awt.Dimension(40, 30));
		jLabel_a_Alice.setText("Enter");
		jLabel_a_Alice.setVisible(false);
		jTextFieldAlice_a.setBorder(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178)));
		jTextFieldAlice_a.setLocation(new java.awt.Point(65, 60));
		jTextFieldAlice_a.setSize(new java.awt.Dimension(80, 30));
		jTextFieldAlice_a.setToolTipText("number between 3 - (p-1)");
		jTextFieldAlice_a.setVisible(false);
		jButtonAlice_a.setFont(new java.awt.Font("Dialog", 0, 12));
		jButtonAlice_a.setLocation(new java.awt.Point(185, 60));
		jButtonAlice_a.setSize(new java.awt.Dimension(140, 30));
		jButtonAlice_a.setText("Calculate Alices A");
		jButtonAlice_a.setVisible(false);
		jLabel_A_Alice.setBackground(java.awt.Color.white);
		jLabel_A_Alice.setFont(new java.awt.Font("SansSerif", 3, 12));
		jLabel_A_Alice.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabel_A_Alice.setLocation(new java.awt.Point(35, 130));
		jLabel_A_Alice.setSize(new java.awt.Dimension(10, 30));
		jLabel_A_Alice.setText("A");
		jLabel_A_Alice.setVisible(false);
		jLabelAlice_A.setAlignmentX(0.5F);
		jLabelAlice_A.setBackground(java.awt.Color.white);
		jLabelAlice_A.setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.border.SoftBevelBorder(0), new javax.swing.border.SoftBevelBorder(1)));
		jLabelAlice_A.setLocation(new java.awt.Point(65, 130));
		jLabelAlice_A.setOpaque(true);
		jLabelAlice_A.setSize(new java.awt.Dimension(80, 30));
		jLabelAlice_A.setVisible(false);
		jButtonAlice_A.setFont(new java.awt.Font("Dialog", 0, 12));
		jButtonAlice_A.setLocation(new java.awt.Point(185, 130));
		jButtonAlice_A.setSize(new java.awt.Dimension(140, 30));
		jButtonAlice_A.setText("Send Bob  A");
		jButtonAlice_A.setVisible(false);
		jButtonAlice_K.setFont(new java.awt.Font("Dialog", 0, 12));
		jButtonAlice_K.setLocation(new java.awt.Point(35, 190));
		jButtonAlice_K.setSize(new java.awt.Dimension(140, 30));
		jButtonAlice_K.setText("Calculate K");
		jButtonAlice_K.setVisible(false);
		jLabelAlice_K.setBackground(java.awt.Color.white);
		jLabelAlice_K.setFont(new java.awt.Font("SansSerif", 3, 12));
		jLabelAlice_K.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabelAlice_K.setLocation(new java.awt.Point(25, 190));
		jLabelAlice_K.setSize(new java.awt.Dimension(50, 30));
		jLabelAlice_K.setText("Key = ");
		jLabelAlice_K.setVisible(false);
		jLabel_Alice_K.setAlignmentX(0.5F);
		jLabel_Alice_K.setBackground(java.awt.Color.white);
		jLabel_Alice_K.setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.border.SoftBevelBorder(0), new javax.swing.border.SoftBevelBorder(1)));
		jLabel_Alice_K.setLocation(new java.awt.Point(95, 190));
		jLabel_Alice_K.setOpaque(true);
		jLabel_Alice_K.setSize(new java.awt.Dimension(80, 30));
		jLabel_Alice_K.setVisible(false);
		jLabelAlice_B.setBackground(java.awt.Color.white);
		jLabelAlice_B.setFont(new java.awt.Font("SansSerif", 0, 12));
		jLabelAlice_B.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabelAlice_B.setLocation(new java.awt.Point(20, 310));
		jLabelAlice_B.setSize(new java.awt.Dimension(45, 30));
		jLabelAlice_B.setText("Bob's");
		jLabelAlice_B.setVisible(false);
		jLabel_Alice_B.setAlignmentX(0.5F);
		jLabel_Alice_B.setBackground(java.awt.Color.white);
		jLabel_Alice_B.setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.border.SoftBevelBorder(0), new javax.swing.border.SoftBevelBorder(1)));
		jLabel_Alice_B.setLocation(new java.awt.Point(90, 310));
		jLabel_Alice_B.setOpaque(true);
		jLabel_Alice_B.setSize(new java.awt.Dimension(80, 30));
		jLabel_Alice_B.setVisible(false);
		jLabelAlice_a.setAlignmentX(0.5F);
		jLabelAlice_a.setBackground(java.awt.Color.white);
		jLabelAlice_a.setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.border.SoftBevelBorder(0), new javax.swing.border.SoftBevelBorder(1)));
		jLabelAlice_a.setLocation(new java.awt.Point(65, 60));
		jLabelAlice_a.setOpaque(true);
		jLabelAlice_a.setSize(new java.awt.Dimension(80, 30));
		jLabelAlice_a.setVisible(false);
		jLabelAlice_BB.setFont(new java.awt.Font("Dialog", 3, 12));
		jLabelAlice_BB.setLocation(new java.awt.Point(65, 310));
		jLabelAlice_BB.setSize(new java.awt.Dimension(10, 30));
		jLabelAlice_BB.setText("B");
		jLabelAlice_BB.setVisible(false);
		jPanelBob.setBackground(java.awt.Color.white);
		jPanelBob.setBorder(new javax.swing.plaf.BorderUIResource.TitledBorderUIResource(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, false), "Bob", 2, 2, new java.awt.Font("SansSerif", 2, 14), java.awt.Color.darkGray));
		jPanelBob.setLayout(null);
		jPanelBob.setLocation(new java.awt.Point(352, 80));
		jPanelBob.setSize(new java.awt.Dimension(343, 390));
		jPanelBob.setVisible(true);
		jLabelBob_b.setAlignmentX(0.5F);
		jLabelBob_b.setBackground(java.awt.Color.white);
		jLabelBob_b.setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.border.SoftBevelBorder(0), new javax.swing.border.SoftBevelBorder(1)));
		jLabelBob_b.setLocation(new java.awt.Point(65, 60));
		jLabelBob_b.setOpaque(true);
		jLabelBob_b.setSize(new java.awt.Dimension(80, 30));
		jLabelBob_b.setVisible(false);
		jLabelBobData.setBackground(java.awt.Color.white);
		jLabelBobData.setBorder(new javax.swing.border.SoftBevelBorder(0));
		jLabelBobData.setFont(new java.awt.Font("SansSerif", 0, 12));
		jLabelBobData.setLocation(new java.awt.Point(18, 20));
		jLabelBobData.setSize(new java.awt.Dimension(280, 20));
		jLabelBobData.setText("Bob's Data");
		jLabelBobData.setVisible(true);
		jLabelAlicePublic.setBackground(java.awt.Color.white);
		jLabelAlicePublic.setBorder(new javax.swing.border.SoftBevelBorder(0));
		jLabelAlicePublic.setFont(new java.awt.Font("SansSerif", 0, 12));
		jLabelAlicePublic.setLocation(new java.awt.Point(18, 270));
		jLabelAlicePublic.setSize(new java.awt.Dimension(280, 20));
		jLabelAlicePublic.setText("Alice Sent Data");
		jLabelAlicePublic.setVisible(true);
		jLabel_b_Bob.setBackground(java.awt.Color.white);
		jLabel_b_Bob.setFont(new java.awt.Font("SansSerif", 0, 12));
		jLabel_b_Bob.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabel_b_Bob.setLocation(new java.awt.Point(8, 60));
		jLabel_b_Bob.setSize(new java.awt.Dimension(50, 30));
		jLabel_b_Bob.setText("Enter");
		jLabel_b_Bob.setVisible(false);
		jTextFieldBob_b.setBorder(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178)));
		jTextFieldBob_b.setLocation(new java.awt.Point(66, 60));
		jTextFieldBob_b.setSize(new java.awt.Dimension(80, 30));
		jTextFieldBob_b.setToolTipText("number between 3 - (p-1)");
		jTextFieldBob_b.setVisible(false);
		jButtonBob_b.setFont(new java.awt.Font("Dialog", 0, 12));
		jButtonBob_b.setLocation(new java.awt.Point(186, 60));
		jButtonBob_b.setSize(new java.awt.Dimension(140, 30));
		jButtonBob_b.setText("Calculate Bobs B");
		jButtonBob_b.setVisible(false);
		jLabel_B_Bob.setBackground(java.awt.Color.white);
		jLabel_B_Bob.setFont(new java.awt.Font("SansSerif", 3, 12));
		jLabel_B_Bob.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabel_B_Bob.setLocation(new java.awt.Point(35, 130));
		jLabel_B_Bob.setSize(new java.awt.Dimension(10, 30));
		jLabel_B_Bob.setText("B");
		jLabel_B_Bob.setVisible(false);
		jLabelBob_B.setAlignmentX(0.5F);
		jLabelBob_B.setBackground(java.awt.Color.white);
		jLabelBob_B.setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.border.SoftBevelBorder(0), new javax.swing.border.SoftBevelBorder(1)));
		jLabelBob_B.setLocation(new java.awt.Point(66, 130));
		jLabelBob_B.setOpaque(true);
		jLabelBob_B.setSize(new java.awt.Dimension(80, 30));
		jLabelBob_B.setVisible(false);
		jButtonBob_B.setFont(new java.awt.Font("Dialog", 0, 12));
		jButtonBob_B.setLocation(new java.awt.Point(188, 130));
		jButtonBob_B.setSize(new java.awt.Dimension(140, 30));
		jButtonBob_B.setText("Send Alice B");
		jButtonBob_B.setVisible(false);
		jButtonBob_K.setFont(new java.awt.Font("Dialog", 0, 12));
		jButtonBob_K.setLocation(new java.awt.Point(36, 190));
		jButtonBob_K.setSize(new java.awt.Dimension(140, 30));
		jButtonBob_K.setText("Calculate Key");
		jButtonBob_K.setVisible(false);
		jLabel_Bob_A.setAlignmentX(0.5F);
		jLabel_Bob_A.setBackground(java.awt.Color.white);
		jLabel_Bob_A.setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.border.SoftBevelBorder(0), new javax.swing.border.SoftBevelBorder(1)));
		jLabel_Bob_A.setLocation(new java.awt.Point(86, 310));
		jLabel_Bob_A.setOpaque(true);
		jLabel_Bob_A.setSize(new java.awt.Dimension(80, 30));
		jLabel_Bob_A.setVisible(false);
		jLabelBob_A.setBackground(java.awt.Color.white);
		jLabelBob_A.setFont(new java.awt.Font("SansSerif", 0, 12));
		jLabelBob_A.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabelBob_A.setLocation(new java.awt.Point(16, 310));
		jLabelBob_A.setSize(new java.awt.Dimension(50, 30));
		jLabelBob_A.setText("Alice's");
		jLabelBob_A.setVisible(false);
		jLabel_Bob_K.setAlignmentX(0.5F);
		jLabel_Bob_K.setBackground(java.awt.Color.white);
		jLabel_Bob_K.setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.border.SoftBevelBorder(0), new javax.swing.border.SoftBevelBorder(1)));
		jLabel_Bob_K.setLocation(new java.awt.Point(96, 190));
		jLabel_Bob_K.setOpaque(true);
		jLabel_Bob_K.setSize(new java.awt.Dimension(80, 30));
		jLabel_Bob_K.setVisible(false);
		jLabelBob_K.setBackground(java.awt.Color.white);
		jLabelBob_K.setFont(new java.awt.Font("SansSerif", 3, 12));
		jLabelBob_K.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabelBob_K.setLocation(new java.awt.Point(26, 190));
		jLabelBob_K.setSize(new java.awt.Dimension(50, 30));
		jLabelBob_K.setText("Key  = ");
		jLabelBob_K.setVisible(false);
		jLabel_bb_Bob.setFont(new java.awt.Font("Dialog", 3, 12));
		jLabel_bb_Bob.setLocation(new java.awt.Point(50, 60));
		jLabel_bb_Bob.setSize(new java.awt.Dimension(10, 30));
		jLabel_bb_Bob.setText("b");
		jLabel_bb_Bob.setVisible(false);
		jLabelBob_AA.setFont(new java.awt.Font("Dialog", 3, 12));
		jLabelBob_AA.setLocation(new java.awt.Point(68, 310));
		jLabelBob_AA.setSize(new java.awt.Dimension(10, 30));
		jLabelBob_AA.setText("A");
		jLabelBob_AA.setVisible(false);
		jScrollPane1.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.HAND_CURSOR));
		jScrollPane1.setFocusable(false);
		jScrollPane1.setLocation(new java.awt.Point(5, 470));
		jScrollPane1.setSize(new java.awt.Dimension(690, 175));
		jScrollPane1.setVerticalScrollBarPolicy(javax.swing.JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		jScrollPane1.setVisible(true);
		jTextAreaOutPutMessage.setBorder(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178)));
		jTextAreaOutPutMessage.setEditable(false);
		jTextAreaOutPutMessage.setFont(new java.awt.Font("Dialog", 1, 11));
		jTextAreaOutPutMessage.setForeground(new java.awt.Color(128, 128, 64));
		jTextAreaOutPutMessage.setVisible(true);
		jLabelS.setBackground(java.awt.Color.white);
		jLabelS.setFont(new java.awt.Font("SansSerif", 0, 12));
		jLabelS.setLocation(new java.awt.Point(290, 40));
		jLabelS.setSize(new java.awt.Dimension(190, 30));
		jLabelS.setText("Enter a  Number between 2....P-1:");
		jLabelS.setVisible(true);
		jLabelP.setBackground(java.awt.Color.white);
		jLabelP.setFont(new java.awt.Font("SansSerif", 0, 12));
		jLabelP.setLocation(new java.awt.Point(40, 40));
		jLabelP.setSize(new java.awt.Dimension(130, 30));
		jLabelP.setText("Enter a Prime Number:");
		jLabelP.setVisible(true);
		jButtonSelectPS.setFont(new java.awt.Font("Dialog", 0, 12));
		jButtonSelectPS.setLocation(new java.awt.Point(610, 40));
		jButtonSelectPS.setSize(new java.awt.Dimension(70, 30));
		jButtonSelectPS.setText("OK");
		jButtonSelectPS.setVisible(true);
		jLabelPP.setFont(new java.awt.Font("Dialog", 3, 12));
		jLabelPP.setLocation(new java.awt.Point(170, 40));
		jLabelPP.setSize(new java.awt.Dimension(10, 30));
		jLabelPP.setText("P");
		jLabelPP.setVisible(true);
		jLabelSS.setFont(new java.awt.Font("Dialog", 3, 12));
		jLabelSS.setLocation(new java.awt.Point(480, 40));
		jLabelSS.setSize(new java.awt.Dimension(10, 30));
		jLabelSS.setText("s");
		jLabelSS.setVisible(true);
		getContentPane().setLayout(null);
		setLocation(new java.awt.Point(0, 0));

		jPanel1.add(jLabelPrimeP);
		jPanel1.add(jTextFieldPrimeP);
		jPanel1.add(jTextFieldNumberS);
		jPanel1.add(jLabelNumberS);
		jPanel1.add(jPanelAlice);
		jPanel1.add(jPanelBob);
		jPanel1.add(jScrollPane1);
		jPanel1.add(jLabelS);
		jPanel1.add(jLabelP);
		jPanel1.add(jButtonSelectPS);
		jPanel1.add(jLabelPP);
		jPanel1.add(jLabelSS);
		jPanelAlice.add(jLabel_aa_Alice);
		jPanelAlice.add(jLabelBobPublic);
		jPanelAlice.add(jLabelAliceData);
		jPanelAlice.add(jLabel_a_Alice);
		jPanelAlice.add(jTextFieldAlice_a);
		jPanelAlice.add(jButtonAlice_a);
		jPanelAlice.add(jLabel_A_Alice);
		jPanelAlice.add(jLabelAlice_A);
		jPanelAlice.add(jButtonAlice_A);
		jPanelAlice.add(jButtonAlice_K);
		jPanelAlice.add(jLabelAlice_K);
		jPanelAlice.add(jLabel_Alice_K);
		jPanelAlice.add(jLabelAlice_B);
		jPanelAlice.add(jLabel_Alice_B);
		jPanelAlice.add(jLabelAlice_a);
		jPanelAlice.add(jLabelAlice_BB);
		jPanelBob.add(jLabelBob_b);
		jPanelBob.add(jLabelBobData);
		jPanelBob.add(jLabelAlicePublic);
		jPanelBob.add(jLabel_b_Bob);
		jPanelBob.add(jTextFieldBob_b);
		jPanelBob.add(jButtonBob_b);
		jPanelBob.add(jLabel_B_Bob);
		jPanelBob.add(jLabelBob_B);
		jPanelBob.add(jButtonBob_B);
		jPanelBob.add(jButtonBob_K);
		jPanelBob.add(jLabel_Bob_A);
		jPanelBob.add(jLabelBob_A);
		jPanelBob.add(jLabel_Bob_K);
		jPanelBob.add(jLabelBob_K);
		jPanelBob.add(jLabel_bb_Bob);
		jPanelBob.add(jLabelBob_AA);
		jScrollPane1.getViewport().add(jTextAreaOutPutMessage);
		getContentPane().add(jPanel1);

		setSize(new java.awt.Dimension(700, 650));

		// event handling

// END GENERATED CODE
		// event handling
		jLabelPrimeP.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jLabelPrimePMouseClicked(e);
			}
		});
		jLabelNumberS.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jLabelNumberSMouseClicked(e);
			}
		});
		jButtonAlice_a.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonAlice_aMouseClicked(e);
			}
		});
		jButtonAlice_A.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonAlice_AMouseClicked(e);
			}
		});
		jButtonAlice_K.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonAlice_KMouseClicked(e);
			}
		});
		jLabelAlice_a.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jLabelAlice_aMouseClicked(e);
			}
		});
		jLabelBob_b.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jLabelBob_bMouseClicked(e);
			}
		});
		jButtonBob_b.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonBob_bMouseClicked(e);
			}
		});
		jButtonBob_B.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonBob_BMouseClicked(e);
			}
		});
		jButtonBob_K.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonBob_KMouseClicked(e);
			}
		});
		jButtonSelectPS.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonSelectPSMouseClicked(e);
			}
		});



OutPutMessage= ">>\nPlease enter P, a prime number in the range of 3..45000 and s, a number betwen 2 and p-1 then click on the ok button";

jTextAreaOutPutMessage.setText(OutPutMessage);

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
		KeyAgreement applet = new KeyAgreement();
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
	
	
		
 	public boolean isPrime(int n) {
    
            // 2 is the smallest prime
    
            if (n <= 2) {
                return true;
            }
    
            // even numbers other than 2 are not prime
    
            if (n % 2 == 0) {
                return false;
            }
    
            // check odd divisors from 3
            // to the square root of n
    
            for (int i = 3, end = (int)Math.sqrt(n);
            i <= end; i += 2) {
                if (n % i == 0) {
                    return false;
                }
            }
    
            return true;
            
            /*if (n.isProbablePrime(2)) 
            {
            return(1);
            }
            else 
            return(0); */
        }
	
	public void jButtonSelectPSMouseClicked(java.awt.event.MouseEvent e) {
	String popupError,sInput,pInput;
	int paerr=0,saerr=0;
	pInput=jTextFieldPrimeP.getText();
	sInput=jTextFieldNumberS.getText();
	pInput =pInput.trim();	
		
	for(int i=0;i<pInput.length();i++)
		
 		if (!Character.isDigit(pInput.charAt(i)))
	 			paerr =1;
		
	for(int i=0;i<sInput.length();i++)
	
 		if (!Character.isDigit(sInput.charAt(i)))
	 			saerr =1;
	
	if(pInput.length() ==  0) 
	 		ErrorPopup("P  not entered");
	else if(pInput.length() >5)
	 		ErrorPopup("P should be a prime number greater then 3 and less then 45000");
	else if(paerr== 1)
			ErrorPopup("P should be a prime number greater then 3 and less then 45000");
	else if(sInput.length() ==  0) 
	 		ErrorPopup("s  not entered");
	else if(saerr== 1)
	 		ErrorPopup("s should be a number");
	else
		{
		p=Integer.parseInt(pInput);
			
		if ( p < 4 )
			ErrorPopup("P should be a prime number greater then 3 and and less then 45000");
		else if ( p >45000)
			ErrorPopup("P should be a prime number greater then 3 and and less then 45000");	
		else if(!isPrime(p))
			ErrorPopup("P is not prime, P should be a prime number greater then 3 and and less then 45000");
		else if(sInput.length() >5)
	 		ErrorPopup("s should be a number in the range 2 ... P-1");
		else 
			{
			s=Integer.parseInt(sInput);
			if (s < 2) 
			ErrorPopup("s should be a number in the range 2 ... P-1");
			else if(s > p-1)
	 		ErrorPopup("s should be a number in the range 2 ... P-1");
			else
				{
				OutPutMessage= OutPutMessage + "\n>>\nTo change P or s, click on the P or s box";
				OutPutMessage= OutPutMessage + "\n>\nEnter a, any number between 2...P-1. Then click on Calculate Alice's A";
				jTextAreaOutPutMessage.setText(OutPutMessage);	
				jTextFieldNumberS.setVisible(false);
				jTextFieldPrimeP.setVisible(false);
				jLabelPrimeP.setText(Integer.toString(p));
				jLabelNumberS.setText(Integer.toString(s));
				jLabelNumberS.setVisible(true);
				jLabelPrimeP.setVisible(true);
				jButtonSelectPS.setVisible(false);
				jLabel_a_Alice.setText("Enter");
				jLabel_a_Alice.setVisible(true);
				jTextFieldAlice_a.setVisible(true);
				jLabelAlice_a.setVisible(false);
				jButtonAlice_a.setVisible(true);
				jLabel_aa_Alice.setLocation(new java.awt.Point(55,60));
				jLabel_aa_Alice.setVisible(true);
				}	
			}
		}
	}
	
	public void ErrorPopup(String message)	
	{
	getToolkit().beep();
	jOptionPane1.showMessageDialog(this,message,"Error",JOptionPane.ERROR_MESSAGE);
	}
	
	public void jLabelPrimePMouseClicked(java.awt.event.MouseEvent e) {
	

	jButtonSelectPS.setVisible(true);
	jLabelNumberS.setVisible(false);
	jLabelPrimeP.setVisible(false);
	jTextFieldNumberS.setVisible(true);
	jTextFieldPrimeP.setVisible(true);
	jLabel_a_Alice.setVisible(false);
	jTextFieldAlice_a.setVisible(false);
	jLabelAlice_a.setVisible(false);
	jButtonAlice_a.setVisible(false);
	jLabel_A_Alice.setVisible(false);
	jLabelAlice_A.setVisible(false);
	jButtonAlice_A.setVisible(false);
	jButtonAlice_K.setVisible(false);
	jLabelAlice_K.setVisible(false);
	jLabel_Alice_K.setVisible(false);
	jLabelAlice_B.setVisible(false);
	jLabel_Alice_B.setVisible(false);
	jLabel_b_Bob.setVisible(false);
	jTextFieldBob_b.setVisible(false);
	jLabelBob_b.setVisible(false);
	jButtonBob_b.setVisible(false);
	jLabel_B_Bob.setVisible(false);
	jLabelBob_B.setVisible(false);
	jButtonBob_B.setVisible(false);
	jButtonBob_K.setVisible(false);
	jLabel_Bob_A.setVisible(false);
	jLabelBob_A.setVisible(false);
	jLabel_Bob_K.setVisible(false);
	jLabelBob_K.setVisible(false);
	jLabel_aa_Alice.setVisible(false);
	jLabel_bb_Bob.setVisible(false);
	jLabelAlice_BB.setVisible(false);
	jLabelBob_AA.setVisible(false);


	
	}
	
	public void jLabelNumberSMouseClicked(java.awt.event.MouseEvent e) {
	jButtonSelectPS.setVisible(true);
	jLabelNumberS.setVisible(false);
	jLabelPrimeP.setVisible(false);
	jTextFieldNumberS.setVisible(true);
	jTextFieldPrimeP.setVisible(true);
	
	jLabel_a_Alice.setVisible(false);
	jTextFieldAlice_a.setVisible(false);
	jLabelAlice_a.setVisible(false);
	jButtonAlice_a.setVisible(false);
	jLabel_A_Alice.setVisible(false);
	jLabelAlice_A.setVisible(false);
	jButtonAlice_A.setVisible(false);
	jButtonAlice_K.setVisible(false);
	jLabelAlice_K.setVisible(false);
	jLabel_Alice_K.setVisible(false);
	jLabelAlice_B.setVisible(false);
	jLabel_Alice_B.setVisible(false);
	jLabel_b_Bob.setVisible(false);
	jTextFieldBob_b.setVisible(false);
	jLabelBob_b.setVisible(false);
	jButtonBob_b.setVisible(false);
	jLabel_B_Bob.setVisible(false);
	jLabelBob_B.setVisible(false);
	jButtonBob_B.setVisible(false);
	jButtonBob_K.setVisible(false);
	jLabel_Bob_A.setVisible(false);
	jLabelBob_A.setVisible(false);
	jLabel_Bob_K.setVisible(false);
	jLabelBob_K.setVisible(false);
	jLabel_aa_Alice.setVisible(false);
	jLabel_bb_Bob.setVisible(false);
	jLabelAlice_BB.setVisible(false);
	jLabelBob_AA.setVisible(false);

	}
	
	public void jButtonAlice_aMouseClicked(java.awt.event.MouseEvent e) {
	
	
	String aInput;
	int aaerr=0;
	aInput=jTextFieldAlice_a.getText();
	aInput =aInput.trim();	
	for(int i=0;i<aInput.length();i++)
		if (!Character.isDigit(aInput.charAt(i)))
 			aaerr =1;
	
	if(aInput.length() ==  0) 
	 		ErrorPopup("a  not entered");
	else if(aaerr== 1)
	 		ErrorPopup("a should be a number");
	else if(aInput.length() >5)
	 		ErrorPopup("a should be a number in the range 2 ... P-1");
		else 
			{
			a=Integer.parseInt(aInput);
			if (a < 2) 
			ErrorPopup("a should be a number in the range 2 ... P-1");
			else if(a > p-1)
	 		ErrorPopup("a should be a number in the range 2 ... P-1");
			else
				{
				binary_a = baseTenToTwo(a);
				A = afterModulo(s,binary_a,p);
				jLabelAlice_a.setText(Integer.toString(a));
				jLabelAlice_A.setText(Integer.toString(A));
				OutPutMessage = OutPutMessage + "\n>>\nAlice calculates A = (s ^ a ) Mod p = ("+Integer.toString(s)+" ^ "+Integer.toString(a)+") = "+Integer.toString(A); 
				OutPutMessage= OutPutMessage + "\nTo change a, click on a value box";
				OutPutMessage= OutPutMessage + "\nEnter b, any number between 2...P-1. Then click on Calculate Bob B";
				jTextAreaOutPutMessage.setText(OutPutMessage);	
				jLabel_aa_Alice.setLocation(new java.awt.Point(35,60));
				jLabel_a_Alice.setVisible(false);
				jButtonAlice_a.setVisible(false);
				jLabelAlice_a.setVisible(true);
				jTextFieldAlice_a.setVisible(false);
				jLabel_A_Alice.setVisible(true);
				jLabelAlice_A.setVisible(true);
				jLabel_b_Bob.setText("Enter");
				jLabel_b_Bob.setVisible(true);
				jTextFieldBob_b.setVisible(true);
				jButtonBob_b.setVisible(true);
				jLabel_bb_Bob.setVisible(true);
				jLabel_bb_Bob.setLocation(new java.awt.Point(50,60));
				}
			}	
	}
	
	public void jButtonBob_bMouseClicked(java.awt.event.MouseEvent e) {
	
	
	String bInput;
	int baerr=0;
	bInput=jTextFieldBob_b.getText();
	bInput =bInput.trim();	
	for(int i=0;i<bInput.length();i++)
		if (!Character.isDigit(bInput.charAt(i)))
 			baerr =1;
	
	if(bInput.length() ==  0) 
	 		ErrorPopup("b  not entered");
	else if(baerr== 1)
	 		ErrorPopup("b should be a number");
	else if(bInput.length() >5)
	 		ErrorPopup("b should be a number in the range 2 ... P-1");
		else 
			{
			b=Integer.parseInt(bInput);
			if (b < 2) 
			ErrorPopup("b should be a number in the range 2 ... P-1");
			else if(b > p-1)
	 		ErrorPopup("b should be a number in the range 2 ... P-1");
			else
				{
				binary_b = baseTenToTwo(b);
				B = afterModulo(s,binary_b,p);
				jLabelBob_b.setText(Integer.toString(b));
				jLabelBob_B.setText(Integer.toString(B));
				OutPutMessage = OutPutMessage + "\n>>\nBob calculates B = (s ^ b ) Mod p = ("+Integer.toString(s)+" ^ "+Integer.toString(b)+") = "+Integer.toString(B); 
				OutPutMessage= OutPutMessage + "\nTo change b, click on b value box";
				OutPutMessage= OutPutMessage + "\nAlice needs to send her A to Bob. Click on Send Bob A";
				jTextAreaOutPutMessage.setText(OutPutMessage);
				jLabel_b_Bob.setText("b");
				jLabelBob_b.setVisible(true);
				jTextFieldBob_b.setVisible(false);
				jButtonBob_b.setVisible(false);
				jLabelBob_B.setVisible(true);
				jLabel_B_Bob.setVisible(true);
				jButtonAlice_A.setVisible(true);
				jLabel_b_Bob.setVisible(false);
				jLabel_bb_Bob.setLocation(new java.awt.Point(35,60));
				}
			}	
	}			
	
	public void jButtonAlice_AMouseClicked(java.awt.event.MouseEvent e) {
	
	OutPutMessage= OutPutMessage + "\n>>\nBob receives Alice's A";
	OutPutMessage= OutPutMessage + "\nBob has to send his B to Alice, so Click on Send Alice B";
	jTextAreaOutPutMessage.setText(OutPutMessage);
	jLabel_Bob_A.setText(Integer.toString(A));
	jButtonAlice_A.setVisible(false);
	jButtonBob_B.setVisible(true);
	jLabelBob_A.setVisible(true);
	jLabel_Bob_A.setVisible(true);
	jLabelBob_AA.setVisible(true);

	}
	
	public void jButtonBob_BMouseClicked(java.awt.event.MouseEvent e) {
	
	
	OutPutMessage= OutPutMessage + "\n>>\nAlice receives Bob's B";
	OutPutMessage= OutPutMessage + "\nNow Alice calculates the key. Click on Calculate k";
	jTextAreaOutPutMessage.setText(OutPutMessage);
	jLabel_Alice_B.setText(Integer.toString(B));
	jButtonBob_B.setVisible(false);
	jLabelAlice_B.setVisible(true);
	jLabel_Alice_B.setVisible(true);
	jButtonAlice_K.setVisible(true);
	jLabelAlice_BB.setVisible(true);
	}
	
	public void jButtonAlice_KMouseClicked(java.awt.event.MouseEvent e) {
	
	
	Alice_Key= afterModulo(B,binary_a,p);
	jLabel_Alice_K.setText(Integer.toString(Alice_Key));	
	OutPutMessage= OutPutMessage + "\n>>\nAlice uses his private a, public p and B. Calculates Key = (B ^ a) Mod p = ("+ Integer.toString(B) +" ^ "+ Integer.toString(a)+ ") Mod "+Integer.toString(p)+" = "+Integer.toString(Alice_Key);
	OutPutMessage= OutPutMessage + "\nBob has Alice's A. So Bob also calculates the key. Click on Calculate k";
	jTextAreaOutPutMessage.setText(OutPutMessage);
	jButtonAlice_K.setVisible(false);
	jButtonBob_K.setVisible(true);
	jLabel_Alice_K.setVisible(true);
	jLabelAlice_K.setVisible(true);
	
	}
	
	public void jButtonBob_KMouseClicked(java.awt.event.MouseEvent e) {
	Bob_Key=  afterModulo(A,binary_b,p);
	jLabel_Bob_K.setText(Integer.toString(Bob_Key));
	OutPutMessage= OutPutMessage + "\n>>\nBob uses his private b, public p and A. Calculates Key = (A ^ b) Mod p = ("+ Integer.toString(A) +" ^ "+ Integer.toString(b)+ ") Mod "+Integer.toString(p)+" = "+Integer.toString(Bob_Key);
	OutPutMessage= OutPutMessage + "\nNow Both Bob and Alice has the same key. So they can use this as their key";
	jTextAreaOutPutMessage.setText(OutPutMessage);
	jButtonBob_K.setVisible(false);
	jLabel_Bob_K.setVisible(true);
	jLabelBob_K.setVisible(true);
	
	}
	
	public void jLabelAlice_aMouseClicked(java.awt.event.MouseEvent e) {
	jLabel_a_Alice.setText("Enter");
	jLabel_a_Alice.setVisible(true);
	jTextFieldAlice_a.setVisible(true);
	jButtonAlice_a.setVisible(true);
	jLabel_A_Alice.setVisible(false);
	jLabelAlice_A.setVisible(false);
	jButtonAlice_A.setVisible(false);
	jButtonAlice_K.setVisible(false);
	jLabelAlice_K.setVisible(false);
	jLabel_Alice_K.setVisible(false);
	jLabelAlice_B.setVisible(false);
	jLabel_Alice_B.setVisible(false);
	jLabel_b_Bob.setVisible(false);
	jTextFieldBob_b.setVisible(false);
	jLabelBob_b.setVisible(false);
	jButtonBob_b.setVisible(false);
	jLabel_B_Bob.setVisible(false);
	jLabelBob_B.setVisible(false);
	jButtonBob_B.setVisible(false);
	jButtonBob_K.setVisible(false);
	jLabel_Bob_A.setVisible(false);
	jLabelBob_A.setVisible(false);
	jLabel_Bob_K.setVisible(false);
	jLabelBob_K.setVisible(false);
	jLabel_aa_Alice.setVisible(true);
	jLabel_aa_Alice.setLocation(new java.awt.Point(55,60));
	jLabelAlice_BB.setVisible(false);
	jLabelBob_AA.setVisible(false);
	jLabel_bb_Bob.setVisible(false);
	}
	
	public void jLabelBob_bMouseClicked(java.awt.event.MouseEvent e) {
	
	jLabel_b_Bob.setText("enter");
	jLabel_b_Bob.setVisible(true);
	jTextFieldBob_b.setVisible(true);
	jButtonBob_b.setVisible(true);
	jLabel_bb_Bob.setVisible(true);
	jLabel_bb_Bob.setLocation(new java.awt.Point(55,60));
	jLabelAlice_BB.setVisible(false);
	jLabelBob_AA.setVisible(false);
	jButtonAlice_A.setVisible(false);
	jButtonAlice_K.setVisible(false);
	jLabelAlice_K.setVisible(false);
	jLabel_Alice_K.setVisible(false);
	jLabelAlice_B.setVisible(false);
	jLabel_Alice_B.setVisible(false);
	jLabelBob_b.setVisible(false);
	jLabel_B_Bob.setVisible(false);
	jLabelBob_B.setVisible(false);
	jButtonBob_B.setVisible(false);
	jButtonBob_K.setVisible(false);
	jLabel_Bob_A.setVisible(false);
	jLabelBob_A.setVisible(false);
	jLabel_Bob_K.setVisible(false);
	jLabelBob_K.setVisible(false);
	
	}
	
	public String baseTenToTwo(int n)
	{
	String outputBaseTwo = "";
	int baseTen;
	baseTen = n;
    // will loop 32 times
   // for(int k=0; k<32; k++)
   while(baseTen >0)
    	{
    	// tacks the remainder of the number divided by 2 to the beginning of the string
        if ((baseTen%2) == 0) { outputBaseTwo = "0" + outputBaseTwo;  }
        else { outputBaseTwo = "1" + outputBaseTwo; }

        // prepares the baseTen number for the next iteration of the loop
        baseTen = baseTen/2;
        }
    return(outputBaseTwo);    
	}

	public int afterModulo(int number, String power, int modulo)
	{
	int tempmod,pretempmod;
	tempmod = number;
	pretempmod=number;
	for(int i=1; i<power.length(); i++)
		{
		
		tempmod = (tempmod * tempmod) % modulo;
		
		if(power.substring(i,i+1).equals("1"))
			{
			tempmod = (tempmod * pretempmod) % modulo;	
			}
		}
	return(tempmod);	
	}

	

}
