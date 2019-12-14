import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPasswordField;

public class DB1 {

	private JFrame frame;
	private JTextField textFieldUN;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		DB1 DB1ob = new DB1();
		DB1ob.main(); 
	}
	public void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DB1 window = new DB1();
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
	public DB1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String username = textFieldUN.getText();
				String pass = passwordField.getText();
				connectDS login = new connectDS();
				//System.out.println(username);
				//System.out.println(pass);
				login.loginpage(username,pass);
				
				
				
			}
		});
		btnLogin.setBounds(97, 167, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		JButton signup = new JButton("SIGN UP");
		signup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				signup_page signup_page_obj = new signup_page();
				signup_page_obj.main();
			}
		});
		signup.setBounds(184, 167, 89, 23);
		frame.getContentPane().add(signup);
		
		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setBounds(97, 90, 67, 14);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setBounds(97, 116, 67, 14);
		frame.getContentPane().add(lblPassword);
		
		textFieldUN = new JTextField();
		textFieldUN.setBounds(214, 87, 86, 20);
		frame.getContentPane().add(textFieldUN);
		textFieldUN.setColumns(10);
		
		JLabel lblMcart = new JLabel("M-CART");
		lblMcart.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 24));
		lblMcart.setLabelFor(frame);
		lblMcart.setBackground(new Color(0, 255, 0));
		lblMcart.setForeground(Color.RED);
		lblMcart.setBounds(121, 29, 127, 47);
		frame.getContentPane().add(lblMcart);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(214, 116, 86, 20);
		frame.getContentPane().add(passwordField);
	}
}
	