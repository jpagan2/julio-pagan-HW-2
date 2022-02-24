package test.java;

import org.junit.jupiter.api.Test;
import main.java.ImprovedRandom;

public class ImprovedRandomTest {
    private final static int lowerBound;
    private final static int upperBound;

    static {
        lowerBound = 3;
        upperBound = 9;
    }

    @Test
    void testOutputIsWithinBounds() {
        ImprovedRandom improvedRandom = new ImprovedRandom();
        int randomInt = improvedRandom.generateRandomIntWithinBounds(lowerBound, upperBound);
        assert(randomInt >= lowerBound && randomInt <= upperBound);
    }
}