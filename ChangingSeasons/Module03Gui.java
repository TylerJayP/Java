package m03;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

/**
 * GUI for changing seasons on button click
 * Creating variables to call to, to make code cleaner.
 * 
 * @author tyler
 *
 */
public class Module03Gui extends JFrame {

	private JPanel contentPane;
	
	JLabel fourSeasons = new JLabel("");
	JLabel picturesHere = new JLabel("");
	
	ImageIcon fall = new ImageIcon(Module03Gui.class.getResource("/m03/Images/fall.jpg"));
	ImageIcon winter = new ImageIcon(Module03Gui.class.getResource("/m03/Images/winter.jpg"));
	ImageIcon spring = new ImageIcon(Module03Gui.class.getResource("/m03/Images/spring.jpg"));
	ImageIcon summer = new ImageIcon(Module03Gui.class.getResource("/m03/Images/summer.jpg"));
	
	private ImageIcon[] seasonsArray = {fall, winter, spring, summer};
	
	private int seasonsIndex = 0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Module03Gui frame = new Module03Gui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Module03Gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 5));
		setContentPane(contentPane);

		topRegion();

		middleRegion();

		bottomRegion();
	}

	/**
	 * This is the top region of the JFrame
	 * 
	 * 
	 */
	private void topRegion() {

		fourSeasons = new JLabel("Four Seasons");
		fourSeasons.setFont(new Font("Georgia", Font.PLAIN, 18));
		fourSeasons.setHorizontalAlignment(SwingConstants.CENTER);
		fourSeasons.setBackground(new Color(230, 230, 230));
		//fourSeasons.setForeground(new Color(211, 211, 211)); IMPOSSIBLE TO SEE SO STUCK WITH JUST BLACK.
		fourSeasons.setOpaque(true);
		fourSeasons.setBorder(new EmptyBorder(10, 0, 8, 0));
		contentPane.add(fourSeasons, BorderLayout.NORTH);

	}

	/**
	 * This is the middle region of the JFrame. This will change with a button click to a new picture
	 * 
	 * 
	 */
	private void middleRegion() {
		
		picturesHere = new JLabel("");
		picturesHere.setIcon(seasonsArray[0]);
		picturesHere.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(picturesHere, BorderLayout.CENTER);

	}

	/**
	 * Has button that user will click to change the seasons. 
	 * ActionListener and ActionPerformed
	 * 
	 * 
	 */
	private void bottomRegion() {

		JButton timesMove = new JButton("As Time Moves On...");	
		
		timesMove.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				seasonsIndex++;
				
				if(seasonsIndex == 1) {
					
					picturesHere.setIcon(seasonsArray[1]);
					fourSeasons.setText("Winter");
					

				}
				
				if(seasonsIndex == 2) {
					
					picturesHere.setIcon(seasonsArray[2]);
					fourSeasons.setText("Spring");
					
					
				}
				
				if(seasonsIndex == 3) {
					
					picturesHere.setIcon(seasonsArray[3]);
					fourSeasons.setText("Summer");
					
					
				}
				
				if(seasonsIndex > 3) {
					
					picturesHere.setIcon(seasonsArray[0]);
					fourSeasons.setText("Fall");
					seasonsIndex = 0;
				

				}
			}
		});
		
		timesMove.setFont(new Font("Tahoma", Font.BOLD, 14));
		timesMove.setBackground(new Color(155, 155, 155, 155));
		timesMove.setForeground(new Color(230, 230, 230, 230));
		timesMove.setBorder(new EmptyBorder(4, 0, 4, 0));
		contentPane.add(timesMove, BorderLayout.SOUTH);

	}
	

}
