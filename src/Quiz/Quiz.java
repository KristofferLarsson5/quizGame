package Quiz;

import javax.swing.*;
import java.util.List;
import java.util.Scanner;
public class Quiz {
    private List<Question> questions;
    private int score;
    private String userName;
    private String userInput;
    Scanner scanner = new Scanner(System.in);
    public Quiz(List<Question> questions) {
        this.questions = questions;
        this.score = 0;
    }

    public void startQuiz() {
        // Create an instance of GUI for displaying questions
        QuizGUI quizGUI = new QuizGUI();
        userName = JOptionPane.showInputDialog(null, "What is your name?");

        // Loop through questions using the GUI
        for (Question question : questions) {
            // Display the question and get user input
            userInput = quizGUI.getUserInput(question.getQuestionText());

            // Set user answer in the question
            question.setUserAnswer(userInput);

            // Check if the answer is correct and update the score
            if (question.isAnswerCorrect()) {
                score++;
            }
        }
        // Display the result using the GUI
        quizGUI.displayResult(userName, score);
    }
}
