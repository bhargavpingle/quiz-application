import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Option option1 = new Option("Java", true);
        Option option2 = new Option("C++", false);
        Option option3 = new Option("Python", false);
        Option option4 = new Option("JavaScript", false);

        Question question1 = new Question("Which language is used for Android development?", Arrays.asList(option1, option2, option3, option4));

        Quiz quiz = new Quiz();
        quiz.addQuestion(question1);

        quiz.start();
    }
}
