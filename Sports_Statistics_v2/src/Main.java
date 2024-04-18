import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        ArrayList<String[]> sportList = new ArrayList<>();
        Scanner myScanner = new Scanner(System.in);

        //choosing a file
        System.out.println("Select file");
        String filename = myScanner.nextLine();

        //separating the data
        String homeTeamName = "";
        String guestTeamName = "";
        int homeTeamScore = 0;
        int guestTeamScore = 0;

        //listing through the file and adding into sportList
        try {
            Scanner fileScanner = new Scanner(Paths.get(filename));
            while (fileScanner.hasNextLine()) {
                String csvLine = fileScanner.nextLine();
                String[] csvList = csvLine.split(",");
                sportList.add(csvList);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        //games played
        System.out.println("Select a team for number of games played");
        String getTeam = myScanner.nextLine();

        //counting total games of a team
        int numberOfGames = 0;
        for (String[] item : sportList){
            if (item[0].equals(getTeam) || item[1].equals(getTeam)){
                numberOfGames++;
            }
        }

        //counting wins and looses
        int wins = 0;
        for (String[] item : sportList){
            homeTeamName = item[0];
            guestTeamName = item[1];
            homeTeamScore = Integer.parseInt(item[2]);
            guestTeamScore = Integer.parseInt(item[3]);
            if (getTeam.equals(homeTeamName) && homeTeamScore > guestTeamScore){
                wins++;
            }
            if (getTeam.equals(guestTeamName) && homeTeamScore < guestTeamScore){
                wins++;
            }
        }
        int looses = numberOfGames - wins;


        //printing the stats
        System.out.println("The team : " + getTeam + " has played: " + numberOfGames);
        System.out.println("The team: " + getTeam + " has lost: " + looses + " games and won: " + wins);
    }

}
