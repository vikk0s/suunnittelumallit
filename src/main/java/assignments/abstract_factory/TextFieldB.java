package assignments.abstract_factory;

public class TextFieldB extends TextField {
    public TextFieldB (String text) {
        this.text = text;
    }

    public void display() {
        System.out.println("TextFieldB: " + text);
    }
}
