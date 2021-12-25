// Computer AI
class AITic {
  String piece;

  public String checker(String[][] board) {
    if (board[2][2].equals("|_|")) {
      board[2][2] = "|" + piece + "|";
      return "";
    } else if (!(board[2][2].equals("|_|"))) {
      for (int i = 1; i < 4; i += 2) {
        for (int x = 1; x < 4; x += 2) {
          if (board[i][x].equals("|_|")) {
            board[i][x] = "|" + piece + "|";
            return "";
          }
        }
      }
    }
    return "";
  }
}
