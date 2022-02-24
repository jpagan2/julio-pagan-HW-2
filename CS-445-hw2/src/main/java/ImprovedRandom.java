package main.java;

import java.util.Random;

public class ImprovedRandom extends Random {

    ImprovedRandom(long seed){
        super(seed);
    }
    
    public ImprovedRandom() {
        super();
    }

    public int generateRandomIntWithinBounds(int lowerBound, int upperBound) {
        int range = upperBound - lowerBound + 1;
        return (int) (super.nextDouble() * range) + lowerBound;
    }
}