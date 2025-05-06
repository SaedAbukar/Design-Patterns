package Facade;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        String URL = "https://api.chucknorris.io/jokes/random";
        String value = "value";
        try {
            String jokeText = facade.getAttributeValueFromJson(URL, value);
            System.out.println(jokeText);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String fxUrl = "https://api.fxratesapi.com/latest";
        String fxKey = "base";

        try {
            String baseCurrency = facade.getAttributeValueFromJson(fxUrl, fxKey);
            System.out.println("Base Currency: " + baseCurrency);
        } catch (Exception e) {
            System.err.println("Failed to fetch FX data: " + e.getMessage());
        }
    }
}
