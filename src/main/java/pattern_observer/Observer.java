package pattern_observer;

/**
 * Created by bul on 01.08.2017.
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure, float heatIndex);
}
