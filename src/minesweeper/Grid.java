package minesweeper;

public class Grid {
    private char[][] grid;

    public Grid() {
        grid = new char[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                grid[i][j] = '|'+'?'+'|';
            }
        }
    }

    public void printGrid() {
        for (int i = grid.length - 1; i >= 0; i--) {
            System.out.printf("%-2d", i + 1);
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("  ");
        for (int i = 1; i <= grid[0].length; i++) {
            System.out.printf("%-2d", i);
        }
    }
    
    public void revealCell(int row, int col) {
        grid[row][col] = ' ';
    }
}