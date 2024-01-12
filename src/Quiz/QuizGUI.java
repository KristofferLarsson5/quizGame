package Quiz;

import javax.swing.*;

public class QuizGUI {
    public String getUserInput(String questionText) {
        // Display the question and get user input using JOptionPane
        return JOptionPane.showInputDialog(null, questionText);
    }

    public void displayResult(String userName, int score) {
        // Display the final result using JOptionPane
        JOptionPane.showMessageDialog(null, "Quiz ended! Good job " + userName +"\nYour final score is: " + score);
        // Save the score to the database using the QuizDAO
        Database quizDAO = new Database();
        quizDAO.saveScore(userName, score);
    }


}
