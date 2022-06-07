import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GameMethods {
    Scanner getInput = new Scanner(System.in);
    String name;
    int randomNumber;
    String input = "";
    int guess=0;

    public GameMethods(int randomNumber){
        this.randomNumber=ThreadLocalRandom.current().nextInt(1, 20 + 1);
    }
    public int getRandomNumber(){
        System.out.println(randomNumber);
        return randomNumber;
    }


    public void startGame(){
        System.out.println("Hello There! What is your name?");
        try {
             name = getInput.next();
        }catch(Exception e){
            System.out.println("Caught Exception: Not a name");
        }
        System.out.println("Nice to meet you "+ name);
    }

    public void guessLoop() {
        System.out.println("I'm thinking of a number between 1-20");
        System.out.println("Can you guess it in 6 tries?");
        try {
            input = getInput.next();
        } catch (Exception e) {
            System.out.println("Caught Exception: Not a number!");
        }
        if(input.equalsIgnoreCase("cheat")){
            getRandomNumber();
            input=getInput.next();
        }
        while (Integer.parseInt(input) != randomNumber && guess != 6) {
            if (Integer.parseInt(input) > randomNumber && Integer.parseInt(input) < 21) {
                System.out.println("Your guess is to high!");
                System.out.println("Try Again");
            } else if (Integer.parseInt(input) < randomNumber && Integer.parseInt(input) > 0) {
                System.out.println("your guess is too low!");
                System.out.println("Try Again");
            }
            guess++;
            try {
                input = getInput.next();
            } catch (Exception e) {
                System.out.println("Caught Exception: Not a number!");
            }
        }
            if (guess == 6) {
                System.out.println("You failed to get it right in 6 turns");
                System.out.println("You lose.");
            } else {
                System.out.println("You got it right in " + (guess + 1) + " guesses!");
            }
        guess = 0;
        randomNumber = ThreadLocalRandom.current().nextInt(1, 20 + 1);
        }
}

