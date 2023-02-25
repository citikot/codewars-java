package hillel.observer;

public interface EventManager {
    void registerObserver(Observer observer);

    void unregisterObserver(Observer observer);

    void notifyObserver(FopData fopData);
}
