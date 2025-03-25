package Observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation("Helsinki");
        Observer ob1 = new Observer("Käpylä", "Drive with caution!");
        Observer ob2 = new Observer("Töölö", "Be aware of the fog!");
        Observer ob3 = new Observer("Kamppi", "Road construction!");
        weatherStation.getEventManager().subscribe(ob1);
        weatherStation.getEventManager().subscribe(ob2);
        weatherStation.getEventManager().subscribe(ob3);
        Thread thread = new Thread(() -> {
            int i = 0;
            while (true) {
                if (i >= 3) {
                    weatherStation.getEventManager().unsubscribe(ob2);
                }
                if (i >= 7) {
                    weatherStation.getEventManager().unsubscribe(ob3);
                    weatherStation.getEventManager().subscribe(ob2);
                }
                if (i >= 10) {
                    weatherStation.getEventManager().unsubscribe(ob1);
                    weatherStation.getEventManager().subscribe(ob3);
                }
                weatherStation.setTemperature((Math.random() * 2 - 1) * 3);
                System.out.printf("WeatherStation %s. Temperature %.2f C\n",weatherStation.getStationName(),weatherStation.getTemperature());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                i += 1;
            }
        });
        thread.start();
    }
}
