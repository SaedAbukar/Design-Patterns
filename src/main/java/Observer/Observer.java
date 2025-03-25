package Observer;

public class Observer implements EventListeners{
    private String observerName;
    private String message;
    private double temperature;

    public Observer(String observerName, String message) {
        this.observerName = observerName;
        this.message = message;
    }

    @Override
    public void update(double event) {
        this.temperature = event;
        System.out.printf("Location %s. Temperature: %.2f C. %s.\n", observerName, temperature, message);
    }
}
