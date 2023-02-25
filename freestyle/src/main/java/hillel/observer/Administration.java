package hillel.observer;

import java.util.ArrayList;
import java.util.List;

public class Administration implements EventManager {

    private List<Observer> observers = new ArrayList<>();

    public void registerFop(String name, int id) {
        System.out.println("Administration has registered: " + name + " " + id);
        notifyObserver(new FopData(name, id));
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(FopData fopData) {
        observers.forEach(observer -> observer.update(fopData));

    }
}
