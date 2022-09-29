package observer;

import java.lang.reflect.Array;
import java.util.ArrayList;

public interface Subject {

    ArrayList<Observer> OBSERVERS = new ArrayList<>();

    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

}
