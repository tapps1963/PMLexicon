package packageSpec;

import java.awt.EventQueue;

import java.net.*;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

public class MySpecGui {

	private JFrame frmMyJavaSpecification;
	private JTextField txtSource;
	private JLabel lblOsUserName;
	private JTextField txtOSUname;
	private JLabel lblUserLanguage;
	private JLabel lblUserCountry;
	private JLabel lblUserHomeDirectory;
	private JTextField txtHomeDirectory;
	private JTextField txtUserCountry;
	private JTextField txtUserLanguage;
	private JLabel lblJavaHome;
	private JTextField txtJavaHome;
	private JLabel lblJavaVersion;
	private JTextField txtJavaVersion;
	private JLabel lblJavaVmVersion;
	private JTextField txtJavaVMVersion;
	private JTextField txtOS;
	private JLabel lblMac;
	private JTextField txtMAC;
	private JLabel lblIpAddress;
	private JTextField txtIPAddress;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySpecGui window = new MySpecGui();
					window.frmMyJavaSpecification.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MySpecGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frmMyJavaSpecification = new JFrame();
		frmMyJavaSpecification.setTitle("My Java Specification");
		frmMyJavaSpecification.setBounds(100, 100, 451, 369);
		frmMyJavaSpecification.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblJavaOrEclipse = new JLabel("Java or Eclipse");

		txtSource = new JTextField();
		txtSource.setColumns(10);
		
		lblOsUserName = new JLabel("OS User Name");
		
		txtOSUname = new JTextField();
		txtOSUname.setColumns(10);
		
		lblUserLanguage = new JLabel("User Language");
		
		lblUserCountry = new JLabel("User Country");
		
		lblUserHomeDirectory = new JLabel("User Home Directory");
		
		txtHomeDirectory = new JTextField();
		txtHomeDirectory.setColumns(10);
		
		txtUserCountry = new JTextField();
		txtUserCountry.setHorizontalAlignment(SwingConstants.CENTER);
		txtUserCountry.setColumns(10);
		
		txtUserLanguage = new JTextField();
		txtUserLanguage.setHorizontalAlignment(SwingConstants.CENTER);
		txtUserLanguage.setColumns(10);
		
		lblJavaHome = new JLabel("Java Home");
		
		txtJavaHome = new JTextField();
		txtJavaHome.setColumns(10);
		
		lblJavaVersion = new JLabel("Java Version");
		
		txtJavaVersion = new JTextField();
		txtJavaVersion.setColumns(10);
		
		lblJavaVmVersion = new JLabel("Java VM Version");
		
		txtJavaVMVersion = new JTextField();
		txtJavaVMVersion.setColumns(10);
		
		JLabel lblOs = new JLabel("OS");
		
		txtOS = new JTextField();
		txtOS.setColumns(10);
		
		lblMac = new JLabel("MAC");
		
		txtMAC = new JTextField();
		txtMAC.setColumns(10);
		
		lblIpAddress = new JLabel("IP Address");
		
		txtIPAddress = new JTextField();
		txtIPAddress.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(frmMyJavaSpecification.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblJavaOrEclipse)
						.addComponent(lblOsUserName)
						.addComponent(lblUserLanguage)
						.addComponent(lblUserCountry)
						.addComponent(lblUserHomeDirectory)
						.addComponent(lblJavaHome)
						.addComponent(lblJavaVersion)
						.addComponent(lblJavaVmVersion)
						.addComponent(lblOs)
						.addComponent(lblMac)
						.addComponent(lblIpAddress))
					.addGap(31)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtSource, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtOSUname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtHomeDirectory, 262, 262, 262)
						.addComponent(txtJavaHome, GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
						.addComponent(txtJavaVersion, GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
						.addComponent(txtIPAddress, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(txtJavaVMVersion, Alignment.LEADING)
							.addComponent(txtOS, Alignment.LEADING)
							.addComponent(txtMAC, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(txtUserCountry, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
							.addComponent(txtUserLanguage, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(28, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblJavaOrEclipse)
						.addComponent(txtSource, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblOsUserName)
						.addComponent(txtOSUname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUserLanguage)
						.addComponent(txtUserLanguage, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUserCountry)
						.addComponent(txtUserCountry, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUserHomeDirectory)
						.addComponent(txtHomeDirectory, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblJavaHome)
						.addComponent(txtJavaHome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblJavaVersion)
						.addComponent(txtJavaVersion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblJavaVmVersion)
						.addComponent(txtJavaVMVersion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblOs)
						.addComponent(txtOS, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMac)
						.addComponent(txtMAC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIpAddress)
						.addComponent(txtIPAddress, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(23, Short.MAX_VALUE))
		);
		frmMyJavaSpecification.getContentPane().setLayout(groupLayout);
		
		String jarCheck = MySpecGui.class.getResource("MySpecGui.class").toString().substring(0, 4);
		
		txtSource.setText(jarCheck);
		txtOSUname.setText(System.getProperty("user.name"));
		txtUserLanguage.setText(System.getProperty("user.language"));
		txtUserCountry.setText(System.getProperty("user.country"));
		txtHomeDirectory.setText(System.getProperty("user.home"));
		txtJavaHome.setText(System.getProperty("java.home"));
		txtJavaVersion.setText(System.getProperty("java.version"));
		txtJavaVMVersion.setText(System.getProperty("java.vm.version"));
		txtOS.setText(System.getProperty("os.name"));
		
		InetAddress ip;
		
		try {
			ip = InetAddress.getLocalHost();

			NetworkInterface network = NetworkInterface.getByInetAddress(ip);

			byte[] mac = network.getHardwareAddress();
			
			//System.out.println(mac);  

			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < mac.length; i++) {
				sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
			}
			txtMAC.setText("B4-B5-2F-8D-C8-D8");
			txtIPAddress.setText(ip.getHostAddress());
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
}
