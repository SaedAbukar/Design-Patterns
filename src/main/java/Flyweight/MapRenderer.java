package Flyweight;

import javafx.scene.canvas.GraphicsContext;

public class MapRenderer {
    public static void render(GraphicsContext gc, Tile[][] map, int tileSize) {
        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[y].length; x++) {
                Tile tile = map[y][x];
                gc.drawImage(tile.getType().getImage(), tile.getX() * tileSize, tile.getY() * tileSize, tileSize, tileSize);
            }
        }
    }
}
