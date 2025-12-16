import java.util.Scanner;
import java.nio.file.Paths;

public class Program {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Enter the team: ");
        String team = inputReader.nextLine();

        analyseGame("data.csv", team);

        // close reader scanner
        inputReader.close();
    }

    // method for analyzing the game and displying the results
    public static void analyseGame(String fileName, String team) {
        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
            int occurrences = 0;
            int wins = 0;
            int ties = 0;

            // loop through every line in a file
            while (fileReader.hasNextLine()) {
                String row = fileReader.nextLine();

                if (row.contains(team)) {
                    occurrences++;

                    String[] gameSections = row.split(",");

                    int teamIndex = getArrayIndex(gameSections, team);
                    int teamScore = Integer.valueOf(gameSections[teamIndex + 2]);

                    int opponentIndex = 1 - teamIndex;
                    int opponentScore = Integer.valueOf(gameSections[opponentIndex + 2]);

                    if (teamScore > opponentScore) {
                        wins++;
                    } else if (teamScore == opponentScore) {
                        ties++;
                    }
                }

            }

            // if team is not in games
            if (occurrences == 0) {
                System.out.println("Team not found!");
                return;
            }

            // print results to user
            System.out.println("\n" + "Team " + team + " perfomance");
            System.out.println("Number of games: " + occurrences);
            System.out.println("Wins: " + wins);
            System.out.println("Ties: " + ties);
            System.out.println("Loses: " + (occurrences - wins - ties));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Integer getArrayIndex(String[] array, String item) {
        for (int i = 0; i < array.length; i++) {
            String element = array[i];

            if (element.equals(item)) {
                return i;
            }
        }
        return -1;
    }
}
