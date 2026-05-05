package assignments.assignment22.command;

public class MovePositionRightCommand implements Command {
    private PixelArtEditor editor;

    public MovePositionRightCommand(PixelArtEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.moveRight();
    }
}
