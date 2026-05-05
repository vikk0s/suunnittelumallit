package assignments.assignment22.command;

public class MovePositionUpCommand implements Command {
    private PixelArtEditor editor;

    public MovePositionUpCommand(PixelArtEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.moveUp();
    }
}
