public class GameBoard {

    private final int  boardSize = 100 ;
    private int[] gameBoard;

    public GameBoard(){
        this.gameBoard = setBoard();
    }

    public int[] setBoard() {
        this.gameBoard = new int[boardSize];
        for (int i = 0 ; i < boardSize ; i++)
            gameBoard[i] = i+1;
        return gameBoard;
    }

    public int[] getGameBoard() {
        return gameBoard;
    }

    public int getGameBoard(int index) {
        return gameBoard[index];
    }

    public void setGameBoard(int[] gameBoard) {
        this.gameBoard = gameBoard;
    }

    public int getBoardSize() {
        return boardSize;
    }
}
