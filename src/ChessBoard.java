public class ChessBoard {

    public static void main(String[] args){
        getChess();
        System.out.println();
    }

    public static void getChess()
    {
        System.out.print("Let's play?");

        System.out.println();

        String[][] board = new String[8][8];

        {
         for(int rows = 0; rows < board.length; rows++)
         {
          for(int cols = 0; cols < board[rows].length; cols++)
          {
              if
                  ((rows + cols) % 2 == 0)

                  board[rows][cols] = "W";
              else
                  board[rows][cols] = "B";

                 System.out.print(" " + board[rows][cols] + " ");}
                 System.out.println();
              }
          }
    }
}