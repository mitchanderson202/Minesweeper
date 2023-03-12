package minesweeper;

public class Main {
    public static void main(String[] args) {
        boolean playAgain = true;
        while (playAgain) {
            Bomb bomb = new Bomb(10, 10, 10);
            char[][] grid = new char[10][10];
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    grid[i][j] = '?';
                }
            }
            RevealGrid revealGrid = new RevealGrid(grid, bomb.getBombs());
            GameBool game = new GameBool();

            revealGrid.printGrid();

            boolean gameOver = false;
            while (!gameOver) {
                UserInput userInput = new UserInput();
                int x = userInput.getX();
                int y = userInput.getY();
                gameOver = game.revealCell(x, y, revealGrid);
                revealGrid.printGrid();
            }if (gameOver) {
            	revealGrid.revealAllBombs();
            	revealGrid.printGrid();
            }

            if (!GameOver.playAgain()) {
                playAgain = false;
            }
        }
    }
}
