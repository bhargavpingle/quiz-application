public class Result {
    private int score;
    private int totalQuestions;

    public Result(int score, int totalQuestions) {
        this.score = score;
        this.totalQuestions = totalQuestions;
    }

    public void display() {
        System.out.println("Quiz Complete!");
        System.out.println("Your Score: " + score + " out of " + totalQuestions);
    }
}
