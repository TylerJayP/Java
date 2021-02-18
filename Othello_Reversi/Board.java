package othello;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * Represents the Othello board. You can place discs on it, and flip already
 * placed discs in its place.
 * 
 * @author Haehyun Jung, Tyler Perkins
 */
@SuppressWarnings("serial")
public class Board extends JPanel implements ActionListener {
	
	private JButton[][] buttons = new JButton[8][8];
	private Disc[][] discs = new Disc[8][8];
	JLabel lblWhiteScore, lblBlackScore, lblEOG, whoseTurn;
	JPanel turnPanel = new JPanel();
	private boolean isBlackTurn;
	int turn;

	/**
	 * Constructor. Sets up GUI for the board and the score panel.
	 */
	public Board() {
		
		isBlackTurn = true;
		turn = 1;

		createBoardPanel();
		createScorePanel();	
		playerTurnPanel();

		setDisc(2, 3, 3);
		setDisc(1, 4, 3);
		setDisc(2, 4, 4);
		setDisc(1, 3, 4);
		legalMoves();

		setVisible(true);
		
	}

	/**
	 * Figures out legal moves by checking the 8 surrounding spaces of the target
	 * space, determining if it is of opposing color of the turn, and then
	 * continuing in that direction to see if there is same color of the turn on the
	 * way.
	 * 
	 * @return String with
	 */
	private void legalMoves() {
		
		for (int r = 0; r < 8; r++) {
			
			for (int c = 0; c < 8; c++) {
				
				if (!isOccupied(r, c)) {
					
					if (upperLeftDiag(turn, r, c) || up(turn, r, c) || 
							upperRightDiag(turn, r, c) || right(turn, r, c) || 
							lowerRightDiag(turn, r, c) || down(turn, r, c) || 
							lowerLeftDiag(turn, r, c) || left(turn, r, c)) 
						setDisc(3, r, c);
					
				}
				
			}
			
		}
		
	}

	
	private void changeTurn() {
		
		if(isBlackTurn) {
			
			whoseTurn.setText("WHITE'S TURN");
			turn = 2;
			isBlackTurn = false;
			
		}else {
			
			whoseTurn.setText("BLACK'S TURN");
			turn = 1;
			isBlackTurn = true;
			
		}
		
		legalMoves();
		
	}
	
	
	private void flipDiscs(int r, int c) {
		
		if (lowerRightDiag(turn, r, c)) {
			
			setLowerRightDiag(turn, r, c);
			
		}
		
		if (down(turn, r, c)) {
			
			setDown(turn, r, c);
			
		}
		
		if (lowerLeftDiag(turn, r, c)) {
			
			setLowerLeftDiag(turn, r, c);
			
		}
		
		if (up(turn, r, c)) {
			
			setUp(turn, r, c);
			
		}
		
		if (upperRightDiag(turn, r, c)) {
			
			setUpperRightDiag(turn, r, c);
			
		}
		
		if (left(turn, r, c)) {
			
			setLeft(turn, r, c);
			
		}
		
		if (upperLeftDiag(turn, r, c)) {
			
			setUpperLeftDiag(turn, r, c);
			
		}
		
		if (right(turn, r, c)) {
			
			setRight(turn, r, c);
			
		}
		
	}

	
	private void clearLegalMoves() {
		
		for (int r = 0; r < 8; r++) {
			
			for (int c = 0; c < 8; c++) {
				
				if (discs[r][c].getBlackWhiteLegal() == 3) {
					
					setDisc(0, r, c);
					
				}
			}
			
		}
		
	}
	

	private void setDisc(int color, int row, int col) {
		
		discs[row][col].setPiece(color);
		buttons[row][col].setIcon(discs[row][col].getPiece());
		
		if (color == 1 || color == 2) {
			
			setOccupied(row, col);
			
			}
		
		lblBlackScore.setText("Black: " + countDiscs(1));
		lblWhiteScore.setText("White: " + countDiscs(2));
		
	}

	/**
	 * returns true if the space is occupied(has black or white disc on it).
	 * 
	 * @param row
	 * @param col
	 * @return
	 */
	private boolean isOccupied(int row, int col) {
		
		return (discs[row][col].getBlackWhiteLegal() == 1 || discs[row][col].getBlackWhiteLegal() == 2);
		
	}

	private void setOccupied(int row, int col) {
		
		buttons[row][col].removeActionListener(this);
		
	}

	/**
	 * Counts the number of one type/color of discs on the board.
	 * 
	 * @param blackWhiteLegal The type or color of the disc to count. 0: not placed
	 *                        yet 1: black 2: white 3: legal moves
	 * @return Number of said discs on the board.
	 */
	private int countDiscs(int blackWhiteLegal) {
		
		int output = 0;
		
		for (int i = 0; i < 8; i++) {
			
			for (int j = 0; j < 8; j++) {
				
				if (discs[i][j].getBlackWhiteLegal() == blackWhiteLegal) {
					output++;
				}
				
			}
			
		}
		
		return output;
		
	}

	
	private int getRow(JButton button) {
		
		return Character.getNumericValue(button.getActionCommand().charAt(0));
		
	}

	private int getColumn(JButton button) {
		return Character.getNumericValue(button.getActionCommand().charAt(1));
	}

	/**
	 * Acts on valid button clicks to place a disc.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object src = e.getSource();
		
		if (discs[getRow((JButton) src)][getColumn((JButton) src)].getBlackWhiteLegal() == 3) {
			
			if (isBlackTurn) {
				
				setDisc(1, getRow((JButton) src), getColumn((JButton) src));
				
			}else {
				
				setDisc(2, getRow((JButton) src), getColumn((JButton) src));
				
			}
			
			clearLegalMoves();
			flipDiscs(getRow((JButton) src), getColumn((JButton) src));

			changeTurn();
			
			if(countDiscs(3) == 0) {
				
				changeTurn();
				
				if(countDiscs(3) == 0) {
					
					gameOver();
					
				}
				
			}
			
			if ((countDiscs(1) + countDiscs(2)) == 64) {
				
				gameOver();
				
			}
			
		}
		
	}
	
	
	private void playerTurnPanel() {
		
        turnPanel = new JPanel();
        turnPanel.setBackground(Color.LIGHT_GRAY);
        add(turnPanel, BorderLayout.NORTH);

        whoseTurn = new JLabel("BLACKS TURN");
        whoseTurn.setFont(new Font("MS UI Gothic", Font.PLAIN, 24));
        whoseTurn.setHorizontalTextPosition(SwingConstants.CENTER);
        whoseTurn.setHorizontalAlignment(SwingConstants.CENTER);
        turnPanel.add(whoseTurn);
        
    }
	

	private void gameOver() {
		
		lblEOG = new JLabel();

		if (countDiscs(1) > countDiscs(2)) {
			
			lblEOG = lblBlackScore;
			lblEOG.setText("Game Over. Black Wins! (" + countDiscs(1) + 
					" : " + countDiscs(2) + ")");
			
			lblWhiteScore.setVisible(false);

		} else if (countDiscs(1) < countDiscs(2)) {
			
			lblEOG = lblBlackScore;
			lblEOG.setText("Game Over. White Wins! (" + countDiscs(1) + 
					" : " + countDiscs(2) + ")");
			lblWhiteScore.setVisible(false);
			
		} else {
			
			lblEOG = lblBlackScore;
			lblEOG.setText("Game Over. It's A Tie! ("+ countDiscs(1) + 
					" : " + countDiscs(2) + ")");
			lblWhiteScore.setVisible(false);
			
		}
		
	}

	
	private void createScorePanel() {
		
		JPanel scorePanel = new JPanel();
		scorePanel.setBackground(Color.LIGHT_GRAY);
		add(scorePanel, BorderLayout.SOUTH);

		lblBlackScore = new JLabel("Black: " + countDiscs(1));
		lblBlackScore.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBlackScore.setHorizontalTextPosition(SwingConstants.LEFT);
		lblBlackScore.setHorizontalAlignment(SwingConstants.LEFT);
		scorePanel.add(lblBlackScore);

		lblWhiteScore = new JLabel("White: " + countDiscs(2));
		lblWhiteScore.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblWhiteScore.setHorizontalAlignment(SwingConstants.RIGHT);
		lblWhiteScore.setFont(new Font("Tahoma", Font.PLAIN, 16));
		scorePanel.add(lblWhiteScore);
		
	}

	private void createBoardPanel() {
		
		JPanel gamePanel = new JPanel();
		gamePanel.setSize(640, 640);
		gamePanel.setLayout(new GridLayout(8, 8));

		setLayout(new BorderLayout());
		add(gamePanel, BorderLayout.CENTER);

		for (int i = 0; i < 8; i++) {
			
			for (int j = 0; j < 8; j++) {
				
				buttons[i][j] = new JButton();
				gamePanel.add(buttons[i][j]);
				buttons[i][j].setBackground(Color.cyan);
				buttons[i][j].setOpaque(true);
				buttons[i][j].addActionListener(this);
				buttons[i][j].setActionCommand(i + "" + j);

				discs[i][j] = new Disc(0);
				buttons[i][j].setIcon(discs[i][j].getPiece());
				
			}
			
		}
		
	}

	
	private boolean lowerRightDiag(int turn, int r, int c) {
		
		if ((r + 1 <= 7 && c + 1 <= 7) && isOccupied(r + 1, c + 1)) {
			
			if (discs[r + 1][c + 1].getBlackWhiteLegal() != turn) {
				
				for (int d = 2; d <= 7 - r && d <= 7 - c; d++) {
					
					if (discs[r + d][c + d].getBlackWhiteLegal() == 0 ||
							discs[r + d][c + d].getBlackWhiteLegal() == 3) {
						
						return false;
						
					}else if (discs[r + d][c + d].getBlackWhiteLegal() == turn) {
						
						return true;
						
					}
					
				}
				
			}
			
		}
		
		return false;
		
	}

	
	private boolean down(int turn, int r, int c) {
		
		if (r + 1 <= 7 && isOccupied(r + 1, c)) {
			
			if (discs[r + 1][c].getBlackWhiteLegal() != turn) {
				
				for (int d = 2; d <= 7 - r; d++) {
					
					if (discs[r + d][c].getBlackWhiteLegal() == 0 ||
							discs[r + d][c].getBlackWhiteLegal() == 3) {
						
						return false;
						
					}else if (discs[r + d][c].getBlackWhiteLegal() == turn) {
						
						return true;
						
					}
					
				}
				
			}
			
		}
		
		return false;
		
	}

	private boolean lowerLeftDiag(int turn, int r, int c) {
		
		if ((r + 1 <= 7 && c - 1 >= 0) && isOccupied(r + 1, c - 1)) {
			
			if (discs[r + 1][c - 1].getBlackWhiteLegal() != turn) {
				
				for (int d = 2; d <= 7 - r && d <= c; d++) {
					
					if (discs[r + d][c - d].getBlackWhiteLegal() == 0 || discs[r + d][c - d].getBlackWhiteLegal() == 3) {
						
						return false;
						
					}
					else if (discs[r + d][c - d].getBlackWhiteLegal() == turn) {
						
						return true;
						
					}
					
				}
				
			}
			
		}
		
		return false;
		
	}

	
	private boolean right(int turn, int r, int c) {
		
		if (c + 1 <= 7 && isOccupied(r, c + 1)) {
			
			if (discs[r][c + 1].getBlackWhiteLegal() != turn) {
				
				for (int d = 2; d <= 7 - c; d++) {
					
					if (discs[r][c + d].getBlackWhiteLegal() == 0 || discs[r][c + d].getBlackWhiteLegal() == 3) {
						
						return false;
						
					}
					else if (discs[r][c + d].getBlackWhiteLegal() == turn) {
						
						return true;
						
					}
					
				}
				
			}
			
		}
		
		return false;
		
	}

	
	private boolean left(int turn, int r, int c) {
		
		if (c - 1 >= 0 && isOccupied(r, c - 1)) {
			
			if (discs[r][c - 1].getBlackWhiteLegal() != turn) {
				
				for (int d = 2; d <= c; d++) {
					
					if (discs[r][c - d].getBlackWhiteLegal() == 0 || discs[r][c - d].getBlackWhiteLegal() == 3) {
						
						return false;
						
					}
					else if (discs[r][c - d].getBlackWhiteLegal() == turn) {
						
						return true;
						
					}
					
				}
				
			}
			
		}
		
		return false;
		
	}
	
	
	private boolean upperRightDiag(int turn, int r, int c) {
		
		if ((r - 1 >= 0 && c + 1 <= 7) && isOccupied(r - 1, c + 1)) {
			
			if (discs[r - 1][c + 1].getBlackWhiteLegal() != turn) {
				
				for (int d = 2; d <= r && d <= 7 - c; d++) {
					
					if (discs[r - d][c + d].getBlackWhiteLegal() == 0 || discs[r - d][c + d].getBlackWhiteLegal() == 3) {
						
						return false;
						
					}
					else if (discs[r - d][c + d].getBlackWhiteLegal() == turn) {
						
						return true;
						
					}
					
				}
				
			}
			
		}
		
		return false;
		
	}

	
	private boolean up(int turn, int r, int c) {
		
		if (r - 1 >= 0 && isOccupied(r - 1, c)) {
			
			if (discs[r - 1][c].getBlackWhiteLegal() != turn) {
				
				for (int d = 2; d <= r; d++) {
					
					if (discs[r - d][c].getBlackWhiteLegal() == 0 || discs[r - d][c].getBlackWhiteLegal() == 3) {
						
						return false;
						
					}
					else if (discs[r - d][c].getBlackWhiteLegal() == turn) {
						
						return true;
						
					}
					
				}
				
			}
			
		}
		
		return false;
		
	}

	
	private boolean upperLeftDiag(int turn, int r, int c) {
		
		if ((r - 1 >= 0 && c - 1 >= 0) && isOccupied(r - 1, c - 1)) {
			
			if (discs[r - 1][c - 1].getBlackWhiteLegal() != turn) {
				
				for (int d = 2; d <= r && d <= c; d++) {
					
					if (discs[r - d][c - d].getBlackWhiteLegal() == 0 || discs[r - d][c - d].getBlackWhiteLegal() == 3) {
						
						return false;
						
					}
					else if (discs[r - d][c - d].getBlackWhiteLegal() == turn) {
						
						return true;
						
					}
					
				}
				
			}
			
		}
		
		return false;
		
	}

	
	private void setLowerRightDiag(int turn, int r, int c) {
		
		if (r + 1 <= 7 && c + 1 <= 7) {
			
			for (int d = 1; d <= 7 - r && d <= 7 - c; d++) {
				
				if (discs[r + d][c + d].getBlackWhiteLegal() == turn || discs[r + d][c + d].getBlackWhiteLegal() == 0) {
					
					return;
					
				}if (isBlackTurn) {
					
					setDisc(1, r + d, c + d);
					
				}else {
					
					setDisc(2, r + d, c + d);
					
				}
				
			}
			
		}
		
	}

	
	private void setDown(int turn, int r, int c) {
		
		if (r + 1 <= 7)	{
			
			for (int d = 1; d <= 7 - r; d++) {
				
				if (discs[r + d][c].getBlackWhiteLegal() == turn || discs[r + d][c].getBlackWhiteLegal() == 0) {
					
					return;
					
				}
				
				if (isBlackTurn) {
					
					setDisc(1, r + d, c);
					
				}else {
					
					setDisc(2, r + d, c);
					
				}
				
			}
			
		}
		
	}
	

	private void setLowerLeftDiag(int turn, int r, int c) {
		
		if (r + 1 <= 7 && c - 1 >= 0) {
			
			for (int d = 1; d <= 7 - r && d <= c; d++) {
				
				if (discs[r + d][c - d].getBlackWhiteLegal() == turn || discs[r + d][c - d].getBlackWhiteLegal() == 0) {
					
					return;
					
				}
				if (isBlackTurn) {
					
					setDisc(1, r + d, c - d);
					
				}else {
					
					setDisc(2, r + d, c - d);
					
				}
				
			}
			
		}
		
	}
	

	private void setRight(int turn, int r, int c) {
		
		if (c + 1 <= 7) {
			
			for (int d = 1; d <= 7 - c; d++) {
				
				if (discs[r][c + d].getBlackWhiteLegal() == turn || discs[r][c + d].getBlackWhiteLegal() == 0) {
					
					return;
					
				}
				if (isBlackTurn) {
					
					setDisc(1, r, c + d);
					
				}else {
					
					setDisc(2, r, c + d);
					
				}
				
			}
			
		}
		
	}
	

	private void setLeft(int turn, int r, int c) {
		
		if (c - 1 >= 0) {
			
			for (int d = 1; d <= c; d++) {
				if (discs[r][c - d].getBlackWhiteLegal() == turn || discs[r][c - d].getBlackWhiteLegal() == 0) {
					
					return;
					
				}
				if (isBlackTurn) {
					
					setDisc(1, r, c - d);
					
				}else {
					
					setDisc(2, r, c - d);
					
				}
				
			}
			
		}
		
	}
	

	private void setUpperRightDiag(int turn, int r, int c) {
		
		if (r - 1 >= 0 && c + 1 <= 7) {
			
			for (int d = 1; d <= r && d <= 7 - c; d++) {
				
				if (discs[r - d][c + d].getBlackWhiteLegal() == turn || discs[r - d][c + d].getBlackWhiteLegal() == 0) {
					
					return;
					
				}if (isBlackTurn) {
					
					setDisc(1, r - d, c + d);
					
				}else {
					
					setDisc(2, r - d, c + d);
					
				}
				
			}
			
		}
		
	}
	

	private void setUp(int turn, int r, int c) {
		
		if (r - 1 >= 0) {
			
			for (int d = 1; d <= r; d++) {
				
				if (discs[r - d][c].getBlackWhiteLegal() == turn || discs[r - d][c].getBlackWhiteLegal() == 0) {
					
					return;
					
				}if (isBlackTurn) {
					
					setDisc(1, r - d, c);
					
				}else {
					
					setDisc(2, r - d, c);
					
				}
				
			}
			
		}
		
	}
	

	private void setUpperLeftDiag(int turn, int r, int c) {
		
		if (r - 1 >= 0 && c - 1 >= 0) {
			
			for (int d = 1; d <= r && d <= c; d++) {
				
				if (discs[r - d][c - d].getBlackWhiteLegal() == turn || discs[r - d][c - d].getBlackWhiteLegal() == 0) {
					
					return;
					
				}if (isBlackTurn) {
					
					setDisc(1, r - d, c - d);
					
				}else {
					
					setDisc(2, r - d, c - d);
					
				}
				
			}
			
		}
		
	}
	
}