package assignments.assignment7.state;

public class ExpertState extends State {
    public ExpertState(GameCharacter character) {
        super(character);
    }

    public void action() {
        String[] options = {"train", "meditate", "fight"};
        int option = this.getCharacter().readUserInput(options);
        switch (option) {
            case 1:
                this.getCharacter().train();
                break;
            case 2:
                this.getCharacter().meditate();
                break;
            case 3:
                this.getCharacter().fight();
                break;
            default:
                System.out.println("Invalid option.");
        }
    }
}
