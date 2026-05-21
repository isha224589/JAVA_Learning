package OOPs;

import java.util.Random;

public class built_in {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(2000, 5000);
        System.out.println(number);
    }
}
