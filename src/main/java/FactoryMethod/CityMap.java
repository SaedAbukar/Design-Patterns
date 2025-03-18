package FactoryMethod;

import java.util.ArrayList;
import java.util.List;

public class CityMap extends Map {
    private Tile tile;

    public CityMap(){
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
            tile = new RoadTile();
        } else if (Math.random() < 0.66) {
            tile = new ForestTile();
        } else {
            tile = new BuildingTile();
        }
        return tile;
    }
}
