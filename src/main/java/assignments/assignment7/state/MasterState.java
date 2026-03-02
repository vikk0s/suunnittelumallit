package assignments.assignment7.state;

public class MasterState extends State {
    public MasterState(GameCharacter character) {
        super(character);
    }

    public void action() {
        this.getCharacter().endGame();
    }
}
