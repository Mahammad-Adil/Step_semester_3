```java
import java.util.Arrays;

class FantasyTeam {

    static void applyMultipliers(double[] playerScores,
                                 int captainIndex,
                                 int viceCaptainIndex) {

        // Captain gets 2x points
        playerScores[captainIndex] =
                playerScores[captainIndex] * 2;

        // Vice-Captain gets 1.5x points
        playerScores[viceCaptainIndex] =
                playerScores[viceCaptainIndex] * 1.5;
    }
}

public class MainFantasyTeam {

    public static void main(String[] args) {

        double[] scores = {40, 55, 30, 62};

        int captainIndex = 1;
        int viceCaptainIndex = 3;

        FantasyTeam.applyMultipliers(
                scores,
                captainIndex,
                viceCaptainIndex
        );

        System.out.println(Arrays.toString(scores));
    }
}
```
