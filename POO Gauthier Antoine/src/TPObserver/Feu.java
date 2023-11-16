package TPObserver;

import java.util.ArrayList;

public class Feu implements Subject{
    private ArrayList<IObserver> observers = new ArrayList<>();
    private String state;

    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }

    private void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update(state);
        }
    }
}
