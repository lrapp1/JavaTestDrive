import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeciderShould {

    @Test
    @DisplayName("Low value starting test")
    void decide() {
        // arrange test conditions
        Decider systemUnderTest = new Decider();

        // act
        String result = systemUnderTest.decide(5);

        // assert
        assertEquals("FizzBuzz", result);
    }
}