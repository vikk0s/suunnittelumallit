package assignments.assignment21.facade;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.json.simple.JSONObject; // add Maven dependency for JSON.simple
import org.json.simple.parser.JSONParser; // add Maven dependency for JSON.simple

public class JokeClient {
    public String getAttributeValueFromJson(String urlString, String attributeName) throws IllegalArgumentException, IOException {
        String jsonResult = getJsonFromApi(urlString);
        return extractValueFromJson(jsonResult, attributeName);
    }

    /*public String getRandomJoke() throws Exception {
        String jsonResult = getJsonFromApi("https://api.chucknorris.io/jokes/random");
        return extractJokeFromJson(jsonResult);
    }*/

    private String getJsonFromApi(String apiUrl) throws IOException {
        URL url = new URL(apiUrl);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        int status = con.getResponseCode();
        if (status != 200) {
            throw new IOException("Failed to fetch data from API, status code: " + status);
        }

        try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            return content.toString();
        } finally {
            con.disconnect();
        }
    }

    private String extractValueFromJson(String json, String atrributeName) throws IllegalArgumentException {
        try {
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(json);

            if (!jsonObject.containsKey(atrributeName)) {
                throw new IllegalArgumentException("Atrribute '" + atrributeName + "' not found in JSON response");
            }

            return (String) jsonObject.get(atrributeName);
        } catch (Exception e) {
            throw new IllegalArgumentException("Failed to parse JSON response: " + e.getMessage());
        }
    }

    /*public static void main(String[] args) {
        JokeClient client = new JokeClient();
        try {
            String jokeText = client.getRandomJoke();
            System.out.println(jokeText);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
}