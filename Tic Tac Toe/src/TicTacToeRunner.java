
import java.util.Scanner;

public class TicTacToeRunner {
  public static void main(String[] args) {
    TicTacToeClass game = new TicTacToeClass();
    Scanner input = new Scanner(System.in);
    int row, col;
    char player = 'X';

    game.displayBoard();
    while (!game.isFull() && !game.isWinner('X') && !game.isWinner('O')) {
      System.out.println(player + ", choose your location (row, column): ");
      row = input.nextInt();
      col = input.nextInt();
      game.playMove(player, row, col);
      game.displayBoard();
      if (player == 'X') {
        player = 'O';
      } else {
        player = 'X';
      }
    }

    if (game.isWinner('X')) {
      System.out.println("X wins!");
    } else if (game.isWinner('O')) {
      System.out.println("O wins!");
    } else {
      System.out.println("The game is a tie.");
    }
  }
}
