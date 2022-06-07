import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        GameMethods gameMethods = new GameMethods(0);
        gameMethods.startGame();
        String playAgain;
        do {
            gameMethods.guessLoop();
            System.out.println("play again? y or n");
            playAgain = getInput.next();
            }while (playAgain.equals("y"));
        System.out.println("OK! Goodbyte!");
               System.out.println("program ended");
    }
}
