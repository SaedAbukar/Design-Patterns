package Flyweight;

import javafx.scene.image.Image;

import java.util.HashMap;
import java.util.Map;

public class TileFactory {
    private static final Map<String, TileType> tileTypes = new HashMap<>();

    public static TileType getTileType(String name, char symbol) {
        if (!tileTypes.containsKey(name)) {
            Image image = new Image("C:\\Users\\saeda\\OneDrive\\Code\\Design_Patterns\\src\\main\\resources\\" + name + ".png");
            TileType type = new TileType(name, symbol, image);
            tileTypes.put(name, type);
        }
        return tileTypes.get(name);
    }
}
