import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class Main {

    //games played
    public static int gamesPlayed(ArrayList<String[]> teamData, String teamName){
        int numberOfGames = 0;
        for (String[] data : teamData){
            if (data[0].equals(teamName) || data[1].equals(teamName)){
                numberOfGames++;
            }
        }
        return numberOfGames;
    }

    //wins
    public static void winsAndLosses(ArrayList<String[]> teamData, String teamName, int games) {
        int wins = 0;

        for (String[] team : teamData) {
            if (team[0].equals(teamName) && Integer.parseInt(team[2]) > Integer.parseInt(team[3])) {
                wins++;
            } else if (team[1].equals(teamName) && Integer.parseInt(team[3]) > Integer.parseInt(team[2])) {
                wins++;
            }
        }
        int losses = games - wins;
        System.out.println("The team " + teamName + " has " + wins + " wins and " + losses + " losses");
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        /*
        System.out.println("Select a file");
        String fileName = myScanner.nextLine();

         */

        ArrayList<String[]> teamData = new ArrayList<>();

        try{
            Scanner fileScanner = new Scanner(Paths.get("data.txt"));
            while (fileScanner.hasNextLine()){
                String csvInfo = fileScanner.nextLine();
                if (csvInfo.isEmpty()){
                    continue;
                }
                String[] gameData = csvInfo.split(",");
                teamData.add(gameData);
            }
        }catch(IOException e){
            System.out.println("exception: " + e);
        }

        System.out.println("Select a team for the count of all games played");
        String selectTeam = myScanner.nextLine();
        System.out.println("Team : " + selectTeam + " has played: " + gamesPlayed(teamData, selectTeam) + " games");
        winsAndLosses(teamData, selectTeam, gamesPlayed(teamData, selectTeam));
    }
}