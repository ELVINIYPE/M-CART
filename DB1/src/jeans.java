import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class jeans {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jeans window = new jeans();
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
	public jeans() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 735, 618);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnJeans = new JButton("JEANS");
		btnJeans.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 23));
		btnJeans.setBounds(52, 32, 140, 31);
		frame.getContentPane().add(btnJeans);
		
		JLabel lblSorryForThe = new JLabel("SORRY FOR THE INCONVIENCE. NOW NO STOCKS ARE AVIALABLE");
		lblSorryForThe.setBounds(41, 141, 383, 50);
		frame.getContentPane().add(lblSorryForThe);
		
		JLabel lblNewStocksWill = new JLabel("NEW STOCKS WILL BE AVIALABLE ON ");
		lblNewStocksWill.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 27));
		lblNewStocksWill.setBounds(122, 296, 570, 111);
		frame.getContentPane().add(lblNewStocksWill);
		
		JLabel lblDec = new JLabel("DEC 25");
		lblDec.setEnabled(false);
		lblDec.setForeground(Color.GRAY);
		lblDec.setBackground(Color.BLUE);
		lblDec.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 68));
		lblDec.setBounds(266, 388, 268, 88);
		frame.getContentPane().add(lblDec);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstPage firstobj = new firstPage();
				firstobj.main();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnBack.setBounds(44, 495, 132, 23);
		frame.getContentPane().add(btnBack);
	}
}
