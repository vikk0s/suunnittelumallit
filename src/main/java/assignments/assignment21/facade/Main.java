package assignments.assignment21.facade;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        JokeClient client = new JokeClient();

        try {
            System.out.println("Chuck Norris joke: " + client.getAttributeValueFromJson("https://api.chucknorris.io/jokes/random", "value"));

            System.out.println("Base currency: " + client.getAttributeValueFromJson("https://api.fxratesapi.com/latest", "base"));
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Network error: " + e.getMessage());
        }
    }
}
