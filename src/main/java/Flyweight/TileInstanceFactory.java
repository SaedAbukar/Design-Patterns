package Flyweight;

public class TileInstanceFactory {
    public static Tile createTile(int x, int y, String typeName, char symbol) {
        TileType type = TileFactory.getTileType(typeName, symbol);
        return new Tile(x, y, type);
    }
}
