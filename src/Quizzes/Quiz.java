package Quizzes;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        //instantiate quiz questions here
        //allow for addition of user-generated questions

        //run quiz from here
        //grade quiz

        //quizQuestions hashmap int : ID and Question : question
        //ID is the key and instantiated question object is the value

        MultipleChoice m1 = new MultipleChoice("Why did the chicken cross the road?",
                3);
        m1.setAnswers(1,
                "It was being chased by a fox.",
                2,
                "It wanted a change of scenery.",
                3,
                "To get to the other side.",
                4,
                "That's where the Uber was picking it up.");

        MultipleChoice m2 = new MultipleChoice("What color is the sky?", 2);
        m2.setAnswers(1,"Green",2,"Blue",3,"Dragon",4,"Polka-dot");
        System.out.println(m1);
        System.out.println(m2);
    }

}
