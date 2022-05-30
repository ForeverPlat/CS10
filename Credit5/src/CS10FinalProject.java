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
		
		JButton Start = new JButton("Start");
		Start.setBounds(364, 375, 89, 23);
		frame.getContentPane().add(Start);
		
		JButton hp = new JButton("HP");
		hp.setBounds(39, 459, 125, 125);
		frame.getContentPane().add(hp);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(33, 64, 420, 300);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel Enemy = new JLabel("");
		Enemy.setBounds(300, 15, 73, 169);
		panel_3.add(Enemy);
		
		JLabel Char = new JLabel("");
		Char.setBounds(5, 15, 211, 225);
		panel_3.add(Char);
		
		JLabel effect = new JLabel("");
		effect.setBounds(110, 37, 180, 222);
		
		panel_3.add(effect);
		
		JLabel bg = new JLabel("");
		bg.setBounds(5, 5, 410, 290);
		panel_3.add(bg);
		
		JButton run = new JButton("Run");
		run.setBounds(309, 459, 125, 125);
		frame.getContentPane().add(run);
		
		JButton yes = new JButton("Yes");
		yes.setBounds(39, 459, 125, 125);
		frame.getContentPane().add(yes);
		
		JButton no = new JButton("No");
		no.setBounds(309, 459, 125, 125);
		frame.getContentPane().add(no);
		
		JButton ab1 = new JButton("Slash");
		ab1.setBounds(39, 459, 125, 125);
		frame.getContentPane().add(ab1);
		
		JButton ab2 = new JButton("Shield");
		ab2.setBounds(174, 389, 125, 125);
		frame.getContentPane().add(ab2);
		
		JButton ab3 = new JButton("DeBuff");
		ab3.setBounds(309, 459, 125, 125);
		frame.getContentPane().add(ab3);	

		JButton qt = new JButton("Quit");
		qt.setBounds(174, 535, 125, 125);
		frame.getContentPane().add(qt);	
		
		JButton fght = new JButton("Fight");
		fght.setBounds(174, 389, 125, 125);
		frame.getContentPane().add(fght);
		
		hp.setVisible(false);
		run.setVisible(false);
		qt.setVisible(false);
		fght.setVisible(false);
		ab1.setVisible(false);
		ab2.setVisible(false);
		ab3.setVisible(false);
		yes.setVisible(false);
		no.setVisible(false);
		
		
		Start.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				bg.setIcon(bg1);
				Enemy.setIcon(nmy1);
				Char.setIcon(Char1);
				hp.setVisible(true);
				run.setVisible(true);
				qt.setVisible(true);
				fght.setVisible(true);
				Start.setVisible(false);
			}
		});	
		
		run.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
	
		fght.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				hp.setVisible(false);
				yes.setVisible(false);
				no.setVisible(false);
				fght.setVisible(false);
				run.setVisible(false);	
				ab1.setVisible(true);
				ab2.setVisible(true);
				ab3.setVisible(true);
			}
		});
		
		ab1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{	
				effect.setIcon(slash1);	
			}
		});
		
		hp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		qt.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				qt.setVisible(false);
				hp.setVisible(false);
				yes.setVisible(true);
				no.setVisible(true);
				fght.setVisible(false);
				run.setVisible(false);	
				ab1.setVisible(false);
				ab2.setVisible(false);
				ab3.setVisible(false);
			}
		});
	}
}
