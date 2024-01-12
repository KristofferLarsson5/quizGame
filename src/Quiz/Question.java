package Quiz;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Question {
    private String questionText;
    private String correctAnswer;
    public String userAnswer;
    public Question(String questionText, String correctAnswer) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }

    public boolean isAnswerCorrect() {
        return correctAnswer.equalsIgnoreCase(userAnswer);
    }
    public static List<Question> getQuestionsFromFile() {
        List<Question> questions = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("src/Quiz/Questions.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\?");

                if (parts.length >= 2) {
                    String question = parts[0].trim();
                    String answer = parts[1].trim();

                    Question q = new Question(question, answer);
                    questions.add(q);
                } else {
                    System.out.println("Invalid line format: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return questions;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
}


