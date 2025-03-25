package Observer;

public class WeatherStation {
    private EventManager eventManager;
    private String stationName;
    private double temperature;

    public WeatherStation(String stationName) {
        this.stationName = stationName;
        this.temperature = Math.random() + 30;
        this.eventManager = new EventManager();
    }

    public String getStationName() {
        return stationName;
    }

    public void setTemperature(double temperature) {
        this.temperature += temperature;
        eventManager.notifyObservers(this.temperature);
    }

    public double getTemperature() {
        return temperature;
    }

    public EventManager getEventManager() {
        return eventManager;
    }
}
