package bai;

import java.util.ArrayList;
import java.util.List;

public abstract class Tigia {
    List<TigiaObserver> observers = new ArrayList<>();

    public void attach(TigiaObserver observer) {
        observers.add(observer);
    }

    public void detach(TigiaObserver observer) {
        observers.remove(observer);
    }

    public abstract void notify(double delta);

    public interface TigiaObserver {
        void tigiaChanged(double delta);
    }
}