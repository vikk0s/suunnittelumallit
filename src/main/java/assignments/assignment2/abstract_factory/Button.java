package assignments.assignment2.abstract_factory;

public abstract class Button {
    protected String text;
    public abstract void display();
    public void setText(String text) {
        this.text = text;
    }
}
