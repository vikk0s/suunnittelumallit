package assignments.assignment22.command;

public class MovePositionDownCommand implements Command {
    private PixelArtEditor editor;

    public MovePositionDownCommand(PixelArtEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.moveDown();
    }
}
