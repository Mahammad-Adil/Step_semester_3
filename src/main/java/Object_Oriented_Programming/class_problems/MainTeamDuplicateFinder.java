```java
class TeamDuplicateFinder {

    static String findDuplicateTeam(String[] teamNames) {

        for (int i = 0; i < teamNames.length; i++) {

            for (int j = i + 1; j < teamNames.length; j++) {

                if (teamNames[i].equals(teamNames[j])) {
                    return "Duplicate Found: " + teamNames[i];
                }
            }
        }

        return "No Duplicates Found";
    }
}

public class MainTeamDuplicateFinder {

    public static void main(String[] args) {

        String[] teamNames = {
            "ByteForce",
            "CodeCrafters",
            "ByteForce"
        };

        String result = TeamDuplicateFinder.findDuplicateTeam(teamNames);

        System.out.println(result);
    }
}
```
