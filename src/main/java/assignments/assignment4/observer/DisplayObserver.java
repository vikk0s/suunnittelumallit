package assignments.assignment4.observer;

public class DisplayObserver implements WeatherObserver {
    private final String name;

    public DisplayObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(int data) {
        System.out.println(name + " received weather update: " + data);
    }
}
