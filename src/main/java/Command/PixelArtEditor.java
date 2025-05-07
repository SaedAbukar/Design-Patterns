package Command;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PixelArtEditor extends Application {
    private final PixelGrid pixelGrid = new PixelGrid();
    private final int cellSize = 40;
    private final Canvas canvas = new Canvas(320, 320);

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        drawGrid();

        Button generateButton = new Button("Create Code");
        generateButton.setOnAction(e -> {
            String code = pixelGrid.generateJavaCode();
            System.out.println(code);
        });

        VBox rightPanel = new VBox(generateButton);
        root.setCenter(canvas);
        root.setRight(rightPanel);

        Scene scene = new Scene(root, 400, 340);
        setupKeyHandlers(scene);

        scene.setOnMouseClicked(e -> scene.getRoot().requestFocus());
        scene.getRoot().requestFocus();

        primaryStage.setTitle("Pixel Art Editor");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void setupKeyHandlers(Scene scene) {
        scene.setOnKeyPressed(event -> {
            Command command = null;
            if (event.getCode() == KeyCode.UP) {
                command = new MoveCursorUpCommand(pixelGrid);
            } else if (event.getCode() == KeyCode.DOWN) {
                command = new MoveCursorDownCommand(pixelGrid);
            } else if (event.getCode() == KeyCode.LEFT) {
                command = new MoveCursorLeftCommand(pixelGrid);
            } else if (event.getCode() == KeyCode.RIGHT) {
                command = new MoveCursorRightCommand(pixelGrid);
            } else if (event.getCode() == KeyCode.SPACE) {
                command = new TogglePixelCommand(pixelGrid);
            }

            if (command != null) {
                command.execute();
                drawGrid();
            }
        });
    }

    private void drawGrid() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.WHITE);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

        int[][] grid = pixelGrid.getGrid();

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (grid[row][col] == 1) {
                    gc.setFill(Color.BLACK);
                    gc.fillRect(col * cellSize, row * cellSize, cellSize, cellSize);
                }
                gc.setStroke(Color.LIGHTGRAY);
                gc.strokeRect(col * cellSize, row * cellSize, cellSize, cellSize);
            }
        }

        // Draw cursor
        gc.setStroke(Color.RED);
        gc.strokeRect(pixelGrid.getCursorCol() * cellSize, pixelGrid.getCursorRow() * cellSize, cellSize, cellSize);
    }
}

