import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;

public class Payment {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payment window = new Payment();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Payment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 681, 597);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTree tree = new JTree();
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("PAYMENT") {
				{
					DefaultMutableTreeNode node_1;
					node_1 = new DefaultMutableTreeNode("ONLINE PAYMENT");
						node_1.add(new DefaultMutableTreeNode("SCOCIA"));
						node_1.add(new DefaultMutableTreeNode("CIBC"));
						node_1.add(new DefaultMutableTreeNode("TD"));
						node_1.add(new DefaultMutableTreeNode("BMO"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("CREDIT CARD");
						node_1.add(new DefaultMutableTreeNode("SCOCIA"));
						node_1.add(new DefaultMutableTreeNode("CIBC"));
						node_1.add(new DefaultMutableTreeNode("TD"));
						node_1.add(new DefaultMutableTreeNode("BMO"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("DEBIT CARD");
						node_1.add(new DefaultMutableTreeNode("SCOCIA"));
						node_1.add(new DefaultMutableTreeNode("CIBC"));
						node_1.add(new DefaultMutableTreeNode("TD"));
						node_1.add(new DefaultMutableTreeNode("BMO"));
					add(node_1);
				}
			}
		));
		tree.setBounds(61, 37, 199, 328);
		frame.getContentPane().add(tree);
	}
}
