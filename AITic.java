// Computer AI
class AITic {
  String piece;

  public String checker(String[][] board, String playerPiece) {
    if (board[2][2].equals("|_|")) {
      board[2][2] = "|" + piece + "|";
      return "";
    } // The else if statements below are used to block the player from winning by the middles.
    else if (board[2][2].equals("|" + playerPiece + "|") && board[3][2].equals("|" + playerPiece + "|") && board[1][2] == "|_|") {
      board[1][2] = "|" + piece + "|";
      return "";
    } else if (board[2][2].equals("|" + playerPiece + "|") && board[2][1].equals("|" + playerPiece + "|") && board[2][3] == "|_|") {
      board[2][3] = "|" + piece + "|";
      return "";
    } else if (board[2][2].equals("|" + playerPiece + "|") && board[2][3].equals("|" + playerPiece + "|") && board[2][1] == "|_|") {
      board[2][1] = "|" + piece + "|";
      return "";
    } else if (board[2][2].equals("|" + playerPiece + "|") && board[1][2].equals("|" + playerPiece + "|") && board[3][2] == "|_|") {
      board[3][2] = "|" + piece + "|";
      System.out.println("test");
      return "";
    } // The if else statements below are used to check if the player is going to win by getting three in a row.
         // Note that the win is only being considered for the sides, not the middle square.
    else if (board[1][1].equals("|" + playerPiece + "|") && board[3][1].equals("|" + playerPiece + "|") && board[2][1] == "|_|") {
      board[2][1] = "|" + piece + "|";
      return "";
    } else if (board[1][1].equals("|" + playerPiece + "|") && board[1][3].equals("|" + playerPiece + "|") && board[1][2] == "|_|") {
      board[1][2] = "|" + piece + "|";
      return "";
    } else if (board[1][3].equals("|" + playerPiece + "|") && board[3][3].equals("|" + playerPiece + "|") && board[2][3] == "|_|") {
      board[2][3] = "|" + piece + "|";
      return "";
    } else if (board[3][1].equals("|" + playerPiece + "|") && board[3][3].equals("|" + playerPiece + "|") && board[3][2] == "|_|") {
      board[3][2] = "|" + piece + "|";
      return "";
    } // The else if statement below is used in case the middle spot is taken.
    else if (!(board[2][2].equals("|_|")))
      if (board[2][2].equals("|" + playerPiece + "|") && board[1][3].equals("|" + playerPiece + "|") && board[3][1] == "|_|") {
        board[3][1] = "|" + piece + "|";
        return "";
      } else if (board[2][2].equals("|" + playerPiece + "|") && board[1][1].equals("|" + playerPiece + "|") && board[3][3] == "|_|") {
        board[3][3] = "|" + piece + "|";
        return "";
      } else if (board[2][2].equals("|" + playerPiece + "|") && board[3][1].equals("|" + playerPiece + "|") && board[1][3] == "|_|") {
        board[1][3] = "|" + piece + "|";
        return "";
      } else if (board[2][2].equals("|" + playerPiece + "|") && board[3][3].equals("|" + playerPiece + "|") && board[1][1] == "|_|") {
        board[1][1] = "|" + piece + "|";
        return "";
      } else {
        for (int i = 1; i < 4; i += 2) {
          for (int x = 1; x < 4; x += 2) {
            if (board[1][1].equals("|" + playerPiece + "|") && board[3][3] == "|_|") {
              board[3][3] = "|" + piece + "|";
              return "";
            } else if (board[3][3].equals("|" + playerPiece + "|") && board[1][1] == "|_|") {
              board[1][1] = "|" + piece + "|";
              return "";
            } else if (board[1][3].equals("|" + playerPiece + "|") && board[3][1] == "|_|") {
              board[3][1] = "|" + piece + "|";
              return "";
            } else if (board[3][1].equals("|" + playerPiece + "|") && board[1][3] == "|_|") {
              board[1][3] = "|" + piece + "|";
              return "";
            } else if (board[i][x].equals("|_|")) {
              board[i][x] = "|" + piece + "|";
              return "";
            }
          }
        }
      }
      System.out.println("test");
      return "";
    }
  }
