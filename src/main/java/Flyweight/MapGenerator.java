package Flyweight;

import java.util.Random;

public class MapGenerator {
    private static final Random random = new Random();

    public static Tile[][] generateMap(int width, int height) {
        Tile[][] map = new Tile[height][width];

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                map[y][x] = randomTile(x, y);
            }
        }
        return map;
    }

    private static Tile randomTile(int x, int y) {
        int rand = random.nextInt(3);
        switch (rand) {
            case 0:
                return TileInstanceFactory.createTile(x, y, "forest", 'F');
            case 1:
                return TileInstanceFactory.createTile(x, y, "desert", 'D');
            case 2:
                return TileInstanceFactory.createTile(x, y, "water", 'W');
            default:
                return TileInstanceFactory.createTile(x, y, "forest", 'F');
        }
    }

}
