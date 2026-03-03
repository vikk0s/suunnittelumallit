package assignments.assignment8.template_method;

import java.util.Random;
import java.util.Scanner;

public class BlackJack extends Game {
    private static final int MAX_SCORE = 21;

    private int player1Score;
    private int player2Score;

    private int player1StandCount;
    private int player2StandCount;

    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    public void initializeGame(int numberOfPlayers) {
        if (numberOfPlayers != 2) {
            throw new IllegalArgumentException("BlackJack requires exactly 2 players.");
        }

        this.player1Score = 0;
        this.player2Score = 0;
        this.player1StandCount = 0;
        this.player2StandCount = 0;

        for (int i = 0; i < 2; i++) {
            int card1 = random.nextInt(11) + 1;
            int card2 = random.nextInt(11) + 1;

            player1Score += card1;
            player2Score += card2;

            System.out.println("Player 1 draws " + card1);
            System.out.println("Player 2 draws " + card2);
        }

        System.out.println("\nStarting scores:");
        System.out.println("Player 1: " + player1Score);
        System.out.println("Player 2: " + player2Score);
    }

    public boolean endOfGame() {
        if (player1Score > MAX_SCORE || player2Score > MAX_SCORE) {
            return true;
        }

        return player1StandCount >= 2 && player2StandCount >= 2;
    }

    public void playSingleTurn(int player) {
        System.out.println("\nPlayer " + (player + 1) + "'s turn.");
        System.out.println("choose: 1 hit. 2 stand.");

        boolean validInput = false;

        int choice = 0;

        while (validInput == false) {
            try {
                choice = scanner.nextInt();
                if (choice == 1 || choice == 2) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter 1 for hit or 2 for stand.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }

        if (choice == 1) {
            int cardValue = random.nextInt(11) + 1;
            if (player == 0) {
                player1Score += cardValue;
                player1StandCount = 0;
                System.out.println("Player 1 draws " + cardValue + ". Total score: " + player1Score);
            } else {
                player2Score += cardValue;
                player2StandCount = 0;
                System.out.println("Player 2 draws " + cardValue + ". Total score: " + player2Score);
            }
        } else {
            if (player == 0) {
                player1StandCount += 1;
                System.out.println("Player 1 stands with score: " + player1Score);
            } else {
                player2StandCount += 1;
                System.out.println("Player 2 stands with score: " + player2Score);
            }
        }
    }

    public void displayWinner() {
        System.out.println("\nGame over.");
        System.out.println("Player 1 score: " + player1Score);
        System.out.println("Player 2 score: " + player2Score);

        if (player1Score > MAX_SCORE) {
            System.out.println("Player 1 busts. Player 2 wins!");
        } else if (player2Score > MAX_SCORE) {
            System.out.println("Player 2 busts. Player 1 wins!");
        } else if (player1Score > player2Score) {
            System.out.println("Player 1 wins!");
        } else if (player2Score > player1Score) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}
