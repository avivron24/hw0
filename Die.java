import java.util.Random;
import java.util.Scanner;

public class Die {

    Random random = Main.rnd;
    int[] die;
    int down;
    int up;


    public Die (int down , int up){
        this.down = down;
        this.up = up;
    }

    public Die (){
        int down = 1;
        int up = 6;
    }

    public int roll (int down , int up ){
        Random random = new Random();
        int rollResult = random.nextInt(up)+1-down;
        return rollResult;
    }

}

