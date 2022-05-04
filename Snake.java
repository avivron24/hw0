public class Snake {

    private int snakeStartingPoint;
    private int snakeEndingPoint;

    public Snake(int snakeStartingPoint , int snakeEndingPoint){
        this.snakeStartingPoint = snakeStartingPoint;
        this.snakeEndingPoint = snakeEndingPoint;
    }

    public int getSnakeStartingPoint() {
        return snakeStartingPoint;
    }

    public int getSnakeEndingPoint() {
        return snakeEndingPoint;
    }

}
