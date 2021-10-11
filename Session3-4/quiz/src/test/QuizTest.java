package test;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import src.Quiz;

/**
 * The test class QuizTest.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QuizTest {
    /**
     * Default constructor for test class QuizTest
     */
    public QuizTest() {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp() {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown() {
    }

    /**
     * Tests the constructor and getters for question and correct answer
     */
    @Test
    public void test1() {
        Quiz quiz = new Quiz("Who plays agent Coulson in the Marvel Cinematic Universe?", "Simon Pegg", "Clark Gregg",
                "Nick Clegg", 2); // Creates a new quiz object with given values
        assertEquals(quiz.getQuestion(), "Who plays agent Coulson in the Marvel Cinematic Universe?"); // checks whether
                                                                                                       // the method
                                                                                                       // getQuestion
                                                                                                       // returns the
                                                                                                       // given string
        assertEquals(quiz.getCorrectAnswer(), 2); // Checks whether the correct answer is set to 2
    }

    /**
     * Tests the setter for question and correct answer
     */
    @Test
    public void test2() {
        Quiz quiz = new Quiz("Who plays agent Coulson in the Marvel Cinematic Universe?", "Simon Pegg", "Clark Gregg",
                "Nick Clegg", 2); // Creates a new quiz object with default values
        assertEquals(quiz.getQuestion(), "Who plays agent Coulson in the Marvel Cinematic Universe?"); // checks the
                                                                                                       // value of
                                                                                                       // question after
                                                                                                       // constructor

        quiz.setQuestion("Which of the people below is not an actor?"); // sets a new value for question
        assertEquals(quiz.getQuestion(), "Which of the people below is not an actor?"); // checks if the new value for
                                                                                        // question was saved correctly

        quiz.setCorrectAnswer(3); // sets a new value for correct answer
        assertEquals(quiz.getCorrectAnswer(), 3); // checks if the new value for correct answer was saved correctly
    }
}
