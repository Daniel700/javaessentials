package patterns.pattern_observer;

/**
 * Created by bul on 01.08.2017.
 */
public interface Subject {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();

}
