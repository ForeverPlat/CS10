import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Special2Dig {

	private JFrame frame;
	private JTextField td;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Special2Dig window = new Special2Dig();
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
	public Special2Dig() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 414, 320);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 11, 388, 281);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Enter two digits: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(20, 45, 116, 31);
		panel.add(lblNewLabel_1);
		
		td = new JTextField();
		td.setColumns(10);
		td.setBounds(132, 52, 28, 20);
		panel.add(td);
		
		JLabel dis = new JLabel("");
		dis.setBounds(37, 174, 324, 84);
		panel.add(dis);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String twoDigit = td.getText();//record the 2 digits
				
				int twoD = Integer.parseInt(twoDigit);//get the integer part
				
				int firstD = twoD /10;//grab the first
				int secondD = twoD % 10;//record second digit
				
				int sum = firstD + secondD;//record the sum
				
				int prdc = firstD * secondD;//record product
				
				int check = sum + prdc;
				
				if (check == twoD)
				{
					dis.setText(twoD + "is a special two digit number. ");
				}
				else 
				{
					dis.setText(twoD + "is not a special two digit number. ");
				}
				
				dis.setText(""+ sum);//display the speial number
			
				
				
				
			}
		});
		btnNewButton.setBounds(253, 36, 110, 52);
		panel.add(btnNewButton);
		
		
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				td.setText("");
				dis.setText("");
			}
		});
		btnReset.setBounds(253, 103, 110, 52);
		panel.add(btnReset);
	}
}
