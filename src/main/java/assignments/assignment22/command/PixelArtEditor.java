package assignments.assignment22.command;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;

public class PixelArtEditor extends Application {
    private int positionX = 0;
    private int positionY = 0;

    private static final int GRID_SIZE = 8;
    private static final int CELL_SIZE = 30;

    private final int[][] grid;
    private final Rectangle[][] cellGrid;

    public PixelArtEditor() {
        this.positionX = GRID_SIZE / 2;
        this.positionY = GRID_SIZE / 2;

        this.grid = new int[GRID_SIZE][GRID_SIZE];
        this.cellGrid = new Rectangle[GRID_SIZE][GRID_SIZE];
    }

    public void start(Stage stage) {
        GridPane gridPane = new GridPane();
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                Rectangle cell = new Rectangle(CELL_SIZE, CELL_SIZE);
                cell.setFill(Color.WHITE);
                cell.setStroke(Color.BLACK);
                gridPane.add(cell, j, i);
                cellGrid[i][j] = cell;
            }
        }

        Button generateCodeButton = new Button("Generate Code");
        Command generateCode = new GenerateCodeCommand(this);
        generateCodeButton.setOnAction(e -> generateCode.execute());

        VBox vBox = new VBox(gridPane, generateCodeButton);
        Scene scene = new Scene(vBox);

        Command moveUp = new MovePositionUpCommand(this);
        Command moveDown = new MovePositionDownCommand(this);
        Command moveLeft = new MovePositionLeftCommand(this);
        Command moveRight = new MovePositionRightCommand(this);
        Command togglePixel = new TogglePixelCommand(this);

        ControlPanel controlPanel = new ControlPanel(moveUp, moveDown, moveLeft, moveRight, togglePixel);

        scene.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.UP) {
                controlPanel.pressMoveUp();
            } else if (e.getCode() == KeyCode.DOWN) {
                controlPanel.pressMoveDown();
            } else if (e.getCode() == KeyCode.LEFT) {
                controlPanel.pressMoveLeft();
            } else if (e.getCode() == KeyCode.RIGHT) {
                controlPanel.pressMoveRight();
            } else if (e.getCode() == KeyCode.SPACE) {
                controlPanel.togglePixel();
            }
        });

        stage.setTitle("Pixel Art Editor");
        stage.setScene(scene);
        stage.show();
        scene.getRoot().requestFocus();
    }

    public void moveUp() {
        if (positionY > 0) {
            positionY --;
            updateCursor();
        }
    }

    public void moveDown() {
        if (positionY < GRID_SIZE - 1) {
            positionY ++;
            updateCursor();
        }
    }

    public void moveLeft() {
        if (positionX > 0) {
            positionX --;
            updateCursor();
        }
    }

    public void moveRight() {
        if (positionX < GRID_SIZE - 1) {
            positionX ++;
            updateCursor();
        }
    }

    public void togglePixel() {
        if (grid[positionX][positionY] == 0) {
            grid[positionX][positionY] = 1;
            cellGrid[positionY][positionX].setFill(Color.BLACK);
        } else {
            grid[positionX][positionY] = 0;
            cellGrid[positionY][positionX].setFill(Color.WHITE);
        }
    }

    private void updateCursor() {
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                if (i == positionY && j == positionX) {
                    cellGrid[i][j].setStroke(Color.RED);
                } else {
                    cellGrid[i][j].setStroke(Color.BLACK);
                }
            }
        }
    }

    public void generateCode() {
        System.out.println("int[][] grid = {");
        for (int i = 0; i < GRID_SIZE; i++) {
            System.out.print("    {");
            for (int j = 0; j < GRID_SIZE; j++) {
                System.out.print(grid[j][i]);
                if (j < GRID_SIZE - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("}");
        }
        System.out.println("}");
    }
}
