package pattern_observer;

import java.util.*;

/**
 * Created by bul on 01.08.2017.
 */
public class GeneralDisplay implements java.util.Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private float heatIndex;
    private Observable observable;

    public GeneralDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }


    //If Observable calls notifyObservers() we will just get the Observable o Object    -> PULL because we need getters for the data
    //If Observable calls notfiyObservers(args) we will also get a data object          -> PUSH because we get the data directly
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherDataNative){
            this.temperature = ((WeatherDataNative) o).getTemperature();
            this.humidity = ((WeatherDataNative) o).getHumidity();
            this.pressure = ((WeatherDataNative) o).getPressure();
            this.heatIndex = ((WeatherDataNative) o).getHeatIndex();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("General Display - Current Conditions: " + temperature + " C degrees and " + humidity + "% humidity");
        System.out.println("General Display - Heat Index: " + heatIndex);
    }



}
