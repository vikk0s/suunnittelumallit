package assignments.assignment4.observer;

public class WeatherStationSimulator {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        DisplayObserver observer1 = new DisplayObserver("Observer 1");
        DisplayObserver observer2 = new DisplayObserver("Observer 2");
        DisplayObserver observer3 = new DisplayObserver("Observer 3");

        weatherStation.addObserver(observer1);
        weatherStation.addObserver(observer2);
        weatherStation.addObserver(observer3);

        Thread stationThread = new Thread(weatherStation);
        stationThread.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Removing Observer 1");
        weatherStation.removeObserver(observer1);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Removing Observer 2");
        weatherStation.removeObserver(observer2);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Removing Observer 3");
        weatherStation.removeObserver(observer3);

        weatherStation.stop();
        try {
            stationThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Simulation edned.");
    }
}
