package observer.pull;

import observer.DisplayElement;

public class ForecastDisplay implements Observer, DisplayElement {

    private float lastPressure;
    private float currentPressure = 29.2f;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        lastPressure = currentPressure;
        this.currentPressure = weatherData.getPressure();
        display();
    }

    @Override
    public void display() {
        System.out.print("🌬️ **Pressure Forecast: \n");
        // Display the detailed pressure values
        System.out.printf("  Current Pressure: %.2f inHg\n", currentPressure);
        System.out.printf("  Last Pressure: %.2f inHg\n", lastPressure);
        System.out.print("  Outlook: ");

        if (currentPressure > lastPressure) {
            System.out.println("**Improving weather** on the way! (Pressure Rising)");
        } else if (currentPressure < lastPressure) {
            System.out.println("**Cooler, rainy weather** likely. (Pressure Falling)");
        } else {
            System.out.println("**Stable weather** expected. (Pressure Unchanged)");
        }
    }
}

