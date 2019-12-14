import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class signup_page {

	private JFrame frame;
	private JTextField SUNAME;
	private JTextField SUUSERNAME;
	private JPasswordField SGPASS;
	private JTextField SUPHONE;
	private JPasswordField SUCONPASS;
	private JTextField SUMAIL;
	private JLabel lblNewLabel_2;
	private JButton btnBack;

	/**
	 * Launch the application.
	 */
	public void  main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signup_page window = new signup_page();
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
	public signup_page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLACK);
		frame.getContentPane().setEnabled(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		SUNAME = new JTextField();
		SUNAME.setBounds(192, 53, 140, 20);
		frame.getContentPane().add(SUNAME);
		SUNAME.setColumns(10);
		
		SUUSERNAME = new JTextField();
		SUUSERNAME.setBounds(192, 73, 140, 20);
		frame.getContentPane().add(SUUSERNAME);
		SUUSERNAME.setColumns(10);
		
		SGPASS = new JPasswordField();
		SGPASS.setBounds(192, 95, 140, 20);
		frame.getContentPane().add(SGPASS);
		
		SUPHONE = new JTextField();
		SUPHONE.setBounds(192, 136, 140, 20);
		frame.getContentPane().add(SUPHONE);
		SUPHONE.setColumns(10);
		
		JLabel lblUserName = new JLabel("USER NAME");
		lblUserName.setBounds(10, 56, 132, 14);
		frame.getContentPane().add(lblUserName);
		
		JLabel lblUserName_1 = new JLabel("NAME");
		lblUserName_1.setBounds(10, 76, 106, 14);
		frame.getContentPane().add(lblUserName_1);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setBounds(10, 98, 106, 14);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblNewLabel = new JLabel("CONFIRM PASSWORD");
		lblNewLabel.setBounds(10, 115, 146, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PHONE NUMBER");
		lblNewLabel_1.setBounds(10, 139, 106, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		SUCONPASS = new JPasswordField();
		SUCONPASS.setBounds(192, 115, 140, 20);
		frame.getContentPane().add(SUCONPASS);
		
		SUMAIL = new JTextField();
		SUMAIL.setBounds(192, 156, 140, 20);
		frame.getContentPane().add(SUMAIL);
		SUMAIL.setColumns(10);
		
		lblNewLabel_2 = new JLabel("MAIL ID");
		lblNewLabel_2.setBounds(10, 159, 167, 14);
		frame.getContentPane().add(lblNewLabel_2);
		connectDS databaseConnect = new connectDS();
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String SUNAME1 = SUNAME.getText();
				String SUUSERNAME1 = SUUSERNAME.getText();
				String SUPHONE1 = SUPHONE.getText();
				String SUMAIL1 = SUMAIL.getText();
				String SGPASS1 = SGPASS.getText();
				String SUCONPASS1 = SUCONPASS.getText();
				if(!SGPASS1.equals(SUCONPASS1))
				{ 
					JOptionPane.showMessageDialog(null, "Password mismatch");
				}else
				JOptionPane.showMessageDialog(null, "NEW USER REGISTERED");
				databaseConnect.passData(SUNAME1,SUUSERNAME1,SUPHONE1,SUMAIL1,SGPASS1,SUCONPASS1);
				
			}
		});
		btnRegister.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		btnRegister.setBackground(new Color(0, 0, 0));
		btnRegister.setForeground(Color.RED);
		btnRegister.setBounds(95, 196, 212, 43);
		frame.getContentPane().add(btnRegister);
		
		btnBack = new JButton("back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DB1 DB1ob = new DB1();
        		DB1ob.main(); 
			}
		});
		btnBack.setBounds(10, 11, 89, 23);
		frame.getContentPane().add(btnBack);
	}

	

	
}
