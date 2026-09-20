class Scorecard {

    private boolean[] results;
    private final int totalQuestions;
    private int currentQuestion;

    // Constructor
    public Scorecard(int totalQuestions) {
        this.totalQuestions = totalQuestions;
        this.results = new boolean[totalQuestions];
        this.currentQuestion = 0;
    }

    // Record the next answer
    public void recordAnswer(boolean correct) {
        if (currentQuestion < totalQuestions) {
            results[currentQuestion] = correct;
            currentQuestion++;
        } else {
            System.out.println("No more answers can be recorded.");
        }
    }

    // Return only the total score
    public int getScore() {
        int score = 0;

        for (int i = 0; i < currentQuestion; i++) {
            if (results[i]) {
                score++;
            }
        }

        return score;
    }
}

public class MainScorecard {
    public static void main(String[] args) {

        Scorecard sc = new Scorecard(4);

        sc.recordAnswer(true);
        sc.recordAnswer(true);
        sc.recordAnswer(false);
        sc.recordAnswer(true);

        System.out.println("Score = " + sc.getScore());
    }
}