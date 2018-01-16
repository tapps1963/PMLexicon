import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.sql.*;
import javax.swing.*;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Login {

	private JFrame frmPmdictionaryLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmPmdictionaryLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Set connection to null
	Connection connection = null;
	
	// Variable for the login screen
	private JTextField txtUserName;
	private JPasswordField passwordField;
	
	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
		connection = mySqlConnection.dbConnector("pmdictionary");
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPmdictionaryLogin = new JFrame();
		frmPmdictionaryLogin.setTitle("Login");
		frmPmdictionaryLogin.setResizable(false);
		frmPmdictionaryLogin.setBounds(100, 100, 248, 137);
		frmPmdictionaryLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPmdictionaryLogin.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setBounds(6, 19, 77, 16);
		frmPmdictionaryLogin.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(6, 47, 61, 16);
		frmPmdictionaryLogin.getContentPane().add(lblNewLabel_1);
		
		txtUserName = new JTextField();
		txtUserName.setBounds(79, 14, 130, 26);
		frmPmdictionaryLogin.getContentPane().add(txtUserName);
		txtUserName.setColumns(10);
		

		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				try {
					// Prepare the query sql statement
					String sql = "select * from pm_userlist where uname = ? and pwd = ?";
					
					// Prepared Statement
					PreparedStatement prStmnt = connection.prepareStatement(sql);
					prStmnt.setString(1,txtUserName.getText());
					prStmnt.setString(2, passwordField.getText());
					
					// Execute the query
					ResultSet rs = prStmnt.executeQuery();
					
					// One way of counting the number of records in the Record Set
					int myCount  = 0; // Set counter at zero
							
					while (rs.next()) {
						myCount++;
					}
					
					// Output the count for debug purposes
					//System.out.println(myCount);
					
					// Check if count == 1 for successful login
					// count < 1 is unsuccessful
					if (myCount == 1) {
						JOptionPane.showMessageDialog(null, "User Name and Password correct");
						frmPmdictionaryLogin.dispose();
						PMMain pmMain = new PMMain();
						pmMain.setVisible(true);
					} else if (myCount < 1) {
						JOptionPane.showMessageDialog(null, "User Name and Password incorrect");
					}
					
					// Close the connection
					rs.close();
					prStmnt.close();
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});

		btnLogin.setBounds(79, 80, 130, 29);
		frmPmdictionaryLogin.getContentPane().add(btnLogin);
		
		// Everything to do with the password field
		// Had to move it after the Button Method
		//
		passwordField = new JPasswordField();
		passwordField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// Check whether the Enter key has been pressed
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnLogin.doClick();
				}
			}
		});
		passwordField.setBounds(79, 42, 130, 26);
		frmPmdictionaryLogin.getContentPane().add(passwordField);
		
	}
}
