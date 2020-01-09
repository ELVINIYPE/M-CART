import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class firstPage {

	private JFrame frame;
	private JTextField FPSearch;
	private JTextField FB;
	
	/**
	 * Launch the application.
	 */
	public  void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					firstPage window = new firstPage();
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
	public firstPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 878, 799);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		Image image = new ImageIcon(this.getClass().getResource("offer.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(image));
		lblNewLabel.setBounds(236, 34, 188, 188);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image image1 = new ImageIcon(this.getClass().getResource("shirt1.jpg")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(image1));
		lblNewLabel_1.setBounds(40, 73, 215, 188);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image image2 = new ImageIcon(this.getClass().getResource("menjeans2.jpg")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(image2));
		lblNewLabel_2.setBounds(459, 112, 221, 170);
		frame.getContentPane().add(lblNewLabel_2);
		
		FPSearch = new JTextField();
		FPSearch.setBounds(28, 24, 86, 20);
		frame.getContentPane().add(FPSearch);
		FPSearch.setColumns(10);
		
		
		JButton btnNewButton = new JButton("go");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String FPSearch1 = FPSearch.getText();
				JOptionPane.showMessageDialog(null, FPSearch1);
				if((FPSearch1.equals("shoes")) || (FPSearch1.equals("SHOES"))) {
					shoes shoesob = new shoes();
					shoesob.main();
				}else if ((FPSearch1.equals("shirt"))|| (FPSearch1.equals("SHIRT"))) {
					
					shirt shirtob = new shirt();
					shirtob.main();
				}else if ((FPSearch1.equals("jeans"))|| (FPSearch1.equals("JEANS"))) {
					jeans jeansob = new jeans();
					jeansob.main();
				}else
					JOptionPane.showMessageDialog(null, "item not available");
			}
		});
		btnNewButton.setBounds(114, 23, 63, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("PLAY");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main objG = new Main();
				objG.main();
			}
		});
		btnNewButton_1.setBounds(501, 431, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		connectDS databaseConnectFB = new connectDS();
		JLabel lblNewLabel_3 = new JLabel("");
		Image imageG = new ImageIcon(this.getClass().getResource("GAMEI.jpg")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(imageG));
		lblNewLabel_3.setBounds(267, 293, 479, 317);
		frame.getContentPane().add(lblNewLabel_3);
		
		FB = new JTextField();
		FB.setBounds(40, 337, 86, 31);
		frame.getContentPane().add(FB);
		FB.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("feedback");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String feedback = FB.getText();
				databaseConnectFB.FB(feedback);
				FB.setText(" ");
			
			
			
			
			
			}
		});
		btnNewButton_2.setBounds(37, 368, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		//connectDS databaseConnect1 = new connectDS();
		
		
		
		
	}
}
