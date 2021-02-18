package othello;

import javax.swing.ImageIcon;

/**
 * Represents a disc that is placed on an Othello board as a player's move.
 * A disc has two sides, black and white, and each color represents the two
 * players in a game.
 * 
 * @author Haehyun Jung, Tyler Perkins
 */
public class Disc {
	static ImageIcon[] piecesArray = {
			
			new ImageIcon(Board.class.getResource("/othello/images/nodisc.png")),
			new ImageIcon(Board.class.getResource("/othello/images/dark.png")),
			new ImageIcon(Board.class.getResource("/othello/images/light.png")),
			new ImageIcon(Board.class.getResource("/othello/images/legalMoveIcon.png"))
			
	};
	
	private ImageIcon piece;
	private int blackWhiteLegal;
	
	/**
	 * Initializes the object Disc by setting which side will be on top when 
	 * placed on the board.
	 * 
	 * @param blackWhiteLegal	int value that represents the type of disc	
	 */
	public Disc(int blackWhiteLegal) {
		
		piece = piecesArray[blackWhiteLegal];
		this.blackWhiteLegal = blackWhiteLegal;
		
	}
	
	/**
	 * @return isBlack	true if disc is on the Black side
	 */
	public boolean isBlack() {
		
		return (blackWhiteLegal == 1);
		
	}
	
	/**
	 * @return the piece
	 */
	public ImageIcon getPiece() {
		
		return piece;
		
	}
	

	/**
	 * @return the blackWhiteLegal
	 */
	public int getBlackWhiteLegal() {
		
		return blackWhiteLegal;
		
	}
	
	/**
	 * Changes the color/type of the disc.
	 * 
	 * @param blackWhiteLegal	int value that represents the type of disc
	 */
	public void setPiece(int blackWhiteLegal) {
		
		piece = piecesArray[blackWhiteLegal];
		this.blackWhiteLegal = blackWhiteLegal; 
		
	}
}