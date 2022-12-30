package TicTacToe;

public class TicTacToeTester {
  public static void main(String[] args) {
    TicTacToeClass game = new TicTacToeClass();

    // test isValid
    System.out.println("Testing isValid...");
    System.out.println(game.isValid(0, 0) == true);
    System.out.println(game.isValid(-1, 0) == false);
    System.out.println(game.isValid(0, 3) == false);
    System.out.println(game.isValid(0, 0) == true);
    game.playMove('X', 0, 0);
    System.out.println(game.isValid(0, 0) == false);

    // test isWinner
    System.out.println("\nTesting isWinner...");
    System.out.println(game.isWinner('X') == false);
    game.playMove('X', 1, 0);
    game.playMove('X', 1, 1);
    game.playMove('X', 1, 2);
    System.out.println(game.isWinner('X') == true);
    game.playMove('O', 0, 0);
    game.playMove('O', 0, 1);
    game.playMove('O', 0, 2);
    System.out.println(game.isWinner('O') == true);
    game.playMove('X', 2, 0);
    System.out.println(game.isWinner('X') == false);

    // test isFull
    System.out.println("\nTesting isFull...");
    game = new TicTacToeClass();
    System.out.println(game.isFull() == false);
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        game.playMove('X', i, j);
      }
    }
    System.out.println(game.isFull() == true);

    // test isCat
    System.out.println("\nTesting isCat...");
    game = new TicTacToeClass();
    System.out.println(game.isCat() == false);
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        game.playMove('X', i, j);
      }
    }
    System.out.println(game.isCat() == true);
    game = new TicTacToeClass();
    game.playMove('X', 0, 0);
    game.playMove('X', 1, 0);
    game.playMove('X', 2, 0);
    System.out.println(game.isCat() == false);
  }
}
