package Practice;

import java.util.Scanner;

public class practice {
    public static void guessingNumberGame() {
       Scanner sc = new Scanner(System.in);
    //    generate a random number between 1-10
       int num = 1 + (int)(10 * Math.random());

       int k=5;

       System.out.println("A number chosen between 1 and 10");
       System.out.println("You have"+ k + " attempts to guess the correct number.");

       for(int i=0; i<k; i++){
        System.out.println("Enter your guess: ");
        int guess = sc.nextInt();

        if (guess == num){
            System.out.println("Congrats! You guessed the correct number.");
            sc.close();
            return;
        }
        else if (guess < num) {
            System.out.println("The number is greater than "+ guess);
        }
        else{
            System.out.println("The number is less than "+ guess);
        }
       }
       System.out.println("You've exhausted all attempts. The correct number was:"+ num);
       sc.close();
    }
    public static void main(String[] args) {
        guessingNumberGame();
    }

}


