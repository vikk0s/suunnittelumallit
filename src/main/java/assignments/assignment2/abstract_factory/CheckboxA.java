package assignments.assignment2.abstract_factory;

public class CheckboxA extends Checkbox {
    public CheckboxA (String text) {
        this.text = text;
    }

    public void display() {
        System.out.println("[Checkbox A] " + text);
    }
}
