package org.sen;

import java.util.concurrent.TimeUnit;

/**
 * This class represents the Deep Thought computer.
 */
public final class DeepThought {
    /**
     * The number of million years to think.
     */
    private static final int MILLION_YEARS = 8;

    /**
     * The sleep time in seconds.
     */
    private static final int SLEEP_TIME = 1;

    /**
     * The answer to the ultimate question.
     */
    private static final int ANSWER = 42;

    /**
     * Constructor for DeepThought.
     */
    public DeepThought() {
        // Default constructor
    }

    /**
     *
     * @return the answer to the ultimate question
     */
    public int answerToTheUltimateQuestionOfLifeTheUniverseAndEverything() {
        System.out.println("You have asked the answer to the "
                + "Ultimate Question of Life, "
                + "the Universe, and Everything");
        System.out.println("I need to think a while about that one, "
                + "come back again in "
                + "7.5 million years...");
        calculate(); // for 7.5 million years....
        return giveAnswer();
    }

    private void calculate() {
        for (int millionYears = 0; millionYears < MILLION_YEARS;
                millionYears++) {
            System.out.println(millionYears + " Million years have passed...");
            think(SLEEP_TIME);
        }
        System.out.println("7.5 million years have now passed "
                + "and I have an answer");
    }

    private void think(final int time) {
        try {
            TimeUnit.SECONDS.sleep(time);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private int giveAnswer() {
        return ANSWER;
    }
}
