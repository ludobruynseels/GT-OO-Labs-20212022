package src;

/**
 * A class representing a quiz with one multiple-choice question with three
 * possible answers
 */
public class Quiz {
    /**
     * instance variables (or attributes)
     */
    private String question; // the question text
    private String answer1; // the text for answer 1
    private String answer2; // the text for answer 2
    private String answer3; // the text for answer 3
    private int correctAnswer; // the number of the correct answer

    /**
     * Constructor. This initializes each instance variable by giving it a value.
     */
    public Quiz(String q, String answ1, String answ2, String answ3, int correct) {
        question = q;
        answer1 = answ1;
        answer2 = answ2;
        answer3 = answ3;
    }

    /**
     * Getters and setters
     */
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String newQuestion) {
        question = newQuestion;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int newCorrectAnswer) {
        correctAnswer = newCorrectAnswer;
    }

    /**
     * Prints the question text and possible answers
     */
    public void printQuestion() {
        System.out.println(question);
        System.out.println("   1 - " + answer1);
        System.out.println("   2 - " + answer2);
        System.out.println("   3 - " + answer3);
    }

    /**
     * Processes an answer to the question. First this method tests whether the
     * answer is between 1 and 3, and then it prints an output based on whether the
     * given answer was correct.
     */
    public void answerQuestion(int answerNr) {
        if (answerNr < 1 || answerNr > 3) {
            System.out.println("Please enter an answer number between 1 and 3");
        } else {
            boolean correct = checkIfAnswerIsCorrect(answerNr);

            if (correct) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose, the correct answer was " + answer2);
            }
        }
    }

    /**
     * Compares a given answer with the correct one to determine whether the answer
     * was correct. This method returns true if the answer was correct, false
     * otherwise. Note: this method is private, so it does not appear in the method
     * list if you create an object an right-click it!
     */
    private boolean checkIfAnswerIsCorrect(int givenAnswer) {
        if (givenAnswer == correctAnswer) {
            return true;
        } else {
            return false;
        }
    }
}
