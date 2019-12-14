import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cart {
	public static int is1 = 0;
	public static int is2 = 0;
	public static int is3 = 0;
	public static int is4 = 0;
	public static int ishirt1 = 0;
	public static int ishirt2 = 0;

	private JFrame frame;
	private JTextField txtCart;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cart window = new cart();
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
	public cart() {
		initialize();
	}

	
		public void cart_items(int i1, int i2, int i3, int i4){
			
			if (i1 == 1) {
				is1 = 1;
				textField.setText("JW SHOES RS:50 ");
			}
			if (i2 == 1) {
				is2 = 1;
				textField.setText("JOHN MIKES RS:75 ");
			}
			if (i3 == 1) {
				is3 = 1;
				textField.setText("WHITE JUMBO RS:35 ");
			}
			if (i4 == 1) {
				is4 = 1;
				textField.setText("NIKE RS:100 ");
			}
			
		}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtCart = new JTextField();
		txtCart.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 23));
		txtCart.setBackground(Color.MAGENTA);
		txtCart.setForeground(Color.BLACK);
		txtCart.setText("CART");
		txtCart.setBounds(81, 28, 74, 41);
		frame.getContentPane().add(txtCart);
		txtCart.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(61, 120, 6, 20);
		frame.getContentPane().add(textPane);
		
		textField = new JTextField();
		textField.setBounds(45, 96, 359, 96);
		
		
	
		frame.getContentPane().add(textField);
		String str = "";
		textField.setColumns(10);
		if (is1 == 1) {
			if(str.isEmpty())
				str = "JW SHOES $:50";
			else
			str = str + "JW SHOES $:50";
			
			
		}
		if (is2 == 1) {
			if(str.isEmpty())
				str = "JOHN MIKES $:75";
			else
			str =str + "JOHN MIKES $:75";
			
			
			
		}
		if (is3 == 1) {
			if(str.isEmpty())
				str = "WHITE JUMBO $:35";
			else
			str = str + "WHITE JUMBO $:35 ";
		
		}
		if (is4 == 1) {
			if(str.isEmpty())
				str = "NIKE $:100";
			else
			str = str + "NIKE $:100 ";
			
		}
		if (ishirt1 == 1) {
			if(str.isEmpty())
				str = "LEVIS $50";
			else
			str = str + "LEVIS $50 ";
			
		}
		if (ishirt2 == 1) {
			if(str.isEmpty())
				str = "PETER ENGLAND $75";
			else
			str = str + "PETER ENGLAND $75 ";
			
		}
		
		
		textField.setText(str);
		
		JButton btnPayment = new JButton("PAYMENT");
		btnPayment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Payment payobj = new Payment();
				payobj.main();
			}
		});
		btnPayment.setBounds(300, 227, 89, 23);
		frame.getContentPane().add(btnPayment);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstPage firstobj = new firstPage();
				firstobj.main();
				
			}
		});
		btnBack.setBounds(22, 227, 79, 23);
		frame.getContentPane().add(btnBack);
		
		
		
	}

	public void cart_Shirtitems(int i1, int i2) {
		// TODO Auto-generated method stub
		if (i1 == 1) {
			ishirt1 = 1;
			textField.setText("LEVIS $50 ");
		}
		if (i2 == 1) {
			ishirt2 = 1;
			textField.setText("PETER ENGLAND $75 ");
		}
	}
}
