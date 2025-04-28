package Flyweight;

import javafx.scene.image.Image;

public class TileType {
    private final String name;
    private final char symbol;
    private final Image image;

    public TileType(String name, char symbol, Image image) {
        this.name = name;
        this.symbol = symbol;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    public Image getImage() {
        return image;
    }
}
