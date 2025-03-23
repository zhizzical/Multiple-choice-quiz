/* we create a class for the questions called (Question class). to prevent using print statement for every
 question and choices and to increase readability. */

import java.util.ArrayList; //this one is the actual implantation
import java.util.List; //is an interface. acts as a blueprint
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        List<Question> questionList = new ArrayList<>(); //List<> listName = new ArrayList<>();. it's not List because we can't create object of interface
        //add() is a method of ArrayList. we say "new Question" because we create new objects.
        questionList.add(new Question("Q1/ I speak without a mouth and hear without ears. I have no body, but I come alive with wind. What am I? ",
                new String[]{"A. A shadow", "B. An echo", "A whisper", "D. A ghost"}, 'B'));
        questionList.add(new Question("Q2/ The more you take, the more you leave behind. What am I? ",
                new String[]{"A. Footsteps", "B. Time", "C. Secrets", "D. Shadows"}, 'A'));
        questionList.add(new Question("Q3/ A man was born in 1990 and died in 1995. Yet he was 40 years old when he died. How? ",
                new String[]{"A. He lived on another planet", "B. He was born in hospital room 1990", "C. He used a time machine", "D. He followed a different calendar system"}, 'D'));
        questionList.add(new Question("Q4/ What has to be broken before you can use it? ",
                new String[]{"A. A mirror", "B. A secret","C. A lock", "D. An egg"}, 'D'));
        questionList.add(new Question("Q5/ I have keys but open no locks. I have space but no room. You can enter, but you can’t leave. What am I? ",
                new String[]{"A. A computer keyboard", "B. A prison", "C. A phone", "D. A puzzle"}, 'A'));

        for (Question x : questionList) { //loop through the list
            System.out.println(x.getQuestion()); //print the questions with the help of the getter
            for (String y : x.getOptions()) { //loop through the options by the help of the getter
                System.out.println(y); //print the options
            }
            System.out.println("Enter your choice (A, B, C, D): ");
            char choice = sc.next().toUpperCase().charAt(0);

            if (choice == x.getAnswer()){ //gets the answers and compares them
                System.out.println("Correct!");
                score++; //if correct, get a point
            } else {
                System.out.println("Wrong! Correct answer is: " + x.getAnswer());
            }
        }
        System.out.println("Your final score is:" + score + "/5");

        sc.close();

    }
}