import java.awt.EventQueue;
import java.awt.event.WindowListener;
import java.awt.event.*;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.util.Timer;
import java.awt.event.ItemEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JToggleButton;



public class shoes {
	
	public static int i1 = 0;
	public static int i2 = 0;
	public static int i3 = 0;
	public static int i4 = 0;
	
	private JFrame frame;
	private JTextField txtShoes;
	private JTextField txtJwShoes;
	private JTextField txtJohnMikes;
	private JTextField textField;
	private JTextField txtWhiteJumbo;
	private JTextField textField_1;
	private JTextField txtNike;
	private JCheckBox chckbxNewCheckBox;
	private JTextField textField_2;
	private JCheckBox chckbxNewCheckBox_1;
	private JCheckBox chckbxNewCheckBox_2;
	private JButton btnGoToCart;
	
	
	
	

	/**
	 * Launch the application.
	 */
	public void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					shoes window = new shoes();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @param i 
	 */
	public shoes() {		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	private void initialize() {
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1350, 815);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		txtShoes = new JTextField();
		txtShoes.setBackground(Color.PINK);
		txtShoes.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		txtShoes.setText("SHOES");
		txtShoes.setBounds(10, 11, 96, 33);
		frame.getContentPane().add(txtShoes);
		txtShoes.setColumns(10);
		
		
		
		
		JLabel lblNewLabel = new JLabel("");
		Image image = new ImageIcon(this.getClass().getResource("shoes1.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(image));
		lblNewLabel.setBounds(28, 139, 295, 199);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		Image image2 = new ImageIcon(this.getClass().getResource("shoes2.jpg")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(image2));
		lblNewLabel_1.setBounds(405, 138, 335, 217);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		Image image3 = new ImageIcon(this.getClass().getResource("shoes3.jpg")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(image3));
		lblNewLabel_3.setBounds(28, 349, 263, 199);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		Image image4 = new ImageIcon(this.getClass().getResource("shoes4.jpg")).getImage();
		lblNewLabel_4.setIcon(new ImageIcon(image4));
		lblNewLabel_4.setBounds(487, 355, 253, 217);
		frame.getContentPane().add(lblNewLabel_4);
		
		txtJwShoes = new JTextField();
		txtJwShoes.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtJwShoes.setText("JW SHOES");
		txtJwShoes.setBounds(28, 86, 96, 20);
		frame.getContentPane().add(txtJwShoes);
		txtJwShoes.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("$50");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(198, 91, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		txtJohnMikes = new JTextField();
		txtJohnMikes.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtJohnMikes.setText("JOHN MIKES");
		txtJohnMikes.setBounds(415, 86, 121, 20);
		frame.getContentPane().add(txtJohnMikes);
		txtJohnMikes.setColumns(10);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setText("$75");
		textField.setBounds(568, 86, 39, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		txtWhiteJumbo = new JTextField();
		txtWhiteJumbo.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtWhiteJumbo.setText("WHITE JUMBO ");
		txtWhiteJumbo.setBounds(10, 552, 131, 38);
		frame.getContentPane().add(txtWhiteJumbo);
		txtWhiteJumbo.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_1.setText("$35");
		textField_1.setBounds(158, 563, 39, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		txtNike = new JTextField();
		txtNike.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtNike.setText("NIKE");
		txtNike.setBounds(435, 583, 46, 20);
		frame.getContentPane().add(txtNike);
		txtNike.setColumns(10);
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(checkBox.isSelected()) {
					JOptionPane.showMessageDialog(null, "added to cart");
					i1 = 1;
					
					
				}
			}
		});
		
		checkBox.setBounds(231, 124, 97, 23);
		frame.getContentPane().add(checkBox);
		
		chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected()) {
					JOptionPane.showMessageDialog(null, "added to cart");
					i2 = 1;
				}
				
			}
		});
		
		chckbxNewCheckBox.setBounds(637, 124, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_2.setText("$100");
		textField_2.setBounds(497, 585, 46, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JCheckBox chckbox3 = new JCheckBox("");
		
		chckbox3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbox3.isSelected()) {
					JOptionPane.showMessageDialog(null, "added to cart");
					i3 = 1;
					
				}
				
			}
			
			
		});
		chckbox3.setBounds(231, 562, 28, 23);
		frame.getContentPane().add(chckbox3);
		
		JCheckBox chckbox4 = new JCheckBox("");
		chckbox4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbox4.isSelected()) {
					JOptionPane.showMessageDialog(null, "added to cart");
					i4 = 1;
				}
			}
		});
		chckbox4.setBounds(643, 584, 28, 23);
		frame.getContentPane().add(chckbox4);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("yoyo honey singh new songs downloads GET 50% OFF");
		tglbtnNewToggleButton.setBackground(Color.ORANGE);
		tglbtnNewToggleButton.setFont(new Font("Harlow Solid Italic", Font.BOLD | Font.ITALIC, 23));
		tglbtnNewToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(tglbtnNewToggleButton.isSelected()) {
					JOptionPane.showMessageDialog(null, "JUST ENJOY FOR $10");
					playstore py = new playstore();
					py.main();
				}
			}
		});
		tglbtnNewToggleButton.setBounds(693, 39, 604, 40);
		frame.getContentPane().add(tglbtnNewToggleButton);
		
		btnGoToCart = new JButton("GO TO CART");
		btnGoToCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cart cartob = new cart();
				cartob.cart_items(i1,i2,i3,i4);
				cartob.main();
				
			}
		});
		btnGoToCart.setBounds(851, 362, 158, 23);
		frame.getContentPane().add(btnGoToCart);
		
		JButton btnBack = new JButton("back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				firstPage firstobj = new firstPage();
				firstobj.main();
				cart cartob = new cart();
				cartob.cart_items(i1,i2,i3,i4);
				shoes sh = new shoes();
				//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//frame.getContentPane().setLayout(null);
				//dispose();
				
				
				
			}
		});
		btnBack.setBounds(75, 708, 89, 23);
		frame.getContentPane().add(btnBack);
		
		
		
		
		
		chckbxNewCheckBox_1 = new JCheckBox("");
		chckbxNewCheckBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "selected");
			}
		});
	
		
		
		
		
		
		
	}

	protected void dispose() {
		// TODO Auto-generated method stub
		
	}

	protected void setDefaultCloseOperation(int exitOnClose) {
		// TODO Auto-generated method stub
		
	}
}
