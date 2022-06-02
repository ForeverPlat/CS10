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
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import javax.swing.JSlider;

public class CS10FinalProject 
{

	private JFrame frame;
	
	ImageIcon bg1 = new ImageIcon("C:\\Users\\57013002\\git\\CS10\\Credit5\\src\\bg1.png");
	ImageIcon nmy1 = new ImageIcon("C:/Users/57013002/git/CS10/Credit5/src/Enemy.png");
	ImageIcon sprite = new ImageIcon("C:\\Users\\57013002\\git\\CS10\\Credit5\\src\\Char.png");
	ImageIcon slash = new ImageIcon("C:\\Users\\57013002\\git\\CS10\\Credit5\\src\\SLASH.png");
	ImageIcon quit = new ImageIcon("C:\\Users\\57013002\\git\\CS10\\Credit5\\src\\quit1.png");
	ImageIcon BlueBullet = new ImageIcon("C:/Users/57013002/git/CS10/Credit5/src/BlueBullet.png");
			
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

		JButton fght = new JButton("Fight");
		fght.setBounds(174, 389, 125, 125);
		frame.getContentPane().add(fght);
		
		JButton hp = new JButton("HP");
		hp.setBounds(39, 459, 125, 125);
		frame.getContentPane().add(hp);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(33, 64, 420, 300);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);

		JProgressBar hpbar = new JProgressBar();
		hpbar.setValue(100);
		hpbar.setStringPainted(true);
		hpbar.setBackground(new Color(255, 0, 0));
		hpbar.setForeground(Color.GREEN);
		hpbar.setBounds(20, 37, 146, 14);
		panel_3.add(hpbar);
		
		JProgressBar hpbar1 = new JProgressBar();
		hpbar1.setValue(100);
		hpbar1.setStringPainted(true);
		hpbar1.setForeground(Color.GREEN);
		hpbar1.setBackground(Color.RED);
		hpbar1.setBounds(252, 201, 146, 14);
		panel_3.add(hpbar1);
		
		JLabel BBeffect = new JLabel("");
		BBeffect.setBounds(128, 10, 180, 222);
		panel_3.add(BBeffect);
		
		JLabel Char = new JLabel("");
		Char.setBounds(10, 28, 211, 225);
		panel_3.add(Char);

		JLabel effect = new JLabel("");
		effect.setBounds(110, 37, 180, 222);
		panel_3.add(effect);

		JLabel Enemy = new JLabel("");
		Enemy.setBounds(275, 10, 73, 169);
		panel_3.add(Enemy);
		
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
		
		JButton ab3 = new JButton("Debuff");
		ab3.setBounds(309, 459, 125, 125);
		frame.getContentPane().add(ab3);	

		JButton qt = new JButton("Quit");
		qt.setBounds(174, 535, 125, 125);
		frame.getContentPane().add(qt);	
		
		JButton rtrn = new JButton("Return");
		rtrn.setBounds(174, 535, 125, 125);
		frame.getContentPane().add(rtrn);
		
		
		hp.setVisible(false);
		run.setVisible(false);
		qt.setVisible(false);
		fght.setVisible(false);
		ab1.setVisible(false);
		ab2.setVisible(false);
		ab3.setVisible(false);
		yes.setVisible(false);
		no.setVisible(false);
		rtrn.setVisible(false);
		hpbar.setVisible(false);
		hpbar1.setVisible(false);
		
		Start.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				bg.setIcon(bg1);
				Enemy.setIcon(nmy1);
				Char.setIcon(sprite);
				hp.setVisible(true);
				run.setVisible(true);
				qt.setVisible(true);
				fght.setVisible(true);
				hpbar.setVisible(true);
				hpbar1.setVisible(true);
				Start.setVisible(false);
			}
		});	
		
		run.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
		
		rtrn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				// makes main buttons visible
				fght.setVisible(true);
				qt.setVisible(true);
				hp.setVisible(true);
				run.setVisible(true);
				// makes fight buttons invisible
				ab1.setVisible(false);
				ab2.setVisible(false);
				ab3.setVisible(false);
				rtrn.setVisible(false);
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
				qt.setVisible(false);
				rtrn.setVisible(true);
				ab1.setVisible(true);
				ab2.setVisible(true);
				ab3.setVisible(true);
			}
		});
		
		ab1.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent e) 
			{	
<<<<<<< HEAD
				//sets damage range from 10 - 20%
				int dmg1 = 11 + (int)(Math.random()*10);
				int hp2 = hpbar1.getValue();
				hp2 = hp2 - dmg1;
				hpbar1.setValue(hp2);
				effect.setIcon(slash);
=======
				effect.setIcon(slash1);
				Timer timer = new Timer();
>>>>>>> branch 'master' of https://github.com/ForeverPlat/CS10
				
<<<<<<< HEAD
				Timer timerWait = new Timer();					
				TimerTask taskWait = new TimerTask() 
				{
					public void run() 
					{
						int dmg2 = 11 + (int)(Math.random()*10);
						int hp1 = hpbar.getValue();
						hp1 = hp1 - dmg2;
						hpbar.setValue(hp1);
						BBeffect.setIcon(BlueBullet);
						
						Timer timer = new Timer();					
						TimerTask task = new TimerTask() 
						{
							public void run() 
							{
								BBeffect.setIcon(null);

								hp.setVisible(true);
								yes.setVisible(true);
								no.setVisible(true);
								fght.setVisible(true);
								run.setVisible(true);	
								qt.setVisible(true);
								rtrn.setVisible(true);
								ab1.setVisible(true);
								ab2.setVisible(true);
								ab3.setVisible(true);
							}
						};
						//timer for enemy attack disappear		
						timer.schedule(task, 900);	
					}
				};
				
				hp.setVisible(false);
				yes.setVisible(false);
				no.setVisible(false);
				fght.setVisible(false);
				run.setVisible(false);	
				qt.setVisible(false);
				rtrn.setVisible(false);
				ab1.setVisible(false);
				ab2.setVisible(false);
				ab3.setVisible(false);
				
				//Timer for enemy attack		
				timerWait.schedule(taskWait, 1600);			

				Timer timer = new Timer();					
				TimerTask task = new TimerTask() 
				{
					public void run() 
					{
						effect.setIcon(null);
						
					}
				};
				//timer for sprite attack disappear			
				timer.schedule(task, 900);						
				
				
				
=======
				TimerTask task = new TimerTask() 
				{
					public void run() 
					{
						effect.setIcon(null);
					}
				};
						
				timer.schedule(task, 300);	
				
				//sets damage range from 10 - 20%
				int dmg = 11 + (int)(Math.random()*20);
				
				int hp2 = hp2 - dmg;
>>>>>>> branch 'master' of https://github.com/ForeverPlat/CS10
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
				Enemy.setIcon(null);	
				Char.setIcon(null);
				effect.setIcon(null);
				hpbar.setVisible(false);
				hpbar1.setVisible(false);
				bg.setIcon(quit);
				
				yes.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent e) 
					{
						//puts program to sleep
						try 
						{
							Thread.sleep(1500);
						} catch (InterruptedException e1) 
						{
							e1.printStackTrace();
						}	
						System.exit(0); // ends program	
					}
					});
				
				no.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent e) 
					{
						bg.setIcon(bg1);
						Enemy.setIcon(nmy1);
						Char.setIcon(sprite);
						hp.setVisible(true);
						run.setVisible(true);
						qt.setVisible(true);
						fght.setVisible(true);
						hpbar.setVisible(true);
						hpbar1.setVisible(true);
						Start.setVisible(false);	
					}
					
					
					});
				
				
				
				
				
				}
			});
	}
}