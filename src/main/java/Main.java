import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        int randomNumber= ThreadLocalRandom.current().nextInt(1, 20 + 1);;
        int guess=0;
        System.out.println("I'm thinking of a number between 1-20");
        System.out.println("Can you guess it in 6 tries?");
        Scanner getInput = new Scanner(System.in);
        int input = getInput.nextInt();
        while (input!=randomNumber) {
            if (input > randomNumber) {
                System.out.println("Your guess is to high!");
                System.out.println("Try Again");
            } else if (input < randomNumber) {
                System.out.println("your guess is too low!");
                System.out.println("Try Again");
            }
            guess++;
            if(guess==6){
                System.out.println("You failed to get it right in 6 turns");
                System.out.println("You lose.");
                break;
            }
            input = getInput.nextInt();
        }
        if(input==randomNumber) {
            System.out.println("You got it right!");
        }

    }
}
