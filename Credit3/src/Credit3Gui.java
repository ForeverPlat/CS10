import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Credit3Gui {

	private JFrame frame;
	private JTextField fn;
	private JTextField lnn;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Credit3Gui window = new Credit3Gui();
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
	public Credit3Gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 671, 412);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 604, 347);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel fnl = new JLabel("First Name");
		fnl.setBounds(10, 15, 67, 28);
		panel.add(fnl);
		
		fn = new JTextField();
		fn.setBounds(72, 19, 121, 20);
		panel.add(fn);
		fn.setColumns(10);
		
		JLabel ln = new JLabel("Last Name");
		ln.setBounds(10, 54, 67, 28);
		panel.add(ln);
		
		lnn = new JTextField();
		lnn.setColumns(10);
		lnn.setBounds(72, 58, 121, 20);
		panel.add(lnn);
		
		JLabel Ag = new JLabel("Age");
		Ag.setBounds(10, 93, 67, 28);
		panel.add(Ag);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(72, 97, 121, 20);
		panel.add(textField_2);
		
		JLabel dis = new JLabel("");
		dis.setBounds(10, 215, 378, 106);
		panel.add(dis);
		
		JButton Sb = new JButton("Submit");
		Sb.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String FN = fn.getText();
				String LN = lnn.getText();
		
				dis.setText("First Name: " + FN+ " Last name: " +LN);
			}
		});
		Sb.setBounds(220, 18, 168, 64);
		panel.add(Sb);
		
		JButton Rs = new JButton("Reset");
		Rs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Rs.setBounds(220, 96, 168, 64);
		panel.add(Rs);
		
		
	}
}
