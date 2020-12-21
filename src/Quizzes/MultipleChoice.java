package Quizzes;

import java.util.HashMap;

public class MultipleChoice extends Question {

    HashMap<Integer, String> multipleChoiceAnswers;
    // 1: answer1
    // 2: answer2
    // 3: answer3
    // 4: answer4


    //constructor

    public MultipleChoice(String question, int correctAnswer) {
        super(question, correctAnswer);
        HashMap<Integer, String> multipleChoiceAnswers = this.multipleChoiceAnswers;
    }

    public HashMap<Integer, String> getMultipleChoiceAnswers() {
        return multipleChoiceAnswers;
    }

    public void setMultipleChoiceAnswers(HashMap<Integer, String> multipleChoiceAnswers) {
        this.multipleChoiceAnswers = multipleChoiceAnswers;
    }

//    public String setQuestion(String question) {
//        this.getQuestionText() = question;
//    }

    public HashMap setAnswers(int key1, String answer1,int key2, String answer2,int key3, String answer3,int key4, String answer4) {
        multipleChoiceAnswers.put(key1, answer1);
        multipleChoiceAnswers.put(key2, answer2);
        multipleChoiceAnswers.put(key3, answer3);
        multipleChoiceAnswers.put(key4, answer4);
        return multipleChoiceAnswers;
    }

//    public int[] setCorrectAnswer(int[] key) {
//        this.getCorrectAnswer() = key;
//    }
}
