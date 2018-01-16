import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;  // a utility

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.sql.*;
import javax.swing.*;

import java.awt.Button;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;

public class PMMain extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5834929815965321885L;
	private JPanel contentPane;
	private JTable myJTable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.apple.laf.AquaLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PMMain frame = new PMMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Created this method because I had a struggle to execute the same instruction
	// from
	// the 'Load' Button and the 'Menu' Item and figured out, hahaha that I can
	// create
	// a single method and call it from anywhere...
	public void myConnection() {
		try {
			String query = "select * from om_obj_str";
			PreparedStatement pst = connection.prepareStatement(query);
			ResultSet rs = pst.executeQuery();

			myJTable.setModel(DbUtils.resultSetToTableModel(rs));
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	Connection connection = null;
	
	
	
	//TODO Atta, please pay attention
	// This aint the easy part
	
	/**
	 * Create the frame.
	 */
	@SuppressWarnings("serial")
	public PMMain() {
		setTitle("Tapps PM Dictionary");

		// Set up connection to DataBase
		connection = mySqlConnection.dbConnector("pmbuilder");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 727, 457);

		// Menu Structure
		// have a problem with the WindowBuilder when trying to add a JMenu.
		// Eclipse goes into hanging. I figured out that the Absolute Layout
		// was the problem.
		// If I do use the Absolute Layout, I have to add the JMenu manually.
		// Its ok, at least I get to understand the coding involved

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		JMenuItem mntmNew = new JMenuItem("New");
		mnFile.add(mntmNew);

		JSeparator separator = new JSeparator();
		mnFile.add(separator);

		JMenuItem mntmQuitPmdictionary = new JMenuItem("Quit PMDictionary");
		mntmQuitPmdictionary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnFile.add(mntmQuitPmdictionary);

		JMenu mnData = new JMenu("Data");
		menuBar.add(mnData);

		JMenuItem mntmLoadData = new JMenuItem("Load Data");
		mntmLoadData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myConnection();

			}
		});
		mnData.add(mntmLoadData);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnLoadData = new JButton("Load Data");
		btnLoadData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// I have created a method to check the connection
				myConnection();
			}
		});
		btnLoadData.setBounds(588, 350, 117, 40);
		contentPane.add(btnLoadData);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(307, 25, 398, 313);
		contentPane.add(scrollPane);

		myJTable = new JTable();
		scrollPane.setViewportView(myJTable);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(6, 25, 277, 313);
		contentPane.add(scrollPane_1);
		
		JTree tree = new JTree();
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("JTree") {
				{
					add(new DefaultMutableTreeNode("PM Config Treeview"));
					add(new DefaultMutableTreeNode("BPML Treeview"));
					add(new DefaultMutableTreeNode("SAP PM Transactions"));
					add(new DefaultMutableTreeNode("Question Bank"));
					add(new DefaultMutableTreeNode("Users"));
					add(new DefaultMutableTreeNode("Extract Tables"));
					add(new DefaultMutableTreeNode("Long Text"));
					add(new DefaultMutableTreeNode("Data Migration"));
					add(new DefaultMutableTreeNode("Settings"));
					add(new DefaultMutableTreeNode("To Do List"));
				}
			}
		));
		scrollPane_1.setViewportView(tree);
	}
}
