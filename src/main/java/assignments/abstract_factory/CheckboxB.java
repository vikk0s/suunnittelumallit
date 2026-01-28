package assignments.abstract_factory;

public class CheckboxB extends Checkbox {
    public CheckboxB (String text) {
        this.text = text;
    }

    public void display() {
        System.out.println("[Checkbox B] " + text);
    }
}
