import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;

public class CS10FinalProject 
{

	private JFrame frame;
	
	ImageIcon bg1 = new ImageIcon("C:\\Users\\57013002\\git\\CS10\\Credit5\\src\\bg1.png");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					CS10FinalProject window = new CS10FinalProject();
					window.frame.setVisible(true);
				}
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CS10FinalProject() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton bag = new JButton("Bag");
		bag.setBounds(39, 459, 125, 125);
		frame.getContentPane().add(bag);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(39, 65, 401, 250);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JPanel hp = new JPanel();
		hp.setBounds(70, 67, 100, 10);
		panel_3.add(hp);
		hp.setLayout(null);
		
		JPanel hp2 = new JPanel();
		hp2.setBounds(10, 0, 10, 10);
		hp2.setBackground(SystemColor.menu);
		hp.add(hp2);
		
		JPanel hp3 = new JPanel();
		hp3.setBackground(SystemColor.menu);
		hp3.setBounds(20, 0, 10, 10);
		hp.add(hp3);
		
		JPanel hp4 = new JPanel();
		hp4.setBackground(SystemColor.menu);
		hp4.setBounds(30, 0, 10, 10);
		hp.add(hp4);
		
		JPanel hp5 = new JPanel();
		hp5.setBackground(SystemColor.menu);
		hp5.setBounds(40, 0, 10, 10);
		hp.add(hp5);
		
		JPanel hp6 = new JPanel();
		hp6.setBackground(SystemColor.menu);
		hp6.setBounds(50, 0, 10, 10);
		hp.add(hp6);
		
		JPanel hp7 = new JPanel();
		hp7.setBackground(SystemColor.menu);
		hp7.setBounds(60, 0, 10, 10);
		hp.add(hp7);
		
		JPanel hp8 = new JPanel();
		hp8.setBackground(SystemColor.menu);
		hp8.setBounds(70, 0, 10, 10);
		hp.add(hp8);
		
		JPanel hp9 = new JPanel();
		hp9.setBackground(SystemColor.menu);
		hp9.setBounds(80, 0, 10, 10);
		hp.add(hp9);
		
		JPanel hp10 = new JPanel();
		hp10.setBackground(SystemColor.menu);
		hp10.setBounds(90, 0, 10, 10);
		hp.add(hp10);
		
		JPanel hp1 = new JPanel();
		hp1.setBackground(SystemColor.menu);
		hp1.setBounds(0, 0, 10, 10);
		hp.add(hp1);
		
		JLabel bg = new JLabel("");
		bg.setBounds(5, 5, 391, 240);
		panel_3.add(bg);
		
		JButton fght = new JButton("Fight");
		fght.setBounds(174, 389, 125, 125);
		fght.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				bg.setIcon(bg1);
				hp1.setBackground(Color.green);
				hp2.setBackground(Color.green);
				hp3.setBackground(Color.green);
				hp4.setBackground(Color.green);
				hp5.setBackground(Color.green);
				hp6.setBackground(Color.green);
				hp7.setBackground(Color.green);
				hp8.setBackground(Color.green);
				hp9.setBackground(Color.green);
				hp10.setBackground(Color.green);
			}
		});
		frame.getContentPane().add(fght);
		
		JButton run = new JButton("Run");
		run.setBounds(309, 459, 125, 125);
		frame.getContentPane().add(run);
		
		JButton qt = new JButton("Quit");
		qt.setBounds(174, 535, 125, 125);
		frame.getContentPane().add(qt);
	}
}
