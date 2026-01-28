package assignments.abstract_factory;

public abstract class Checkbox {
    protected String text;
    public abstract void display();
    public void setText(String text) {
        this.text = text;
    }
}
