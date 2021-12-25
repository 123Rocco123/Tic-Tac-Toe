import java.util.Scanner;
import java.util.Arrays;

class tictactoe {
  ticBoard boardToPlayOn = new ticBoard();
  AITic computer = new AITic();

  public void gameStart() {
    Scanner input = new Scanner(System.in);

    System.out.println("Choose the row: ");
    String row = input.nextLine();
    System.out.println("\nChoose the column: ");
    String column = input.nextLine();
  }

  public void pieceSelection(String chosenPlayerPiece) {
    String playerPiece = chosenPlayerPiece;

    if (chosenPlayerPiece.equals("X")) {
      computer.piece = "O";
    } else {
      computer.piece = "X";
    }

    gameStart();
  }

  public String boardOutput() {
    Scanner input = new Scanner(System.in);

    for (String[] row : boardToPlayOn.ticTacToeBoard) {
      System.out.println(Arrays.toString(row));
    }

    System.out.println("What do you want to play as (X/O)? ");
    String playerPiece = input.nextLine();

    return playerPiece;
  }

  public void startGame() {
    Scanner input = new Scanner(System.in);

    System.out.println("Write \"Start\" to start the game.");
    String startGame = input.nextLine();

    if (startGame.equals("Start")) {
      boardOutput();
    } else {
      System.out.println("Invalid input.");
      startGame();
    }
  }

  public static void main(String[] args) {
    tictactoe newGame = new tictactoe();
    newGame.startGame();
  }
}
