package assignments.abstract_factory;

public class TextFieldA extends TextField {
    public TextFieldA (String text) {
        this.text = text;
    }

    public void display() {
        System.out.println("[TextField A] " + text);
    }
}
