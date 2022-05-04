public class Player {

    private int playerPosition ;
    private String playerName;
    private GamePiece playerGamePiece;
    static int playerCount;


    public Player (String playerName , GamePiece playerGamePiece , int playerPosition){

        this.playerName = playerName;
        this.playerGamePiece=playerGamePiece;
        this.playerPosition= playerPosition = 0;
        playerCount++;
    }

    public int getPlayerPosition() {
        return playerPosition;
    }

    public String getPlayerName() {
        return playerName;
    }

    public static int getPlayerCount() {
        return playerCount;
    }

    public GamePiece getPlayerGamePiece() {
        return playerGamePiece;
    }

    public void setPlayerPosition(int playerPosition) {
        this.playerPosition = playerPosition;
    }
}
