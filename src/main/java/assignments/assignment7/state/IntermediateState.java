package assignments.assignment7.state;

public class IntermediateState extends State {
    public IntermediateState(GameCharacter character) {
        super(character);
    }

    public void action() {
        String[] options = {"train", "meditate"};
        int option = this.getCharacter().readUserInput(options);
        switch (option) {
            case 1:
                this.getCharacter().train();
                break;
            case 2:
                this.getCharacter().meditate();
                break;
            default:
                System.out.println("Invalid option.");
        }
    }
}
