package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private final Character[][] matrix;

    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {
        return getWinner().equals("X");
    }

    public Boolean isInFavorOfO() {
        return getWinner().equals("O");
    }

    public Boolean isTie() {
        return !isInFavorOfO() && !isInFavorOfX();
    }

    public String getWinner() {
        Character[][] columns = transpose();
        Character[][] diagnols = getDiagnols();


        for (Character[] row : matrix) {
            if(isAllEqual(row)) {
                return row[0].toString();
            }
        }

        for(Character[] column : columns) {
            if(isAllEqual(column)) {
                return column[0].toString();
            }
        }

        for(Character[] diagnol : diagnols) {
            if(isAllEqual(diagnol)) {
                return diagnol[0].toString();
            }
        }
        return "";
    }

    private Boolean isAllEqual(Character[] array){
        for(int i=1; i<array.length; i++){
            if(array[0] != array[i]){
                return false;
            }
        }
        return true;
    }

    private Character[][] transpose() {
        Character[][] board = this.matrix.clone();
        int columnLength = board.length;
        int rowLength = board[0].length;

        Character[][] newArray = new Character[rowLength][columnLength];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                newArray[j][i] = board[i][j];
            }
        }
        return newArray;
    }

    private Character[][] getDiagnols() {
        Character centerCell = matrix[1][1];

        Character topLeftCell = matrix[0][0];
        Character bottomRightCell = matrix[2][2];
        Character[] diagnol1 = new Character[]{ topLeftCell, centerCell, bottomRightCell};

        Character topRightCell = matrix[0][2];
        Character bottomLeftCell = matrix[2][0];
        Character[] diagnol2 = new Character[]{ topRightCell, centerCell, bottomLeftCell };
        Character[][] diagnols = {diagnol1, diagnol2};
        return  diagnols;
    }


}
