package hillel.observer;

public class Police implements Observer {
    @Override
    public void update(FopData fopData) {
        System.out.println("Police Office has got data: " + fopData);
    }
}
