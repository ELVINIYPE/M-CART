import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class shirt {
	public static int i1 = 0;
	public static int i2 = 0;

	private JFrame frame;
	private JTextField txtLevis;
	private JTextField txtPeterEngland;

	/**
	 * Launch the application.
	 */
	public void main(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					shirt window = new shirt();
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
	public shirt() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1230, 729);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnShirt = new JButton("SHIRT");
		btnShirt.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		btnShirt.setBounds(32, 30, 191, 48);
		frame.getContentPane().add(btnShirt);
		
		JButton btnCart = new JButton("CART");
		btnCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cart cartob = new cart();
				cartob.cart_Shirtitems(i1,i2);
				cartob.main();
			}
		});
		btnCart.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		btnCart.setBounds(1064, 603, 103, 43);
		frame.getContentPane().add(btnCart);
		
		JLabel lblNewLabel = new JLabel("");
		Image image = new ImageIcon(this.getClass().getResource("shirt2.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(image));
		lblNewLabel.setBounds(51, 155, 302, 238);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		Image image1 = new ImageIcon(this.getClass().getResource("shirt3.jpg")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(image1));
		lblNewLabel_1.setBounds(622, 352, 194, 238);
		frame.getContentPane().add(lblNewLabel_1);
		
		JCheckBox chckbox1 = new JCheckBox("");
		chckbox1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbox1.isSelected()) {
					JOptionPane.showMessageDialog(null, "added to cart");
					i2 = 1;
				}
			}
			
		});
		chckbox1.setBounds(61, 400, 26, 23);
		frame.getContentPane().add(chckbox1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected()) {
					JOptionPane.showMessageDialog(null, "added to cart");
					i1 = 1;
				}
			}
		});
		chckbxNewCheckBox.setBounds(619, 594, 26, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		txtLevis = new JTextField();
		txtLevis.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		txtLevis.setText("Levis  $50");
		txtLevis.setBounds(651, 597, 115, 20);
		frame.getContentPane().add(txtLevis);
		txtLevis.setColumns(10);
		
		txtPeterEngland = new JTextField();
		txtPeterEngland.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		txtPeterEngland.setText("PETER ENGLAND");
		txtPeterEngland.setBounds(85, 404, 166, 20);
		frame.getContentPane().add(txtPeterEngland);
		txtPeterEngland.setColumns(10);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstPage firstobj = new firstPage();
				firstobj.main();
				cart cartob = new cart();
				cartob.cart_Shirtitems(i1,i2);
			}
			
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnBack.setBounds(34, 618, 89, 23);
		frame.getContentPane().add(btnBack);
		
		
	}
}
