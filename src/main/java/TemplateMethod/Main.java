package TemplateMethod;

public class Main {
    public static void main(String[] args) {
        Game diceGame = new DiceGame();
        int numberOfplayers = 3;
        diceGame.play(numberOfplayers);
    }
}
