package minesweeper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RevealGridTest {

	@Test
	public void testRevealBomb() {
	    char[][] grid = {{'?','?','?','?','?'},
	                     {'?','?','?','?','?'},
	                     {'?','?','?','?','?'},
	                     {'?','?','?','?','?'}};
	    int[][] bombs = {{0,0}, {2,2}, {3,4}};
	    RevealGrid revealGrid = new RevealGrid(grid, bombs);
	    assertTrue(revealGrid.reveal(0, 0));
	    revealGrid.printGrid();
	}

	@Test
	public void testRevealNumber() {
	    char[][] grid = {{'?','?','?','?','?'},
	                     {'?','*','*','*','?'},
	                     {'?','*','?','?','?'},
	                     {'?','*','?','?','?'}};
	    int[][] bombs = {{1,1}, {1,2}, {1,3}, {2,1}, {3,1}};
	    RevealGrid revealGrid = new RevealGrid(grid, bombs);
	    assertFalse(revealGrid.reveal(1, 1));
	    revealGrid.printGrid();
	}

	@Test
	public void testRevealEmpty() {
	    char[][] grid = {{'?','?','?','?','?'},
	                     {'?','*','*','*','?'},
	                     {'?','*','?','?','?'},
	                     {'?','*','?','?','?'}};
	    int[][] bombs = {{1,1}, {1,2}, {1,3}, {2,1}, {3,1}};
	    RevealGrid revealGrid = new RevealGrid(grid, bombs);
	    assertFalse(revealGrid.reveal(2, 2));
	    revealGrid.printGrid();
	}


}