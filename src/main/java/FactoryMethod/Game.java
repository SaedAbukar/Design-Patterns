package FactoryMethod;

import java.util.Scanner;

public class Game {

    private Map createMap() {
        Map map = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Select the Map");
        System.out.println("1. City Map, 2. WildernessMap");
        int size = scanner.nextInt();
        if (size == 1) {
            map = new CityMap();
        }
        else if (size == 2) {
            map = new WildernessMap();
        }
        return map;
    }
    public static void main(String[] args) {
        Game game = new Game();
        Map map = game.createMap();
        if (map != null) {
            System.out.println("The Map is loaded");
            map.display();
        }
    }
}
