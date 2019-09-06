import java.util.List;

public class Question {
    private String questionText;
    private List<Option> options;

    public Question(String questionText, List<Option> options) {
        this.questionText = questionText;
        this.options = options;
    }

    public String getQuestionText() {
        return questionText;
    }

    public List<Option> getOptions() {
        return options;
    }
}
