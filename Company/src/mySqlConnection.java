import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

import javax.swing.*;

public class mySqlConnection {
	Connection conn = null;

	public static Connection dbConnector(String myDBIn) {

		try {
			String myDB = myDBIn;

			// Load properties file
			Properties props = new Properties();
			props.load(new FileInputStream("pmbProperties"));

			// Read the properties
			String myServer = props.getProperty("server");
			String myUser = props.getProperty("user");
			String myPassword = props.getProperty("password");
			String myConnection = myServer + myDB;

			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(myConnection, myUser, myPassword);
			// TODO
			JOptionPane.showMessageDialog(null, "Connection succesful ");
			return conn;
		}

		catch (Exception e) {

			JOptionPane.showMessageDialog(null, e);
			return null;
		}

	}
}
