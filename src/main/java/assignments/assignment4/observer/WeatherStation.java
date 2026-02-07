package assignments.assignment4.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherStation implements Runnable {
    private final List<WeatherObserver> observers;
    private Random random;
    private int temperature;
    private boolean running;

    private static final int MAX_TEMPERATURE = 40;
    private static final int MIN_TEMPERATURE = -10;

    public WeatherStation() {
        observers = new ArrayList<>();
        random = new Random();
        temperature = random.nextInt(MAX_TEMPERATURE - MIN_TEMPERATURE + 1) + MIN_TEMPERATURE;
        running = true;
    }

    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(temperature);
        }
    }

    public void stop() {
        running = false;
    }

    public void run() {
        while (running) {
            try {
                Thread.sleep(1000 + random.nextInt(4000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            int change = random.nextBoolean() ? 1 : -1;
            temperature += change;

            if (temperature > MAX_TEMPERATURE) {
                temperature = MAX_TEMPERATURE;
            } else if (temperature < MIN_TEMPERATURE) {
                temperature = MIN_TEMPERATURE;
            }

            notifyObservers();
        }
    }
}
