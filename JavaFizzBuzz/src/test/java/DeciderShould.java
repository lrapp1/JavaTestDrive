import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeciderShould {

    @Test
    @DisplayName("number divisible by 3")
    void decideThreeIsFizz() {
        // arrange test conditions
        Decider systemUnderTest = new Decider();

        // act
        String result = systemUnderTest.decide(3);

        // assert
        assertEquals("Fizz", result);
    }
    @Test
    @DisplayName("number divisible by 5")
    void decideFiveIsBuzz() {
        // arrange test conditions
        Decider systemUnderTest = new Decider();

        // act
        String result = systemUnderTest.decide(5);

        // assert
        assertEquals("Buzz", result);
    }
    @Test
    @DisplayName("Another number divisible by three (9)")
    void decideNineIsFizz() {
        // arrange test conditions
        Decider systemUnderTest = new Decider();

        // act
        String result = systemUnderTest.decide(9);

        // assert
        assertEquals("Fizz", result);
    }
    @Test
    @DisplayName("Another number divisible by three (20)")
    void decideTwentyIsBuzz() {
        // arrange test conditions
        Decider systemUnderTest = new Decider();

        // act
        String result = systemUnderTest.decide(20);

        // assert
        assertEquals("Buzz", result);
    }
}
