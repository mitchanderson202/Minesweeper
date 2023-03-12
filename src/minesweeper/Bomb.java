package minesweeper;

import java.util.Random;

public class Bomb {
    private int[][] bombs;
    private int count;

    public Bomb(int numRows, int numCols, int numBombs) {
        bombs = new int[numBombs][2];
        count = 0;
        Random random = new Random();
        while (count < numBombs) {
            int row = random.nextInt(numRows);
            int col = random.nextInt(numCols);
            boolean alreadyPlaced = false;
            for (int i = 0; i < count; i++) {
                if (bombs[i][0] == row && bombs[i][1] == col) {
                    alreadyPlaced = true;
                    break;
                }
            }
            if (!alreadyPlaced) {
                bombs[count][0] = row;
                bombs[count][1] = col;
                count++;
            }
        }
    }

    public int[][] getBombs() {
        return bombs;
    }
}