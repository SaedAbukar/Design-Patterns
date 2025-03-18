package FactoryMethod;

import java.util.ArrayList;
import java.util.List;

public class WildernessMap extends Map {
    private Tile tile;

    public WildernessMap(){
        initialize();
    }

    private void initialize() {
        for (int i = 0; i < 3; i++) {
            List<Tile> row = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                row.add(createTile());
            }
            tiles.add(row);
        }
    }

    @Override
    public Tile createTile() {
        if (Math.random() < 0.33){
            tile = new SwampTile();
        } else if (Math.random() < 0.66) {
            tile = new WaterTile();
        } else {
            tile = new ForestTile();
        }
        return tile;
    }
}
