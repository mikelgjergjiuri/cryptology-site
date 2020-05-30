/** 
 * ElGamal.java
 *
 * Title:			ElGamal Cryptosystem
 * Description:	
 * @author			chilukas
 * @version			
 */

package ElGamal;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import java.lang.Math.*;
import javax.swing.text.StyleConstants;




public class ElGamal extends javax.swing.JApplet {

// IMPORTANT: Source code between BEGIN/END comment pair will be regenerated
// every time the form is saved. All manual changes will be overwritten.
// BEGIN GENERATED CODE
	// member declarations
	javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
	javax.swing.JLabel jLabelPrimeP = new javax.swing.JLabel();
	javax.swing.JTextField jTextFieldPrimeP = new javax.swing.JTextField();
	javax.swing.JTextField jTextFieldNumberS = new javax.swing.JTextField();
	javax.swing.JLabel jLabelNumberS = new javax.swing.JLabel();
	javax.swing.JLabel jLabelS = new javax.swing.JLabel();
	javax.swing.JLabel jLabelP = new javax.swing.JLabel();
	javax.swing.JButton jButtonSelectPS = new javax.swing.JButton();
	javax.swing.JPanel jPanelAlice = new javax.swing.JPanel();
	javax.swing.JLabel jLabelAliceData = new javax.swing.JLabel();
	javax.swing.JLabel jLabelEncrypt = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_a_Alice = new javax.swing.JLabel();
	javax.swing.JTextField jTextFieldAlice_a = new javax.swing.JTextField();
	javax.swing.JButton jButtonAlice_a = new javax.swing.JButton();
	javax.swing.JLabel jLabelAlice_a = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_A_Alice = new javax.swing.JLabel();
	javax.swing.JLabel jLabelAlice_A = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_alice_encrypt = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_a_alice = new javax.swing.JLabel();
	javax.swing.JLabel jLabelAlice_k = new javax.swing.JLabel();
	javax.swing.JTextField jTextField_alice_k = new javax.swing.JTextField();
	javax.swing.JLabel jLabel_alice_message = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_alice_t = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_t_alice = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_alice_encrypted_Message = new javax.swing.JLabel();
	javax.swing.JButton jButton_t_message_alice = new javax.swing.JButton();
	javax.swing.JButton jButton_send_t_m = new javax.swing.JButton();
	javax.swing.JLabel jLabel_Alice_Public = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_Alice_B = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_B_Alice = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_aa_Alice = new javax.swing.JLabel();
	javax.swing.JScrollPane jScrollPane_allice_message = new javax.swing.JScrollPane();
	javax.swing.JTextField jTextField_alice_message = new javax.swing.JTextField();
	javax.swing.JScrollPane jScrollPane_message_alice = new javax.swing.JScrollPane();
	javax.swing.JLabel jLabel_message_alice = new javax.swing.JLabel();
	javax.swing.JScrollPane jScrollPane_Encrypted_message_Alice = new javax.swing.JScrollPane();
	javax.swing.JLabel jLabel_Encrypted_message_Alice = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_Alice_BB = new javax.swing.JLabel();
	javax.swing.JPanel jPanelBob = new javax.swing.JPanel();
	javax.swing.JLabel jLabel_bb_Bob = new javax.swing.JLabel();
	javax.swing.JLabel jLabelBobData = new javax.swing.JLabel();
	javax.swing.JLabel jLabelDecrypt = new javax.swing.JLabel();
	javax.swing.JLabel jLabelAlicePublic = new javax.swing.JLabel();
	javax.swing.JLabel jLabelBob_b = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_b_Bob = new javax.swing.JLabel();
	javax.swing.JTextField jTextFieldBob_b = new javax.swing.JTextField();
	javax.swing.JButton jButtonBob_b = new javax.swing.JButton();
	javax.swing.JLabel jLabel_B_Bob = new javax.swing.JLabel();
	javax.swing.JLabel jLabelBob_B = new javax.swing.JLabel();
	javax.swing.JLabel jLabelBob_t_m = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_Bob_T = new javax.swing.JLabel();
	javax.swing.JButton jButtonDecrypt = new javax.swing.JButton();
	javax.swing.JLabel jLabel_bob_t = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_t_bob = new javax.swing.JLabel();
	javax.swing.JLabel jLabel_decrypt_message = new javax.swing.JLabel();
	javax.swing.JButton jButtonBob_B = new javax.swing.JButton();
	javax.swing.JScrollPane jScrollPane_Bob_M = new javax.swing.JScrollPane();
	javax.swing.JLabel jLabel_Bob_M = new javax.swing.JLabel();
	javax.swing.JScrollPane jScrollPanemessage_decrypt = new javax.swing.JScrollPane();
	javax.swing.JLabel jLabelmessage_decrypt = new javax.swing.JLabel();
	javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
	javax.swing.JTextArea jTextAreaOutPutMessage = new javax.swing.JTextArea();
	javax.swing.JLabel jLabelPP = new javax.swing.JLabel();
	javax.swing.JLabel jLabelSS = new javax.swing.JLabel();
// END GENERATED CODE
	javax.swing.JOptionPane jOptionPane1 = new javax.swing.JOptionPane();
	String OutPutMessage;
	boolean isStandalone = false;
	int p,s,a,A,b,B,Alice_k,Bob_k,Alice_plain [],Bob_plain [],Bob_encrypted [],Alice_T,Bob_T;
	int tempint,block;
	String binary_a,binary_b;
	int iePlain [], plainBlocks1 [], plainBlocks [], iPlain [];
	String Alice_encrypted, messageInput;
	char cPlain [];
	public ElGamal() {
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
		jPanel1.setBorder(new javax.swing.plaf.BorderUIResource.TitledBorderUIResource(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, false), "ElGamal Cryptosystem", 4, 2, new java.awt.Font("Dialog", 1, 12), java.awt.Color.black));
		jPanel1.setLayout(null);
		jPanel1.setLocation(new java.awt.Point(0, 0));
		jPanel1.setSize(new java.awt.Dimension(800, 670));
		jPanel1.setVisible(true);
		jLabelPrimeP.setAlignmentX(0.5F);
		jLabelPrimeP.setBackground(java.awt.Color.white);
		jLabelPrimeP.setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.border.SoftBevelBorder(0), new javax.swing.border.SoftBevelBorder(1)));
		jLabelPrimeP.setLocation(new java.awt.Point(180, 40));
		jLabelPrimeP.setOpaque(true);
		jLabelPrimeP.setSize(new java.awt.Dimension(80, 30));
		jLabelPrimeP.setVisible(false);
		jTextFieldPrimeP.setBorder(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178)));
		jTextFieldPrimeP.setLocation(new java.awt.Point(180, 40));
		jTextFieldPrimeP.setSize(new java.awt.Dimension(80, 30));
		jTextFieldPrimeP.setToolTipText("number between 3 - 45000");
		jTextFieldPrimeP.setVisible(true);
		jTextFieldNumberS.setBorder(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178)));
		jTextFieldNumberS.setLocation(new java.awt.Point(490, 40));
		jTextFieldNumberS.setSize(new java.awt.Dimension(80, 30));
		jTextFieldNumberS.setToolTipText("number between 3 - 2147483647");
		jTextFieldNumberS.setVisible(true);
		jLabelNumberS.setAlignmentX(0.5F);
		jLabelNumberS.setBackground(java.awt.Color.white);
		jLabelNumberS.setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.border.SoftBevelBorder(0), new javax.swing.border.SoftBevelBorder(1)));
		jLabelNumberS.setLocation(new java.awt.Point(490, 40));
		jLabelNumberS.setOpaque(true);
		jLabelNumberS.setSize(new java.awt.Dimension(80, 30));
		jLabelNumberS.setVisible(false);
		jLabelS.setBackground(java.awt.Color.white);
		jLabelS.setFont(new java.awt.Font("SansSerif", 0, 12));
		jLabelS.setLocation(new java.awt.Point(280, 40));
		jLabelS.setSize(new java.awt.Dimension(190, 30));
		jLabelS.setText("Enter a  Number between 2....P-1:");
		jLabelS.setVisible(true);
		jLabelP.setBackground(java.awt.Color.white);
		jLabelP.setFont(new java.awt.Font("SansSerif", 0, 12));
		jLabelP.setLocation(new java.awt.Point(20, 40));
		jLabelP.setSize(new java.awt.Dimension(130, 30));
		jLabelP.setText("Enter a Prime Number: ");
		jLabelP.setVisible(true);
		jButtonSelectPS.setFont(new java.awt.Font("Dialog", 0, 12));
		jButtonSelectPS.setLocation(new java.awt.Point(610, 40));
		jButtonSelectPS.setSize(new java.awt.Dimension(70, 30));
		jButtonSelectPS.setText("OK");
		jButtonSelectPS.setVisible(true);
		jPanelAlice.setBackground(java.awt.Color.white);
		jPanelAlice.setBorder(new javax.swing.plaf.BorderUIResource.TitledBorderUIResource(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, false), "Alice", 2, 2, new java.awt.Font("SansSerif", 2, 14), java.awt.Color.darkGray));
		jPanelAlice.setLayout(null);
		jPanelAlice.setLocation(new java.awt.Point(5, 80));
		jPanelAlice.setSize(new java.awt.Dimension(390, 440));
		jPanelAlice.setVisible(true);
		jLabelAliceData.setBackground(java.awt.Color.white);
		jLabelAliceData.setBorder(new javax.swing.border.SoftBevelBorder(0));
		jLabelAliceData.setFont(new java.awt.Font("SansSerif", 0, 12));
		jLabelAliceData.setLocation(new java.awt.Point(15, 20));
		jLabelAliceData.setSize(new java.awt.Dimension(280, 20));
		jLabelAliceData.setText("Alice's  Data");
		jLabelAliceData.setVisible(true);
		jLabelEncrypt.setBackground(java.awt.Color.white);
		jLabelEncrypt.setBorder(new javax.swing.border.SoftBevelBorder(0));
		jLabelEncrypt.setFont(new java.awt.Font("SansSerif", 0, 12));
		jLabelEncrypt.setLocation(new java.awt.Point(15, 130));
		jLabelEncrypt.setSize(new java.awt.Dimension(280, 20));
		jLabelEncrypt.setText("Encryption");
		jLabelEncrypt.setVisible(true);
		jLabel_a_Alice.setBackground(java.awt.Color.white);
		jLabel_a_Alice.setFont(new java.awt.Font("SansSerif", 0, 12));
		jLabel_a_Alice.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabel_a_Alice.setLocation(new java.awt.Point(15, 60));
		jLabel_a_Alice.setSize(new java.awt.Dimension(40, 30));
		jLabel_a_Alice.setText("Enter");
		jLabel_a_Alice.setVisible(false);
		jTextFieldAlice_a.setBorder(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178)));
		jTextFieldAlice_a.setLocation(new java.awt.Point(75, 60));
		jTextFieldAlice_a.setSize(new java.awt.Dimension(80, 30));
		jTextFieldAlice_a.setToolTipText("number between 3 - (p-1)");
		jTextFieldAlice_a.setVisible(false);
		jButtonAlice_a.setFont(new java.awt.Font("Dialog", 0, 12));
		jButtonAlice_a.setLocation(new java.awt.Point(15, 100));
		jButtonAlice_a.setSize(new java.awt.Dimension(140, 30));
		jButtonAlice_a.setText("Calculate Alices A1");
		jButtonAlice_a.setVisible(false);
		jLabelAlice_a.setAlignmentX(0.5F);
		jLabelAlice_a.setBackground(java.awt.Color.white);
		jLabelAlice_a.setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.border.SoftBevelBorder(0), new javax.swing.border.SoftBevelBorder(1)));
		jLabelAlice_a.setLocation(new java.awt.Point(75, 60));
		jLabelAlice_a.setOpaque(true);
		jLabelAlice_a.setSize(new java.awt.Dimension(80, 30));
		jLabelAlice_a.setVisible(false);
		jLabel_A_Alice.setBackground(java.awt.Color.white);
		jLabel_A_Alice.setFont(new java.awt.Font("SansSerif", 3, 12));
		jLabel_A_Alice.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabel_A_Alice.setLocation(new java.awt.Point(185, 60));
		jLabel_A_Alice.setSize(new java.awt.Dimension(50, 30));
		jLabel_A_Alice.setText("A1");
		jLabel_A_Alice.setVisible(false);
		jLabelAlice_A.setAlignmentX(0.5F);
		jLabelAlice_A.setBackground(java.awt.Color.white);
		jLabelAlice_A.setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.border.SoftBevelBorder(0), new javax.swing.border.SoftBevelBorder(1)));
		jLabelAlice_A.setLocation(new java.awt.Point(235, 60));
		jLabelAlice_A.setOpaque(true);
		jLabelAlice_A.setSize(new java.awt.Dimension(80, 30));
		jLabelAlice_A.setVisible(false);
		jLabel_alice_encrypt.setBackground(java.awt.Color.white);
		jLabel_alice_encrypt.setFont(new java.awt.Font("SansSerif", 0, 12));
		jLabel_alice_encrypt.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabel_alice_encrypt.setLocation(new java.awt.Point(35, 150));
		jLabel_alice_encrypt.setSize(new java.awt.Dimension(200, 30));
		jLabel_alice_encrypt.setText("Enter k and Message to Encrypt");
		jLabel_alice_encrypt.setVisible(false);
		jLabel_a_alice.setBackground(java.awt.Color.white);
		jLabel_a_alice.setFont(new java.awt.Font("SansSerif", 3, 12));
		jLabel_a_alice.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabel_a_alice.setLocation(new java.awt.Point(15, 180));
		jLabel_a_alice.setSize(new java.awt.Dimension(30, 30));
		jLabel_a_alice.setText("K");
		jLabel_a_alice.setVisible(false);
		jLabelAlice_k.setAlignmentX(0.5F);
		jLabelAlice_k.setBackground(java.awt.Color.white);
		jLabelAlice_k.setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.border.SoftBevelBorder(0), new javax.swing.border.SoftBevelBorder(1)));
		jLabelAlice_k.setLocation(new java.awt.Point(165, 180));
		jLabelAlice_k.setOpaque(true);
		jLabelAlice_k.setSize(new java.awt.Dimension(80, 30));
		jLabelAlice_k.setVisible(false);
		jTextField_alice_k.setBorder(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178)));
		jTextField_alice_k.setLocation(new java.awt.Point(85, 180));
		jTextField_alice_k.setSize(new java.awt.Dimension(80, 30));
		jTextField_alice_k.setToolTipText("number between 3 - (p-1)");
		jTextField_alice_k.setVisible(false);
		jLabel_alice_message.setBackground(java.awt.Color.white);
		jLabel_alice_message.setFont(new java.awt.Font("SansSerif", 0, 12));
		jLabel_alice_message.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabel_alice_message.setLocation(new java.awt.Point(5, 220));
		jLabel_alice_message.setSize(new java.awt.Dimension(85, 30));
		jLabel_alice_message.setText("Message");
		jLabel_alice_message.setVisible(false);
		jLabel_alice_t.setBackground(java.awt.Color.white);
		jLabel_alice_t.setFont(new java.awt.Font("SansSerif", 3, 12));
		jLabel_alice_t.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabel_alice_t.setLocation(new java.awt.Point(5, 270));
		jLabel_alice_t.setSize(new java.awt.Dimension(50, 30));
		jLabel_alice_t.setText("T");
		jLabel_alice_t.setVisible(false);
		jLabel_t_alice.setAlignmentX(0.5F);
		jLabel_t_alice.setBackground(java.awt.Color.white);
		jLabel_t_alice.setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.border.SoftBevelBorder(0), new javax.swing.border.SoftBevelBorder(1)));
		jLabel_t_alice.setLocation(new java.awt.Point(165, 270));
		jLabel_t_alice.setOpaque(true);
		jLabel_t_alice.setSize(new java.awt.Dimension(80, 30));
		jLabel_t_alice.setVisible(false);
		jLabel_alice_encrypted_Message.setBackground(java.awt.Color.white);
		jLabel_alice_encrypted_Message.setFont(new java.awt.Font("SansSerif", 0, 12));
		jLabel_alice_encrypted_Message.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabel_alice_encrypted_Message.setLocation(new java.awt.Point(25, 300));
		jLabel_alice_encrypted_Message.setSize(new java.awt.Dimension(130, 30));
		jLabel_alice_encrypted_Message.setText("Encrypted Message, E");
		jLabel_alice_encrypted_Message.setVisible(false);
		jButton_t_message_alice.setFont(new java.awt.Font("Dialog", 0, 12));
		jButton_t_message_alice.setLocation(new java.awt.Point(15, 300));
		jButton_t_message_alice.setSize(new java.awt.Dimension(240, 30));
		jButton_t_message_alice.setText("Caluclate T and Encrypt Message");
		jButton_t_message_alice.setVisible(false);
		jButton_send_t_m.setFont(new java.awt.Font("Dialog", 0, 12));
		jButton_send_t_m.setLocation(new java.awt.Point(145, 355));
		jButton_send_t_m.setSize(new java.awt.Dimension(150, 20));
		jButton_send_t_m.setText("Send T and E to Bob");
		jButton_send_t_m.setVisible(false);
		jLabel_Alice_Public.setBackground(java.awt.Color.white);
		jLabel_Alice_Public.setBorder(new javax.swing.border.SoftBevelBorder(0));
		jLabel_Alice_Public.setFont(new java.awt.Font("SansSerif", 0, 12));
		jLabel_Alice_Public.setLocation(new java.awt.Point(5, 380));
		jLabel_Alice_Public.setSize(new java.awt.Dimension(280, 20));
		jLabel_Alice_Public.setText("Bob Sent Data");
		jLabel_Alice_Public.setVisible(true);
		jLabel_Alice_B.setBackground(java.awt.Color.white);
		jLabel_Alice_B.setFont(new java.awt.Font("SansSerif", 0, 12));
		jLabel_Alice_B.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabel_Alice_B.setLocation(new java.awt.Point(5, 400));
		jLabel_Alice_B.setSize(new java.awt.Dimension(80, 30));
		jLabel_Alice_B.setText("Bob's");
		jLabel_Alice_B.setVisible(false);
		jLabel_B_Alice.setAlignmentX(0.5F);
		jLabel_B_Alice.setBackground(java.awt.Color.white);
		jLabel_B_Alice.setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.border.SoftBevelBorder(0), new javax.swing.border.SoftBevelBorder(1)));
		jLabel_B_Alice.setLocation(new java.awt.Point(85, 400));
		jLabel_B_Alice.setOpaque(true);
		jLabel_B_Alice.setSize(new java.awt.Dimension(90, 30));
		jLabel_B_Alice.setVisible(false);
		jLabel_aa_Alice.setFont(new java.awt.Font("Dialog", 3, 12));
		jLabel_aa_Alice.setLocation(new java.awt.Point(55, 60));
		jLabel_aa_Alice.setSize(new java.awt.Dimension(10, 30));
		jLabel_aa_Alice.setText("A");
		jLabel_aa_Alice.setVisible(false);
		jScrollPane_allice_message.setBorder(new javax.swing.border.LineBorder(java.awt.Color.white, 1, false));
		jScrollPane_allice_message.setLocation(new java.awt.Point(85, 210));
		jScrollPane_allice_message.setSize(new java.awt.Dimension(200, 50));
		jScrollPane_allice_message.setVisible(false);
		jTextField_alice_message.setBorder(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178)));
		jTextField_alice_message.setToolTipText("enter message");
		jTextField_alice_message.setVisible(true);
		jScrollPane_message_alice.setBorder(new javax.swing.border.LineBorder(java.awt.Color.white, 1, false));
		jScrollPane_message_alice.setLocation(new java.awt.Point(165, 210));
		jScrollPane_message_alice.setSize(new java.awt.Dimension(200, 50));
		jScrollPane_message_alice.setVisible(false);
		jLabel_message_alice.setAlignmentX(0.5F);
		jLabel_message_alice.setBackground(java.awt.Color.white);
		jLabel_message_alice.setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.border.SoftBevelBorder(0), new javax.swing.border.SoftBevelBorder(1)));
		jLabel_message_alice.setOpaque(true);
		jLabel_message_alice.setVisible(true);
		jScrollPane_Encrypted_message_Alice.setBorder(new javax.swing.border.LineBorder(java.awt.Color.white, 1, false));
		jScrollPane_Encrypted_message_Alice.setLocation(new java.awt.Point(165, 300));
		jScrollPane_Encrypted_message_Alice.setSize(new java.awt.Dimension(200, 50));
		jScrollPane_Encrypted_message_Alice.setVisible(false);
		jLabel_Encrypted_message_Alice.setAlignmentX(0.5F);
		jLabel_Encrypted_message_Alice.setBackground(java.awt.Color.white);
		jLabel_Encrypted_message_Alice.setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.border.SoftBevelBorder(0), new javax.swing.border.SoftBevelBorder(1)));
		jLabel_Encrypted_message_Alice.setOpaque(true);
		jLabel_Encrypted_message_Alice.setVisible(true);
		jLabel_Alice_BB.setFont(new java.awt.Font("Dialog", 3, 12));
		jLabel_Alice_BB.setLocation(new java.awt.Point(65, 400));
		jLabel_Alice_BB.setSize(new java.awt.Dimension(10, 30));
		jLabel_Alice_BB.setText("B");
		jLabel_Alice_BB.setVisible(false);
		jPanelBob.setBackground(java.awt.Color.white);
		jPanelBob.setBorder(new javax.swing.plaf.BorderUIResource.TitledBorderUIResource(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, false), "Bob", 2, 2, new java.awt.Font("SansSerif", 2, 14), java.awt.Color.darkGray));
		jPanelBob.setLayout(null);
		jPanelBob.setLocation(new java.awt.Point(400, 80));
		jPanelBob.setSize(new java.awt.Dimension(393, 440));
		jPanelBob.setVisible(true);
		jLabel_bb_Bob.setFont(new java.awt.Font("Dialog", 3, 12));
		jLabel_bb_Bob.setLocation(new java.awt.Point(60, 60));
		jLabel_bb_Bob.setSize(new java.awt.Dimension(10, 30));
		jLabel_bb_Bob.setText("B");
		jLabel_bb_Bob.setVisible(false);
		jLabelBobData.setBackground(java.awt.Color.white);
		jLabelBobData.setBorder(new javax.swing.border.SoftBevelBorder(0));
		jLabelBobData.setFont(new java.awt.Font("SansSerif", 0, 12));
		jLabelBobData.setLocation(new java.awt.Point(18, 20));
		jLabelBobData.setSize(new java.awt.Dimension(280, 20));
		jLabelBobData.setText("Bob's Data");
		jLabelBobData.setVisible(true);
		jLabelDecrypt.setBackground(java.awt.Color.white);
		jLabelDecrypt.setBorder(new javax.swing.border.SoftBevelBorder(0));
		jLabelDecrypt.setFont(new java.awt.Font("SansSerif", 0, 12));
		jLabelDecrypt.setLocation(new java.awt.Point(20, 270));
		jLabelDecrypt.setSize(new java.awt.Dimension(280, 20));
		jLabelDecrypt.setText("Decryption");
		jLabelDecrypt.setVisible(true);
		jLabelAlicePublic.setBackground(java.awt.Color.white);
		jLabelAlicePublic.setBorder(new javax.swing.border.SoftBevelBorder(0));
		jLabelAlicePublic.setFont(new java.awt.Font("SansSerif", 0, 12));
		jLabelAlicePublic.setLocation(new java.awt.Point(20, 140));
		jLabelAlicePublic.setSize(new java.awt.Dimension(280, 20));
		jLabelAlicePublic.setText("Alice Sent Data");
		jLabelAlicePublic.setVisible(true);
		jLabelBob_b.setAlignmentX(0.5F);
		jLabelBob_b.setBackground(java.awt.Color.white);
		jLabelBob_b.setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.border.SoftBevelBorder(0), new javax.swing.border.SoftBevelBorder(1)));
		jLabelBob_b.setLocation(new java.awt.Point(80, 60));
		jLabelBob_b.setOpaque(true);
		jLabelBob_b.setSize(new java.awt.Dimension(80, 30));
		jLabelBob_b.setVisible(false);
		jLabel_b_Bob.setBackground(java.awt.Color.white);
		jLabel_b_Bob.setFont(new java.awt.Font("SansSerif", 0, 12));
		jLabel_b_Bob.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabel_b_Bob.setLocation(new java.awt.Point(16, 60));
		jLabel_b_Bob.setSize(new java.awt.Dimension(44, 30));
		jLabel_b_Bob.setText("Enter");
		jLabel_b_Bob.setVisible(false);
		jTextFieldBob_b.setBorder(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178)));
		jTextFieldBob_b.setLocation(new java.awt.Point(80, 60));
		jTextFieldBob_b.setSize(new java.awt.Dimension(80, 30));
		jTextFieldBob_b.setToolTipText("number between 3 - (p-1)");
		jTextFieldBob_b.setVisible(false);
		jButtonBob_b.setFont(new java.awt.Font("Dialog", 0, 12));
		jButtonBob_b.setLocation(new java.awt.Point(30, 100));
		jButtonBob_b.setSize(new java.awt.Dimension(140, 30));
		jButtonBob_b.setText("Calculate Bobs B1");
		jButtonBob_b.setVisible(false);
		jLabel_B_Bob.setBackground(java.awt.Color.white);
		jLabel_B_Bob.setFont(new java.awt.Font("SansSerif", 3, 12));
		jLabel_B_Bob.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabel_B_Bob.setLocation(new java.awt.Point(178, 60));
		jLabel_B_Bob.setSize(new java.awt.Dimension(50, 30));
		jLabel_B_Bob.setText("B1");
		jLabel_B_Bob.setVisible(false);
		jLabelBob_B.setAlignmentX(0.5F);
		jLabelBob_B.setBackground(java.awt.Color.white);
		jLabelBob_B.setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.border.SoftBevelBorder(0), new javax.swing.border.SoftBevelBorder(1)));
		jLabelBob_B.setLocation(new java.awt.Point(226, 60));
		jLabelBob_B.setOpaque(true);
		jLabelBob_B.setSize(new java.awt.Dimension(80, 30));
		jLabelBob_B.setVisible(false);
		jLabelBob_t_m.setBackground(java.awt.Color.white);
		jLabelBob_t_m.setFont(new java.awt.Font("SansSerif", 0, 12));
		jLabelBob_t_m.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabelBob_t_m.setLocation(new java.awt.Point(20, 170));
		jLabelBob_t_m.setSize(new java.awt.Dimension(190, 30));
		jLabelBob_t_m.setText("Alice T and Encrypted Messsage");
		jLabelBob_t_m.setVisible(false);
		jLabel_Bob_T.setAlignmentX(0.5F);
		jLabel_Bob_T.setBackground(java.awt.Color.white);
		jLabel_Bob_T.setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.border.SoftBevelBorder(0), new javax.swing.border.SoftBevelBorder(1)));
		jLabel_Bob_T.setLocation(new java.awt.Point(30, 200));
		jLabel_Bob_T.setOpaque(true);
		jLabel_Bob_T.setSize(new java.awt.Dimension(80, 30));
		jLabel_Bob_T.setVisible(false);
		jButtonDecrypt.setFont(new java.awt.Font("Dialog", 0, 12));
		jButtonDecrypt.setLocation(new java.awt.Point(90, 300));
		jButtonDecrypt.setSize(new java.awt.Dimension(140, 30));
		jButtonDecrypt.setText("Decrypt");
		jButtonDecrypt.setVisible(false);
		jLabel_bob_t.setBackground(java.awt.Color.white);
		jLabel_bob_t.setFont(new java.awt.Font("SansSerif", 3, 12));
		jLabel_bob_t.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabel_bob_t.setLocation(new java.awt.Point(20, 330));
		jLabel_bob_t.setSize(new java.awt.Dimension(50, 30));
		jLabel_bob_t.setText("T^( -B)");
		jLabel_bob_t.setVisible(false);
		jLabel_t_bob.setAlignmentX(0.5F);
		jLabel_t_bob.setBackground(java.awt.Color.white);
		jLabel_t_bob.setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.border.SoftBevelBorder(0), new javax.swing.border.SoftBevelBorder(1)));
		jLabel_t_bob.setLocation(new java.awt.Point(160, 330));
		jLabel_t_bob.setOpaque(true);
		jLabel_t_bob.setSize(new java.awt.Dimension(80, 30));
		jLabel_t_bob.setVisible(false);
		jLabel_decrypt_message.setBackground(java.awt.Color.white);
		jLabel_decrypt_message.setFont(new java.awt.Font("SansSerif", 0, 12));
		jLabel_decrypt_message.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		jLabel_decrypt_message.setLocation(new java.awt.Point(30, 360));
		jLabel_decrypt_message.setSize(new java.awt.Dimension(110, 30));
		jLabel_decrypt_message.setText("Decrypted Message");
		jLabel_decrypt_message.setVisible(false);
		jButtonBob_B.setFont(new java.awt.Font("Dialog", 0, 12));
		jButtonBob_B.setLocation(new java.awt.Point(30, 100));
		jButtonBob_B.setSize(new java.awt.Dimension(140, 30));
		jButtonBob_B.setText("Send Alice B1");
		jButtonBob_B.setVisible(false);
		jScrollPane_Bob_M.setBorder(new javax.swing.border.LineBorder(java.awt.Color.white, 1, false));
		jScrollPane_Bob_M.setLocation(new java.awt.Point(140, 200));
		jScrollPane_Bob_M.setSize(new java.awt.Dimension(200, 50));
		jScrollPane_Bob_M.setVisible(false);
		jLabel_Bob_M.setAlignmentX(0.5F);
		jLabel_Bob_M.setBackground(java.awt.Color.white);
		jLabel_Bob_M.setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.border.SoftBevelBorder(0), new javax.swing.border.SoftBevelBorder(1)));
		jLabel_Bob_M.setOpaque(true);
		jLabel_Bob_M.setVisible(true);
		jScrollPanemessage_decrypt.setBorder(new javax.swing.border.LineBorder(java.awt.Color.white, 1, false));
		jScrollPanemessage_decrypt.setLocation(new java.awt.Point(160, 360));
		jScrollPanemessage_decrypt.setSize(new java.awt.Dimension(200, 50));
		jScrollPanemessage_decrypt.setVisible(false);
		jLabelmessage_decrypt.setAlignmentX(0.5F);
		jLabelmessage_decrypt.setBackground(java.awt.Color.white);
		jLabelmessage_decrypt.setBorder(new javax.swing.plaf.BorderUIResource.CompoundBorderUIResource(new javax.swing.border.SoftBevelBorder(0), new javax.swing.border.SoftBevelBorder(1)));
		jLabelmessage_decrypt.setOpaque(true);
		jLabelmessage_decrypt.setVisible(true);
		jScrollPane1.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.HAND_CURSOR));
		jScrollPane1.setFocusable(false);
		jScrollPane1.setLocation(new java.awt.Point(5, 520));
		jScrollPane1.setSize(new java.awt.Dimension(790, 145));
		jScrollPane1.setVerticalScrollBarPolicy(javax.swing.JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		jScrollPane1.setVisible(true);
		jTextAreaOutPutMessage.setBorder(new javax.swing.plaf.BorderUIResource.EtchedBorderUIResource(1, java.awt.Color.white, new java.awt.Color(178, 178, 178)));
		jTextAreaOutPutMessage.setEditable(false);
		jTextAreaOutPutMessage.setFont(new java.awt.Font("Dialog", 1, 11));
		jTextAreaOutPutMessage.setForeground(new java.awt.Color(128, 128, 64));
		jTextAreaOutPutMessage.setLineWrap(true);
		jTextAreaOutPutMessage.setVisible(true);
		jLabelPP.setFont(new java.awt.Font("Dialog", 3, 12));
		jLabelPP.setLocation(new java.awt.Point(160, 40));
		jLabelPP.setSize(new java.awt.Dimension(10, 30));
		jLabelPP.setText("P");
		jLabelPP.setVisible(true);
		jLabelSS.setFont(new java.awt.Font("Dialog", 3, 12));
		jLabelSS.setLocation(new java.awt.Point(470, 40));
		jLabelSS.setSize(new java.awt.Dimension(10, 30));
		jLabelSS.setText("S");
		jLabelSS.setVisible(true);
		getContentPane().setLayout(null);
		setLocation(new java.awt.Point(0, 0));

		jPanel1.add(jLabelPrimeP);
		jPanel1.add(jTextFieldPrimeP);
		jPanel1.add(jTextFieldNumberS);
		jPanel1.add(jLabelNumberS);
		jPanel1.add(jLabelS);
		jPanel1.add(jLabelP);
		jPanel1.add(jButtonSelectPS);
		jPanel1.add(jPanelAlice);
		jPanel1.add(jPanelBob);
		jPanel1.add(jScrollPane1);
		jPanel1.add(jLabelPP);
		jPanel1.add(jLabelSS);
		jPanelAlice.add(jLabelAliceData);
		jPanelAlice.add(jLabelEncrypt);
		jPanelAlice.add(jLabel_a_Alice);
		jPanelAlice.add(jTextFieldAlice_a);
		jPanelAlice.add(jButtonAlice_a);
		jPanelAlice.add(jLabelAlice_a);
		jPanelAlice.add(jLabel_A_Alice);
		jPanelAlice.add(jLabelAlice_A);
		jPanelAlice.add(jLabel_alice_encrypt);
		jPanelAlice.add(jLabel_a_alice);
		jPanelAlice.add(jLabelAlice_k);
		jPanelAlice.add(jTextField_alice_k);
		jPanelAlice.add(jLabel_alice_message);
		jPanelAlice.add(jLabel_alice_t);
		jPanelAlice.add(jLabel_t_alice);
		jPanelAlice.add(jLabel_alice_encrypted_Message);
		jPanelAlice.add(jButton_t_message_alice);
		jPanelAlice.add(jButton_send_t_m);
		jPanelAlice.add(jLabel_Alice_Public);
		jPanelAlice.add(jLabel_Alice_B);
		jPanelAlice.add(jLabel_B_Alice);
		jPanelAlice.add(jLabel_aa_Alice);
		jPanelAlice.add(jScrollPane_allice_message);
		jPanelAlice.add(jScrollPane_message_alice);
		jPanelAlice.add(jScrollPane_Encrypted_message_Alice);
		jPanelAlice.add(jLabel_Alice_BB);
		jScrollPane_allice_message.getViewport().add(jTextField_alice_message);
		jScrollPane_message_alice.getViewport().add(jLabel_message_alice);
		jScrollPane_Encrypted_message_Alice.getViewport().add(jLabel_Encrypted_message_Alice);
		jPanelBob.add(jLabel_bb_Bob);
		jPanelBob.add(jLabelBobData);
		jPanelBob.add(jLabelDecrypt);
		jPanelBob.add(jLabelAlicePublic);
		jPanelBob.add(jLabelBob_b);
		jPanelBob.add(jLabel_b_Bob);
		jPanelBob.add(jTextFieldBob_b);
		jPanelBob.add(jButtonBob_b);
		jPanelBob.add(jLabel_B_Bob);
		jPanelBob.add(jLabelBob_B);
		jPanelBob.add(jLabelBob_t_m);
		jPanelBob.add(jLabel_Bob_T);
		jPanelBob.add(jButtonDecrypt);
		jPanelBob.add(jLabel_bob_t);
		jPanelBob.add(jLabel_t_bob);
		jPanelBob.add(jLabel_decrypt_message);
		jPanelBob.add(jButtonBob_B);
		jPanelBob.add(jScrollPane_Bob_M);
		jPanelBob.add(jScrollPanemessage_decrypt);
		jScrollPane_Bob_M.getViewport().add(jLabel_Bob_M);
		jScrollPanemessage_decrypt.getViewport().add(jLabelmessage_decrypt);
		jScrollPane1.getViewport().add(jTextAreaOutPutMessage);
		getContentPane().add(jPanel1);

		setSize(new java.awt.Dimension(800, 670));

		// event handling
		jLabelPrimeP.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jLabelPrimePMouseClicked(e);
			}
		});
		jButtonSelectPS.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonSelectPSMouseClicked(e);
			}
		});
		jButtonAlice_a.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonAlice_aMouseClicked(e);
			}
		});
		jLabelAlice_a.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jLabelAlice_aMouseClicked(e);
			}
		});
		jLabelAlice_k.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jLabelAlice_kMouseClicked(e);
			}
		});
		jButton_t_message_alice.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButton_t_message_aliceMouseClicked(e);
			}
		});
		jButton_send_t_m.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButton_send_t_mMouseClicked(e);
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
		jButtonDecrypt.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonDecryptMouseClicked(e);
			}
		});
		jButtonBob_B.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				jButtonBob_BMouseClicked(e);
			}
		});

// END GENERATED CODE*/


OutPutMessage= ">>\nPlease enter P, a prime number in the range of 3..45000 and S, a number betwen 2 and P-1 then click on the ok button";

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
		ElGamal applet = new ElGamal();
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
			ErrorPopup("P  should be a number");
	else if(sInput.length() ==  0) 
	 		ErrorPopup("S  not entered");
	else if(saerr== 1)
	 		ErrorPopup("S should be a number");
	else
		{
		p=Integer.parseInt(pInput);
			
		if ( p < 26 )
			ErrorPopup("P should be a prime number greater then 25 and and less then 45000");
		else if ( p >45000)
			ErrorPopup("P should be a prime number greater then 25 and and less then 45000");	
		else if(!isPrime(p))
			ErrorPopup("P is not prime, p should be a prime number greater then 25 and and less then 45000");
		else if(sInput.length() >5)
	 		ErrorPopup("S should be a number in the range 2 ... P-1");
		else 
			{
			s=Integer.parseInt(sInput);
			if (s < 2) 
			ErrorPopup("S should be a number in the range 2 ... P-1");
			else if(s > p-1)
	 		ErrorPopup("S should be a number in the range 2 ... P-1");
			else
				{
				block = (int) Math.floor(Math.log((p)*1.0)/Math.log(26.0));
				OutPutMessage= OutPutMessage + "\n>>\nTo change P and S, click on the P or S box";
				OutPutMessage= OutPutMessage + "\n>\nEnter A, any number between 2...P-1. Then click on Calculate Alice's A1";
				jTextAreaOutPutMessage.setText(OutPutMessage);	
				jTextFieldNumberS.setVisible(false);
				jTextFieldPrimeP.setVisible(false);
				jLabelPrimeP.setText(Integer.toString(p));
				jLabelNumberS.setText(Integer.toString(s));
				jLabelNumberS.setVisible(true);
				jLabelPrimeP.setVisible(true);
				jButtonSelectPS.setVisible(false);
				jLabel_a_Alice.setText("Enter");
				jLabel_aa_Alice.setVisible(true);
				jLabel_aa_Alice.setLocation(new java.awt.Point(55, 60));
				jLabel_a_Alice.setVisible(true);
				jTextFieldAlice_a.setVisible(true);
				jLabelAlice_a.setVisible(false);
				jButtonAlice_a.setVisible(true);
				}	
			}
		}
	}
	
	public void ErrorPopup(String message)	
	{
	jOptionPane1.showMessageDialog(this,message,"Error",JOptionPane.ERROR_MESSAGE);
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
	 		ErrorPopup("A  not entered");
	else if(aaerr== 1)
	 		ErrorPopup("A should be a number");
	else if(aInput.length() >5)
	 		ErrorPopup("A should be a number in the range 2 ... P-1");
		else 
			{
			a=Integer.parseInt(aInput);
			if (a < 2) 
			ErrorPopup("A should be a number in the range 2 ... P-1");
			else if(a > p-1)
	 		ErrorPopup("A should be a number in the range 2 ... P-1");
			else
				{
				binary_a = baseTenToTwo(a);
				A = afterModulo(s,binary_a,p);
				jLabelAlice_a.setText(Integer.toString(a));
				jLabelAlice_A.setText(Integer.toString(A));
				OutPutMessage = OutPutMessage + "\n>>\nAlice calculates A1 = (S ^ A ) Mod P = ("+Integer.toString(s)+" ^ "+Integer.toString(a)+") = "+Integer.toString(A); 
				OutPutMessage= OutPutMessage + "\nTo change A, click on A value box";
				OutPutMessage= OutPutMessage + "\nEnter B, any number between 2...P-1. Then click on Calculate Bob B1";
				jTextAreaOutPutMessage.setText(OutPutMessage);	
				jLabel_a_Alice.setVisible(false);
				jLabel_aa_Alice.setLocation(new java.awt.Point(25, 60));
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
				jLabel_bb_Bob.setLocation(new java.awt.Point(60, 60));

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
	 		ErrorPopup("B  not entered");
	else if(baerr== 1)
	 		ErrorPopup("B should be a number");
	else if(bInput.length() >5)
	 		ErrorPopup("B should be a number in the range 2 ... P-1");
		else 
			{
			b=Integer.parseInt(bInput);
			if (b < 2) 
			ErrorPopup("B should be a number in the range 2 ... P-1");
			else if(b > p-1)
	 		ErrorPopup("B should be a number in the range 2 ... P-1");
			else
				{
				binary_b = baseTenToTwo(b);
				B = afterModulo(s,binary_b,p);
				jLabelBob_b.setText(Integer.toString(b));
				jLabelBob_B.setText(Integer.toString(B));
				OutPutMessage = OutPutMessage + "\n>>\nBob calculates B1 = (S ^ B ) Mod P = ("+Integer.toString(s)+" ^ "+Integer.toString(b)+") = "+Integer.toString(B); 
				OutPutMessage= OutPutMessage + "\nTo change B, click on B value box";
				OutPutMessage= OutPutMessage + "\nBob needs to send B1 to Alice. Click on Send Alice B1";
				jTextAreaOutPutMessage.setText(OutPutMessage);
				jLabelBob_b.setVisible(true);
				jTextFieldBob_b.setVisible(false);
				jButtonBob_b.setVisible(false);
				jLabelBob_B.setVisible(true);
				jLabel_B_Bob.setVisible(true);
				jButtonBob_B.setVisible(true);
				jLabel_b_Bob.setVisible(false);
				jLabel_bb_Bob.setLocation(new java.awt.Point(27, 60));
				}
			}	
	}			
	
	
	public void jButtonBob_BMouseClicked(java.awt.event.MouseEvent e) {
	
	
	OutPutMessage= OutPutMessage + "\n>>\nAlice receives Bobs B1";
	OutPutMessage= OutPutMessage + "\nEnter K and Plain Message; K is used to calculate T.";
	jTextAreaOutPutMessage.setText(OutPutMessage);
	jLabel_B_Alice.setText(Integer.toString(B));
	jButtonBob_B.setVisible(false);
	jLabel_Alice_B.setVisible(true);
	jLabel_B_Alice.setVisible(true);
	jLabel_alice_encrypt.setVisible(true);
	jLabel_alice_message.setVisible(true);
	jLabel_a_alice.setVisible(true);
	jTextField_alice_k.setVisible(true);
	jScrollPane_allice_message.setVisible(true);
	jButton_t_message_alice.setVisible(true);
	jLabel_Alice_BB.setVisible(true);
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
	
	public void jButton_t_message_aliceMouseClicked(java.awt.event.MouseEvent e) {
	
	String popupError,kInput;
	int kaerr=0,maerr=0;
	kInput=jTextField_alice_k.getText();
	messageInput=jTextField_alice_message.getText();
	kInput =kInput.trim();	
	messageInput =messageInput.trim();		
		
	messageInput =messageInput.toLowerCase();				// converting to lower case
	while(messageInput.length() % block !=0)			// padding at end 
		messageInput=messageInput+"z";
	cPlain = new char[messageInput.length()];
	iPlain = new int[messageInput.length()];
	cPlain = messageInput.toCharArray();
	
	
	for(int i=0;i<kInput.length();i++)
		
 		if (!Character.isDigit(kInput.charAt(i)))
	 			kaerr =1;
		
	for (int i =0;i<messageInput.length();i++)
		{
		iPlain[i] = encode(cPlain[i]);
		}

	for (int i =0;i<messageInput.length();i++)
		if (iPlain[i] == -1)
	 			maerr =1;
	
	if(kInput.length() ==  0) 
	 		ErrorPopup("K  not entered");
	else if(kaerr== 1)
			ErrorPopup("K  should be a number");
	else
		{
		Alice_k=Integer.parseInt(kInput);	
		if (Alice_k < 2) 
			ErrorPopup("K should be a number in the range 2 ... P-1");
		else if(Alice_k > p-1)
	 		ErrorPopup("K should be a number in the range 2 ... P-1");	
		else if(messageInput.length() ==  0) 
	 		ErrorPopup("message  not entered");
		else if(maerr== 1)
	 		ErrorPopup("Invalid Message, Only Characters allowed");
		else 
			{
				jLabel_message_alice.setText(messageInput);
				jLabelAlice_k.setText(kInput);
				jButton_t_message_alice.setVisible(false);
				jScrollPane_allice_message.setVisible(false);
				jTextField_alice_k.setVisible(false);
				jScrollPane_message_alice.setVisible(true);
				jLabelAlice_k.setVisible(true);
				String binary_alice_k = baseTenToTwo(Alice_k);
				
				int no_of_blocks = messageInput.length() / block;
				plainBlocks	 = new int[no_of_blocks];
				plainBlocks1 = new int[no_of_blocks];

				for (int i =0,j=0; i<messageInput.length() ;i=i+block,j++)
					{
					plainBlocks1[j] =0;
					for (int l=0;l<block;l++)
						{
						plainBlocks1[j]=plainBlocks1[j]+iPlain[i+l]*(int)Math.pow(26,(double)l);
						}
					}
				
				Alice_T = afterModulo(s,binary_alice_k,p);
				for (int i =0; i<no_of_blocks;i++)
					{
					plainBlocks[i] = (afterModulo(B,binary_alice_k,p) * plainBlocks1[i]) % p;
					}

				iePlain = new int[messageInput.length()+no_of_blocks];
		        int k =0,itemp;
												// changing from base 10 to based 26
				for (int i =0; i<no_of_blocks;i++)
					{
					itemp = plainBlocks[i];
					for( int j = block+1; j>0;j--)
						{
						iePlain[k]= itemp % 26;
						itemp = itemp / 26;
						k++;
						}
					}	
				Alice_encrypted ="";
												// decoding the number to get character	
				for (int i =0; i<k;i++)
					{
					Alice_encrypted = Alice_encrypted +decode(iePlain[i]);
					}	


				jLabel_t_alice.setText(Integer.toString(Alice_T));
				OutPutMessage= OutPutMessage + "\n>>\nT and Encrypted Message are calculated as follows";
				OutPutMessage= OutPutMessage + "\nFirst calculate the bloc size\nfloor[ln("+Integer.toString(p-1)+"/ln(26)] ="+Integer.toString(block);
				OutPutMessage= OutPutMessage + "\nNext calculate T = (S ^ K) Mod P = ("+Integer.toString(s)+" ^ "+kInput+") Mod "+Integer.toString(p)+" = "+Integer.toString(Alice_T );
				OutPutMessage= OutPutMessage + "\nConvert the first block '";
				for(int i=0;i<block;i++)
				OutPutMessage = OutPutMessage +cPlain[i];
				OutPutMessage = OutPutMessage +" 'to a number\n";
				for(int i=0;i<block;i++)
				OutPutMessage = OutPutMessage +cPlain[i];
				OutPutMessage = OutPutMessage + " = "+ plainBlocks1[0];				
				OutPutMessage= OutPutMessage + "\nEncrypted Message = ((Bobs B1 ^ K)* PlainText Block) Mod P = (("+Integer.toString(B)+" ^ "+kInput+") * "+plainBlocks1[0]+") Mod "+	Integer.toString(p)+" = "+Integer.toString(plainBlocks[0]);
				OutPutMessage= OutPutMessage + "\nThe above method of encryption is repeated for every block";
				jTextAreaOutPutMessage.setText(OutPutMessage);
				jLabel_Encrypted_message_Alice.setText(Alice_encrypted);
				jLabel_alice_encrypted_Message.setVisible(true);
				jLabel_alice_t.setVisible(true);
				jLabel_t_alice.setVisible(true);
				jScrollPane_Encrypted_message_Alice.setVisible(true);
				jButton_send_t_m.setVisible(true);

			}
		}
	}	
	
	public void jButton_send_t_mMouseClicked(java.awt.event.MouseEvent e) {
	OutPutMessage= OutPutMessage + "\n>>\nBob Receives T and Encrypted Message";
	OutPutMessage= OutPutMessage + "\nNow Bob can decrypt the message. Click on the Decrypt button";
	jTextAreaOutPutMessage.setText(OutPutMessage);
	jLabel_Bob_T.setText(Integer.toString(Alice_T));
	jLabel_Bob_M.setText(Alice_encrypted);
	jButton_send_t_m.setVisible(false);
	jLabelBob_t_m.setVisible(true);
	jLabel_Bob_T.setVisible(true);
	jScrollPane_Bob_M.setVisible(true);
	jButtonDecrypt.setVisible(true);
	}
	
	public void jButtonDecryptMouseClicked(java.awt.event.MouseEvent e) {
	int tempblockvalue=0;
	OutPutMessage= OutPutMessage + "\n>>\nBob calculateS inverse of T power B =((t ^ B) ^-1) Mod P = ((S^ (B*K))^-1) Mod P";
	OutPutMessage= OutPutMessage + "\nBob then multiplies the encrypted message with the inverss of T power B to get the Plain message";
	jTextAreaOutPutMessage.setText(OutPutMessage);
	String bob_t = baseTenToTwo(p-1-b);
	Bob_T = afterModulo(Alice_T,bob_t,p);
//	Bob_plain = (Bob_T * Alice_encrypted) % p;
	jLabel_t_bob.setText(Integer.toString(Bob_T));
	jLabelmessage_decrypt.setText(messageInput);
	OutPutMessage= OutPutMessage + "\nFirst calculate the bloc size\nceling[ln("+Integer.toString(p-1)+"/ln(26)] ="+Integer.toString(block+1);
	OutPutMessage= OutPutMessage + "\nInverse of T power B =((T ^ B) ^-1) Mod P = (("+Integer.toString(Alice_T)+" ^ "+Integer.toString(b)+") ^ -1) Mod "+Integer.toString(p)+" = "+Integer.toString(Bob_T); 
	OutPutMessage = OutPutMessage+"\nNow do encryption on the first block\n\nconvert the first block '"; 
	for (int i=0;i<block+1;i++)
	{
	tempblockvalue = tempblockvalue + (encode(Alice_encrypted.charAt(i)))*(int)Math.pow(26,(double)i);
	OutPutMessage =OutPutMessage +Alice_encrypted.charAt(i);
	}
	OutPutMessage =OutPutMessage +"' to Number = "+ tempblockvalue; 
	OutPutMessage= OutPutMessage + "\nPlain Message = Encrypted Message Block* ((T ^ B) ^-1) Mod P = (B1 ^ k) * Message Block * ((S^ (B*K))^-1)  =\n\t\t\t\t\t\t\t\t\t\t ((S^ (B*K)) * Message Block)*((S^ (B*K))^-1) = (Encrypted Message block) Mod P =";
	for(int i=0;i<block;i++)
	OutPutMessage= OutPutMessage + cPlain[i];
	jTextAreaOutPutMessage.setText(OutPutMessage);
	jButtonDecrypt.setVisible(false);
	jLabel_t_bob.setVisible(true);
	jScrollPanemessage_decrypt.setVisible(true);
	jLabel_bob_t.setVisible(true);
	jLabel_decrypt_message.setVisible(true);
	}
	
	public void jLabelPrimePMouseClicked(java.awt.event.MouseEvent e) {
	
	jTextFieldPrimeP.setVisible(true);
	jTextFieldNumberS.setVisible(true);
	jLabelPrimeP.setVisible(false);
	jLabelNumberS.setVisible(false);
	
	jLabel_a_Alice.setVisible(false);
	jTextFieldAlice_a.setVisible(false);
	jButtonAlice_a.setVisible(false);
	jLabelAlice_a.setVisible(false);
	jLabel_A_Alice.setVisible(false);
	jLabelAlice_A.setVisible(false);
	jLabel_alice_encrypt.setVisible(false);
	jLabel_a_alice.setVisible(false);
	jLabelAlice_k.setVisible(false);
	jTextField_alice_k.setVisible(false);
	jScrollPane_message_alice.setVisible(false);
	jScrollPane_allice_message.setVisible(false);
	jLabel_alice_message.setVisible(false);
	jLabel_alice_t.setVisible(false);
	jLabel_t_alice.setVisible(false);
	jLabel_alice_encrypted_Message.setVisible(false);
	jScrollPane_Encrypted_message_Alice.setVisible(false);
	jButton_t_message_alice.setVisible(false);
	jButton_send_t_m.setVisible(false);
	jLabel_Alice_B.setVisible(false);
	jLabel_B_Alice.setVisible(false);
	jLabelBob_b.setVisible(false);
	jLabel_b_Bob.setVisible(false);
	jTextFieldBob_b.setVisible(false);
	jButtonBob_b.setVisible(false);
	jLabel_B_Bob.setVisible(false);
	jLabelBob_B.setVisible(false);
	jLabelBob_t_m.setVisible(false);
	jScrollPane_Bob_M.setVisible(false);
	jLabel_Bob_T.setVisible(false);
	jButtonDecrypt.setVisible(false);
	jLabel_bob_t.setVisible(false);
	jLabel_t_bob.setVisible(false);
	jLabel_decrypt_message.setVisible(false);
	jScrollPanemessage_decrypt.setVisible(false);
	jButtonBob_B.setVisible(false);
	jButtonSelectPS.setVisible(true);
	jLabel_aa_Alice.setLocation(new java.awt.Point(55, 60));
	jLabel_aa_Alice.setVisible(false);
	jLabel_bb_Bob.setVisible(false);
	jLabel_Alice_BB.setVisible(false);


	}
	
	public void jLabelAlice_aMouseClicked(java.awt.event.MouseEvent e) {
	
	jTextFieldAlice_a.setVisible(true);
	jButtonAlice_a.setVisible(true);
	jLabelAlice_a.setVisible(false);
	jLabel_A_Alice.setVisible(false);
	jLabelAlice_A.setVisible(false);
	jLabel_alice_encrypt.setVisible(false);
	jLabel_a_alice.setVisible(false);
	jLabelAlice_k.setVisible(false);
	jTextField_alice_k.setVisible(false);
	jScrollPane_message_alice.setVisible(false);
	jScrollPane_allice_message.setVisible(false);
	jLabel_alice_message.setVisible(false);
	jLabel_alice_t.setVisible(false);
	jLabel_t_alice.setVisible(false);
	jLabel_alice_encrypted_Message.setVisible(false);
	jScrollPane_Encrypted_message_Alice.setVisible(false);
	jButton_t_message_alice.setVisible(false);
	jButton_send_t_m.setVisible(false);
	jLabel_Alice_B.setVisible(false);
	jLabel_B_Alice.setVisible(false);
	jLabelBob_b.setVisible(false);
	jLabel_b_Bob.setVisible(false);
	jTextFieldBob_b.setVisible(false);
	jButtonBob_b.setVisible(false);
	jLabel_B_Bob.setVisible(false);
	jLabelBob_B.setVisible(false);
	jLabelBob_t_m.setVisible(false);
	jScrollPane_Bob_M.setVisible(false);
	jLabel_Bob_T.setVisible(false);
	jButtonDecrypt.setVisible(false);
	jLabel_bob_t.setVisible(false);
	jLabel_t_bob.setVisible(false);
	jLabel_decrypt_message.setVisible(false);
	jScrollPanemessage_decrypt.setVisible(false);
	jButtonBob_B.setVisible(false);
	jLabel_aa_Alice.setLocation(new java.awt.Point(55, 60));
	jLabel_a_Alice.setVisible(true);
	jLabel_bb_Bob.setVisible(false);
	jLabel_Alice_BB.setVisible(false);
	
	}
	
	public void jLabelBob_bMouseClicked(java.awt.event.MouseEvent e) {
	
	jLabel_b_Bob.setVisible(true);
	jLabel_bb_Bob.setLocation(new java.awt.Point(60, 60));
	jLabel_Alice_BB.setVisible(false);
	jLabel_alice_encrypt.setVisible(false);
	jLabel_a_alice.setVisible(false);
	jLabelAlice_k.setVisible(false);
	jTextField_alice_k.setVisible(false);
	jScrollPane_message_alice.setVisible(false);
	jLabel_alice_message.setVisible(false);
	jLabel_alice_t.setVisible(false);
	jLabel_t_alice.setVisible(false);
	jLabel_alice_encrypted_Message.setVisible(false);
	jScrollPane_Encrypted_message_Alice.setVisible(false);
	jButton_t_message_alice.setVisible(false);
	jButton_send_t_m.setVisible(false);
	jLabel_Alice_B.setVisible(false);
	jLabel_B_Alice.setVisible(false);
	
	jLabelBob_b.setVisible(false);
	
	jLabel_B_Bob.setVisible(false);
	jLabelBob_B.setVisible(false);
	jLabelBob_t_m.setVisible(false);
	jScrollPane_Bob_M.setVisible(false);
	jLabel_Bob_T.setVisible(false);
	jButtonDecrypt.setVisible(false);
	jLabel_bob_t.setVisible(false);
	jLabel_t_bob.setVisible(false);
	jLabel_decrypt_message.setVisible(false);
	jScrollPanemessage_decrypt.setVisible(false);
	jButtonBob_B.setVisible(false);
	jTextFieldBob_b.setVisible(true);
	jButtonBob_b.setVisible(true);
	jScrollPane_allice_message.setVisible(false);
	}
	
	public void jLabelAlice_kMouseClicked(java.awt.event.MouseEvent e) {
	
	jLabelAlice_k.setVisible(false);
	jTextField_alice_k.setVisible(true);
	jScrollPane_message_alice.setVisible(false);
	jScrollPane_allice_message.setVisible(true);
	jLabel_alice_t.setVisible(false);
	jLabel_t_alice.setVisible(false);
	jLabel_alice_encrypted_Message.setVisible(false);
	jScrollPane_Encrypted_message_Alice.setVisible(false);
	jButton_t_message_alice.setVisible(true);
	jButton_send_t_m.setVisible(false);
	
	jLabelBob_t_m.setVisible(false);
	jScrollPane_Bob_M.setVisible(false);
	jLabel_Bob_T.setVisible(false);
	jButtonDecrypt.setVisible(false);
	jLabel_bob_t.setVisible(false);
	jLabel_t_bob.setVisible(false);
	jLabel_decrypt_message.setVisible(false);
	jScrollPanemessage_decrypt.setVisible(false);
	jButtonBob_B.setVisible(false);
	
	}
	
	public int encode(char chr)
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
	
	
		
	
		

					
	
}//end program
