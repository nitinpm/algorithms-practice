package AE.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TournamentWinner {
    public static String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {

        String currentWinner="";
        String currBestTeam = "";
        int i = 0;
        HashMap<String, Integer> winCount = new HashMap<>();
        winCount.put(currBestTeam, 0);

        for(ArrayList<String> competition: competitions){
            currentWinner = (results.get(i++) == 0) ? competition.get(1) : competition.get(0);

            updateCount(currentWinner, winCount);

            if(winCount.get(currentWinner) > winCount.get(currBestTeam)){
                currBestTeam = currentWinner;
            }
        }

        return currBestTeam;
    }

    private static void updateCount(String currentWinner, HashMap<String, Integer> winCount) {
        if(winCount.get(currentWinner) != null) {
            winCount.put(currentWinner, winCount.get(currentWinner) + 3);
        } else{
            winCount.put(currentWinner, 3);
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> competitions = new ArrayList<>();
        List<String> comptetition = Arrays.asList("HTML", "C#");
        competitions.add((ArrayList<String>) comptetition);
        comptetition = Arrays.asList("C#", "Python");
        competitions.add((ArrayList<String>) comptetition);
        comptetition = Arrays.asList("Python", "HTML");
        competitions.add((ArrayList<String>) comptetition);
        /*ArrayList<String> c1 = new ArrayList<>();
        ArrayList<String> c2 = new ArrayList<>();
        ArrayList<String> c3 = new ArrayList<>();
        c1.add("HTML"); c1.add("C#");
        c2.add("C#"); c2.add("Python");
        c3.add("Python"); c3.add("HTML");
        competitions.add(c1); competitions.add(c2); competitions.add(c3);*/
        ArrayList<Integer> results = new ArrayList<>();
        results.add(0);
        results.add(0);
        results.add(1);
        System.out.println(tournamentWinner(competitions, results));
    }
}
