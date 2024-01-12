package Test;
import Quiz.Question;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuestionTest {
    @Test
    void getQuestionText() {
        Question question = new Question("What is the capital of France?", "Paris");
        assertEquals("What is the capital of France?", question.getQuestionText());
    }

    @Test
    void setUserAnswer() {
        Question question = new Question("What is the capital of France?", "Paris");
        question.setUserAnswer("Berlin");
        assertEquals("Berlin", question.userAnswer);
    }

    @Test
    void isAnswerCorrect() {
        Question question = new Question("What is the capital of France?", "Paris");

        // Case-insensitive comparison
        question.setUserAnswer("paris");
        assertTrue(question.isAnswerCorrect());

        question.setUserAnswer("Berlin");
        assertFalse(question.isAnswerCorrect());
    }
}