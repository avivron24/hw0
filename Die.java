import java.util.Random;
import java.util.Scanner;

public class Die {
    private static final int DEFAULT_MIN = 1;
    private static final int DEFAULT_MAX = 6;


    Random random = Main.rnd;
    int[] die;
    int max;
    int min;


    public Die (int max , int min){
        this.max = max;
        this.min = min;
    }

    public Die (){
        this.min = DEFAULT_MIN;
        this.max = DEFAULT_MAX;
    }

    public int roll (int down , int up ){
        Random random = new Random();
        int rollResult = random.nextInt(up)+1-down;
        return rollResult;
    }

}

