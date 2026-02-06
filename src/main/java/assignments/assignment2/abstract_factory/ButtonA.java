package assignments.assignment2.abstract_factory;

public class ButtonA extends Button {
    public ButtonA(String text) {
        this.text = text;
    }

    public void display() {
        System.out.println("[Button A] " + text);
    }
}
