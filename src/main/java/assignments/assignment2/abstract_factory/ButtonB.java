package assignments.assignment2.abstract_factory;

public class ButtonB extends Button {
    public ButtonB(String text) {
        this.text = text;
    }

    public void display() {
        System.out.println("[Button B] " + text);
    }
}
