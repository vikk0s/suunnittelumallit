package assignments.assignment15.adapter;

public class Main {
    public static void main(String[] args) {
        NewDateInterface dateAdapter = new CalendarToNewDateAdapter();

        dateAdapter.setDay(24);
        dateAdapter.setMonth(2);
        dateAdapter.setYear(2024);

        System.out.println("Initial date: " + dateAdapter.getDay() + "." + dateAdapter.getMonth() + "." + dateAdapter.getYear());

        dateAdapter.advanceDays(25);

        System.out.println("Advanced date: " + dateAdapter.getDay() + "." + dateAdapter.getMonth() + "." + dateAdapter.getYear());
    }
}
