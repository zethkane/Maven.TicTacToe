package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] board;
    public Board(Character[][] matrix) {
        board = matrix;
    }

    public Boolean isInFavorOfX()
    {
        boolean xIsInFavor;
        if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X'){return true;}
        else if (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X'){return true;}
        else if (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X'){return true;}
        else if (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X'){return true;}
        else if (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X'){return true;}
        else if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X'){return true;}
        else if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X'){return true;}
        else if (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X'){return true;}
        else {xIsInFavor = false;}

        return xIsInFavor;
    }

    public Boolean isInFavorOfO() {
        boolean oIsInFavor;
        if (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O'){return true;}
        else if (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O'){return true;}
        else if (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O'){return true;}
        else if (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O'){return true;}
        else if (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O'){return true;}
        else if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O'){return true;}
        else if (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O'){return true;}
        else if (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O'){return true;}
        else {oIsInFavor = false;}

        return oIsInFavor;
    }

    public Boolean isTie() {
        boolean weWin;
        if( isInFavorOfX() == true || isInFavorOfO() == true){
            weWin = false;
        }
        else {
            weWin = true;
        } return weWin;
    }

    public String getWinner() {
        String winner = "";
        if ( isInFavorOfO() == true){
            winner += "O";
        }
        else if(isInFavorOfX() == true){
            winner += "X";
        }

        return winner;

    }

}
