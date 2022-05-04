import javax.xml.namespace.QName;
import java.util.Scanner;

public class SnakesAndLaddersGame {

    Scanner scanner = Main.scanner;
    Player newPlayer ;

    int down;
    int up;

    public SnakesAndLaddersGame (int down , int up){
        this.down = down;
        this.up = up;
    }

    public SnakesAndLaddersGame (){
        int down = 1;
        int up = 6;
    }

    public void initializeGame(){
        scanner = new Scanner(System.in);
        String add = scanner.next();
        String second = scanner.next();
        if (second.equals("player")){
            

        }


    }

    public void addPlayer(){
        scanner = new Scanner(System.in);
        String add = scanner.next();
        String second = scanner.next();



    }



}
