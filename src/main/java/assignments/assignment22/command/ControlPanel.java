package assignments.assignment22.command;

public class ControlPanel {
    private Command moveUp;
    private Command moveDown;
    private Command moveLeft;
    private Command moveRight;
    private Command togglePixel;

    public ControlPanel(Command moveUp, Command moveDown, Command moveLeft, Command moveRight, Command togglePixel) {
        this.moveUp = moveUp;
        this.moveDown = moveDown;
        this.moveLeft = moveLeft;
        this.moveRight = moveRight;
        this.togglePixel = togglePixel;
    }

    public void pressMoveUp() {
        moveUp.execute();
    }

    public void pressMoveDown() {
        moveDown.execute();
    }

    public void pressMoveLeft() {
        moveLeft.execute();
    }

    public void pressMoveRight() {
        moveRight.execute();
    }

    public void togglePixel() {
        togglePixel.execute();
    }
}
