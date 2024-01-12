package Quiz;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Question> questionsFromFile = Question.getQuestionsFromFile();
        Quiz quiz = new Quiz(questionsFromFile);

        // Start the quiz
        quiz.startQuiz();
    }
}
