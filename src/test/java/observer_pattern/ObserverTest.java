package observer_pattern;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by bul on 01.08.2017.
 */
public class ObserverTest {

    private WeatherData weatherData;
    private WeatherDataNative weatherDataNative;

    @Before
    public void setUp() throws Exception {

        //######### CUSTOM PATTERN
        weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        //StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        //ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);


        //######### JAVA NATIVE PATTERN
        weatherDataNative = new WeatherDataNative();
        GeneralDisplay generalDisplay = new GeneralDisplay(weatherDataNative);

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testCustomObserverPattern() throws Exception {
        System.out.println("Testing Custom Pattern: ");
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
        System.out.println(" ");
    }

    @Test
    public void testNativeObserverPattern() throws Exception {
        System.out.println("Testing Native Pattern: ");
        weatherDataNative.setMeasurements(80, 65, 30.4f);
        weatherDataNative.setMeasurements(82, 70, 29.2f);
        weatherDataNative.setMeasurements(78, 90, 29.2f);
        System.out.println(" ");
    }


}
