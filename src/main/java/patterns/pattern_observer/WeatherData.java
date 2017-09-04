package patterns.pattern_observer;

import java.util.ArrayList;

/**
 * This custom pattern implements the push method (observer.update() ) in a pub/sub system.
 * Created by bul on 01.08.2017.
 */
public class WeatherData implements Subject {

    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;
    private float heatIndex;

    public WeatherData(){
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o){
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {

        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, pressure, heatIndex);
        }

    }

    public void measurementsChanged(){
        notifyObservers();
    }


    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.heatIndex = temperature * humidity;

        measurementsChanged();
    }



}
