import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTree;
import javax.swing.JScrollPane;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class myTest extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4316946829204843091L;
	private JPanel contentPane;
	private JTextField txtNodeText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myTest frame = new myTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public myTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 475, 300);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		JMenu mnNew = new JMenu("New");
		mnFile.add(mnNew);

		JMenuItem mntmEquipment = new JMenuItem("Equipment");
		mnNew.add(mntmEquipment);

		JMenuItem mntmWorkCenter = new JMenuItem("Work Center");
		mnNew.add(mntmWorkCenter);

		JSeparator separator = new JSeparator();
		mnFile.add(separator);

		JMenu mnDelete = new JMenu("Delete");
		mnFile.add(mnDelete);

		JMenuItem mntmOneItem = new JMenuItem("One Item");
		mnDelete.add(mntmOneItem);

		JMenuItem mntmQuit = new JMenuItem("Quit");
		mnFile.add(mntmQuit);

		JMenu mnStart = new JMenu("Start");
		menuBar.add(mnStart);

		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(11, 11, 288, 231);

		JTree trvTest = new JTree();
		trvTest.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Display selected node text into text-field
				TreeSelectionModel smd = trvTest.getSelectionModel();
				if (smd.getSelectionCount() > 0) {
					DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) trvTest.getSelectionPath()
							.getLastPathComponent();
					txtNodeText.setText(selectedNode.toString());
				}
			}
		});

		scrollPane.setViewportView(trvTest);

		JButton btnAddNode = new JButton("Add Node");
		btnAddNode.setBounds(311, 72, 130, 29);
		btnAddNode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// get selected Node
				// a check to see if a node is selected
				TreeSelectionModel smd = trvTest.getSelectionModel();

				if (smd.getSelectionCount() > 0) {
					DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) trvTest.getSelectionPath()
							.getLastPathComponent();
					DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(txtNodeText.getText());
					selectedNode.add(newNode);

					// Reload Treeview
					DefaultTreeModel model = (DefaultTreeModel) trvTest.getModel();
					model.reload();
				}
			}
		});

		contentPane.setLayout(null);

		contentPane.add(scrollPane);
		contentPane.add(btnAddNode);

		txtNodeText = new JTextField();
		txtNodeText.setBounds(311, 216, 130, 26);
		contentPane.add(txtNodeText);
		txtNodeText.setColumns(10);

		JButton btnEditNode = new JButton("Edit Node");
		btnEditNode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// get selected Node
				// a check to see if a node is selected
				TreeSelectionModel smd = trvTest.getSelectionModel();

				if (smd.getSelectionCount() > 0) {
					DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) trvTest.getSelectionPath()
							.getLastPathComponent();
					selectedNode.setUserObject(txtNodeText.getText());

					// Reload TreeView
					DefaultTreeModel model = (DefaultTreeModel) trvTest.getModel();
					model.reload();
				}
			}
		});
		btnEditNode.setBounds(311, 120, 130, 29);
		contentPane.add(btnEditNode);

		JButton btnDeleteNode = new JButton("Delete Node");
		btnDeleteNode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// get selected Node
				// a check to see if a node is selected
				TreeSelectionModel smd = trvTest.getSelectionModel();

				if (smd.getSelectionCount() > 0) {
					DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) trvTest.getSelectionPath()
							.getLastPathComponent();
					DefaultTreeModel model = (DefaultTreeModel) trvTest.getModel();

					// Don't remove Root
					if (selectedNode != trvTest.getModel().getRoot()) {
						model.removeNodeFromParent(selectedNode);
						model.reload();
					}
				}
			}
		});
		btnDeleteNode.setBounds(311, 168, 130, 29);
		contentPane.add(btnDeleteNode);
	}
}
