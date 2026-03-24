package assignments.assignment11;

public class Memento implements IMemento {
    private int[] options;
    private boolean isSelected;

    public Memento(int[] options, boolean isSelected) {
        this.options = options.clone(); // Copy options array
        this.isSelected = isSelected;
    }

    public int[] getOptions() {
        return options.clone();
    }

    public boolean isSelected() {
        return isSelected;
    }

    public String toString() {
        return "Memento{options=" + java.util.Arrays.toString(options) + ", isSelected=" + isSelected + "}";
    }
}
