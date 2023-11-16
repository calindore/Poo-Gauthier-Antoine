package TPObserver;

public interface Subject {
    public void addObserver(IObserver observer);
    public void removeObserver(IObserver observer);
    public void setState(String state);
    private void notifyObservers() {

    }
}
