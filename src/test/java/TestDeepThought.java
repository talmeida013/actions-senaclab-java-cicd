import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.sen.DeepThought;

public class TestDeepThought {
    public TestDeepThought() {
        // Default constructor
    }

    @Test
    @DisplayName("Test the answer to everything")
    void testAnswerToAll() {
        DeepThought superComputer = new DeepThought();
        assertEquals(42, superComputer.answerToTheUltimateQuestionOfLifeTheUniverseAndEverything());
    }
}