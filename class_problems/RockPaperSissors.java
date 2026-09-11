import java.util.*;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] moves = {"Rock", "Paper", "Scissors"};

        int wins = 0, losses = 0, draws = 0;

        System.out.print("Enter number of rounds: ");
        int n = sc.nextInt();

        String[] playerMove = new String[n];
        String[] computerMove = new String[n];
        String[] result = new String[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nRound " + (i + 1));
            System.out.print("Enter your move (Rock/Paper/Scissors): ");
            playerMove[i] = sc.next();

            // Generate computer move randomly
            computerMove[i] = moves[rand.nextInt(3)];

            // Determine winner
            if (playerMove[i].equalsIgnoreCase(computerMove[i])) {
                result[i] = "Draw";
                draws++;
            }
            else if ((playerMove[i].equalsIgnoreCase("Rock") &&
                      computerMove[i].equals("Scissors")) ||
                     (playerMove[i].equalsIgnoreCase("Paper") &&
                      computerMove[i].equals("Rock")) ||
                     (playerMove[i].equalsIgnoreCase("Scissors") &&
                      computerMove[i].equals("Paper"))) {

                result[i] = "Win";
                wins++;
            }
            else {
                result[i] = "Loss";
                losses++;
            }

            System.out.println("Computer: " + computerMove[i]);
            System.out.println("Result: " + result[i]);
        }

        // Final scoreboard
        System.out.println("\n========== SCOREBOARD ==========");
        System.out.printf("%-8s %-15s %-15s %-10s%n",
                          "Round", "Player Move", "Computer Move", "Result");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-8d %-15s %-15s %-10s%n",
                              (i + 1), playerMove[i],
                              computerMove[i], result[i]);
        }

        double winPercentage = ((double) wins / n) * 100;

        System.out.println("\nWins   : " + wins);
        System.out.println("Losses : " + losses);
        System.out.println("Draws  : " + draws);
        System.out.printf("Win Percentage : %.2f%%%n", winPercentage);

        sc.close();
    }
}