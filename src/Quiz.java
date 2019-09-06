import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questions;
    private int score;

    public Quiz() {
        questions = new ArrayList<>();
        score = 0;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        for (Question question : questions) {
            System.out.println(question.getQuestionText());
            int i = 1;
            for (Option option : question.getOptions()) {
                System.out.println(i + ". " + option.getText());
                i++;
            }
            System.out.print("Your answer (enter the number): ");
            int answer = scanner.nextInt();

            Option selectedOption = question.getOptions().get(answer - 1);
            if (selectedOption.isCorrect()) {
                score++;
            }
        }
        System.out.println("Your score: " + score + "/" + questions.size());
    }
}
