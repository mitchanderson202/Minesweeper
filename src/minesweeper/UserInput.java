package minesweeper;

import java.util.Scanner;

public class UserInput {
    private int x;
    private int y;
    
    public UserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select Row between 1-10: ");
        x = scanner.nextInt() - 1;
        while (x < 0 || x > 9) {
            System.out.println("Invalid input.");
            x = scanner.nextInt() - 1;
        }
        
        System.out.print("Select Column between 1-10: ");
        y = scanner.nextInt() - 1;
        while (y < 0 || y > 9) {
            System.out.println("Invalid input");
            y = scanner.nextInt() - 1;
        }
        
       
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
}