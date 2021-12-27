// Computer AI
class AITic {
  String piece;

  // To block the wins via the middle
  boolean middleTop = true;
  boolean middleLeft  = true;
  boolean middleRight = true;
  boolean middleBottom = true;

  // To block the corners
  boolean topRightCorner = true;
  boolean topLeftCorner = true;
  boolean bottomRightCorner = true;
  boolean bottomLeftCorner = true;

  public String checker(String[][] board, String playerPiece) {
    if (board[2][2].equals("|_|")) {
      board[2][2] = "|" + piece + "|";
      return "";
    } else if (board[1][1].equals("|" + playerPiece + "|") && board[3][1].equals("|" + playerPiece + "|") && middleLeft == true) {
      board[2][1] = "|" + piece + "|";
      this.middleLeft = false;
      return "";
    } // The else if statement below is used in case the middle spot is taken.
    else if (!(board[2][2].equals("|_|"))) {
      for (int i = 1; i < 4; i += 2) {
        for (int x = 1; x < 4; x += 2) {
          if (board[1][1].equals("|" + playerPiece + "|") && (this.bottomLeftCorner == true) && !(board[3][3].equals("|" + playerPiece + "|"))) {
            board[3][3] = "|" + piece + "|";
            this.bottomLeftCorner = false;
            return "";
          } else if (board[3][3].equals("|" + playerPiece + "|") && (this.topLeftCorner == true) && !(board[1][1].equals("|" + playerPiece + "|"))) {
            board[1][1] = "|" + piece + "|";
            this.topLeftCorner = false;
            return "";
          } else if (board[1][3].equals("|" + playerPiece + "|") && (this.topRightCorner == true) && !(board[3][1].equals("|" + playerPiece + "|"))) {
            board[3][1] = "|" + piece + "|";
            this.topRightCorner = false;
            return "";
          } else if (board[3][1].equals("|" + playerPiece + "|") && (this.bottomRightCorner == true) && !(board[1][3].equals("|" + playerPiece + "|"))) {
            board[1][3] = "|" + piece + "|";
            this.bottomRightCorner = false;
            return "";
          } else if (board[i][x].equals("|_|")) {
            board[i][x] = "|" + piece + "|";
            return "";
          }
        }
      }
    }
    return "";
  }
}
