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
	ImageIcon nmy1 = new ImageIcon("C:/Users/57013002/git/CS10/Credit5/src/Enemy.png");
	ImageIcon Char1 = new ImageIcon("C:\\Users\\57013002\\git\\CS10\\Credit5\\src\\Char.png");
	ImageIcon slash1 = new ImageIcon("C:\\Users\\57013002\\git\\CS10\\Credit5\\src\\SLASH.png");
	
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
		
		JButton hp = new JButton("HP");
		hp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		hp.setBounds(39, 459, 125, 125);
		frame.getContentPane().add(hp);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(33, 64, 420, 300);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JPanel hpbar = new JPanel();
		hpbar.setBounds(280, 211, 100, 10);
		panel_3.add(hpbar);
		hpbar.setLayout(null);
		
		JPanel hp2 = new JPanel();
		hp2.setBounds(10, 0, 10, 10);
		hp2.setBackground(SystemColor.menu);
		hpbar.add(hp2);
		
		JPanel hp3 = new JPanel();
		hp3.setBackground(SystemColor.menu);
		hp3.setBounds(20, 0, 10, 10);
		hpbar.add(hp3);
		
		JPanel hp4 = new JPanel();
		hp4.setBackground(SystemColor.menu);
		hp4.setBounds(30, 0, 10, 10);
		hpbar.add(hp4);
		
		JPanel hp5 = new JPanel();
		hp5.setBackground(SystemColor.menu);
		hp5.setBounds(40, 0, 10, 10);
		hpbar.add(hp5);
		
		JPanel hp6 = new JPanel();
		hp6.setBackground(SystemColor.menu);
		hp6.setBounds(50, 0, 10, 10);
		hpbar.add(hp6);
		
		JPanel hp7 = new JPanel();
		hp7.setBackground(SystemColor.menu);
		hp7.setBounds(60, 0, 10, 10);
		hpbar.add(hp7);
		
		JPanel hp8 = new JPanel();
		hp8.setBackground(SystemColor.menu);
		hp8.setBounds(70, 0, 10, 10);
		hpbar.add(hp8);
		
		JPanel hp9 = new JPanel();
		hp9.setBackground(SystemColor.menu);
		hp9.setBounds(80, 0, 10, 10);
		hpbar.add(hp9);
		
		JPanel hp10 = new JPanel();
		hp10.setBackground(SystemColor.menu);
		hp10.setBounds(90, 0, 10, 10);
		hpbar.add(hp10);
		
		JPanel hp1 = new JPanel();
		hp1.setBackground(SystemColor.menu);
		hp1.setBounds(0, 0, 10, 10);
		hpbar.add(hp1);
		
		JLabel Enemy = new JLabel("");
		Enemy.setBounds(300, 15, 73, 169);
		panel_3.add(Enemy);
		
		JPanel hpbar_1 = new JPanel();
		hpbar_1.setBounds(51, 37, 100, 10);
		panel_3.add(hpbar_1);
		hpbar_1.setLayout(null);
		
		JPanel hp2_1 = new JPanel();
		hp2_1.setBackground(SystemColor.menu);
		hp2_1.setBounds(10, 0, 10, 10);
		hpbar_1.add(hp2_1);
		
		JPanel hp3_1 = new JPanel();
		hp3_1.setBackground(SystemColor.menu);
		hp3_1.setBounds(20, 0, 10, 10);
		hpbar_1.add(hp3_1);
		
		JPanel hp4_1 = new JPanel();
		hp4_1.setBackground(SystemColor.menu);
		hp4_1.setBounds(30, 0, 10, 10);
		hpbar_1.add(hp4_1);
		
		JPanel hp5_1 = new JPanel();
		hp5_1.setBackground(SystemColor.menu);
		hp5_1.setBounds(40, 0, 10, 10);
		hpbar_1.add(hp5_1);
		
		JPanel hp6_1 = new JPanel();
		hp6_1.setBackground(SystemColor.menu);
		hp6_1.setBounds(50, 0, 10, 10);
		hpbar_1.add(hp6_1);
		
		JPanel hp7_1 = new JPanel();
		hp7_1.setBackground(SystemColor.menu);
		hp7_1.setBounds(60, 0, 10, 10);
		hpbar_1.add(hp7_1);
		
		JPanel hp8_1 = new JPanel();
		hp8_1.setBackground(SystemColor.menu);
		hp8_1.setBounds(70, 0, 10, 10);
		hpbar_1.add(hp8_1);
		
		JPanel hp9_1 = new JPanel();
		hp9_1.setBackground(SystemColor.menu);
		hp9_1.setBounds(80, 0, 10, 10);
		hpbar_1.add(hp9_1);
		
		JPanel hp10_1 = new JPanel();
		hp10_1.setBackground(SystemColor.menu);
		hp10_1.setBounds(90, 0, 10, 10);
		hpbar_1.add(hp10_1);
		
		JPanel hp1_1 = new JPanel();
		hp1_1.setBackground(SystemColor.menu);
		hp1_1.setBounds(0, 0, 10, 10);
		hpbar_1.add(hp1_1);
		
		JLabel Char = new JLabel("");
		Char.setBounds(5, 15, 211, 225);
		panel_3.add(Char);
		
		JLabel effect = new JLabel("");
		effect.setBounds(110, 37, 180, 222);
		
		panel_3.add(effect);
		
		JLabel bg = new JLabel("");
		bg.setBounds(5, 5, 410, 290);
		panel_3.add(bg);
		
		JButton Start = new JButton("Start");
		Start.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				bg.setIcon(bg1);
				//enemys' hp
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
				//Your character hp
				hp1_1.setBackground(Color.green);
				hp2_1.setBackground(Color.green);
				hp3_1.setBackground(Color.green);
				hp4_1.setBackground(Color.green);
				hp5_1.setBackground(Color.green);
				hp6_1.setBackground(Color.green);
				hp7_1.setBackground(Color.green);
				hp8_1.setBackground(Color.green);
				hp9_1.setBackground(Color.green);
				hp10_1.setBackground(Color.green);
				Enemy.setIcon(nmy1);
				Char.setIcon(Char1);
				Start.setVisible(false);
			}
		});
		Start.setBounds(364, 375, 89, 23);
		frame.getContentPane().add(Start);
		
		JButton run = new JButton("Run");
		run.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		run.setBounds(309, 459, 125, 125);
		frame.getContentPane().add(run);
		
		JButton qt = new JButton("Quit");
		qt.setBounds(174, 535, 125, 125);
		frame.getContentPane().add(qt);
		
		JButton fght = new JButton("Fight");
		fght.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				hp.setText("Ability1");
				
					hp.addActionListener(new ActionListener() 
					{
						public void actionPerformed(ActionEvent e) 
						{
							effect.setIcon(slash1);	
							effect.setVisible(false);
						}
					});
				run.setText("Ability");
				qt.setText("Return");
				fght.setText("Ablity");
						
			}
		});
		fght.setBounds(174, 389, 125, 125);
		frame.getContentPane().add(fght);
		
		qt.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				hp.setText("HP");
				run.setText("Run");
				qt.setText("Quit");
				fght.setText("Fight");
			}
		});
		
		
		
		
		
		
	}
}
