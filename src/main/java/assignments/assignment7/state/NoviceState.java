package assignments.assignment7.state;

public class NoviceState extends State {
    public NoviceState(GameCharacter character) {
        super(character);
    }

    public void action() {
        String[] options = {"train"};
        int option = this.getCharacter().readUserInput(options);
        switch (option) {
            case 1:
                this.getCharacter().train();
                break;
            default:
                System.out.println("Invalid option.");
        }
    }
}
