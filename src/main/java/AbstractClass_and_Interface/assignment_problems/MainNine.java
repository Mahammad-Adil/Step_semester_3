import java.util.*;

abstract class Question {
    String questionText;
    String correctAnswer;
    String studentAnswer;
    double points;

    Question(String questionText, String correctAnswer,
             String studentAnswer, double points) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
        this.studentAnswer = studentAnswer;
        this.points = points;
    }

    abstract double evaluate();

    abstract String getType();
}

class MCQ extends Question {
    MCQ(String q, String correct, String student, double points) {
        super(q, correct, student, points);
    }

    double evaluate() {
        return studentAnswer.equals(correctAnswer) ? points : 0;
    }

    String getType() {
        return "MCQ";
    }
}

class TF extends Question {
    TF(String q, String correct, String student, double points) {
        super(q, correct, student, points);
    }

    double evaluate() {
        return studentAnswer.equals(correctAnswer) ? points : 0;
    }

    String getType() {
        return "TF";
    }
}

class Essay extends Question {
    Essay(String q, String correct, String student, double points) {
        super(q, correct, student, points);
    }

    double evaluate() {
        String[] keywords = correctAnswer.split(",");
        String answer = studentAnswer.toLowerCase();

        int count = 0;

        for (String keyword : keywords) {
            if (answer.contains(keyword.trim().toLowerCase())) {
                count++;
            }
        }

        if (count >= 2)
            return points * 0.75;
        else if (count == 1)
            return points * 0.50;
        else
            return 0;
    }

    String getType() {
        return "ESSAY";
    }
}

public class MainNine {

    static String[] parseLine(String line) {
        List<String> parts = new ArrayList<>();

        int i = 0;

        while (i < line.length()) {
            while (i < line.length() && line.charAt(i) == ' ')
                i++;

            if (i >= line.length())
                break;

            if (line.charAt(i) == '"') {
                i++;
                int start = i;

                while (i < line.length() && line.charAt(i) != '"')
                    i++;

                parts.add(line.substring(start, i));
                i++;
            } else {
                int start = i;

                while (i < line.length() && line.charAt(i) != ' ')
                    i++;

                parts.add(line.substring(start, i));
            }
        }

        return parts.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        double total = 0;

        for (int i = 0; i < n; i++) {

            String[] data = parseLine(sc.nextLine());

            String type = data[0];
            String question = data[1];
            String correct = data[2];
            String student = data[3];
            double points = Double.parseDouble(data[4]);

            Question q;

            if (type.equals("MCQ")) {
                q = new MCQ(question, correct, student, points);
            } else if (type.equals("TF")) {
                q = new TF(question, correct, student, points);
            } else {
                q = new Essay(question, correct, student, points);
            }

            double score = q.evaluate();

            System.out.printf("%s: %.2f%n", q.getType(), score);

            total += score;
        }

        System.out.printf("Total Score: %.2f%n", total);
    }
}