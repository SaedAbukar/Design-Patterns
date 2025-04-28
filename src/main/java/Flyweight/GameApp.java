package Flyweight;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class GameApp extends Application {
    private static final int TILE_SIZE = 32;
    private static final int WIDTH = 20;
    private static final int HEIGHT = 15;

    @Override
    public void start(Stage primaryStage) {
        Tile[][] map = MapGenerator.generateMap(WIDTH, HEIGHT);

        Canvas canvas = new Canvas(WIDTH * TILE_SIZE, HEIGHT * TILE_SIZE);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        MapRenderer.render(gc, map, TILE_SIZE);

        Pane root = new Pane(canvas);
        Scene scene = new Scene(root);

        primaryStage.setTitle("RPG Map - Full Flyweight");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
