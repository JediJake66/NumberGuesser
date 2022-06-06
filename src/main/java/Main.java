import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        int randomNumber= ThreadLocalRandom.current().nextInt(1, 20 + 1);
        int input = 0;
        int guess=0;
        String name ="";
        String playAgain;


        System.out.println("Hello There! What is your name?");
        try {
            name = getInput.next();
        }catch(Exception e){
            System.out.println("Caught Exception: Not a name");
        }
        System.out.println("Nice to meet you "+ name);
        do {
            System.out.println("I'm thinking of a number between 1-20");
            System.out.println("Can you guess it in 6 tries?");
            try {
                input = getInput.nextInt();
            } catch (Exception e) {
                System.out.println("Caught Exception: Not a number!");
            }
            while (input != randomNumber && guess != 6) {
                if (input > randomNumber && input < 21) {
                    System.out.println("Your guess is to high!");
                    System.out.println("Try Again");
                } else if (input < randomNumber && input > 0) {
                    System.out.println("your guess is too low!");
                    System.out.println("Try Again");
                }
                guess++;
                try {
                    input = getInput.nextInt();
                } catch (Exception e) {
                    System.out.println("Caught Exception: Not a number!");
                }
                }
                if (guess == 6) {
                    System.out.println("You failed to get it right in 6 turns");
                    System.out.println("You lose.");
                    System.out.println("play again? y or n");
                    playAgain = getInput.next();
                } else {
                    System.out.println("You got it right in " + (guess + 1) + " guesses!");

                    System.out.println("play again? y or n");
                    playAgain = getInput.next();
                }
                guess = 0;
                randomNumber = ThreadLocalRandom.current().nextInt(1, 20 + 1);

                if (playAgain.equalsIgnoreCase("n")) {
                    System.out.println("OK! Goodbyte!");
                    System.out.println("program ended");
                }
            }
            while (playAgain.equals("y")) ;


    }
}
