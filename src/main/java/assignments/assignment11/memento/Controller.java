package assignments.assignment11.memento;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private Model model;
    private Gui gui;
    private List<IMemento> history; // Memento history
    private List<IMemento> undoHistory;

    public Controller(Gui gui) {
        this.model = new Model();
        this.gui = gui;
        this.history = new ArrayList<>();
        this.undoHistory = new ArrayList<>();
    }

    public void setOption(int optionNumber, int choice) {
        saveToHistory();
        model.setOption(optionNumber, choice);
    }

    public int getOption(int optionNumber) {
        return model.getOption(optionNumber);
    }

    public void setIsSelected(boolean isSelected) {
        saveToHistory();
        model.setIsSelected(isSelected);
    }

    public boolean getIsSelected() {
        return model.getIsSelected();
    }

    public void undo() {
        if (!history.isEmpty()) {
            System.out.println("Memento found in history");
            IMemento previousState = history.remove(history.size() - 1);
            undoHistory.add(model.createMemento());
            System.out.println("Undo history size: " + undoHistory.size());
            model.restoreState(previousState);
            gui.updateGui();
        }
    }

    public void redo() {
        if (!undoHistory.isEmpty()) {
            System.out.println("Memento found in undo history");
            IMemento previousState = undoHistory.remove(undoHistory.size() - 1);
            history.add(model.createMemento());
            System.out.println("Undo history size: " + undoHistory.size());
            model.restoreState(previousState);
            gui.updateGui();
        }
    }

    private void saveToHistory() {
        IMemento currentState = model.createMemento();
        history.add(currentState);
        undoHistory.clear();
    }

    public List<IMemento> getHistory() {
        return history;
    }

    public void restoreFromHistory(IMemento memento) {
        model.restoreState(memento);
        gui.updateGui();
    }
}