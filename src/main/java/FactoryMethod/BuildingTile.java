package FactoryMethod;

public class BuildingTile implements Tile {
    private final char character = 'B';
    private final String type = "building";
    public char getCharacter() {
        return character;
    };
    public String getType() {
        return type;
    };
}
