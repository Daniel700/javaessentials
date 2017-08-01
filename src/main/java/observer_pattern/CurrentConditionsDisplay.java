package observer_pattern;

/**
 * Created by bul on 01.08.2017.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float heatIndex;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void update(float temp, float humidity, float pressure, float heatIndex) {
        this.temperature = temp;
        this.humidity = humidity;
        this.heatIndex = heatIndex;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current Conditions: " + temperature + " C degrees and " + humidity + "% humidity");
        System.out.println("Heat Index: " + heatIndex);
    }


}
