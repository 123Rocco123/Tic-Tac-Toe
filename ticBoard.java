class ticBoard {
  String[][] ticTacToeBoard = {{"     ", "Cl1", "Cl2", "Cl3"},
                               {"Row 1", "|_|", "|_|", "|_|"},
                               {"Row 2", "|_|", "|_|", "|_|"},
                               {"Row 3", "|_|", "|_|", "|_|"}};

  public void setterFunc(int row, int column, String playerPiece) {
    if ((ticTacToeBoard[row][column]).equals("|_|")) {
      ticTacToeBoard[row][column] = playerPiece;
    }
  }
}
