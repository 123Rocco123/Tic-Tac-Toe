import java.util.Scanner;
import java.util.Arrays;

class tictactoe {
  ticBoard boardToPlayOn = new ticBoard();
  AITic computer = new AITic();

  String playerPiece;

  public void gameStart() {
    Scanner input = new Scanner(System.in);

    System.out.println("Choose the row: ");
    int row = input.nextInt();
    System.out.println("\nChoose the column: ");
    int column = input.nextInt();

    boardToPlayOn.setterFunc(row, column, this.playerPiece);
  }

  public void pieceSelection() {
    if ((this.playerPiece).equals("X")) {
      computer.piece = "O";
    } else {
      computer.piece = "X";
    }

    gameStart();
  }

  public void boardOutput() {
    Scanner input = new Scanner(System.in);

    for (String[] row : boardToPlayOn.ticTacToeBoard) {
      System.out.println(Arrays.toString(row));
    }

    System.out.println("What do you want to play as (X/O)? ");
    this.playerPiece = input.nextLine();
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
