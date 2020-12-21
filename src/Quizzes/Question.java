package Quizzes;

import java.util.HashMap;

public class Question {
    private String questionText;
    private static int idCounter = 0;
    private int questionId;
    private HashMap<?,?> answerChoices; //declare generic type in Java with ?
    private int correctAnswer;

    //constructor
    public Question (String question, int correctAnswer) {
        this.questionId = idCounter;
        idCounter++;
        this.questionText = question;
        this.correctAnswer = correctAnswer;
    }

    //getters only - not setting anything on this class through child classes
    public String getQuestionText() {
        return this.questionText;
    }

    public int getQuestionId() {
        return this.questionId;
    }

    public HashMap<?, ?> getAnswerChoices() {
        return this.answerChoices;
    }

    public int getCorrectAnswer() {
        return this.correctAnswer;
    }
}
