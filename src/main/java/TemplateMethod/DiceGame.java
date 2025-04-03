package TemplateMethod;

import java.util.HashMap;
import java.util.Map;

public class DiceGame extends Game{
    private boolean finished;
    private HashMap<Integer, String> players;
    private HashMap<String, Integer> points;
    private String winner;

    public DiceGame(){}
    @Override
    public void initializeGame(int numberOfPlayers) {
        finished = false;
        winner = null;
        players = new HashMap<>();
        points = new HashMap<>();
        for (int i = 0; i < numberOfPlayers; i++) {
            String player = "Player " + i;
            players.put(i, player);
            points.put(player, 0);
        }
        System.out.println("Game Initialized!");
    }

    @Override
    public boolean endOfGame() {
        for (Map.Entry<String, Integer> player : points.entrySet()) {
            if (player.getValue() >= 5) {
                winner = player.getKey();
                finished = true;
                System.out.println("The Game ended! We have a winner!");
            }
        }
        return finished;
    }

    @Override
    public void playSingleTurn(int player) {
        String playerInTurn = players.get(player);
        int dice = (int) (Math.random() * 6) + 1;
        if (dice == 6) {
            points.put(playerInTurn, points.get(playerInTurn) + 1);
            System.out.printf("The %s threw %d! 1 point earned!%n", playerInTurn, dice);
        } else {
            System.out.printf("The %s threw %d. No points. %n", playerInTurn, dice);
        }
        displayThePoints();
    }

    @Override
    public void displayWinner() {
        System.out.printf("The winner is: %s. Points: %d%n", winner, points.get(winner));
        System.out.println("\nFinal standings:");
        displayThePoints();
    }

    public void displayThePoints(){
        System.out.printf("%-10s | %-10s %n", "Player", "Points");
        System.out.println("--------------------");
        for (Map.Entry<String, Integer> player : points.entrySet()) {
            System.out.printf("%-10s | %-10s %n", player.getKey(), player.getValue());
        }
        System.out.println("");
    }
}
