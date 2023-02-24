package minesweeper;

public class GameBool {	
	
	public boolean revealCell(int x, int y, RevealGrid revealGrid) {
	    boolean gameOver = revealGrid.reveal(x, y);
	    if (gameOver) {
	        System.out.println("Game over!");
	    }
	    return gameOver;
	}


}
