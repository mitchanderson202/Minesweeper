package minesweeper;

public class SurroundingBombs {
	private char[][] grid;
    private int[][] bombs;
    
    public SurroundingBombs(char[][] grid, int[][] bombs) {
        this.grid = grid;
        this.bombs = bombs;
    }
    
    public int count(int row, int col) {
        int count = 0;
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == 'B') {
                    count++;
                }
            }
        }
        return count;
    }
}
