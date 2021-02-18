package othello;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;

/**
 * This class creates a Game object which specifically organizes and makes a
 * board game called Othello, with an 8x8 board and 64 discs in total, in two
 * colors.
 * 
 * @author Haehyun Jung, Tyler Perkins
 */
@SuppressWarnings("serial")
public class Game extends JFrame{
	
	Board board;
	
	/**
	 * Initialize fields to create a Game object.
	 */
	public Game() {
		
		board = new Board();
		runGame();
		
	}
	
	/**
	 * Puts together the board and discs to create a GUI Othello game.
	 */
	public void runGame() {
		
		setTitle("Othello");
		setResizable(false);
		setSize(640, 740);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		JPanel titlePanel = new JPanel();
		titlePanel.setBorder(new EmptyBorder(0, 0, 0, 0));
		titlePanel.setBackground(Color.LIGHT_GRAY);
		getContentPane().add(titlePanel, BorderLayout.NORTH);
		
		JLabel lblTitle = new JLabel("OTHELLO");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setPreferredSize(new Dimension(500, 75));
		lblTitle.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblTitle.setVerticalAlignment(SwingConstants.BOTTOM);
		lblTitle.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblTitle.setBackground(Color.GRAY);
		lblTitle.setAlignmentY(Component.TOP_ALIGNMENT);
		lblTitle.setFont(new Font("Algerian", Font.PLAIN, 50));
		titlePanel.add(lblTitle);
		
		getContentPane().add(board, BorderLayout.CENTER);		
	}
	
	public static void main(String[] args) {
		
		new Game();
		
	}
	
}