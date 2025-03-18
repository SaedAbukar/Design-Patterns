import java.util.List;
import java.util.ArrayList;

public abstract class Map {
    protected List<List<Tile>> tiles = new ArrayList<>();

    public abstract Tile createTile();

    public void display() {
        for (List<Tile> row : tiles) {
            for (Tile t : row) {
                System.out.print(t.getCharacter() + " ");
            }
            System.out.println();
        }
    }
}
