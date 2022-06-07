import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.*;

class GameMethodsTest {
    GameMethods underTest = new GameMethods(66);

    @Test
    void shouldReturnRandomNumber(){
    int rando = underTest.getRandomNumber();
    assertEquals(66,rando);
    }

}