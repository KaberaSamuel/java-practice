import java.util.Scanner;
import java.nio.file.Paths;

public class Program {
    public static void main(String[] args) {
        System.out.println("Enter file name: ");
        Scanner inputReader = new Scanner(System.in);
        String file = inputReader.nextLine();

        System.out.println("Enter the team: ");
        String team = inputReader.nextLine();

        analyseGame(file, team);

        // close open scanners
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
                    int teamScore = Integer.valueOf(gameSections[teamIndex + 1]);

                    int opponentIndex = 1 - teamIndex;
                    int opponentScore = Integer.valueOf(gameSections[opponentIndex + 1]);

                    if (teamScore > opponentScore) {
                        wins++;
                    } else if (teamScore == opponentScore) {
                        ties++;
                    }
                }

            }

            // print results to user
            System.out.println("Games: " + occurrences);
            System.out.println("Wins: " + wins);
            System.out.println("Ties: " + ties);

        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
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
