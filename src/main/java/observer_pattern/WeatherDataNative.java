package observer_pattern;


import java.util.Observable;

/**
 * This class implements the official java observer pattern and acts as a subject.
 * Downside: this approach works only if no other inheritance is necessary.
 * Created by bul on 01.08.2017.
 */
public class WeatherDataNative extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;
    private float heatIndex;


    public WeatherDataNative(){

    }

    public void measurementsChanged(){
        setChanged();
        notifyObservers(); // !!! Because we don't send data with the notifyObservers() method that means we use a PULL version
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.heatIndex = temperature * humidity;

        measurementsChanged();
    }


    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHeatIndex() {
        return heatIndex;
    }
}
