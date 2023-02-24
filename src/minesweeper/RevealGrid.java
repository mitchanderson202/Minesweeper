package minesweeper;

public class RevealGrid {
    private char[][] grid;
    private int[][] bombs;
    private int numRows;
    private int numCols;
    
    public RevealGrid(char[][] grid, int[][] bombs) {
        this.grid = grid;
        this.bombs = bombs;
        numRows = grid.length;
        numCols = grid[0].length;
    }
    
    public boolean reveal(int x, int y) {
        if (grid[x][y] != '?') {
            return false;
        }
        for (int[] bomb : bombs) {
            if (bomb[0] == x && bomb[1] == y) {
                grid[x][y] = '*'; 
                return true; 
            }
        }
        revealHelper(x, y);
        return false;
    }
    
    private void revealHelper(int x, int y) {
        if (x < 0 || x >= numRows || y < 0 || y >= numCols || grid[x][y] != '?') {
            return;
        }
        int numBombs = countBombs(x, y);
        if (numBombs > 0) {
            grid[x][y] = (char)('0' + numBombs);
        } else {
            grid[x][y] = ' ';
            for (int dx = -1; dx <= 1; dx++) {
                for (int dy = -1; dy <= 1; dy++) {
                    revealHelper(x + dx, y + dy);
                }
            }
        }
    }
    
    private int countBombs(int x, int y) {
        int count = 0;
        for (int[] bomb : bombs) {
            if (Math.abs(bomb[0] - x) <= 1 && Math.abs(bomb[1] - y) <= 1) {
                count++;
            }
        }
        return count;
    }
    
    public void printGrid() {
        for (int i = numRows - 1; i >= 0; i--) {
            System.out.printf("%-2d", i + 1);
            for (int j = 0; j < numCols; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("  ");
        for (int i = 1; i <= numCols; i++) {
            System.out.printf("%-2d", i);
        }
        System.out.println();
    }
    
    public void revealAllBombs() {
        for (int[] bomb : bombs) {
            int row = bomb[0];
            int col = bomb[1];
            grid[row][col] = '*';
        }
    }
}
