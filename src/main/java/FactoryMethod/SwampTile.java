package FactoryMethod;

public class SwampTile implements Tile {
    private final char character = 'S';
    private final String type = "swamp";
    public char getCharacter() {
        return character;
    };
    public String getType() {
        return type;
    };
}
