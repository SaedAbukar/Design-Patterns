package Facade;

import java.io.IOException;

public class Facade {
    public String getAttributeValueFromJson(String urlString, String attributeName) throws IllegalArgumentException, IOException {
        JokeClient client = new JokeClient();
        try {
            return client.getRandomJoke(urlString, attributeName);
        } catch (IOException e) {
            throw e;
        } catch (Exception e) {
            throw new IOException("Failed to retrieve or parse API response", e);
        }
    }
}
