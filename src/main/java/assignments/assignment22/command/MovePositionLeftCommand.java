package assignments.assignment22.command;

public class MovePositionLeftCommand implements Command {
    private PixelArtEditor editor;

    public MovePositionLeftCommand(PixelArtEditor pixelController) {
        this.editor = pixelController;
    }

    @Override
    public void execute() {
        editor.moveLeft();
    }
}
