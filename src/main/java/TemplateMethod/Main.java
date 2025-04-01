package TemplateMethod;

public class Main {
    public static void main(String[] args) {
        DiceGame diceGame = new DiceGame();
        int numberOfplayers = 3;
        diceGame.play(numberOfplayers);
    }
}
