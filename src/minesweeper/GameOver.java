package minesweeper;

import java.util.Scanner;

public class GameOver {
    private static final Scanner scanner = new Scanner(System.in);

    public static boolean playAgain() {
        System.out.println("Game over!");
        System.out.println("Do you want to play again? (y/n)");
        String input = scanner.nextLine().trim().toLowerCase();
        
        while (!input.equals("y") && !input.equals("n")) {
            System.out.println("Invalid input. Play again? (y/n)");
            input = scanner.nextLine().trim().toLowerCase();
        }
        return input.equals("y");
    }
}
