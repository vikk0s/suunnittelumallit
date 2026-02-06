package assignments.assignment2.abstract_factory;

public class Main {
    public static void main(String[] args) {
        UIFactory factory = new AFactory();
        Button button = factory.createButton("Click me");
        TextField textField = factory.createTextField("Enter text");
        Checkbox checkBox = factory.createCheckbox("Check me");

        button.display();
        textField.display();
        checkBox.display();

        button.setText("Click me again");

        button.display();
    }
}
