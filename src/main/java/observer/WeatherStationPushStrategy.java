package observer;

import observer.push.CurrentConditionsDisplay;
import observer.push.ForecastDisplay;
import observer.push.WeatherData;

import java.util.Random;

public class WeatherStationPushStrategy {

    private static final Random RANDOM = new Random();

    /**
     * Generates a random float within a specified range.
     * @param min The minimum value (inclusive).
     * @param max The maximum value (exclusive).
     * @return A random float value.
     */
    private static float getRandomFloat(float min, float max) {
        return min + (max - min) * RANDOM.nextFloat();
    }

    public static void main(String[] args) throws InterruptedException {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay =
                new ForecastDisplay(weatherData);

        //simulation parameters
        int numberOfUpdates = 10;
        long updateIntervalMs = 2000;

        System.out.println("--- Push Strategy: Weather Station Simulation Starting ---");

        for (int i = 1; i <= numberOfUpdates; i++) {
            float temperature = getRandomFloat(60.0f, 95.0f);
            float humidity = getRandomFloat(30.0f, 100.0f);
            float pressure = getRandomFloat(28.0f, 32.0f);

            // B. Update Measurements and Notify Observers
            System.out.println();
            System.out.println("---------------------------------");
            weatherData.setMeasurements(temperature, humidity, pressure);
            if (i < numberOfUpdates) {
                Thread.sleep(updateIntervalMs);
            }
        }

        System.out.println("\n--- Weather Station Simulation Finished ---");
    }
}